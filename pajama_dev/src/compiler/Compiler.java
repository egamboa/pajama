package pajama.compile;

import pajama.js.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;
import java.util.stream.*;
import java.util.Map;
import java.util.Hashtable;
class DepthOffset{
  public Integer d;
  public Integer o;
  public DepthOffset(Integer d, Integer o){
    this.d =d;
	this.o = o;
  }
}
class SymbolEntry{
   JSId x;
   JSAccess s;
   JSNum offset;
   public SymbolEntry(JSId x, JSNum offset, JSAccess s){
      this.x = x;
	  this.s = s;
	  this.offset = offset;
   }
   public JSAccess getAccess(){return this.s;}
   public JSNum getOffset(){return this.offset;}
   
   public void update(){this.offset = new JSNum(this.offset.getValue()+1);}
   
}
public class Compiler extends PajamaBaseVisitor<JSAst> implements Emiter{

   List<JSAst> rules = new ArrayList<>();
   Map<String, SymbolEntry> symbolTable;
   Stack<JSAst> stack = new Stack<>();
   public boolean isEmpty(){return this.stack.empty();}
   public void push(int x){this.stack.push(NUM(x));}
   public void push(JSAccess x ){this.stack.push(x);}
   public JSAst pop(){return this.stack.pop();}
   int offset =0;
   JSId ruleName;
   
  public JSAst locatePatternId(JSId x){
    System.err.println("locatePatternId:" + x.getValue()+" "+stack+ " " +this.offset);
    if(this.offset < 0){
      return locateOnTopLevel();
    }
    locate(x);
    JSNum off = NUM(this.offset);
    JSAccess a = ACCESS(x,off);
    return a;
  } 
public JSAst locateIdRelatively(JSId x){
  System.err.println("locateIdRelatively:IN "+x.getValue()+" "+this.stack+" "+this.offset);
  if(this.offset < 0 && this.isEmpty()){
    return x;
  }
  JSAst ret;
  if (this.offset >= 0) ret = ACCESS(x, NUM(this.offset));
  else ret = this.stack.peek();
  System.err.println("locateIdRelatively:OUT "+ret);
  return ret;
}

public JSAst locate(JSId x){
  System.err.println("locate IN:"+ x.getValue()+" "+this.stack+ " " +this.offset);

  if(this.offset<0 && this.isEmpty()) return x;

  List<JSAst> rstack =  new ArrayList<>();
  for(JSAst k : stack){
    rstack.add(k);
  }
  JSAst a = x;
  JSNum off = (this.offset>=0)?NUM(this.offset):NULL_OFFSET;

  for(JSAst k : rstack){
    System.err.println("locate LOOP: "+x.getValue()+" "+k);
    if(k instanceof JSOAccess){
      System.err.println("locate OAccess");
      JSOAccess na = (JSOAccess)k;
      a = na.setLeft(a);
    } else 
      if( k instanceof JSAccess){
        System.err.println("locate Access "+k);
        JSAccess na = (JSAccess) k;
        a  = na.setLeft(a);
      } 
      else a =ACCESS(a,k);
  }
  System.err.println("locate MIDDLE: "+x.getValue()+ " "+a);
  if(this.offset>=0){
    a = ACCESS(a, off); 
  }

  SymbolEntry e = new SymbolEntry(x, off, (JSAccess)a);
  symbolTable.put(x.getValue(), e);
  System.err.println("locate OUT: "+x.getValue()+" "+stack+" "+this.offset+" "+a);
  return a;
}

    public JSAst setOnTopLevel(JSId x){
    System.err.println("locateOnTopLevel:"+ x.getValue()+" "+stack+ " " +this.offset);
    JSAccess a = TOP();
    SymbolEntry e = new SymbolEntry(x, NULL_OFFSET, a);
    symbolTable.put(x.getValue(),e);
    return a;

   }
   public JSAst locateOnTopLevel(){
    System.err.println("locateOnTopLevel "+this.ruleName);
    SymbolEntry e = symbolTable.get(this.ruleName.getValue());
    if(e!=null)return e.getAccess();
    return setOnTopLevel(this.ruleName);
   }

   public SymbolEntry resetAccess(JSId x, JSAccess a){
      SymbolEntry e = new SymbolEntry(x, NULL_OFFSET, a);
      symbolTable.put(x.getValue(), e);
      return e;
   }
   public String PATH ="rt/util.js";
   public void genCode(){
      LOAD(PATH).genCode();
      rules.stream().forEach((t)->t.genCode());
   }
   public JSAst compile(ParseTree tree){ 
      return visit(tree);
   }

