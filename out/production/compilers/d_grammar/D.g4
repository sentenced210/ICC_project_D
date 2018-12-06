grammar D;

program : body EOF;

body : (statement)+;

statement : declaration
    | assignment
    | if_statement
    | loop
    | return_statement
    | print;

declaration :  'var' var_definition (',' var_definition)*;

var_definition : IDENT (':=' expression)?;

assignment : reference ':=' expression;

if_statement : 'if' expression 'then' body ('else' body)? 'end';

loop : while_loop | for_loop;

while_loop : 'while' expression 'then' body 'end';

for_loop : 'for' (IDENT 'in')? expression '..' expression 'loop' body 'end';

return_statement : 'return' expression?;

print : 'print' expression (',' expression)*;

expression : relation (('or' | 'and' | 'xor') relation)*;

relation : factor (('<'|'<='|'>='|'>'|'='| '/=') factor)?;

factor : term (('+'|'-') term)*;

term : unary (('*'|'/') unary)*;

unary : reference
    | reference 'is' type_indicator
    | ('+'|'-'|'not')? primary;

primary : literal
    | read_int | read_real | read_string
    | function_literal
    | '(' expression ')';

type_indicator : 'int' | 'real' | 'bool' | 'string'
    | 'empty'
    | '[' ']'
    | '{' '}'
    | 'func';

read_int : '@int';

read_real : '@real';

read_string : '@string';

function_literal : 'func' ('('IDENT (',' IDENT)* ')')? function_body;

function_body : 'is' body 'end'
    | '=>' expression;

reference : IDENT
    | reference '[' expression ']'
    | reference '(' expression (',' expression)* ')'
    | reference '.' IDENT;

literal : INTEGER
    | REAL
    | STRING
    | BOOLEAN
    | tuple
    | array
    | 'empty';

array : '[' (expression (',' expression)*)? ']';

tuple : '{'tuple_element (',' tuple_element)* '}';

tuple_element: (IDENT ':=' )? expression;

INTEGER : [0-9]+;

REAL : [0-9]+'.'[0-9]+;

STRING : (["] CHARACTER* ["])
    | (['] CHARACTER* [']);

fragment
CHARACTER : ~["'\r\n\\] | ESCAPECHARACTER ;

fragment
ESCAPECHARACTER : '\\' [btnfr"'\\];

BOOLEAN : 'true'|'false';

IDENT : [A-Za-z][_a-zA-Z0-9]*;

Comment : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip;

WS: [\n\t\r ;]+ -> skip;