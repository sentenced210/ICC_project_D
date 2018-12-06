package types;

public class BooleanValue extends Value {
    private boolean value;

    public BooleanValue(boolean value) {
        this.value = value;
    }

    @Override
    public Value add(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) + (value)");
    }

    @Override
    public Value multiply(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) * (value)");
    }

    @Override
    public Value subtract(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) / (value)");
    }

    @Override
    public Value equal(Value v2) throws Exception {
        throw new Exception("Incorrect operation: (boolean) = (value)");
    }

    @Override
    public Value greater(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) > (value)");
    }

    @Override
    public Value less(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) < (value)");
    }
}
