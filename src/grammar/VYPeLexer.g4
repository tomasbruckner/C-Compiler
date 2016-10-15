/*************************************************************
* Filename: Lexer.g4
* Project: Compiler Implementation for VYPe16 Programming Language
* Compiler Team: 04
* Authors: Filip Benna, xbenna01
*          Tomas Bruckner, xbruck02
* Date: 28/9/2016
*************************************************************/

lexer grammar VYPeLexer;

/******************************************* KEYWORDS **********************************************************/
Char: 'char' ;
Else: 'else' ;
If:  'if' ;
Int: 'int' ;
Return : 'return' ;
String: 'string' ;
Void: 'void' ;
While: 'while' ;

/******************************************* RESERVED WORDS  *******************************************************/
Break: 'break' ;
Continue: 'continue' ;
For: 'for' ;
Short: 'short' ;
Unsigned: 'unsigned' ;

/******************************************* IDENTIFIER **********************************************************/
Identifier : [a-zA-Z_] [a-zA-Z0-9_]* ;

/******************************************* PARENTHESES **********************************************************/
LeftParenthesis: '(' ;
RightParenthesis: ')' ;
LeftCurlyParenthesis: '{' ;
RightCurlyParenthesis: '}' ;

/******************************************* OPERATORS **********************************************************/
ExclamationMark: '!' ;
MultiplicationSign: '*' ;
DivisionSign: '/' ;
ModuloSign: '%' ;
PlusSign: '+' ;
MinusSign: '-' ;
LowerSign: '<' ;
GreaterSign: '>' ;
LowerEqualSign: '<=' ;
GreaterEqualSign: '>=' ;
EqualSign: '==' ;
NotEqualSign: '!=' ;
LogicalAndSign: '&&' ;
LogicalOrSign: '||' ;

/******************************************* LITERALS **********************************************************/
IntLiteral: [0-9]+ ;
CharLiteral: '\'' (([ !#-&(-\[\]-~]) | '\\' ('"' | '\\' | '"' | '\'' | 'n' | 't') | '\\') '\'';
StringLiteral: '"' (([ !#-&(-\[\]-~]) | '\\' ('"' | '\\' | '"' | '\'' | 'n' | 't') | '\\')* '"';

/******************************************* OTHERS **********************************************************/
AssignSign: '=' ;
Colon: ',' ;
Semicolon: ';' ;

/******************************************* SKIP **********************************************************/
WhiteSpaces: [ \r\t\n]+ -> skip;
LineComment: '//' ~[\r\n]* -> skip;
BlockComment: '/*' .*? '*/' -> skip;
