package parser;

import scope.Scope;
import types.RealValue;
import types.Value;

public class Real extends Literal {
    private double value;

    public Real(double value) {
        this.value = value;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return new RealValue(value);
    }
}
