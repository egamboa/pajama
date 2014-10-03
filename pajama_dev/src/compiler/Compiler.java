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
   Stack<Integer> stack = new Stack<>();
   int offset =0;
   
   public JSAst locate(JSId x){
       
      if(this.offset<0) return x;
      SymbolEntry entry = symbolTable.get(x.getValue());
      List<JSAst> rstack =  new ArrayList<>();
      for(Integer k : stack){
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
  	  stack = new Stack<Integer>();
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
	  return FUNCTION(FORMALS(X), RET(EQ(locate(X), n))); //function(x)x===n;
   }
   @Override
   public JSAst visitExprSring(PajamaParser.ExprTStringContext ctx){
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
   public JSAst visitPattList(PajamaParser.PattListContext ctx){
      System.err.println("visitPattList:");
      int lastOffset = this.offset;
      if(this.offset > 0) this.stack.push(this.offset);
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
      if(!stack.empty())
         this.offset = stack.pop();
      else this.offset = lastOffset;
      
      JSAst predicateFirstPart = APP(PATLIST, ARGS(ARRAY(args), X));
      JSAst predicateRestPart, predicateComplete;
      if(ctx.pattRestArray() != null){
         predicateRestPart = visit(ctx.pattRestArray());
         JSAccess a = SLICE(X, NUM(restOffset));
         resetAccess(X, a);
         predicateComplete = AND(predicateFirstPart,
                                APP(predicateRestPart, a));
      }
      else predicateComplete = predicateFirstPart;
      return FUNCTION(FORMALS(X), RET(predicateComplete));
   } 
   
   @Override 
   public JSAst visitPArray(PajamaParser.PArrayContext ctx){
      System.err.println("visitPArray:");
      return visit(ctx.visitPArray());
      /*if(this.offset!=0) this.stack.push(this.offset);
	  this.offset=0;
	  List<JSAst> args = new ArrayList<JSAst>();
	  ctx.pattArray()
	     .pattList()
		 .pattern()
		 .stream()
		 .forEach((p)->{
		    JSAst vp = visit(p);
		    if(vp != null) args.add(vp); 
			this.offset++;
		 });
		 if(!stack.empty())
           this.offset=stack.pop();
		 else this.offset = 0;
	  
      return FUNCTION(FORMALS(X), RET(APP(PATLIST, ARGS(ARRAY(args), X))));
    */
   }
   @Override
   public JSAst visitPattRestArray(PajamaParser.PattRestArrayContext ctx){
      System.err.println("visitPattRestArray:");
      if(ctx.pattArray()!=null)
        return visit(ctx.pattArray());
      JSId id = ID(ctx.ID().getText());
      locate(id);
      return  FUNCTION(FORMALS(X), RET(TRUE));
   }
   @Override 
   public JSAst visitPId(PajamaParser.PIdContext ctx){
      JSId id = ID(ctx.ID().getText());
	  locate(id);
	  return FUNCTION(FORMALS(X), RET(TRUE));
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
    //1 visitar arithsingle y guardar en un jsAst
    //2 visitar args().expr()
    //3 visit expr visitandolos y guardandolos en una lista
    // return FUNCALL(#1, #3);
    return TO_BE_DONE("FUNCALL_TO_BE_DONE");
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
  