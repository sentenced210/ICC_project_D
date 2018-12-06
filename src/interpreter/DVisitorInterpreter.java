package interpreter;

import d_grammar.DBaseVisitor;
import d_grammar.DParser;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DVisitorInterpreter extends DBaseVisitor {

    public String code = "";
    public Map<String, String> memory = new HashMap<>();

    @Override
    public Object visitArray(DParser.ArrayContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitArray(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitAssignment(DParser.AssignmentContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitAssignment(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitBody(DParser.BodyContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitBody(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitDeclaration(DParser.DeclarationContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitDeclaration(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitExpression(DParser.ExpressionContext ctx) {
        code = code + ctx.getText() + "\n";
        String s = "";
        if (ctx.children.size() != 1) {

            return super.visitExpression(ctx);
        }
        else{

            return visitChildren(ctx);
        }    }

    @Override
    public Object visitFactor(DParser.FactorContext ctx) {
        code = code + ctx.getText() + "\n";
        String operation = "";
        if (ctx.children.size() != 1) {

            return super.visitFactor(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitFor_loop(DParser.For_loopContext ctx) {
        code = code + ctx.getText() + "\n";

        return super.visitFor_loop(ctx);
    }

    @Override
    public Object visitFunction_body(DParser.Function_bodyContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitFunction_body(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitFunction_literal(DParser.Function_literalContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitFunction_literal(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitIf_statement(DParser.If_statementContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitIf_statement(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitLiteral(DParser.LiteralContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitLiteral(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitPrimary(DParser.PrimaryContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitPrimary(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitPrint(DParser.PrintContext ctx) {
        if (ctx.children.size() != 1) {

            return super.visitPrint(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitProgram(DParser.ProgramContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitProgram(ctx);
        }
        else{

            return visitChildren(ctx);
        }}

    @Override
    public Object visitRead_int(DParser.Read_intContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitRead_int(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitRead_real(DParser.Read_realContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitRead_real(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitRead_string(DParser.Read_stringContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitRead_string(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitReference(DParser.ReferenceContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitReference(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitRelation(DParser.RelationContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitRelation(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitReturn_statement(DParser.Return_statementContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitReturn_statement(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitStatement(DParser.StatementContext ctx) {
        code = code + ctx.getText() + "\n";

        if (ctx.children.size() != 1) {

            return super.visitStatement(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitTerm(DParser.TermContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitTerm(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitTuple(DParser.TupleContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitTuple(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitTuple_element(DParser.Tuple_elementContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitTuple_element(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitType_indicator(DParser.Type_indicatorContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitType_indicator(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitUnary(DParser.UnaryContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitUnary(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitVar_definition(DParser.Var_definitionContext ctx) {
        code = code + ctx.getText() + "\n";

        if (ctx.children.size() != 1) {

            return super.visitVar_definition(ctx);
        }
        else{

            return visitChildren(ctx);
        }
    }

    @Override
    public Object visitWhile_loop(DParser.While_loopContext ctx) {
        code = code + ctx.getText() + "\n";
        if (ctx.children.size() != 1) {

            return super.visitWhile_loop(ctx);
        }
        else{

            return visitChildren(ctx);
        }
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
