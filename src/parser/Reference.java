package parser;

import scope.Scope;
import types.Value;

public class Reference extends Expression {
    private String varName;

    public Reference(String varName) {
        this.varName = varName;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return scope.getValue(varName);
    }
}
