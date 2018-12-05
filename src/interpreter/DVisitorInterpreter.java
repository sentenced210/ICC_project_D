package interpreter;

import d_grammar.DBaseVisitor;
import d_grammar.DParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;

public class DVisitorInterpreter extends DBaseVisitor {

    public String code = "";
    public String result = "";
    public HashMap<String, String> globalScope = new HashMap<>();

    @Override
    public Object visitArray(DParser.ArrayContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitArray(ctx);
    }

    @Override
    public Object visitAssignment(DParser.AssignmentContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitAssignment(ctx);
    }

    @Override
    public Object visitBody(DParser.BodyContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitBody(ctx);
    }

    @Override
    public Object visitDeclaration(DParser.DeclarationContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitDeclaration(ctx);
    }

    @Override
    public Object visitExpression(DParser.ExpressionContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitExpression(ctx);
    }

    @Override
    public Object visitFactor(DParser.FactorContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitFactor(ctx);
    }

    @Override
    public Object visitFor_loop(DParser.For_loopContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitFor_loop(ctx);
    }

    @Override
    public Object visitFunction_body(DParser.Function_bodyContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitFunction_body(ctx);
    }

    @Override
    public Object visitFunction_literal(DParser.Function_literalContext ctx) {
        code = code + ctx.getText() + "\n";
        return super.visitFunction_literal(ctx);
    }

    @Override
    public Object visitIf_statement(DParser.If_statementContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitIf_statement(ctx);
    }

    @Override
    public Object visitLiteral(DParser.LiteralContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitLiteral(ctx);
    }

    @Override
    public Object visitPrimary(DParser.PrimaryContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitPrimary(ctx);
    }

    @Override
    public Object visitPrint(DParser.PrintContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitPrint(ctx);
    }

    @Override
    public Object visitProgram(DParser.ProgramContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitProgram(ctx);
    }

    @Override
    public Object visitRead_int(DParser.Read_intContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitRead_int(ctx);
    }

    @Override
    public Object visitRead_real(DParser.Read_realContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitRead_real(ctx);
    }

    @Override
    public Object visitRead_string(DParser.Read_stringContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitRead_string(ctx);
    }

    @Override
    public Object visitReference(DParser.ReferenceContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitReference(ctx);
    }

    @Override
    public Object visitRelation(DParser.RelationContext ctx) {
        code = code + ctx.getText() + "\n";
        return super.visitRelation(ctx);
    }

    @Override
    public Object visitReturn_statement(DParser.Return_statementContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitReturn_statement(ctx);
    }

    @Override
    public Object visitStatement(DParser.StatementContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitStatement(ctx);
    }

    @Override
    public Object visitTerm(DParser.TermContext ctx) {
        code = code + ctx.getText() + "\n";
        return super.visitTerm(ctx);
    }

    @Override
    public Object visitTuple(DParser.TupleContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitTuple(ctx);
    }

    @Override
    public Object visitTuple_element(DParser.Tuple_elementContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitTuple_element(ctx);
    }

    @Override
    public Object visitType_indicator(DParser.Type_indicatorContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitType_indicator(ctx);
    }

    @Override
    public Object visitUnary(DParser.UnaryContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitUnary(ctx);
    }

    @Override
    public Object visitVar_definition(DParser.Var_definitionContext ctx) {
        code = code + ctx.getText() + "\n";
        if(ctx.getText().length()>1){
            globalScope.put(ctx.getText().split(":=")[0], ctx.getText().split(":=")[1]);
        }
        else{
            globalScope.put(ctx.getText(), "empty");

        }
        return super.visitVar_definition(ctx);
    }

    @Override
    public Object visitWhile_loop(DParser.While_loopContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitWhile_loop(ctx);
    }

    @Override
    public boolean equals(Object o) {

        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Object visitChildren(RuleNode node) {

        return super.visitChildren(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {

        return super.visitErrorNode(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }


}
