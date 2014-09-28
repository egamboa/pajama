package pajama.js;
import java.util.*;
import java.io.*;
public class JSApply implements JSAst{
   
   private JSAst f;
   private List<JSAst> args;
   
   public JSApply(JSAst f, JSAst e){
      this(f, Arrays.asList(e));
   }
   public JSApply(JSAst f, List<JSAst> args){
      this.f = f;
      this.args = args;
	  
   }
   @Override
   public void genCode(PrintStream out){
      out.print("(");
	  f.genCode(out);
	  out.print(")");
	  out.print("(");
	  genCode(out, args);
	  out.print(")");
   }
}