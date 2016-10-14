// Generated from C:/Users/Tom/IdeaProjects/vype/src/grammar\VYPeParser.g4 by ANTLR 4.5.3
package grammar.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VYPeParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VYPeParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#any_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_value(VYPeParserParser.Any_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#number_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_value(VYPeParserParser.Number_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLabel}
	 * labeled alternative in {@link VYPeParserParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLabel(VYPeParserParser.IntLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharLabel}
	 * labeled alternative in {@link VYPeParserParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLabel(VYPeParserParser.CharLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLabel}
	 * labeled alternative in {@link VYPeParserParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLabel(VYPeParserParser.StringLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DateTypeLabel}
	 * labeled alternative in {@link VYPeParserParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTypeLabel(VYPeParserParser.DateTypeLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidLabel}
	 * labeled alternative in {@link VYPeParserParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidLabel(VYPeParserParser.VoidLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#function_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_identifier(VYPeParserParser.Function_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(VYPeParserParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(VYPeParserParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(VYPeParserParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#param_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_type_list(VYPeParserParser.Param_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(VYPeParserParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(VYPeParserParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(VYPeParserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#variable_definition_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_definition_statement(VYPeParserParser.Variable_definition_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(VYPeParserParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(VYPeParserParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(VYPeParserParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#function_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_statement(VYPeParserParser.Function_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(VYPeParserParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#block_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statements(VYPeParserParser.Block_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(VYPeParserParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#condition_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_expression(VYPeParserParser.Condition_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPeParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(VYPeParserParser.ExpressionContext ctx);
}