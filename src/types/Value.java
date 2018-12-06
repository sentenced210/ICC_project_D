package types;


public abstract class Value {
    public abstract Value add(Value v2) throws Exception;
    public abstract Value multiply(Value v2) throws Exception;
    public abstract Value subtract(Value v2) throws Exception;
    public abstract Value equal(Value v2) throws Exception;
    public abstract Value greater(Value v2) throws Exception;
    public abstract Value less(Value v2) throws Exception;
}
