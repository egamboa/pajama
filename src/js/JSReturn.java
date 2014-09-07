package pajama.js;
import java.util.*;
public class JSReturn implements JSAst{
  
   private JSAst e;
   public JSReturn(JSAst e){
      this.e = e;
   }
}