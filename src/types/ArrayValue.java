package types;

import parser.Expression;
import parser.Integer;

import java.util.HashMap;

public class ArrayValue extends Value {
    private HashMap<java.lang.Integer, Expression> expToValue;

    public ArrayValue(HashMap<java.lang.Integer, Expression> indexToExp) {
        this.expToValue = indexToExp;
    }

    public Expression getElement(Value key) {
        return expToValue.get(((IntegerValue) key).getValue());
    }

    @Override
    public Value add(Value v2) throws Exception {
        return null;
    }

    @Override
    public Value multiply(Value v2) throws Exception {
        return null;
    }

    @Override
    public Value subtract(Value v2) throws Exception {
        return null;
    }

    @Override
    public Value divide(Value v2) throws Exception {
        return null;
    }

    @Override
    public Value xor(Value v2) throws Exception {
        return null;
    }

    @Override
    public Value and(Value v2) throws Exception {
        return null;
    }

    @Override
    public Value or(Value v2) throws Exception {
        return null;
    }

    @Override
    public Value not() throws Exception {
        return null;
    }

    @Override
    public Value equal(Value v2) throws Exception {
        return null;
    }

    @Override
    public Value greater(Value v2) throws Exception {
        return null;
    }

    @Override
    public Value less(Value v2) throws Exception {
        return null;
    }

    @Override
    public Value lessOrEqual(Value v2) throws Exception {
        return null;
    }

    @Override
    public Value greaterOrEqual(Value v2) throws Exception {
        return null;
    }

    @Override
    public Value notEqual(Value v2) throws Exception {
        return null;
    }
}
