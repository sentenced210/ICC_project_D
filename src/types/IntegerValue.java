package types;

public class IntegerValue extends Value {
    private int value;

    public IntegerValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public Value add(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new IntegerValue(value + ((IntegerValue) v2).value);
        } else if (v2 instanceof RealValue) {
            return new RealValue(value + ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (int) + (" + v2.getType() + ")");
    }

    @Override
    public Value multiply(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new IntegerValue(value * ((IntegerValue) v2).value);
        } else if (v2 instanceof RealValue) {
            return new RealValue(value * ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (int) * (" + v2.getType() + ")");
    }

    @Override
    public Value subtract(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new IntegerValue(value - ((IntegerValue) v2).value);
        } else if (v2 instanceof RealValue) {
            return new RealValue(value - ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (int) - (" + v2.getType() + ")");
    }

    @Override
    public Value equal(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new BooleanValue(value == ((IntegerValue) v2).value);
        } else if (v2 instanceof RealValue) {
            return new BooleanValue(value == ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (int) == (" + v2.getType() + ")");
    }

    @Override
    public Value greater(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new BooleanValue(value > ((IntegerValue) v2).value);
        } else if (v2 instanceof RealValue) {
            return new BooleanValue(value > ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (int) > (" + v2.getType() + ")");
    }

    @Override
    public Value less(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new BooleanValue(value < ((IntegerValue) v2).value);
        } else if (v2 instanceof RealValue) {
            return new BooleanValue(value < ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (int) < (" + v2.getType() + ")");
    }

    @Override
    public Value xor(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (int) xor (" + v2.getType() + ")");
    }

    @Override
    public Value and(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (int) and (" + v2.getType() + ")");
    }

    @Override
    public Value or(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (int) or (" + v2.getType() + ")");
    }

    @Override
    public Value not() throws Exception {
        throw new Exception("Incorrent operation: not (int)");
    }

    @Override
    public Value lessOrEqual(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new BooleanValue(value <= ((IntegerValue) v2).value);
        } else if (v2 instanceof RealValue) {
            return new BooleanValue(value <= ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (int) <= (" + v2.getType() + ")");
    }

    @Override
    public Value greaterOrEqual(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new BooleanValue(value >= ((IntegerValue) v2).value);
        } else if (v2 instanceof RealValue) {
            return new BooleanValue(value >= ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (int) >= (" + v2.getType() + ")");
    }

    @Override
    public Value notEqual(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new BooleanValue(value != ((IntegerValue) v2).value);
        } else if (v2 instanceof RealValue) {
            return new BooleanValue(value != ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (int) /= (" + v2.getType() + ")");
    }

    @Override
    public String getType() {
        return "int";
    }

    @Override
    public Value divide(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new IntegerValue(value / ((IntegerValue) v2).value);
        } else if (v2 instanceof RealValue) {
            return new RealValue(value / ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (int) / (" + v2.getType() + ")");
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
