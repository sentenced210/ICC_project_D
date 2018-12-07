package parser;

import d_grammar.DLexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.ArrayList;

public class Parser {
    private ParseTree tree;

    public Parser(ParseTree tree) {
        this.tree = tree;
    }

    public Body parse() throws Exception {
        return parseBody(tree.getChild(0), null);
    }

    private Body parseBody(ParseTree tree, Body parentBody) throws Exception {
        Body b = new Body(parentBody);
        for (int i = 0; i < tree.getChildCount(); i++) {
            b.add(parseStatement(tree.getChild(i).getChild(0), b));
        }
        return b;
    }

    private Statement parseStatement(ParseTree tree, Body parentBody) throws Exception {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        // System.out.println(name);
        switch (name) {
            case "declaration": {
                final String varName = tree.getChild(1).getChild(0).getText();
                final Expression exp = tree.getChild(1).getChildCount() < 3 ? new Empty() : parseExpression(tree.getChild(1).getChild(2), parentBody);
                return new Declaration(varName, exp);
            }
            case "print": {
                ArrayList<Expression> exps = new ArrayList<>();
                for (int i = 1; i < tree.getChildCount(); i += 2) {
                    exps.add(parseExpression(tree.getChild(i), parentBody));
                }
                return new PrintFunction(exps);
            }
            case "if_statement": {
                Expression condition = parseExpression(tree.getChild(1), parentBody);
                Body body = parseBody(tree.getChild(3), parentBody);
                Body elseBody = tree.getChildCount() > 5 ? parseBody(tree.getChild(5), parentBody) : null;
                return new IFStatement(condition, body, elseBody);
            }
            case "while_loop": {
                Expression condition = parseExpression(tree.getChild(1), parentBody);
                Body body = parseBody(tree.getChild(3), parentBody);
                return new WhileLoop(condition, body);
            }
            case "for_loop": {
                final String varName = tree.getChild(1).getText();
                Expression left = parseExpression(tree.getChild(3), parentBody);
                Expression right = parseExpression(tree.getChild(5), parentBody);
                Body body = parseBody(tree.getChild(7), parentBody);
                return new ForLoop(varName, left, right, body);
            }
            case "assignment": {
                String varName = tree.getChild(0).getChild(0).getText();
                Expression exp = parseExpression(tree.getChild(2), parentBody);
                return new Assignment(varName, exp);
            }
            case "return_statement": {
                return new ReturnStatement(tree.getChildCount() == 1 ? null : parseExpression(tree.getChild(1), parentBody));
            }
            default:
                return new Declaration("nothing", new Empty());
        }
    }

    private Expression parseExpression(ParseTree tree, Body parentBody) throws Exception {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        // System.out.println(name);
        Expression exp = parseRelation(tree.getChild(0), parentBody);
        for (int i = 2; i < tree.getChildCount(); i += 2) {
            final String type = ((TerminalNodeImpl) tree.getChild(i - 1)).getSymbol().getText();
            switch (type) {
                case "or": {
                    exp = new OR(exp, parseRelation(tree.getChild(i), parentBody));
                    break;
                }
                case "and": {
                    exp = new AND(exp, parseRelation(tree.getChild(i), parentBody));
                    break;
                }
                case "xor": {
                    exp = new XOR(exp, parseRelation(tree.getChild(i), parentBody));
                    break;
                }
            }
        }
        return exp;
    }

    private Expression parseRelation(ParseTree tree, Body parentBody) throws Exception {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        // System.out.println(name);
        Expression exp = parseFactor(tree.getChild(0), parentBody);
        for (int i = 2; i < tree.getChildCount(); i += 2) {
            final String type = ((TerminalNodeImpl) tree.getChild(i - 1)).getSymbol().getText();
            switch (type) {
                case "<": {
                    exp = new Less(exp, parseFactor(tree.getChild(i), parentBody));
                    break;
                }
                case "<=": {
                    exp = new LessOrEqual(exp, parseFactor(tree.getChild(i), parentBody));
                    break;
                }
                case ">": {
                    exp = new Greater(exp, parseFactor(tree.getChild(i), parentBody));
                    break;
                }
                case ">=": {
                    exp = new GreaterOrEqual(exp, parseFactor(tree.getChild(i), parentBody));
                    break;
                }
                case "=": {
                    exp = new Equal(exp, parseFactor(tree.getChild(i), parentBody));
                    break;
                }
                case "/=": {
                    exp = new NotEqual(exp, parseFactor(tree.getChild(i), parentBody));
                    break;
                }
            }
        }
        return exp;
    }

    private Expression parseFactor(ParseTree tree, Body parentBody) throws Exception {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        // System.out.println(name);
        Expression exp = parseTerm(tree.getChild(0), parentBody);
        for (int i = 2; i < tree.getChildCount(); i += 2) {
            final String type = ((TerminalNodeImpl) tree.getChild(i - 1)).getSymbol().getText();
            switch (type) {
                case "+": {
                    exp = new Add(exp, parseTerm(tree.getChild(i), parentBody));
                    break;
                }
                case "-": {
                    exp = new Subtract(exp, parseTerm(tree.getChild(i), parentBody));
                    break;
                }
            }
        }
        return exp;
    }

    private Expression parseTerm(ParseTree tree, Body parentBody) throws Exception {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        // System.out.println(name);
        Expression exp = parseUnary(tree.getChild(0), parentBody);
        for (int i = 2; i < tree.getChildCount(); i += 2) {
            final String type = ((TerminalNodeImpl) tree.getChild(i - 1)).getSymbol().getText();
            switch (type) {
                case "*": {
                    exp = new Multiply(exp, parseUnary(tree.getChild(i), parentBody));
                    break;
                }
                case "/": {
                    exp = new Divide(exp, parseUnary(tree.getChild(i), parentBody));
                    break;
                }
            }
        }
        return exp;
    }

