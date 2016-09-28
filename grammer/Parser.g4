/*************************************************************
* Filename: Parser.g4
* Project: Compiler Implementation for VYPe16 Programming Language
* Compiler Team: 04
* Authors: Filip Benna, xbenna01
*          Tomas Bruckner, xbruck02
* Date: 28/9/2016
*************************************************************/

grammar Parser;
import Lexer;


data_type:
    Int
    | Char
    | String ;

type:
    data_type
    | Void ;

function_identifier:
    Identifier ;


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
    Identifier AssignSign expression ;

conditional_statement:
    If condition_expression block_statements Else block_statements ;

while_statement:
    While condition_expression block_statements ;

function_call_statement:
    function_identifier LeftParenthesis (expression (Colon expression)*)? RightParenthesis Semicolon ;

return_statement:
    Return (expression)? Semicolon ;

/******************************************* HELP RULES ******************************************************/
block_statements:
    LeftCurlyParenthesis (statement)* RightCurlyParenthesis ;

condition_expression:
    LeftParenthesis expression RightParenthesis ;

/******************************************* EXPRESSION ******************************************************/
expression:
    Identifier
    | ExclamationMark expression
    | LeftParenthesis expression RightParenthesis
    | LeftParenthesis data_type RightParenthesis expression
    | Identifier binary_operand expression
    | ExclamationMark expression binary_operand expression
    | LeftParenthesis expression RightParenthesis binary_operand expression
    | LeftParenthesis data_type RightParenthesis binary_operand expression ;

/******************************************* OPERANDS **********************************************************/
binary_operand:
    MultiplicationSign
    | DivisionSign
    | ModuloSign
    | PlusSign
    | MinusSign
    | LowerSign
    | GreaterSign
    | LowerEqualSign
    | GreaterEqualSign
    | EqualSign
    | NotEqualSign
    | LogicalAndSign
    | LogicalOrSign ;


