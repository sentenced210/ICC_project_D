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

    public Body parse() {
        return parseBody(tree.getChild(0));
    }

    private Body parseBody(ParseTree tree) {
        Body b = new Body();
        for (int i = 0; i < tree.getChildCount(); i++) {
            b.add(parseStatement(tree.getChild(i).getChild(0)));
        }
        return b;
    }

    private Statement parseStatement(ParseTree tree) {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        System.out.println(name);
        switch (name) {
            case "declaration": {
                final String varName = tree.getChild(1).getChild(0).getText();
                final Expression exp = tree.getChild(1).getChildCount() < 3 ? new Empty() : parseExpression(tree.getChild(1).getChild(2));
                return new Declaration(varName, exp);
            }
            case "print": {
                ArrayList<Expression> exps = new ArrayList<>();
                for (int i = 1; i < tree.getChildCount(); i += 2) {
                    exps.add(parseExpression(tree.getChild(i)));
                }
                return new PrintFunction(exps);
            }
            case "if_statement" : {
                Expression condition = parseExpression(tree.getChild(1));
                System.out.println("BODY");
                Body body = parseBody(tree.getChild(3));
                Body elseBody = tree.getChildCount() > 5 ? parseBody(tree.getChild(5)) : null;
                return new IFStatement(condition, body, elseBody);
            }
            default:
                return new Declaration("nothing", new Empty());
        }
    }

    private Expression parseExpression(ParseTree tree) {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        System.out.println(name);
        Expression exp = parseRelation(tree.getChild(0));
        for (int i = 2; i < tree.getChildCount(); i += 2) {
            final String type = ((TerminalNodeImpl) tree.getChild(i - 1)).getSymbol().getText();
            switch (type) {
                case "or": {
                    exp = new OR(exp, parseRelation(tree.getChild(i)));
                    break;
                }
                case "and": {
                    exp = new AND(exp, parseRelation(tree.getChild(i)));
                    break;
                }
                case "xor": {
                    exp = new XOR(exp, parseRelation(tree.getChild(i)));
                    break;
                }
            }
        }
        return exp;
    }

    private Expression parseRelation(ParseTree tree) {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        System.out.println(name);
        Expression exp = parseFactor(tree.getChild(0));
        for (int i = 2; i < tree.getChildCount(); i += 2) {
            final String type = ((TerminalNodeImpl) tree.getChild(i - 1)).getSymbol().getText();
            switch (type) {
                case "<": {
                    exp = new Less(exp, parseFactor(tree.getChild(i)));
                    break;
                }
                case "<=": {
                    exp = new LessOrEqual(exp, parseFactor(tree.getChild(i)));
                    break;
                }
                case ">": {
                    exp = new Greater(exp, parseFactor(tree.getChild(i)));
                    break;
                }
                case ">=": {
                    exp = new GreaterOrEqual(exp, parseFactor(tree.getChild(i)));
                    break;
                }
                case "=": {
                    exp = new Equal(exp, parseFactor(tree.getChild(i)));
                    break;
                }
                case "/=": {
                    exp = new NotEqual(exp, parseFactor(tree.getChild(i)));
                    break;
                }
            }
        }
        return exp;
    }

    private Expression parseFactor(ParseTree tree) {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        System.out.println(name);
        Expression exp = parseTerm(tree.getChild(0));
        for (int i = 2; i < tree.getChildCount(); i += 2) {
            final String type = ((TerminalNodeImpl) tree.getChild(i - 1)).getSymbol().getText();
            switch (type) {
                case "+": {
                    exp = new Add(exp, parseTerm(tree.getChild(i)));
                    break;
                }
                case "-": {
                    exp = new Subtract(exp, parseTerm(tree.getChild(i)));
                    break;
                }
            }
        }
        return exp;
    }

    private Expression parseTerm(ParseTree tree) {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        System.out.println(name);
        Expression exp = parseUnary(tree.getChild(0));
        for (int i = 2; i < tree.getChildCount(); i += 2) {
            final String type = ((TerminalNodeImpl) tree.getChild(i - 1)).getSymbol().getText();
            switch (type) {
                case "*": {
                    exp = new Multiply(exp, parseUnary(tree.getChild(i)));
                    break;
                }
                case "/": {
                    exp = new Divide(exp, parseUnary(tree.getChild(i)));
                    break;
                }
            }
        }
        return exp;
    }

    private Expression parseUnary(ParseTree tree) {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        System.out.println(name);
        switch (tree.getChildCount()) {
            case 1: {
                String childName = tree.getChild(0).getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
                if (childName.equals("reference")) {
                    return parseReference(tree.getChild(0));
                } else {
                    return parsePrimary(tree.getChild(0));
                }
            }
            case 2: {
                switch (tree.getChild(0).getText()) {
                    case "+": {
                        return new Add(new Integer(0), parsePrimary(tree.getChild(1)));
                    }
                    case "-": {
                        return new Subtract(new Integer(0), parsePrimary(tree.getChild(1)));
                    }
                    case "not": {
                        return new NOT(parsePrimary(tree.getChild(1)));
                    }
                }
            }
            case 3:{
                return new Empty();
            }
        }
        return new Empty();
    }

    private Expression parseReference(ParseTree tree) {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        System.out.println(name);
        return new Reference(tree.getChild(0).getText());
    }

    private Expression parsePrimary(ParseTree tree) {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        System.out.println(name);
        switch (tree.getChildCount()) {
            case 1: {
                switch (tree.getChild(0).getClass().getSimpleName().replaceAll("Context$", "").toLowerCase()) {
                    case "literal": {
                        System.out.println("LITERAL");
                        return parseLiteral(tree.getChild(0));
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
                }
            }
            case 3: {
                return parseExpression(tree.getChild(1));
            }
        }
        return new Empty();
    }

    private Expression parseLiteral(ParseTree tree) {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
        System.out.println(name);
        tree = tree.getChild(0);
        if (tree instanceof TerminalNodeImpl) {
            Token token = ((TerminalNodeImpl) tree).getSymbol();
            switch (token.getType()) {
                case DLexer.INTEGER: {
                    System.out.println("INTEGER=" + token.getText());
                    return new Integer(java.lang.Integer.valueOf(token.getText()));
                }
                case DLexer.BOOLEAN: {
                    return new Boolean(java.lang.Boolean.valueOf(token.getText()));
                }
                case DLexer.STRING: {
                    System.out.println("STRING=" + token.getText());
                    return new MyString(token.getText());
                }
                default: {
                    return new Empty();
                }
            }
        } else {
            return new Empty();
        }
    }
}
