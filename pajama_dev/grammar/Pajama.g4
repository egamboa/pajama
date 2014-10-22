grammar Pajama;
// loriacarlos@gmail.com EIF400 II-2014
// START
rules : ruleStatement+ (testStatement ';'?)* ;

// RULE
ruleStatement 		: 'rule' ID formal '{' ruleBody  '}'
;
testStatement 		: ID '(' args ')' 
;
formal            	: '(' ID ')'
;
ruleBody         	: caseRule ('|' caseRule)*;
caseRule         	: 'case' pattern '->' expr  ;

// PATTERN
pattern  			:   pattInit(pattRest)? 
           				| '(' pattern ')'
;
pattInit 			: ANY 			#PatUnderscore
					 | ID  			#PId
                     | pattArray  	#PArray
					 | pattObject 	#PObject
					 | pattConstant #PCte 
;
pattRest 			: '@' ID 		#AtPatt
                     |'when' expr 	#WhenPatt
;
pattArray         	: '[' pattListOrEmpty ']'
;
pattObject        	: '{' pattPairOrEmpty '}'
;
pattListOrEmpty 	: pattEmpty | pattList
;
pattPairOrEmpty 	: pattPairEmpty | pattPairList
;
pattList 			: pattern (',' pattern)* ( '|' pattRestArray)?
;
pattEmpty 			: 
;
pattPairEmpty 		:
;
pattPairList : pattPair (',' pattPair)*
;
pattRestArray		:  pattArray | pattRestId
;
pattRestId 			: ID
;
pattPair     : keyPatt ':' pattern;

keyPatt		 : STRING | ID
;
pattConstant       	:  NUMBER  #PatNum
                   	 | STRING  #PatString
				   	 | 'true'  #PatTrue
				     | 'false' #PatFalse
				     | 'null'  #NullPat
;

// EXPRESSION
arrayExpr  			: '[' args? ']';
object   			: '{' pairs? '}';
pairs    			: pair (',' pair)*;
pair     			: key ':' expr;
key    				: STRING | ID;

expr      			: relMonom ('||' relMonom)*; //Pulga? ||
relMonom  			: relOperation ('&&' relOperation)*
;

relOperation 		:  arithOperation ( relOperator arithOperation)*	#RelOper
                 	 | '!'  relOperation								#NegRelOper
;
relOperator 		: op=('>' | '<' | '==' | '<=' | '>=' | '!=');

arithOperation 		: arithMonom (operAddPlus arithMonom)*;
arithMonom     		: arithSingle (('*' | '/') arithSingle)*;
arithSingle    		:  '-' arithOperation			#DecExpr
					 | idSingle '(' args? ')'    	#FunCallExpr
					 | arrayExpr					#ArrayCall
                   	 | '(' expr ')'					#ParExpr
		           	 | arithSingle ('.' ID)+ 		#ObjectAccess
				   	 | idSingle 					#idExpr
				   	 | object    					#ObjectExpr
		           	 | constant 					#ConstantExpr
;

idSingle : ID
;

operAddPlus : op=('+' | '-')
;
constant        :    NUMBER  #ExprNum 
                   | STRING  #ExprString 
				   | 'true'  #ExprTrue
				   | 'false' #ExprFalse
				   | 'null'  #ExprNull
;
args   :  expr (',' expr)*;

// LEXER
NUMBER : INTEGER ('.' INTEGER)? ;
fragment INTEGER : [0-9]+ ;
STRING : ('"' (~'"')* '"' );
ID : [a-zA-Z][a-zA-Z_0-9]*;
ANY : '_';

// IGNORE
CS : '//' .*? '\r'?'\n' -> skip;
CSB : '/*' .*? '*/' -> skip;
WS : [ \t\r\n]+ -> skip ;