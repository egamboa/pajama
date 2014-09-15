package pajama.compile;

import pajama.js.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;
import java.util.stream.*;


public class Compiler extends PajamaBaseVisitor<JSAst> implements Emiter{
   List<JSAst> rules = new ArrayList<>();
   public void genCode(){
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
      JSAst p = visit(ctx.pattern());
	  JSAst e = visit(ctx. expr());
	  // function(n, c)if(p(n)) return e; else return c(n);
	  return FUNCTION(FORMALS(N, C),
	                  IF(APP(p, N), RET(e), RET(APP(C, N))));
   }
   @Override 
   public JSAst visitPatNum(PajamaParser.PatNumContext ctx){
      JSAst n = NUM(Integer.valueOf(ctx.NUMBER().getText()));
	  return FUNCTION(FORMALS(X), RET(EQ(X, n))); //function(x)x===n;
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
  