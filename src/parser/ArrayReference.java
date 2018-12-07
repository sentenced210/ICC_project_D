package parser;

import scope.Scope;
import types.ArrayValue;
import types.Value;

public class ArrayReference extends Reference {
    private Expression exp;
    private Expression ref;

    public ArrayReference(Expression ref, Expression exp) {
        this.exp = exp;
        this.ref = ref;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return ((ArrayValue) ref.calculate(scope)).getElement(exp.calculate(scope)).calculate(scope);
    }
}
