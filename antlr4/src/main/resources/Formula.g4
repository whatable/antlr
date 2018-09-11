grammar Formula;


logicExpression: logicAtomExpression (('&&' | '||') logicAtomExpression)*;
logicAtomExpression: 'TRUE' | 'FALSE' | conditionExpression | '(' logicExpression ')';

conditionExpression: arithmeticAddExpression op=('==' | '!=' | '>' | '<' | '>=' | '<=') arithmeticAddExpression;

// 原子算术表达式。数字是天然的原子算术表达式；而一个算术表达式（实际上是个加减表达式）如果加了括号，就会强制先算出值，本质上也是一个数字。
arithmeticAtomExpression: NUM | '(' arithmeticAddExpression ')';

// 乘除表达式。乘除优先级高，所以首先用原子表达式构成乘除表达式。稍后用乘除表达式构成加减表达式。
arithmeticMulExpression: arithmeticAtomExpression (('*'|'/') arithmeticAtomExpression)*;

// 加减表达式，四则运算优先级最低，也就是最后才执行的，执行了之后没有任何其他可处理的了，所以每个四则运算表达式实质上就是一个加减表达式
arithmeticAddExpression: arithmeticMulExpression (('+'|'-') arithmeticMulExpression)*;


// 数字，含正负、整数、小数
NUM: DIGIT+	| '(' '-' DIGIT+ ')' | DIGIT+'.'DIGIT+ | '(' '-' DIGIT+'.'DIGIT+ ')';

// 数位0-9
DIGIT : [0-9];

// 空白
WS : [ \t\r\n]+ -> skip;
