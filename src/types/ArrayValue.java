package types;

import parser.Expression;

import java.util.HashMap;

public class ArrayValue extends Value {
    private HashMap<java.lang.Integer, Expression> expToValue;

    public ArrayValue(HashMap<java.lang.Integer, Expression> indexToExp) {
        this.expToValue = indexToExp;
    }

    public Expression getElement(Value key) {
        return expToValue.get(((IntegerValue) key).getValue());
    }

    public void setElement(Value key, Expression exp) {
        expToValue.put(((IntegerValue) key).getValue(), exp);
    }

    @Override
    public Value add(Value v2) throws Exception {
        if (v2 instanceof ArrayValue) {
            HashMap<java.lang.Integer, Expression> tmp = new HashMap<>();
            for (java.lang.Integer x : expToValue.keySet()) {
                tmp.put(x, expToValue.get(x));
            }
            for (java.lang.Integer x : ((ArrayValue) v2).expToValue.keySet()) {
                tmp.put(x, ((ArrayValue) v2).expToValue.get(x));
            }
            return new ArrayValue(tmp);
        } else {
            throw new Exception("Incorrent operation: (array) + (" + v2.getType() + ")");
        }
    }

    @Override
    public Value multiply(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (array) * (" + v2.getType() + ")");
    }

    @Override
    public Value subtract(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (array) - (" + v2.getType() + ")");
    }

    @Override
    public Value divide(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (array) / (" + v2.getType() + ")");
    }

    @Override
    public Value xor(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (array) xor (" + v2.getType() + ")");
    }

    @Override
    public Value and(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (array) and (" + v2.getType() + ")");
    }

    @Override
    public Value or(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (array) or (" + v2.getType() + ")");
    }

    @Override
    public Value not() throws Exception {
        throw new Exception("Incorrent operation: not (array)");
    }

    @Override
    public Value equal(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (array) = (" + v2.getType() + ")");
    }

    @Override
    public Value greater(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (array) > (" + v2.getType() + ")");
    }

    @Override
    public Value less(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (array) < (" + v2.getType() + ")");
    }

    @Override
    public Value lessOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (array) <= (" + v2.getType() + ")");
    }

    @Override
    public Value greaterOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (array) >= (" + v2.getType() + ")");
    }

    @Override
    public Value notEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (array) /= (" + v2.getType() + ")");
    }

    @Override
    public String getType() {
        return "array";
    }
}
