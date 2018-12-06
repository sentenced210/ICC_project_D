package parser;

import scope.Scope;
import types.EmptyValue;
import types.Value;

public class Empty extends Expression {
    @Override
    public Value calculate(Scope scope) throws Exception {
        return new EmptyValue();
    }
}
