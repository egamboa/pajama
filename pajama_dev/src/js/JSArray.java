package pajama.js;
import java.io.*;
import java.util.List;
public class JSArray implements JSAst{
   private List<JSAst> args;
   public List<JSAst> getArgs(){return this.args;}
   
   public JSArray(List<JSAst> args){
      this.args = args;
   }
   public void genCode(PrintStream out){
      out.print("[");
	  if(this.args != null) genCode(out, this.args);
	  out.print("]");
   }
}