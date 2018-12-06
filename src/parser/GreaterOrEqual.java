package parser;

import scope.Scope;
import types.Value;

public class GreaterOrEqual extends Factor {
    private Expression left, right;

    public GreaterOrEqual(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).greaterOrEqual(right.calculate(scope));
    }
}
