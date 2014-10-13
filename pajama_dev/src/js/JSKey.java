package pajama.js;
import java.util.*;
import java.io.PrintStream;

public class JSKey implements JSAst{
  
   private JSId id;
   public JSKey(JSId id){
      this.id = id;
   }
   @Override
   public void genCode(PrintStream out){
	 this.id.genCode(out); 
	 out.format(":");	
   }
}