    private Expression parseUnary(ParseTree tree, Body parentBody) throws Exception {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        // System.out.println(name);
        switch (tree.getChildCount()) {
            case 1: {
                String childName = tree.getChild(0).getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
                if (childName.equals("reference")) {
                    return parseReference(tree.getChild(0), parentBody);
                } else {
                    return parsePrimary(tree.getChild(0), parentBody);
                }
            }
            case 2: {
                switch (tree.getChild(0).getText()) {
                    case "+": {
                        return new Add(new Integer(0), parsePrimary(tree.getChild(1), parentBody));
                    }
                    case "-": {
                        return new Subtract(new Integer(0), parsePrimary(tree.getChild(1), parentBody));
                    }
                    case "not": {
                        return new NOT(parsePrimary(tree.getChild(1), parentBody));
                    }
                }
            }
            case 3: {
                return new Empty();
            }
        }
        return new Empty();
    }

    private Expression parseReference(ParseTree tree, Body parentBody) throws Exception {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        // System.out.println(name);
        if (tree.getChildCount() == 1) {
            return new IDENT(tree.getChild(0).getText());
        }
        else {
            switch (tree.getChild(1).getText()) {
                case "[": {
                    return new ArrayReference(parseReference(tree.getChild(0), parentBody), parseExpression(tree.getChild(2), parentBody));
                }
                case "(": {
                    ArrayList<Expression> exps = new ArrayList<>();
                    for (int i = 2; i < tree.getChildCount(); i += 2) {
                        exps.add(parseExpression(tree.getChild(i), parentBody));
                    }
                    return new FunctionReference(parseReference(tree.getChild(0), new Body(null)), exps);
                }
                case "." : {
                    return new TupleReference(parseReference(tree.getChild(0), parentBody), new IDENT(tree.getChild(2).getText()));
                }
            }
        }
        return new Empty();
    }

    private Expression parsePrimary(ParseTree tree, Body parentBody) throws Exception {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        // System.out.println(name);
        switch (tree.getChildCount()) {
            case 1: {
                switch (tree.getChild(0).getClass().getSimpleName().replaceAll("Context$", "").toLowerCase()) {
                    case "literal": {
                        return parseLiteral(tree.getChild(0), parentBody);
                    }
                    case "read_int": {
                        return new ReadInt();
                    }
                    case "read_real": {
                        return new ReadReal();
                    }
                    case "read_string": {
                        return new ReadString();
                    }
                    case "function_literal":{
                        return parseFunctionLiteral(tree.getChild(0), parentBody);
                    }
                }
            }
            case 3: {
                return parseExpression(tree.getChild(1), parentBody);
            }
        }
        return new Empty();
    }

    private Expression parseFunctionLiteral(ParseTree tree, Body parentBody) throws Exception {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        // System.out.println(name);
        ArrayList<IDENT> paramNames = new ArrayList<>();
        for (int i = 2; i < tree.getChildCount() - 1; i += 2) {
            paramNames.add(new IDENT(tree.getChild(i).getText()));
        }
        if (tree.getChild(tree.getChildCount() - 1).getChildCount() == 3) {
            return new Function(paramNames, parseBody(tree.getChild(tree.getChildCount() - 1).getChild(1), null), null);
        } else {
            return new Function(paramNames, null, parseExpression(tree.getChild(tree.getChildCount() - 1).getChild(1), null));
        }
    }

    private Expression parseLiteral(ParseTree tree, Body parentBody) throws Exception {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        // System.out.println(name);

        if (tree.getChild(0) instanceof TerminalNodeImpl) {
            tree = tree.getChild(0);
            Token token = ((TerminalNodeImpl) tree).getSymbol();
            switch (token.getType()) {
                case DLexer.INTEGER: {
//                    System.out.println("INTEGER=" + token.getText());
                    return new Integer(java.lang.Integer.valueOf(token.getText()));
                }
                case DLexer.BOOLEAN: {
                    return new Boolean(java.lang.Boolean.valueOf(token.getText()));
                }
                case DLexer.STRING: {
//                    System.out.println("STRING=" + token.getText());
                    return new MyString(token.getText());
                }
                case DLexer.REAL: {
                    return new Real(java.lang.Double.valueOf(token.getText()));
                }
                default: {
                    return new Empty();
                }
            }
        } else {
            switch (tree.getChild(0).getClass().getSimpleName().replaceAll("Context$", "").toLowerCase()) {
                case "array": {
                    return parseArray(tree.getChild(0), parentBody);
                }
                case "tuple": {
                    tree = tree.getChild(0);
                    ArrayList<IDENT> idents = new ArrayList<>();
                    ArrayList<Expression> exps = new ArrayList<>();
                    for (int i = 1; i < tree.getChildCount(); i += 2) {
                        if (tree.getChild(i).getChildCount() == 1) {
                            idents.add(null);
                            exps.add(parseExpression(tree.getChild(i).getChild(0), parentBody));
                        } else {
                            idents.add(new IDENT(tree.getChild(i).getChild(0).getText()));
                            exps.add(parseExpression(tree.getChild(i).getChild(2), parentBody));
                        }
                    }
                    return new Tuple(idents, exps);
                }
            }
        }
        return new Empty();
    }

    private Expression parseArray(ParseTree tree, Body parentBody) throws Exception {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        // System.out.println(name);
        ArrayList<Expression> exps = new ArrayList<>();
        for (int i = 1; i < tree.getChildCount() - 1; i += 2) {
            exps.add(parseExpression(tree.getChild(i), parentBody));
        }
        return new Array(exps);
    }
}
