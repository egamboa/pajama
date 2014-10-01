package pajama.js;
import java.io.*;
import java.util.*;
public class JSStatementFuncall extends  JSFuncall{
   
   public JSStatementFuncall(JSAst fun, List<JSAst> args){
      super(fun, args);
   }
   @Override
   public void genCode(PrintStream out){
      super.genCode(out);
	  out.print(";");
	  
   }
   
   
}