   @Override
   public JSAst visitRules(PajamaParser.RulesContext ctx){
    System.err.println("VisitRules");
    ctx.ruleStatement().stream()
                       .forEach((r)->visit(r));
                       
    ctx.testStatement().stream()
                       .forEach((r)->visit(r));
    return null;
   }

   @Override
   public JSAst visitRuleStatement(PajamaParser.RuleStatementContext ctx){
      JSId id = ID(ctx.ID().getText());
      this.ruleName = id;
  	  JSAst formal = visit(ctx.formal());
  	  JSAst body = visit(ctx.ruleBody());
  	  JSAst frule = FUNCTION(id, formal, RET(APP(body, formal )));
  	  rules.add(frule);
  	  return frule;
   }
   @Override
   public JSAst visitTestStatement(PajamaParser.TestStatementContext ctx){
      System.err.println("visitTestStatement:");
      JSAst fun = ID(ctx.ID().getText());
      List<JSAst> args = ctx.args().expr()
                                   .stream()
                                   .map((t)->visit(t))
                                   .collect(Collectors.toList());
      JSAst fc = STATEMENT_FUNCALL(fun, args);
      rules.add(fc);
      return fc;
   }
   @Override
   public JSAst visitFormal(PajamaParser.FormalContext ctx){
       return ID(ctx.ID().getText());
   }
   @Override
   public JSAst visitRuleBody(PajamaParser.RuleBodyContext ctx){
      List<JSAst> fcases = ctx.caseRule().stream()
	                                       .map((c) -> visit(c))
										                     .collect(Collectors.toList());
	    Collections.reverse(fcases);
	  
	    return fcases.stream()
				           .reduce(FAIL, (z, fc)->
	                              FUNCTION(FORMALS(X), RET(APP(fc, ARGS(X,z)))));
	                
   }
   @Override
   public JSAst visitCaseRule(PajamaParser.CaseRuleContext ctx){
      symbolTable = new Hashtable<String, SymbolEntry>();
  	  stack = new Stack<JSAst>();
  	  this.offset = -1;
	  
      JSAst p = visit(ctx.pattern());
  	  JSAst e = visit(ctx. expr());
  	  // function(n, c)if(p(n)) return e; else return c(n);
  	  return FUNCTION(FORMALS(N, C),
	                   IF(APP(p, N), RET(APP(FUNCTION(FORMALS(X), RET(e)), N)),RET(APP(C, N))));
   }
   @Override 
   public JSAst visitPattern(PajamaParser.PatternContext ctx){
      System.err.println("visitPattern:");
      JSAst pi = visit(ctx.pattInit());
      if(ctx.pattRest()==null) return pi;
      JSAst pr = visit(ctx.pattRest());
      return FUNCTION(FORMALS(X), RET(AND(APP(pi, X), APP(pr, X))));
   }
   @Override 
   public JSAst visitPatNum(PajamaParser.PatNumContext ctx){
    JSNum n = NUM(Integer.valueOf(ctx.NUMBER().getText()));
    System.err.println("visitPatNum:"+n.getValue()+" "+this.offset+" "+this.stack);
    JSAst a = locateIdRelatively(X);
	  return FUNCTION(FORMALS(X), RET(EQ(a, n)));
   }
   @Override 
   public JSAst visitPatString(PajamaParser.PatStringContext ctx){
    System.err.println("visitPatString:"+this.offset+" "+this.stack);
    JSString s = STRING(ctx.STRING().getText());
    JSAst a = locateIdRelatively(X);
    return FUNCTION(FORMALS(X), RET(EQ(a, s)));
   }
   @Override
   public JSAst visitExprString(PajamaParser.ExprStringContext ctx){
      return STRING(ctx.STRING().getText());
   }   
   @Override 
   public JSAst visitPattArray(PajamaParser.PattArrayContext ctx){
      System.err.println("visitPattArray:");
      return visit(ctx.pattListOrEmpty());
   }   
   @Override 
   public JSAst visitPattListOrEmpty(PajamaParser.PattListOrEmptyContext ctx){
      System.err.println("visitPattListOrEmpty:");
      if(ctx.pattList()==null) return visit(ctx.pattEmpty());
      return visit(ctx.pattList());
   }   
   @Override 
   public JSAst visitPattEmpty(PajamaParser.PattEmptyContext ctx){
      System.err.println("visitPattEmpty:"+this.offset+" "+this.stack);
      JSAst a = locateIdRelatively(X);
      return FUNCTION(FORMALS(X), RET(APP(ISEMPTY, a)));
   } 
   @Override
   public JSAst visitPattObject(PajamaParser.PattObjectContext ctx){
    System.err.println("visitPattObject");
    return visit(ctx.pattPairOrEmpty());
   }  
   @Override
   public JSAst visitPattPairOrEmpty(PajamaParser.PattPairOrEmptyContext ctx){
    System.err.println("visitPattPairOrEmpty");
    if(ctx.pattPairList()==null)return visit(ctx.pattPairEmpty());
    return visit(ctx.pattPairList());
   }  

