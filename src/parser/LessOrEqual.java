package parser;

import scope.Scope;
import types.Value;

public class LessOrEqual extends Factor {
    private Expression left, right;

    public LessOrEqual(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).lessOrEqual(right.calculate(scope));
    }
}
