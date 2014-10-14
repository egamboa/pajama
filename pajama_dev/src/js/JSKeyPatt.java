package pajama.js;
import java.util.*;
import java.io.PrintStream;

public class JSKeyPatt implements JSAst{
  
   private JSAst key, val;
   public JSKeyPatt(JSAst key, JSAst val){
      this.key = key;
      this.val = val;
   }
   @Override
   public void genCode(PrintStream out){
	 key.genCode(out); 
	 out.format(" : ");
	 val.genCode(out);
   }
}