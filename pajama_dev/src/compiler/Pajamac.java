package pajama.compile;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;


public class Pajamac {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length>0) 
		  inputFile = args[0];
        InputStream is = System.in;
        if (inputFile!=null){
 		   is = new FileInputStream(inputFile);
		   System.out.println("Reading from "+inputFile);
		} else{
		   System.out.println("Reading from console (enter CTRL-Z+ENTER to finish");
		}
        ANTLRInputStream input = new ANTLRInputStream(is);
        PajamaLexer lexer = new PajamaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PajamaParser parser = new PajamaParser(tokens);
        ParseTree tree = parser.rules(); 
        
		System.out.println("Pajamac");
		Compiler comp = new Compiler();
		comp.compile(tree);
		comp.genCode();
		
    }
}
