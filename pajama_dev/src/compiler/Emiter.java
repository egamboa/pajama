package pajama.compile;
import pajama.js.*;
import java.util.*;

public interface Emiter{
   default JSNum NUM(int value){ return new JSNum(value);}
   default JSString STRING(String value){return new JSString(value);} 
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
   default JSAst AND(JSAst a, JSAst b){
      return OPERATION(OPER("&&"), a, b);
   }
   default JSAst LENGTH(JSAst a){
      return OPERATION(OPER("."), a, LENGTH_ID);
   }
   default JSAst OPERATION(JSAst oper, JSAst a, JSAst b){
      return new JSOperation(oper, a, b);
   }
   default JSAst LOAD(String s){ return new JSLoad(s);}
   default JSArray ARRAY(List<JSAst> args){ return new JSArray(args);}
   default JSAccess ACCESS(JSAst a, JSAst k){return new JSAccess(a, k);}
   default JSAccess OACCESS(JSAst a, JSId k){return new JSOAccess(a, k);}
   default JSAst RET(JSAst e){ return new JSReturn(e);}
   default JSAst OPER(String op){return new JSId(op);}
   default JSPoint POINT(JSNum x, JSAst y){ return new JSPoint(x, y);}
   default JSPoint POINT(int x, JSAst y){ return POINT(NUM(x),y);}
   default JSAst FUNCALL(JSAst fun, List<JSAst> args){return new JSFuncall(fun, args);}
   default JSStatementFuncall STATEMENT_FUNCALL(JSAst fun, List<JSAst> args){return new JSStatementFuncall(fun, args);}
   default JSAst TO_BE_DONE(String msg){return ID(msg+"()");}
   default JSAst EMPTY_PREDICATE(){return FUNCTION(FORMALS(X), RET(APP(ISEMPTY, X)));}
   default JSOAccess SLICE(JSAst a, JSAst n){ return new JSOAccess(a, SLICE,  ARGS(n)); }
   final JSBool TRUE = new JSBool(true);
   final JSBool FALSE = new JSBool(false);
   final JSId X = new JSId("x");
   final JSId N = new JSId("n");
   final JSId C = new JSId("c");
   final JSId FAIL = new JSId("fail");
   final JSNum NULL_OFFSET = new JSNum(-1);
   final JSId PATLIST = new JSId("patListTest");
   final JSId ISEMPTY = new JSId("patListTestEmpty");
   final JSId LENGTH_ID = new JSId("length");
   final JSId SLICE = new JSId("slice");
}