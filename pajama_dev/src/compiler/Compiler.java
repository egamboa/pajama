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

   public JSAst locate(JSId x){
      System.err.println("locate:"+ x.getValue()+" "+stack+ " " +this.offset);

      if(this.offset<0) return x;
      SymbolEntry entry = symbolTable.get(x.getValue());
      List<JSAst> rstack =  new ArrayList<>();
      for(JSAst k : stack){
        rstack.add(k);
      }
      JSAst a = x;
      JSNum off = NUM(this.offset);
      for(JSAst k : rstack){
        if(k instanceof JSAccess){
          JSAccess na = (JSAccess)k;
          a = na.setLeft(a);
        }
        else a =ACCESS(a,k);
      }
      a = ACCESS(a, off);
      SymbolEntry e = new SymbolEntry(x, off, (JSAccess)a);
      symbolTable.put(x.getValue(), e);
      return a;
      
      /*for(Integer k : stack){
        rstack.add(NUM(k));
      }
      JSAst a = x;
      JSNum off = NUM(this.offset);
      for(JSAst k : rstack)
        a = ACCESS(a, k);
      a = ACCESS(a, off);
      SymbolEntry e = new SymbolEntry(x, off, (JSAccess)a);
      symbolTable.put(x.getValue(), e);
      return a;
      */
	   
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
	                   IF(APP(p, N), RET(e), RET(APP(C, N))));
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
      JSAst n = NUM(Integer.valueOf(ctx.NUMBER().getText()));
	  return FUNCTION(FORMALS(X), RET(EQ(locate(X), n)));
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
      System.err.println("visitPattEmpty:");
      return EMPTY_PREDICATE();
   } 

   @Override
   public JSAst visitPattPairOrEmpty(PajamaParser.PattPairOrEmptyContext ctx){
    System.err.println("visitPattPairOrEmpty");
    if(ctx.pattPairList()==null)return visit(ctx.pattPairEmpty());
    return visit(ctx.pattPairList());
   }  

    @Override
   public JSAst visitPattPairEmpty(PajamaParser.PattPairEmptyContext ctx){
    System.err.println("visitPattPairEmpty");
    return EMPTY_OBJECT_PREDICATE();
   } 

   @Override 
   public JSAst visitPattList(PajamaParser.PattListContext ctx){
      System.err.println("visitPattList:"+this.offset + " " + this.stack);
      int lastOffset = this.offset;
      if(this.offset > 0) this.push(this.offset);
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
      
      JSAst predicateFirstPart = APP(PATLIST, ARGS(ARRAY(args), X));
      JSAst predicateRestPart, predicateComplete;
      if(ctx.pattRestArray() != null){
        JSAccess slice=SLICE(locate(X),NUM(restOffset));
        this.push(slice);
        lastOffset = this.offset;
        this.offset=0;
        predicateRestPart=visit(ctx.pattRestArray());
        this.offset = lastOffset;
        this.pop();
        predicateComplete = AND(predicateFirstPart,APP(predicateFirstPart,X));
        resetAccess(X,slice);
      }
       else predicateComplete=predicateFirstPart;
       return FUNCTION(FORMALS(X),RET(predicateComplete)); 
   } 

    @Override
   public JSAst visitPattPairList(PajamaParser.PattPairListContext ctx){
    System.err.println("visitPattPairList");
    List<JSAst> args = new ArrayList<JSAst>();
    ctx.pattPair()
       .stream()
       .forEach((p)->{
          JSAst vp = visit(p);
          if(vp != null) args.add(vp);
       });
    return null ;   
   } 
   
   @Override
   public JSAst visitPattPair(PajamaParser.PattPairContext ctx){
    System.err.println("visitPattPair");
    JSAst key = visit(ctx.keyPatt());
    JSAst val = visit(ctx.pattern());
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
      System.err.println("visitPattRestArray:");
      if(ctx.pattArray()!=null)
        return visit(ctx.pattArray());
      return visit(ctx.pattRestId());
   }

   @Override 
   public JSAst visitPattRestId(PajamaParser.PattRestIdContext ctx){
    System.err.println("visitPattRestId:");
    JSId id = ID(ctx.ID().getText());
    locate(id);
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
	  locate(id);
	  //return FUNCTION(FORMALS(X), RET(TRUE));
    return ANY;
   }
   //------------------------------------------------------------
   
    @Override 
	public JSAst visitIdSingle(PajamaParser.IdSingleContext ctx){
	  String value = ctx.ID().getText();
	  JSId id = ID(value);
	  SymbolEntry entry = symbolTable.get(value);
	  if(entry != null){
	     return entry.getAccess().setId(X);
	  }
	  return id;
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
  