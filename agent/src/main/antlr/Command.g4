grammar Command;

parse
 : command_list
 ;

command_list
 : ( help_command
 | sc_command
 | sm_command
 | classloader_command
 | jad_command
 | getstatic_command
 | monitor_command
 | thread_command
 | jvm_command
 | dump_command
 | reset_command
 | shut_command
 | sysprop_command
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

jad_command
 : JAD_COMMAND ( ( hashcode_flag )?( regex_flag )? class_pattern (method_pattern)? | ( general_help )?)
 ;

getstatic_command
 : GETSTATIC_COMMAND ( ( hashcode_flag )?( regex_flag )? class_pattern method_pattern ( express_pattern )? | ( general_help )?)
 ;

sysprop_command
 : SYSPROP_COMMAND  ( ( property_name )? ( property_value )? | ( general_help )?)
 ;

dump_command
 : DUMP_COMMAND ( ( hashcode_flag )?( regex_flag )? class_pattern| ( general_help )?)
 ;

reset_command
 : RESET_COMMAND ( ( regex_flag )? class_pattern | ( general_help )?)
 ;

shut_command
 : SHUT_COMMAND ( general_help )?
 ;

monitor_command
 : MONITOR_COMMAND ( ( cycle_flag )?( regex_flag )? ( number_limit_flag )? class_pattern (method_pattern)? | ( general_help )?)
 ;

thread_command
 : THREAD_COMMAND ( ( top_N_Busy_flag )?( find_most_blockingthread_flag )? ( setSampleInterval_flag )? ( id )? | ( general_help )?)
 ;

jvm_command
 : JVM_COMMAND ( general_help )?
 ;

classloader_command
 : CLASSLOADER_COMMAND ( ( all_flag )?( hashcode_flag )?( includeReflectionClassLoader_flag )?( resource_flag )?
    ( tree_flag )? ( list_flag )?
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

tree_flag
 : '-'TREE
 ;

list_flag
 : '-'LIST
 ;

regex_flag
 : '-'REGEX
 ;

find_most_blockingthread_flag
 : '-'FIND_MOST_BLOCKINGTHREAD
 ;

extend_flag
 : '-'EXTEND EXTEND_LEVEL
 ;

hashcode_flag
 : '-'HASHCODE_FLAG any_name
 ;

number_limit_flag
 : '-'NUMBER_LIMIT any_name
 ;

cycle_flag
 : '-'HASHCODE_FLAG any_name
 ;

top_N_Busy_flag
 : '-'NUMBER_LIMIT any_name
 ;

setSampleInterval_flag
 : '-'INCLUDEREFLECTIONCLASSLOADER_FLAG any_name
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

property_name
 : any_name
 ;

property_value
 : any_name
 ;

field_pattern
 : any_name
 ;

express_pattern
 : any_name
 ;

id
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
JAD_COMMAND : J A D;
GETSTATIC_COMMAND : G E T S T A T I C;
SYSPROP_COMMAND : S Y S P R O P;
DUMP_COMMAND : D U M P;
RESET_COMMAND : R E S E T;
SHUT_COMMAND : S H U T;
MONITOR_COMMAND : M O N I T O R;
THREAD_COMMAND : T H R E A D;
JVM_COMMAND : J V M;
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
FIND_MOST_BLOCKINGTHREAD : B;
EXTEND : X;
HASHCODE_FLAG : C;
NUMBER_LIMIT : N;
CYCLE_FLAG : C;
INCLUDEREFLECTIONCLASSLOADER_FLAG : I;
RESOURCE : R;
TREE : T;
LIST : L;

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
 : [1-9a-z]*
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

