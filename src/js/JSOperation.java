package pajama.js;
public class JSOperation implements  JSAst{
   private JSAst oper;
   private JSAst left, right;
   public JSOperation(JSAst oper, JSAst left, JSAst right){
      this.oper = oper;
	  this.left = left;
	  this.right = right;
   }
   
}