grammar Command;

parse
 : command_list
 ;

command_list
 : ( help_command
 | sc_command
 | sm_command
 | classloader_command
 | keymap_command
 | exit_command
 | cls_command
 )
 ;

help_command
 : HELP_COMMAND
 ;

sc_command
 : SC_COMMAND ( ( detail_flag )?( field_flag )?( regex_flag )?( extend_flag )? class_pattern | ( general_help )?)
 ;

sm_command
 : SM_COMMAND ( ( detail_flag )?( regex_flag )? class_pattern (method_pattern)? | ( general_help )?)
 ;

classloader_command
 : CLASSLOADER_COMMAND ( ( all_flag )?( hashcode_flag )?( includeReflectionClassLoader_flag )?( resource_flag )?
 | ( general_help )?)
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
 : '-'HELP_COMMAND
 | '-'HELP
 ;

field_flag
 : '-'FIELD
 ;

resource_flag
 : '-'RESOURCE any_name
 ;

regex_flag
 : '-'REGEX
 ;

extend_flag
 : '-'EXTEND EXTEND_LEVEL
 ;

hashcode_flag
 : '-'HASHCODE_FLAG HASHCODE
 ;

includeReflectionClassLoader_flag
 : '-'INCLUDEREFLECTIONCLASSLOADER_FLAG
 ;

detail_flag
 : '-'DETAIL
 ;

all_flag
 : '-'ALL_INFO
 ;

class_pattern
 : any_name
 ;

method_pattern
 : any_name
 ;

any_name
 : IDENTIFIER
 | STRING_LITERAL
 | '(' any_name ')'
 ;

SC_COMMAND : S C;
SM_COMMAND : S M;
CLASSLOADER_COMMAND : C L A S S L O A D E R;
KEYMAP_COMMAND : K E Y M A P;
EXIT_COMMAND : E X I T;
LOGOUT_COMMAND : L O G O U T;
QUIT_COMMAND : Q U I T;
CLS_COMMAND : C L S;
HELP_COMMAND : H E L P;
HELP : H;
DETAIL : D;
ALL_INFO : A;
FIELD : F;
REGEX : E;
EXTEND : X;
HASHCODE_FLAG : C;
INCLUDEREFLECTIONCLASSLOADER_FLAG : I;
RESOURCE : R;

IDENTIFIER
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
 | '[' ~']'* ']'
 | [a-zA-Z_0-9_.*/] [a-zA-Z_0-9.*/]*
 ;

EXTEND_LEVEL
 : [1-5]?
 ;

HASHCODE
 : [1-9a-z]+
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

