package parser;

import scope.Scope;
import types.IntegerValue;
import types.Value;

public class Integer extends Literal {
    public int value;

    public Integer(int value) {
        this.value = value;
    }

    @Override
    public Value calculate(Scope scope) {
        return new IntegerValue(value);
    }
}
