package parser;

import d_grammar.DLexer;
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
        return newBody(tree);
    }

    private Body newBody(ParseTree tree) {
        Body b = new Body();
        tree = tree.getChild(0);
        for (int i = 0; i < tree.getChildCount(); i++) {
            b.add(newStatement(tree.getChild(i)));
        }
        return b;
    }

    private Statement newStatement(ParseTree tree) {
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
        return new Integer(1);
    }
}
