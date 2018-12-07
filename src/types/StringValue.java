package types;

public class StringValue extends Value {
    private String value;

    public StringValue(String value) {
        this.value = value;
    }

    @Override
    public Value add(Value v2) throws Exception {
        if (v2 instanceof StringValue) {
            return new StringValue(value + ((StringValue) v2).value);
        }
        throw new Exception("Incorrent operation: (string) + (" + v2.getType() + ")");
    }

    @Override
    public Value multiply(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) * (" + v2.getType() + ")");
    }

    @Override
    public Value subtract(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) - (" + v2.getType() + ")");
    }

    @Override
    public Value divide(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) / (" + v2.getType() + ")");
    }

    @Override
    public Value xor(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) xor (" + v2.getType() + ")");
    }

    @Override
    public Value and(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) and (" + v2.getType() + ")");
    }

    @Override
    public Value or(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) or (" + v2.getType() + ")");
    }

    @Override
    public Value not() throws Exception {
        throw new Exception("Incorrent operation: not (string)");
    }

    @Override
    public Value equal(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) = (" + v2.getType() + ")");
    }

    @Override
    public Value greater(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) > (" + v2.getType() + ")");
    }

    @Override
    public Value less(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) < (" + v2.getType() + ")");
    }

    @Override
    public Value lessOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) <= (" + v2.getType() + ")");
    }

    @Override
    public Value greaterOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) >= (" + v2.getType() + ")");
    }

    @Override
    public Value notEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (string) /= (" + v2.getType() + ")");
    }

    @Override
    public String getType() {
        return "string";
    }

    @Override
    public String toString() {
        return value;
    }
}
