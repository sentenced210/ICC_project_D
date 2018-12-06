package types;

public class BooleanValue extends Value {
    private boolean value;

    public BooleanValue(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
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
        throw new Exception("Incorrent operation: (boolean) - (value)");
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

    @Override
    public Value xor(Value v2) throws Exception {
        if (v2 instanceof BooleanValue) {
            return new BooleanValue(value ^ ((BooleanValue) v2).value);
        }
        throw new Exception("Incorrent operation: (boolean) xor (not boolean)");
    }

    @Override
    public Value and(Value v2) throws Exception {
        if (v2 instanceof BooleanValue) {
            return new BooleanValue(value && ((BooleanValue) v2).value);
        }
        throw new Exception("Incorrent operation: (boolean) and (not boolean)");
    }

    @Override
    public Value or(Value v2) throws Exception {
        if (v2 instanceof BooleanValue) {
            return new BooleanValue(value || ((BooleanValue) v2).value);
        }
        throw new Exception("Incorrent operation: (boolean) || (not boolean)");
    }

    @Override
    public Value not() {
        return new BooleanValue(!value);
    }

    @Override
    public Value lessOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) <= (value)");
    }

    @Override
    public Value greaterOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) >= (value)");
    }

    @Override
    public Value notEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) /= (value)");
    }

    @Override
    public Value divide(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) / (value)");
    }

    @Override
    public String toString() {
        return value ? "true" : "false";
    }
}
