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
        throw new Exception("Incorrent operation: (boolean) + (" + v2.getType() + ")");
    }

    @Override
    public Value multiply(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) * (" + v2.getType() + ")");
    }

    @Override
    public Value subtract(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) - (" + v2.getType() + ")");
    }

    @Override
    public Value equal(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) = (" + v2.getType() + ")");
    }

    @Override
    public Value greater(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) > (" + v2.getType() + ")");
    }

    @Override
    public Value less(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) < (" + v2.getType() + ")");
    }

    @Override
    public Value xor(Value v2) throws Exception {
        if (v2 instanceof BooleanValue) {
            return new BooleanValue(value ^ ((BooleanValue) v2).value);
        }
        throw new Exception("Incorrent operation: (boolean) xor (" + v2.getType() + ")");
    }

    @Override
    public Value and(Value v2) throws Exception {
        if (v2 instanceof BooleanValue) {
            return new BooleanValue(value && ((BooleanValue) v2).value);
        }
        throw new Exception("Incorrent operation: (boolean) and (" + v2.getType() + ")");
    }

    @Override
    public Value or(Value v2) throws Exception {
        if (v2 instanceof BooleanValue) {
            return new BooleanValue(value || ((BooleanValue) v2).value);
        }
        throw new Exception("Incorrent operation: (boolean) or (" + v2.getType() + ")");
    }

    @Override
    public Value not() {
        return new BooleanValue(!value);
    }

    @Override
    public Value lessOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) <= (" + v2.getType() + ")");
    }

    @Override
    public Value greaterOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) >= (" + v2.getType() + ")");
    }

    @Override
    public Value notEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) /= (" + v2.getType() + ")");
    }

    @Override
    public String getType() {
        return "boolean";
    }

    @Override
    public Value divide(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (boolean) / (" + v2.getType() + ")");
    }

    @Override
    public String toString() {
        return value ? "true" : "false";
    }
}
