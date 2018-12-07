package main.main;

import d_grammar.DLexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import scope.Scope;
import types.EmptyValue;
import types.IntegerValue;

public class ScopeChecker {
    private Scope sc;

    public void check(ParseTree tree) throws Exception {
        sc = new Scope();
        traverse(tree);
    }

    private void traverse(ParseTree tree) throws Exception {
        if (tree instanceof TerminalNodeImpl) {
            Token token = ((TerminalNodeImpl) tree).getSymbol();
            if (token.getType() == DLexer.IDENT) {
                String varName = token.getText();
                if (!sc.exists(varName)) {
                    throw new Exception(token.getText() + " was not declared");
                }
            }
        } else {
            String name = tree.getClass().getSimpleName().replaceAll("Context$", "").toLowerCase();
            if (name.equals("body")) {
                sc.newScope();
                for (int i = 0; i < tree.getChildCount(); i++) {
                    traverse(tree.getChild(i));
                }
                sc.endOfScope();
                return;
            }
            if (name.equals("var_definition")) {
                String varName = tree.getChild(0).getText();
                if (sc.isDeclared(varName)) {
                    throw new Exception(varName + " is already declared in this scope");
                }
                sc.newVariable(varName, new EmptyValue());
            }
            if (name.equals("function_literal")) {
                sc.newScope();
                for (int i = 2; i < tree.getChildCount() - 1; i += 2) {
                    String paramName = tree.getChild(i).getText();
                    sc.newVariable(paramName, new EmptyValue());
                }
                for (int i = 0; i < tree.getChildCount(); i++) {
                    traverse(tree.getChild(i));
                }
                sc.endOfScope();
                return;
            }
            for (int i = 0; i < tree.getChildCount(); i++) {
                traverse(tree.getChild(i));
            }
        }
    }
}