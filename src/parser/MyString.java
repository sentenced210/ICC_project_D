package parser;

import scope.Scope;
import types.StringValue;
import types.Value;

public class MyString extends Literal {
    private java.lang.String value;

    public MyString(java.lang.String value) {
        this.value = value;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return new StringValue(value);
    }
}
