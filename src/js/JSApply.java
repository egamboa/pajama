package pajama.js;
import java.util.*;
public class JSApply implements JSAst{
   
   private JSAst f;
   private List<JSAst> args;
   
   public JSApply(JSAst f, JSAst e){
      this(f, Arrays.asList(e));
   }
   public JSApply(JSAst f, List<JSAst> args){
      this.f = f;
      this.args = args;
	  
   }
}