    @Override
   public JSAst visitPattPairEmpty(PajamaParser.PattPairEmptyContext ctx){
    System.err.println("visitPattPairEmpty:"+this.offset+" "+this.stack);
    JSAst a = locateIdRelatively(X);
    return FUNCTION(FORMALS(X), RET(APP(ISEMPTY_OBJECT, a)));
   } 

   @Override 
   public JSAst visitPattList(PajamaParser.PattListContext ctx){
      System.err.println("visitPattList:"+this.offset + " " + this.stack);
      int lastOffset = this.offset;
      if(this.offset >= 0) this.push(this.offset);
      this.offset = 0;
      List<JSAst> args = new ArrayList<JSAst>();
      ctx.pattern()
         .stream()
         .forEach((p)->{
           JSAst vp = visit(p);
           if(vp != null) args.add(vp);
           this.offset++;
         });

      int restOffset = this.offset;
      if(!this.isEmpty() && ((this.stack.peek() instanceof JSNum)))
         this.offset = ((JSNum)this.pop()).getValue();
      else 
        this.offset = lastOffset;
      JSAst locatedX = locateIdRelatively(X);
      JSAst predicateFirstPart = APP(PATLIST, ARGS(ARRAY(args), locatedX));
      JSAst predicateRestPart, predicateComplete;

      if(ctx.pattRestArray() != null){
        System.err.println("visitPattList (BEFORE REST):"+this.offset+" "+ this.stack);
        JSAccess sliceFirstPart = SLICE(locatedX, ZERO, NUM(restOffset)); 
        predicateFirstPart = APP(PATLIST, ARGS(ARRAY(args), sliceFirstPart));
        JSAccess sliceSecondPart = SLICE(X, NUM(restOffset));
        if(this.offset>=0) this.push(this.offset);
        this.push(sliceSecondPart);
        lastOffset = this.offset;
        this.offset=-1;
        predicateRestPart=visit(ctx.pattRestArray());
        this.offset = lastOffset;
        this.pop();
        if(this.offset>=0) this.pop();
        predicateComplete = AND(predicateFirstPart, APP(predicateRestPart, locateIdRelatively(X)));
        resetAccess(X,sliceSecondPart);
      }
       else predicateComplete=predicateFirstPart;
       return FUNCTION(FORMALS(X),RET(predicateComplete)); 
   } 

    @Override
   public JSAst visitPattPairList(PajamaParser.PattPairListContext ctx){
    System.err.println("visitPattPairList"+this.offset+" "+ this.stack);
    List<JSAst> args = new ArrayList<JSAst>();
    ctx.pattPair()
       .stream()
       .forEach((p)->{
          JSAst vp = visit(p);
          if(vp != null) args.add(vp);
       });
    JSAst objPattern = OBJECT(args);
    return FUNCTION(FORMALS(X), RET(APP(PATOBJTEST, ARGS(objPattern, locateIdRelatively(X)))));
   } 
   
   @Override
   public JSAst visitPattPair(PajamaParser.PattPairContext ctx){
    System.err.println("visitPattPair"+this.offset+" "+ this.stack);
    JSAst key = visit(ctx.keyPatt());

    if(this.offset >= 0) this.push(this.offset);
    JSAst locatedX = locateIdRelatively(X);
    if(key instanceof JSString)
      this.push(ACCESS(X, key));
    else this.push(OACCESS(X, (JSId)key));

    int lastOffset = this.offset;
    this.offset = -1;
    
    JSAst val = visit(ctx.pattern());
    this.offset = lastOffset;
    this.pop();

    if(this.offset >= 0) this.pop();

    return KEY_PATT(key,val);
   } 

   @Override
   public JSAst visitKeyPatt(PajamaParser.KeyPattContext ctx){
    return (ctx.ID()!=null)? ID(ctx.ID().getText())
                           : STRING(ctx.STRING().getText());

   }

   @Override 
   public JSAst visitPArray(PajamaParser.PArrayContext ctx){
      System.err.println("visitPArray:");
      return visit(ctx.pattArray());
   }
   @Override
   public JSAst visitPattRestArray(PajamaParser.PattRestArrayContext ctx){
      System.err.println("visitPattRestArray:"+this.offset+" "+ this.stack);
      if(ctx.pattArray()!=null)
        return visit(ctx.pattArray());
      return visit(ctx.pattRestId());
   }

