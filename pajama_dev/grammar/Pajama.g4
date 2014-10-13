grammar Pajama;
// loriacarlos@gmail.com EIF400 II-2014
// START
rules : ruleStatement+ (testStatement ';')* ;

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
pattInit 			: ANY 			#Any
					 | ID  			#PId
                     | pattArray  	#PArray
					 | pattObject 	#PObject
					 | pattConstant #PCte 
;
pattRest 			: '@' ID 		#AtPatt
                     |'when' expr 	#WhenPatt
;
pattArray         	: '[' pattListOrEmpty ']'; 
pattObject        	: '{' pattPairOrEmpty '}'
;
pattListOrEmpty 	: pattEmpty | pattList
;
pattList 			: pattern (',' pattern)* ( '|' pattRestArray)?
;
pattEmpty 			: 
;
pattRestArray		: pattArray | ID
;

pattPairOrEmpty 	: pattPairEmpty | pattPairList
;
pattPairEmpty :
;
pattPairList : pattPair (',' pattPair)*
;
pattPair     : key ':' pattern;

pattConstant       	:  NUMBER  #PatNum
                   	 | STRING  #PatString
				   	 | 'true'  #PatTrue
				     | 'false' #PatFalse
				     | 'null'  #NullPat
;

// EXPRESSION
arrayExpr  			: '[' args? ']';
object   			: '{' pairs? '}';
pairs    			: pair (',' pair)* #PattPairList;
pair     			: key ':' expr #KeyPatt;
key      			: STRING | ID;

expr      			: relMonom ('||' relMonom)*; //Pulga? ||
relMonom  			: relOperation ('&&' relOperation)*
;

relOperation 		:  arithOperation ( relOperator arithOperation)*	#RelOper
                 	 | '!'  relOperation								#NegRelOper
;
relOperator 		: ('>' | '<' | '==' | '<=' | '>=' | '!=');

arithOperation 		: arithMonom (operAddPlus arithMonom)*;
arithMonom     		: arithSingle (('*' | '/') arithSingle)*;
arithSingle    		:  '-' arithOperation			#DecExpr
					 | idSingle '(' args? ')'    	#FunCallExpr
					 | arrayExpr					#ArrayCall
                   	 | '(' expr ')'					#ParExpr
		           	 | arithSingle ('.' ID)+ 		#ObjectAccess
				   	 | idSingle 					#idExpr
				   	 | ObjectExpr 						#ObjectExpr
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