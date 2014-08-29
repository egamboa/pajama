grammar Pajama;
// loriacarlos@gmail.com EIF400 II-2014
// START
rules : ruleStatement+ ;
// RULE
ruleStatement : 'rule' ID formal '{' ruleBody  '}';
formal            : '(' ID ')';
ruleBody          : caseRule ('|' caseRule)*;
caseRule          : 'case' pattern '->' expr  ;

// PATTERN
pattern  :   pattInit(pattRest)? 
           | '(' pattern ')';
pattInit :            ID 
                    | pattArray 
					| pattObject 
					| constant;
pattRest :            '@' ID 
                    | 'when' expr
					;
pattArray         :  '[' pattList? ']';
pattObject        :  '{' pattPair* '}';
pattList : pattern (',' pattern)*;
pattPair : key ':' pattern;



params   : '[' args ']';
object   : '{' pairs? '}';
pairs    : pair (';' pair)*;
pair     : key ':' expr;
key      : STRING | ID;

// EXPRESSION
expr      : relMonom ('||' relMonom)*;
relMonom  : relOperation ('&&' relOperation)*;

relOperation :      arithOperation ( relOperator arithOperation)*
                 | '!'  relOperation
;
relOperator :	('>' | '<' | '==' | '<=' | '>=' | '!=');			
arithOperation : arithMonom (('+' | '-')  arithMonom)*;
arithMonom     : arithSingle (('*' | '/') arithSingle)*;
arithSingle    :     '-' arithOperation
                   | '(' expr ')'
				   | ID 
                   | arithSingle '(' args? ')' 
		           | arithSingle ('.' ID)+ 
				   | object
		           | constant 
		         
				   ;
constant        :    NUMBER 
                   | STRING
				   | 'true'
				   | 'false'
				   | 'null' 
				   ;
args   :  expr (',' expr)*;

// LEXER

NUMBER : INTEGER ('.' INTEGER)? ;
fragment INTEGER : [0-9]+ ;
STRING : ('"' (~'"')* '"' );

ID : [a-zA-Z][a-zA-Z_0-9]* ;
// IGNORE
WS : [ \t\r\n]+ -> skip ;
