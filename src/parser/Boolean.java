package parser;

import scope.Scope;
import types.BooleanValue;
import types.IntegerValue;
import types.Value;

public class Boolean extends Literal {
    public boolean value;

    public Boolean(boolean value) {
        this.value = value;
    }

    @Override
    public Value calculate(Scope scope) {
        return new BooleanValue(value);
    }
}
