package pajama.compile;
import pajama.js.*;
import java.util.*;

public interface Emiter{
   default JSNum NUM(int value){ return new JSNum(value);}
   default JSId  ID(String value){return new JSId(value);}
   default JSFunction FUNCTION(List<JSAst> formals, JSAst body){
           return new JSFunction(formals, body);
   }
   default JSFunction FUNCTION(JSId name, JSAst body){
       return new JSFunction(name, Arrays.asList(), body);
   }
   default JSFunction FUNCTION(JSAst arg, JSAst body){
       return new JSFunction(Arrays.asList(arg), body);
   }
   default JSFunction FUNCTION(JSId id, JSAst arg, JSAst body){
       return new JSFunction(id, Arrays.asList(arg), body);
   }
   default JSIf IF(JSAst c, JSAst t, JSAst e){
       return new JSIf(c, t, e);
   }
   default JSApply APP(JSAst c, JSAst e){
       return new JSApply(c, e);
   }
   default JSApply APP(JSAst f, List<JSAst> args){
       return new JSApply(f, args);
   }
   default List<JSAst> ARGS(JSAst... args){ return Arrays.asList(args);}
   default List<JSAst> FORMALS(JSAst... args){ return Arrays.asList(args);}
   default JSAst EQ(JSAst a, JSAst b){
      return OPERATION(OPER("==="), a, b);
   }
   default JSAst OPERATION(JSAst oper, JSAst a, JSAst b){
      return new JSOperation(oper, a, b);
   }
   default JSAst LOAD(String s){ return new JSLoad(s);}
   default JSArray ARRAY(List<JSAst> args){ return new JSArray(args);}
   default JSAccess ACCESS(JSAst a, JSAst k){return new JSAccess(a, k);}
   default JSAst RET(JSAst e){ return new JSReturn(e);}
   default JSAst OPER(String op){return new JSId(op);}
   final JSBool TRUE = new JSBool(true);
   final JSBool FALSE = new JSBool(false);
   final JSId X = new JSId("x");
   final JSId N = new JSId("n");
   final JSId C = new JSId("c");
   final JSId FAIL = new JSId("fail");
   final JSId PATLIST = new JSId("patListTest");
}