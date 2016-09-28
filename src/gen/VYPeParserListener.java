// Generated from C:/Users/Tom/IdeaProjects/vype/src/grammer\VYPeParser.g4 by ANTLR 4.5.3
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VYPeParserParser}.
 */
public interface VYPeParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(VYPeParserParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(VYPeParserParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(VYPeParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(VYPeParserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#function_identifier}.
	 * @param ctx the parse tree
	 */
	void enterFunction_identifier(VYPeParserParser.Function_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#function_identifier}.
	 * @param ctx the parse tree
	 */
	void exitFunction_identifier(VYPeParserParser.Function_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(VYPeParserParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(VYPeParserParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(VYPeParserParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(VYPeParserParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#param_type_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_type_list(VYPeParserParser.Param_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#param_type_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_type_list(VYPeParserParser.Param_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(VYPeParserParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(VYPeParserParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(VYPeParserParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(VYPeParserParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VYPeParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VYPeParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#variable_definition_statement}.
	 * @param ctx the parse tree
	 */
	void enterVariable_definition_statement(VYPeParserParser.Variable_definition_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#variable_definition_statement}.
	 * @param ctx the parse tree
	 */
	void exitVariable_definition_statement(VYPeParserParser.Variable_definition_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(VYPeParserParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(VYPeParserParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(VYPeParserParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(VYPeParserParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(VYPeParserParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(VYPeParserParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_statement(VYPeParserParser.Function_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_statement(VYPeParserParser.Function_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(VYPeParserParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(VYPeParserParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#block_statements}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statements(VYPeParserParser.Block_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#block_statements}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statements(VYPeParserParser.Block_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#condition_expression}.
	 * @param ctx the parse tree
	 */
	void enterCondition_expression(VYPeParserParser.Condition_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#condition_expression}.
	 * @param ctx the parse tree
	 */
	void exitCondition_expression(VYPeParserParser.Condition_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(VYPeParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(VYPeParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPeParserParser#binary_operand}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operand(VYPeParserParser.Binary_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPeParserParser#binary_operand}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operand(VYPeParserParser.Binary_operandContext ctx);
}