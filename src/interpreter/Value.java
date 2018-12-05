package interpreter;

public class Value {

    public static Value VOID = new Value(new String());

    final String value;


    public Value(String value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return Boolean.parseBoolean(value);
    }

    public Double asDouble() {
        return Double.parseDouble(value);
    }

    public String asString() {
        return String.valueOf(value);
    }
    public Integer asInteger() {
        return Integer.parseInt(value);
    }







    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }



}