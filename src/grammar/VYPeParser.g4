/*************************************************************
* Filename: Parser.g4
* Project: Compiler Implementation for VYPe16 Programming Language
* Compiler Team: 04
* Authors: Filip Benna, xbenna01
*          Tomas Bruckner, xbruck02
* Date: 28/9/2016
*************************************************************/

grammar VYPeParser;
import VYPeLexer;

any_value:
    Identifier      # IdentifierLabel
    | IntLiteral    # IntLiteralLabel
    | CharLiteral   # CharLiteralLabel
    | StringLiteral # StringLiteralLabel
    ;

data_type:
    Int         # IntLabel
    | Char      # CharLabel
    | String    # StringLabel
    ;

type:
    data_type
    | Void
    ;

parse: start ;

start:
    (function_declaration | function_definition)+ EOF;


/************************************ FUNCTION DECLARATION ******************************************************/
function_declaration:
    type Identifier LeftParenthesis param_type_list RightParenthesis Semicolon ;

param_type_list:
    data_type (Colon data_type)*
    | Void ;


/***************************************FUNCTION DEFINITION ******************************************************/
function_definition:
    type Identifier LeftParenthesis param_list RightParenthesis block_statements ;

param_list:
    data_type Identifier (Colon data_type Identifier)*
    | Void ;

/******************************************* STATEMENTS ******************************************************/
statement:
    variable_definition_statement
    | assignment_statement
    | conditional_statement
    | while_statement
    | function_call_statement
    | return_statement ;

variable_definition_statement:
    data_type Identifier (Colon Identifier)* Semicolon ;

assignment_statement:
    Identifier AssignSign expression Semicolon ;

conditional_statement:
    If condition_expression block_statements Else block_statements ;

while_statement:
    While condition_expression block_statements ;

function_call_statement:
    function_call Semicolon ;

return_statement:
    Return (expression)? Semicolon ;

/******************************************* HELP RULES ******************************************************/
block_statements:
    LeftCurlyParenthesis (statement)* RightCurlyParenthesis ;

function_call:
    Identifier LeftParenthesis (expression (Colon expression)*)? RightParenthesis ;

condition_expression:
    LeftParenthesis expression RightParenthesis ;

/******************************************* EXPRESSION ******************************************************/
expression:
    any_value                                                   # AnyValueLabel
    | LeftParenthesis expression RightParenthesis               # ExpressionLabel
    | LeftParenthesis data_type RightParenthesis expression     # CastingLabel
    | function_call                                             # FunctionCallLabel
    | ExclamationMark expression                                # NegationLabel
    | expression op=(MultiplicationSign | DivisionSign | ModuloSign) expression     # MulDivModLabel
    | expression op=(PlusSign | MinusSign) expression                               # PlusMinusLabel
    | expression op=(LowerSign | GreaterSign | LowerEqualSign | GreaterEqualSign) expression    # GreaterLowerLabel
    | expression op=(EqualSign | NotEqualSign) expression                           # EqualLabel
    | expression LogicalAndSign expression                                          # AndLabel
    | expression LogicalOrSign expression                                           # OrLabel
    ;


