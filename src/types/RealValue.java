package types;

public class RealValue extends Value {
    private double value;

    public RealValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public Value add(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new RealValue(value + ((IntegerValue) v2).getValue());
        } else if (v2 instanceof RealValue) {
            return new RealValue(value + ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (real) + (" + v2.getType() + ")");
    }

    @Override
    public Value multiply(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new RealValue(value * ((IntegerValue) v2).getValue());
        } else if (v2 instanceof RealValue) {
            return new RealValue(value * ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (real) * (" + v2.getType() + ")");
    }

    @Override
    public Value subtract(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new RealValue(value - ((IntegerValue) v2).getValue());
        } else if (v2 instanceof RealValue) {
            return new RealValue(value - ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (real) - (" + v2.getType() + ")");
    }

    @Override
    public Value equal(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new BooleanValue(value == ((IntegerValue) v2).getValue());
        } else if (v2 instanceof RealValue) {
            return new BooleanValue(value == ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (real) = (" + v2.getType() + ")");
    }

    @Override
    public Value greater(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new BooleanValue(value > ((IntegerValue) v2).getValue());
        } else if (v2 instanceof RealValue) {
            return new BooleanValue(value > ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (real) > (" + v2.getType() + ")");
    }

    @Override
    public Value less(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new BooleanValue(value < ((IntegerValue) v2).getValue());
        } else if (v2 instanceof RealValue) {
            return new BooleanValue(value < ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (real) < (" + v2.getType() + ")");
    }

    @Override
    public Value xor(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (real) xor (" + v2.getType() + ")");
    }

    @Override
    public Value and(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (real) and (" + v2.getType() + ")");
    }

    @Override
    public Value or(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (real) or (" + v2.getType() + ")");
    }

    @Override
    public Value not() throws Exception {
        throw new Exception("Incorrent operation: not (real)");
    }

    @Override
    public Value lessOrEqual(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new BooleanValue(value <= ((IntegerValue) v2).getValue());
        } else if (v2 instanceof RealValue) {
            return new BooleanValue(value <= ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (real) <= (" + v2.getType() + ")");
    }

    @Override
    public Value greaterOrEqual(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new BooleanValue(value >= ((IntegerValue) v2).getValue());
        } else if (v2 instanceof RealValue) {
            return new BooleanValue(value >= ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (real) >= (" + v2.getType() + ")");
    }

    @Override
    public Value notEqual(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new BooleanValue(value != ((IntegerValue) v2).getValue());
        } else if (v2 instanceof RealValue) {
            return new BooleanValue(value != ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (real) /= (" + v2.getType() + ")");
    }

    @Override
    public String getType() {
        return "real";
    }

    @Override
    public Value divide(Value v2) throws Exception {
        if (v2 instanceof IntegerValue) {
            return new RealValue(value / ((IntegerValue) v2).getValue());
        } else if (v2 instanceof RealValue) {
            return new RealValue(value / ((RealValue) v2).getValue());
        }
        throw new Exception("Incorrent operation: (real) / (" + v2.getType() + ")");
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
