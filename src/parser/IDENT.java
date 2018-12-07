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

    @Override
    public int hashCode() {
        return varName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return false;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return varName.equals(((IDENT) obj).getVarName());
    }
}
