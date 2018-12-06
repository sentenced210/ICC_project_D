package parser;

import types.IntegerValue;
import types.Value;

public class Integer extends Literal {
    public int value;

    public Integer(int value) {
        this.value = value;
    }

    @Override
    public Value calculate() {
        return new IntegerValue(value);
    }
}
