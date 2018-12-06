package parser;

import d_grammar.DLexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class Parser {
    private ParseTree tree;

    public Parser(ParseTree tree) {
        this.tree = tree;
    }

    public Body parse() {
        return parseBody(tree);
    }

    private Body parseBody(ParseTree tree) {
        Body b = new Body();
        tree = tree.getChild(0);
        for (int i = 0; i < tree.getChildCount(); i++) {
            b.add(parseStatement(tree.getChild(i)));
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
            default:
                return new Declaration("nothing", new Empty());
        }
    }

    private Expression parseExpression(ParseTree tree) {
        if (tree instanceof TerminalNodeImpl) {
            Token token = ((TerminalNodeImpl) tree).getSymbol();
            String value = token.getText();
            switch (token.getType()) {
                case DLexer.INTEGER: {
                    return new Integer(java.lang.Integer.valueOf(value));
                }
            }
        } else {
            String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
            System.out.println(name);
            switch (name) {

            }
        }
        return new Empty();
    }
}
