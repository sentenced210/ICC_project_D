package parser;

import scope.Scope;
import types.EmptyValue;
import types.Value;

public class Assignment extends Statement {
    private String varName;
    private Expression exp;

    public Assignment(String varName, Expression exp) {
        this.varName = varName;
        this.exp = exp;
    }

    @Override
    Value execute(Scope scope) throws Exception {
        System.out.println(varName);
        scope.setValue(varName, exp.calculate(scope));
        return new EmptyValue();
    }
}