   @Override 
   public JSAst visitPattRestId(PajamaParser.PattRestIdContext ctx){
    System.err.println("visitPattRestId:");
    JSId id = ID(ctx.ID().getText());
    locatePatternId(X);
    return ANY;
   }

    @Override 
   public JSAst visitPatUnderscore(PajamaParser.PatUnderscoreContext ctx){
    System.err.println("visitPatUnderscore:");
    return ANY;
   }

    @Override 
   public JSAst visitWhenPatt(PajamaParser.WhenPattContext ctx){
    System.err.println("visitWhenPatt:");
    return FUNCTION(FORMALS(X), RET(visit(ctx.expr())));
   }

   @Override 
   public JSAst visitPId(PajamaParser.PIdContext ctx){
    JSId id = ID(ctx.ID().getText());
    System.err.println("visitPId:"+id.getValue()+" "+this.offset+" "+ this.stack);
	  locatePatternId(X);
    return ANY;
   }
   //------------------------------------------------------------
  @Override 
  public JSAst visitRelOper(PajamaParser.RelOperContext ctx){
    List<JSId>  ropers = ctx.relOperator()
                            .stream()
                            .map((o)->(JSId)visit(o))
                            .collect(Collectors.toList());
    List<JSAst> rmonoms = ctx.arithOperation()
                             .stream()
                             .map((m)->visit(m))
                             .collect(Collectors.toList());
    JSAst a = rmonoms.get(0);
    JSAst point = rmonoms.stream()
                         .skip(1)
                         .reduce(POINT(0, a), (z, m)->{
                            JSPoint p = (JSPoint)z;
                            int k = p.index;
                            return POINT(p.add(1).index, OPERATION(ropers.get(k), p.y, m));
                         });
    return ((JSPoint)point).y;
  }
    @Override 
	public JSAst visitIdSingle(PajamaParser.IdSingleContext ctx){
	  String value = ctx.ID().getText();
    System.err.println("visitIdSingle:"+value+" "+this.stack+" "+ this.offset);
	  JSId id = ID(value);
	  SymbolEntry entry = symbolTable.get(value);
	  if(entry != null){
	     return entry.getAccess();
	  }
    else{
      System.err.println("*** WARNING id not found:--> "+value);
    }
	  return locateOnTopLevel();
	}

  @Override
  public JSAst visitArithOperation(PajamaParser.ArithOperationContext ctx){
    List<JSId> opers = ctx.operAddPlus()
                          .stream()
                          .map((o)->(JSId)visit(o))
                          .collect(Collectors.toList());
    List<JSAst> monoms = ctx.arithMonom()
                          .stream()
                          .map((m)->visit(m))
                          .collect(Collectors.toList());
    JSAst a = monoms.get(0);
    JSAst point = monoms.stream()
                        .skip(1)
                        .reduce(POINT(0, a), (z, m) -> {
                          JSPoint p = (JSPoint)z;
                          int k = p.index;
                          return POINT(p.add(1).index, OPERATION(opers.get(k), p.y, m));
                        });
    return ((JSPoint)point).y;
  }

   @Override
   public JSAst visitOperAddPlus(PajamaParser.OperAddPlusContext ctx){
      return ID(ctx.op.getText());
   }
   
   @Override
   public JSAst visitRelOperator(PajamaParser.RelOperatorContext ctx){
      return ID(ctx.op.getText());
   }
   
   @Override
   public JSAst visitFunCallExpr(PajamaParser.FunCallExprContext ctx){
    JSAst fun = visit(ctx.idSingle());
    List<JSAst> args = new ArrayList<JSAst>();
    //IF(args != NULL)
    ctx.args().expr()
       .stream()
       .forEach((arg) -> {
          args.add(visit(arg));
        });
    return FUNCALL(fun, args);
   }
   @Override
   public JSAst visitArrayExpr(PajamaParser.ArrayExprContext ctx){
    System.err.println("visitArrayExpr");
      List<JSAst> args = new ArrayList<JSAst>();
      //IF para 0 args
      ctx.args()
         .expr()
         .stream()
         .forEach((p)->{
           JSAst vp = visit(p);
           if(vp != null) args.add(vp);
         });
      return ARRAY(args);
   }
   @Override
   public JSAst visitExprNum(PajamaParser.ExprNumContext ctx){
      return NUM(Integer.valueOf(ctx.NUMBER().getText()));
   }
   @Override
   public JSAst visitExprTrue(PajamaParser.ExprTrueContext ctx){
      return TRUE;
   }
   @Override
   public JSAst visitExprFalse(PajamaParser.ExprFalseContext ctx){
      return FALSE;
   }

}
  