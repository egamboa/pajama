package pajama.js;
import java.io.*;
import java.util.*;
public class JSFuncall implements  JSAst{
   private JSAst fun;
   List<JSAst> args;
   public JSAst getFun(){return this.fun;}
   public List<JSAst> getArgs(){return this.args;}
   
   
   public JSFuncall(JSAst fun, List<JSAst> args){
      this.fun = fun;
	  this.args = args;
   }
   @Override
   public void genCode(PrintStream out){
      
	  fun.genCode(out);
	  out.print("(");
      if(args!=null && args.size()>0) genCode(out, args);
	  out.print(")");
	  
   }
   
   
}