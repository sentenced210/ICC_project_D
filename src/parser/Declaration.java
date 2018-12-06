package parser;

import scope.Scope;
import types.EmptyValue;
import types.Value;

public class Declaration extends Statement {
    private String varName;
    private Expression exp;

    public Declaration(String varName, Expression exp) {
        this.varName = varName;
        this.exp = exp;
    }

    @Override
    public Value execute(Scope scope) throws Exception {
        scope.newVariable(varName, exp.calculate(scope));
        return new EmptyValue();
    }
}
