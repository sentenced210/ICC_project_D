package parser;

import scope.Scope;

import java.util.ArrayList;

public class Body {
    private ArrayList<Statement> statements;

    public Body() {
        statements = new ArrayList<>();
    }

    public void add(Statement s) {
        statements.add(s);
    }

    public void execute(Scope scope) throws Exception {
        for (Statement s : statements) {
            s.execute(scope);
        }
    }
}
