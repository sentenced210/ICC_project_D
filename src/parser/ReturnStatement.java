package parser;

import scope.Scope;
import types.EmptyValue;
import types.Value;

public class ReturnStatement extends Statement {
    private Expression exp;

    public ReturnStatement(Expression exp) {
        this.exp = exp;
    }

    @Override
    Value execute(Scope scope) throws Exception {
        return exp == null ? new EmptyValue() : exp.calculate(scope);
    }
}
