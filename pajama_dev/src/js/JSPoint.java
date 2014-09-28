package pajama.js;
import java.util.*;
import java.io.*;
public class JSPoint implements JSAst{
   
   public JSNum x;
   public int index;
   public JSAst y;
   
   
   public JSPoint(JSNum x, JSAst y){
      this.x = x;
	  this.index = x.getValue();
      this.y = y;
	  
   }
   public JSPoint add(int k){
      this.index+=k;
	  this.x = new JSNum(this.index);
	  return this;
   }
   @Override
   public void genCode(PrintStream out){
      out.print("(");
	  x.genCode(out);
	  out.print(",");
	  y.genCode(out);
	  out.print(")");
   }
}