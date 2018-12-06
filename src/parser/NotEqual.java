package parser;

import scope.Scope;
import types.Value;

public class NotEqual extends Factor {
    private Expression left, right;

    public NotEqual(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).notEqual(right.calculate(scope));
    }
}
