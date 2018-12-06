package types;

public class StringValue extends Value {
    private String value;

    public StringValue(String value) {
        this.value = value;
    }

    @Override
    public Value add(Value v2) throws Exception {
        return new StringValue(value + ((StringValue) v2).value);
    }

    @Override
    public Value multiply(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) * (value)");
    }

    @Override
    public Value subtract(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) - (value)");
    }

    @Override
    public Value divide(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) / (value)");
    }

    @Override
    public Value xor(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) xor (value)");
    }

    @Override
    public Value and(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) and (value)");
    }

    @Override
    public Value or(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) or (value)");
    }

    @Override
    public Value not() throws Exception {
        throw new Exception("Incorrent operation: (string) not (value)");
    }

    @Override
    public Value equal(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) = (value)");
    }

    @Override
    public Value greater(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) > (value)");
    }

    @Override
    public Value less(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) < (value)");
    }

    @Override
    public Value lessOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) <= (value)");
    }

    @Override
    public Value greaterOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) >= (value)");
    }

    @Override
    public Value notEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) /= (value)");
    }

    @Override
    public String toString() {
        return value;
    }
}
