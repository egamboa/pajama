package pajama.js;
import java.util.*;
import java.io.*;
public class JSReturn implements JSAst{
  
   private JSAst e;
   public JSReturn(JSAst e){
      this.e = e;
   }
   @Override
   public void genCode(PrintStream out){
   
      out.print("return ");
	  e.genCode(out);
	  out.print(";");
   }
}