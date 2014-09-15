package pajama.js;
import java.io.*;
import java.util.*;

public interface JSAst{
   default void genCode(){
      genCode(System.out);
   }
   default void genCode(PrintStream out){
   }
   default void genCode(PrintStream out, List<JSAst> args){
       int n = args.size();
	   if(n==0) return;
	   if(n==1) {args.get(0).genCode(out);return;}
	   args.stream().limit(n-1)
	                .forEach((t)->{t.genCode(out);out.print(", ");});
	   args.get(n-1).genCode(out);
   }
}