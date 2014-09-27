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
   JSAst s;
   JSNum offset;
   public SymbolEntry(JSId x, JSNum offset, JSAst s){
      this.x = x;
	  this.s = s;
	  this.offset = offset;
   }
   public JSAst getAccess(){return this.s;}
   public JSAst getOffset(){return this.offset;}
   
   public void update(){this.offset = new JSNum(this.offset.getValue()+1);}
   
}
public class Compiler extends PajamaBaseVisitor<JSAst> implements Emiter{

   List<JSAst> rules = new ArrayList<>();
   Map<String, SymbolEntry> symbolTable;
   Stack<Integer> stack = new Stack<>();
   int offset =0;
   
   public JSAst locate(JSId x){
       
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
	   SymbolEntry e = new SymbolEntry(x, off, a);
	   symbolTable.put(x.getValue(), e);
	   return a;
	   
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
  	  this.offset = 0;
      JSAst p = visit(ctx.pattern());
  	  JSAst e = visit(ctx. expr());
  	  // function(n, c)if(p(n)) return e; else return c(n);
  	  return FUNCTION(FORMALS(N, C),
  	                  IF(APP(p, N), RET(e), RET(APP(C, N))));
   }
   @Override 
   public JSAst visitPatNum(PajamaParser.PatNumContext ctx){
      JSAst n = NUM(Integer.valueOf(ctx.NUMBER().getText()));
	  return FUNCTION(FORMALS(X), RET(EQ(locate(X), n))); //function(x)x===n;
   }
   
   
   @Override 
   public JSAst visitPArray(PajamaParser.PArrayContext ctx){
      if(this.offset!=0) this.stack.push(this.offset);
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
	     return entry.getAccess();
	  }
	  return id;
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
  