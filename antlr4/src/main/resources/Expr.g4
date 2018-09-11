grammar Expr;

// 这是一个四则运算表达式

expr: expr1 (('+'|'-') expr1)*;			//加减
expr1: expr0 (('*'|'/') expr0)*;		//乘除
expr0: NUM | '(' expr ')';

NUM: DIGIT+
	| '(' '-' DIGIT+ ')'
	| DIGIT+'.'DIGIT+
	| '(' '-' DIGIT+'.'DIGIT+ ')'
;
DIGIT : [0-9];

ID: [a-zA-Z][a-zA-Z0-9]*;
WS : [ \t\r\n]+ -> skip;