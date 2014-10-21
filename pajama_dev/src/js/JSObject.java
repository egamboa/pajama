package pajama.js;
import java.util.*;
import java.io.*;
public class JSObject implements JSAst{
   private List<JSAst> pairs;   
   public JSObject(List<JSAst> pairs){
      this.pairs = pairs;
   }

   public void genCode(PrintStream out){
      out.print("{");
      genCode(out, pairs);
	   out.print("}");
   }
} 