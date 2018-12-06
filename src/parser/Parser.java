package parser;

import d_grammar.DLexer;
import org.antlr.v4.codegen.model.decl.Decl;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import scope.Scope;
import types.EmptyValue;

public class Parser {
    private ParseTree tree;
    private Scope scope;

    public Parser(ParseTree tree) {
        this.tree = tree;
        scope = new Scope();
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
                case "declaration": {
                    scope.newVariable(name, new EmptyValue());
                    if (tree.getChildCount() > 2) {

                    }
                }
            }
        }
    }
}
