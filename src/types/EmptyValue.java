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
        throw new Exception("Incorrent operation: (empty) / (value)");
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
}
