// Generated from /Users/azat/Documents/github/ICC_project_D/src/d_grammar/D.g4 by ANTLR 4.7
package d_grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DParser}.
 */
public interface DListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(DParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(DParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#var_definition}.
	 * @param ctx the parse tree
	 */
	void enterVar_definition(DParser.Var_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#var_definition}.
	 * @param ctx the parse tree
	 */
	void exitVar_definition(DParser.Var_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(DParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(DParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(DParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(DParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(DParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(DParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(DParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(DParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(DParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(DParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(DParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(DParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(DParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(DParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(DParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(DParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(DParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(DParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(DParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(DParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#type_indicator}.
	 * @param ctx the parse tree
	 */
	void enterType_indicator(DParser.Type_indicatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#type_indicator}.
	 * @param ctx the parse tree
	 */
	void exitType_indicator(DParser.Type_indicatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#read_int}.
	 * @param ctx the parse tree
	 */
	void enterRead_int(DParser.Read_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#read_int}.
	 * @param ctx the parse tree
	 */
	void exitRead_int(DParser.Read_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#read_real}.
	 * @param ctx the parse tree
	 */
	void enterRead_real(DParser.Read_realContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#read_real}.
	 * @param ctx the parse tree
	 */
	void exitRead_real(DParser.Read_realContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#read_string}.
	 * @param ctx the parse tree
	 */
	void enterRead_string(DParser.Read_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#read_string}.
	 * @param ctx the parse tree
	 */
	void exitRead_string(DParser.Read_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#function_literal}.
	 * @param ctx the parse tree
	 */
	void enterFunction_literal(DParser.Function_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#function_literal}.
	 * @param ctx the parse tree
	 */
	void exitFunction_literal(DParser.Function_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(DParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(DParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(DParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(DParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(DParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(DParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(DParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(DParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DParser#tuple_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_element(DParser.Tuple_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DParser#tuple_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_element(DParser.Tuple_elementContext ctx);
}