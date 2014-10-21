package pajama.js;
import java.io.*;
import java.util.*;
public class JSOAccess extends  JSAccess{
   List<JSAst> args;
   public JSOAccess(JSAst left, JSId right, List<JSAst> args){
      super(left, right);
	  this.args = args;
   }
   @Override
   public JSAccess setLeft(JSAst left){
      return new JSOAccess(left, (JSId)this.right, args);
   }
   public JSOAccess(JSAst left, JSId right){
      super(left, right);
	  this.args = null;
   }
   @Override
   public void genCode(PrintStream out){
      
      getLeft().genCode(out);
	  out.print(".");
	  getRight().genCode(out);
	  if(args != null){
	    out.print("(");
	    genCode(out, args);
	    out.print(")");
	  }
   }
}