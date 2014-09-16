package pajama.js;
import java.io.*;
public class JSAccess implements  JSAst{
   private JSAst left, right;
   public JSAccess(JSAst left, JSAst right){
      this.left = left;
	  this.right = right;
   }
   @Override
   public void genCode(PrintStream out){
      
	  left.genCode(out);
	  out.print("[");
      right.genCode(out);
	  out.print("]"); // left[right]
	  
   }
   
   
}