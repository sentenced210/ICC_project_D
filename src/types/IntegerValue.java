package types;

public class IntegerValue extends Value {
    private int value;

    public IntegerValue(int value) {
        this.value = value;
    }

    @Override
    public Value add(Value v2) {
        return new IntegerValue(value + ((IntegerValue) v2).value);
    }

    @Override
    public Value multiply(Value v2) {
        return new IntegerValue(value * ((IntegerValue) v2).value);
    }

    @Override
    public Value subtract(Value v2) throws Exception {
        return new IntegerValue(value / ((IntegerValue) v2).value);
    }

    @Override
    public Value equal(Value v2) {
        return new BooleanValue(value == ((IntegerValue) v2).value);
    }

    @Override
    public Value greater(Value v2) {
        return new BooleanValue(value > ((IntegerValue) v2).value);
    }

    @Override
    public Value less(Value v2) {
        return new BooleanValue(value < ((IntegerValue) v2).value);
    }
}
