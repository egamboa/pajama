package pajama.js;
import java.io.*;
public class JSOperation implements  JSAst{
   protected JSAst oper, left, right;
   public JSOperation(JSAst oper, JSAst left, JSAst right){
     this.oper = oper;
	  this.left = left;
	  this.right = right;
   }
   @Override
   public void genCode(PrintStream out){
      out.print("(");
	  left.genCode(out);
      oper.genCode(out);
	  right.genCode(out);
	  out.print(")");
	  
   }
   
}