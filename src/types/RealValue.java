package types;

public class RealValue extends Value {
    private double value;

    public RealValue(double value) {
        this.value = value;
    }

    @Override
    public Value add(Value v2) {
        return new RealValue(value + ((RealValue) v2).value);
    }

    @Override
    public Value multiply(Value v2) {
        return new RealValue(value * ((RealValue) v2).value);
    }

    @Override
    public Value subtract(Value v2) throws Exception {
        return new RealValue(value - ((RealValue) v2).value);
    }

    @Override
    public Value equal(Value v2) {
        return new BooleanValue(value == ((RealValue) v2).value);
    }

    @Override
    public Value greater(Value v2) {
        return new BooleanValue(value > ((RealValue) v2).value);
    }

    @Override
    public Value less(Value v2) {
        return new BooleanValue(value < ((RealValue) v2).value);
    }

    @Override
    public Value xor(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (real) xor (value)");
    }

    @Override
    public Value and(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (real) and (value)");
    }

    @Override
    public Value or(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (real) or (value)");
    }

    @Override
    public Value not() throws Exception {
        throw new Exception("Incorrent operation: not (real)");
    }

    @Override
    public Value lessOrEqual(Value v2) throws Exception {
        return new BooleanValue(value <= ((RealValue) v2).value);
    }

    @Override
    public Value greaterOrEqual(Value v2) throws Exception {
        return new BooleanValue(value >= ((RealValue) v2).value);
    }

    @Override
    public Value notEqual(Value v2) throws Exception {
        return new BooleanValue(value != ((RealValue) v2).value);
    }

    @Override
    public Value divide(Value v2) throws Exception {
        return new RealValue(value / ((RealValue) v2).value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
