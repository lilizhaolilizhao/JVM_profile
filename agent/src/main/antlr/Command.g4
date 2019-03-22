grammar Command;

parse
 : (command_list)* EOF
 ;

command_list
 : ( help_command
 | cls_command
 )
 ;

help_command
 : HELP_COMMAND
 ;

cls_command
 : CLS_COMMAND
 ;

HELP_COMMAND : H E L P;
CLS_COMMAND : C L S;

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