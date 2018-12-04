package main.main;

import java.util.*;

import d_grammar.DLexer;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class ScopeChecker {
    private static class Scope {
        private static Stack<HashSet<String>> globalVariables;
        private static Stack<HashSet<String>> localVariables;

        public Scope() {
            globalVariables = new Stack<>();
            localVariables = new Stack<>();
        }

        public void newScope() {
            if (globalVariables.empty()) {
                globalVariables.add(new HashSet<>());
                localVariables.add(new HashSet<>());
            } else {
                HashSet<String> tmp = new HashSet<>();
                tmp.addAll(globalVariables.peek());
                tmp.addAll(localVariables.peek());
                globalVariables.add(tmp);
                localVariables.add(new HashSet<>());
            }
        }

        public void endOfScope() {
            globalVariables.pop();
            localVariables.pop();
        }

        public void newVariable(String name) {
            localVariables.peek().add(name);
        }

        public boolean exists(String name) {
            return globalVariables.peek().contains(name) || localVariables.peek().contains(name);
        }

        public boolean isDeclared(String name) {
            return localVariables.peek().contains(name);
        }
    }

    private static Scope sc;

    public static void check(ParseTree tree) throws Exception {
        sc = new Scope();
        traverse(tree);
    }

    private static void traverse(ParseTree tree) throws Exception {
        if (tree instanceof TerminalNodeImpl) {
            Token token = ((TerminalNodeImpl) tree).getSymbol();
            if (token.getType() == DLexer.IDENT) {
                String varName = token.getText();
                if (!sc.exists(varName)) {
                    throw new Exception(token.getText() + " was not declared");
                }
            }
            // System.out.println(token.getType());
        } else {
            String name = tree.getClass().getSimpleName().replaceAll("Context$", "");
            // System.out.println(name);
            if (name.equals("Body")) {
                sc.newScope();
                for (int i = 0; i < tree.getChildCount(); i++) {
                    traverse(tree.getChild(i));
                }
                sc.endOfScope();
                return;
            }
            if (name.equals("Var_definition")) {
                String varName = tree.getChild(0).getText();
                if (sc.isDeclared(varName)) {
                    throw new Exception(varName + " is already declared in this scope");
                }
                sc.newVariable(varName);
            }
            for (int i = 0; i < tree.getChildCount(); i++) {
                traverse(tree.getChild(i));
            }
        }
    }
}