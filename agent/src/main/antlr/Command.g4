grammar Command;

parse
 : command_list
 ;

command_list
 : ( help_command
 | sc_command
 | keymap_command
 | exit_command
 | cls_command
 )
 ;

help_command
 : HELP_COMMAND
 ;

sc_command
 : SC_COMMAND general_help
 ;

keymap_command
 : KEYMAP_COMMAND
 ;

exit_command
 : EXIT_COMMAND | LOGOUT_COMMAND | QUIT_COMMAND
 ;

cls_command
 : CLS_COMMAND
 ;

general_help
 : '-'GENERAL_HELP
 ;

SC_COMMAND : S C;
GENERAL_HELP : H E L P;
KEYMAP_COMMAND : K E Y M A P;
EXIT_COMMAND : E X I T;
LOGOUT_COMMAND : L O G O U T;
QUIT_COMMAND : Q U I T;
CLS_COMMAND : C L S;
HELP_COMMAND : H E L P;

IDENTIFIER
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
 | '[' ~']'* ']'
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
 ;

NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

BIND_PARAMETER
 : '?' DIGIT*
 | [:@$] IDENTIFIER
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;

BLOB_LITERAL
 : X STRING_LITERAL
 ;

SINGLE_LINE_COMMENT
 : '--' ~[\r\n]* -> channel(HIDDEN)
 ;

MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

