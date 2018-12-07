package parser;

import scope.Scope;
import types.TupleValue;
import types.Value;

public class TupleReference extends Reference {
    private Expression ref;
    private IDENT ident;

    public TupleReference(Expression ref, IDENT ident) {
        this.ref = ref;
        this.ident = ident;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return ((TupleValue) ref.calculate(scope)).getElement(ident).calculate(scope);
    }
}
