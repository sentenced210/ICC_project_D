package parser;

import scope.Scope;
import types.Value;

public class IDENT extends Reference {
    private String varName;

    public IDENT(String varName) {
        this.varName = varName;
    }

    public String getVarName() {
        return varName;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return scope.getValue(varName);
    }
}
