package pajama.js;
import java.util.*;
import java.io.*;
public class JSFunction implements JSAst{
   static private JSId UNK = new JSId("");
   private JSId name;
   private List<JSAst> formals;
   private JSAst body;
   public JSFunction(List<JSAst> formals, JSAst body){
      this(UNK, formals, body);
   }
   public JSFunction(JSId name, List<JSAst> formals, JSAst body){
      this.formals = formals;
	  this.body = body;
	  this.name = name;
   }
   public void genCode(PrintStream out){
       out.format("function %s(", name.getValue());
	   genCode(out, formals);
	   out.print(")");
	   out.print("{");
	   body.genCode(out);
	   out.print("}");
   }
}