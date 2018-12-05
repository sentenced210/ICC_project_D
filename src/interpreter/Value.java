package interpreter;

public class Value {


    final Object value;


    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean) value;
    }

    public Double asDouble() {
        return (Double) value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    public Integer asInteger() {
        return (Integer) value;
    }



    public boolean isDouble() {
        return value instanceof Double;
    }
    public boolean isInteger() {
        return value instanceof Integer;
    }
    public boolean isBoolean() {
        return value instanceof Boolean;
    }
    public boolean isString() {
        return value instanceof String;
    }




    @Override
    public int hashCode() {

        if (value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if (value == o) {
            return true;
        }

        if (value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value) o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }


}