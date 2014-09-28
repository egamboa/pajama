package pajama.js;
import java.util.*;
import java.io.PrintStream;

public class JSIf implements JSAst{
  
   private JSAst c, t, e;
   public JSIf(JSAst c, JSAst t, JSAst e){
      this.c = c;
	  this.t = t;
	  this.e = e;
   }
   @Override
   public void genCode(PrintStream out){
     out.format("if("); 
	 this.c.genCode(out); 
	 out.format(")"); 
	 this.t.genCode(out); 
	 out.format("\nelse "); 
	 this.e.genCode(out);
	
   }
}