package pajama.js;
import java.io.*;
public class JSLoad implements JSAst{
  
   private String p;
   public JSLoad(String p){
      this.p = p;
   }
   @Override
   public void genCode(PrintStream out){
   
      out.print("load('");
	  out.print(p);
	  out.print("');");
   }
}