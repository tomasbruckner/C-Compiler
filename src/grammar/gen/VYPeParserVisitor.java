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
	 * Visit a parse tree produced by the {@code IdentifierLabel}
	 * labeled alternative in {@link VYPeParserParser#any_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierLabel(VYPeParserParser.IdentifierLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteralLabel}
	 * labeled alternative in {@link VYPeParserParser#any_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteralLabel(VYPeParserParser.IntLiteralLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharLiteralLabel}
	 * labeled alternative in {@link VYPeParserParser#any_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteralLabel(VYPeParserParser.CharLiteralLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralLabel}
	 * labeled alternative in {@link VYPeParserParser#any_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralLabel(VYPeParserParser.StringLiteralLabelContext ctx);
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
	 * Visit a parse tree produced by {@link VYPeParserParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(VYPeParserParser.TypeContext ctx);
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
	 * Visit a parse tree produced by the {@code OrLabel}
	 * labeled alternative in {@link VYPeParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrLabel(VYPeParserParser.OrLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusMinusLabel}
	 * labeled alternative in {@link VYPeParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusLabel(VYPeParserParser.PlusMinusLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegationLabel}
	 * labeled alternative in {@link VYPeParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationLabel(VYPeParserParser.NegationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionLabel}
	 * labeled alternative in {@link VYPeParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLabel(VYPeParserParser.ExpressionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyValueLabel}
	 * labeled alternative in {@link VYPeParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyValueLabel(VYPeParserParser.AnyValueLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterLowerLabel}
	 * labeled alternative in {@link VYPeParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterLowerLabel(VYPeParserParser.GreaterLowerLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndLabel}
	 * labeled alternative in {@link VYPeParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndLabel(VYPeParserParser.AndLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivModLabel}
	 * labeled alternative in {@link VYPeParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivModLabel(VYPeParserParser.MulDivModLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualLabel}
	 * labeled alternative in {@link VYPeParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualLabel(VYPeParserParser.EqualLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastingLabel}
	 * labeled alternative in {@link VYPeParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastingLabel(VYPeParserParser.CastingLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallLabel}
	 * labeled alternative in {@link VYPeParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallLabel(VYPeParserParser.FunctionCallLabelContext ctx);
}