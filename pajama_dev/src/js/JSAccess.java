package pajama.js;
import java.io.*;
public class JSAccess extends  JSPrintable{
   private JSAst left, right;
   public JSAst getLeft(){return this.left;}
   public JSAst getRight(){return this.right;}
   public JSAccess setLeft(JSAst left){
      return new JSAccess (left,this.right);
   }

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