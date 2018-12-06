package parser;

import scope.Scope;
import types.Value;

public class NOT extends Relation {
    private Expression exp;

    public NOT(Expression exp) {
        this.exp = exp;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return exp.calculate(scope).not();
    }
}
