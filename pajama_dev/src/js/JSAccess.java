package pajama.js;
import java.io.*;
public class JSAccess implements  JSAst{
   private JSAst left, right;
   public JSAst getLeft(){return this.left;}
   public JSAccess setLeft(JSAst left){
      this.left = left;
	  return this;
   }
   public JSAccess setId(JSId id){
      JSAst x = this.left;
	  JSAccess last=this;
	  while(!(x instanceof JSId)){
	      last = ((JSAccess)x);
     	  x = last.getLeft();
	  }
	  last.setLeft(id);
	  return this;
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