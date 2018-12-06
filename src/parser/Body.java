package parser;

import scope.Scope;
import types.EmptyValue;
import types.Value;

import java.util.ArrayList;

public class Body {
    private ArrayList<Statement> statements;

    public Body() {
        statements = new ArrayList<>();
    }

    public void add(Statement s) {
        statements.add(s);
    }

    public Value execute(Scope scope) throws Exception {
        for (Statement s : statements) {
            if (s instanceof ReturnStatement) {
                return s.execute(scope);
            } else {
                s.execute(scope);
            }
        }
        return new EmptyValue();
    }
}
