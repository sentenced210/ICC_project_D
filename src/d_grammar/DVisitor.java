// Generated from /home/nariman/Desktop/ICC_project_D/src/d_grammar/D.g4 by ANTLR 4.7
package d_grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(DParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#var_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_definition(DParser.Var_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(DParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(DParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(DParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(DParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(DParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(DParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(DParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(DParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(DParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(DParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#type_indicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_indicator(DParser.Type_indicatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#read_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_int(DParser.Read_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#read_real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_real(DParser.Read_realContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#read_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_string(DParser.Read_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#function_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_literal(DParser.Function_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(DParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(DParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(DParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(DParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DParser#tuple_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_element(DParser.Tuple_elementContext ctx);
}