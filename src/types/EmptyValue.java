package types;

public class EmptyValue extends Value {
    public EmptyValue(){};

    @Override
    public Value add(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (empty) + (value)");
    }

    @Override
    public Value multiply(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (empty) * (value)");
    }

    @Override
    public Value subtract(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (empty) - (value)");
    }

    @Override
    public Value equal(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (empty) = (value)");
    }

    @Override
    public Value greater(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (empty) > (value)");
    }

    @Override
    public Value less(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (empty) < (value)");
    }

    @Override
    public Value xor(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (empty) xor (value)");
    }

    @Override
    public Value and(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (empty) and (value)");
    }

    @Override
    public Value or(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (empty) or (value)");
    }

    @Override
    public Value not() throws Exception {
        throw new Exception("Incorrent operation: not (empty)");
    }

    @Override
    public Value lessOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (empty) <= (value)");
    }

    @Override
    public Value greaterOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (empty) >= (value)");
    }

    @Override
    public Value notEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (empty) /= (value)");
    }

    @Override
    public Value divide(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (empty) / (value)");
    }

    @Override
    public String toString() {
        return "empty";
    }
}
