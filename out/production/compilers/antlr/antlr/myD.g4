grammar myD;

program : program_unit EOF;

program_unit : (statement end_of_statement)+;
end_of_statement : (';' | NEWLINE | EOF);



INTEGER : [0-9]+;
REAL : [0-9]+'.'[0-9]+;
STRING : ["'] CHARACTER* ["'];
fragment
CHARACTER : ~["'\r\n\\] | ESCAPESEQUENCE ;
fragment
ESCAPECHARACTER : '\\' [btnfr"'\\];
BOOLEAN : 'true'|'false';
EMPTY : 'empty';
IDENT : [A-Za-z][_a-zA-Z0-9]*;
NEWLINE : '\r'? '\n'
