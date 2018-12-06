package parser;

import scope.Scope;
import types.Value;

public class Subtract extends Term {
    private Expression left, right;

    public Subtract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).subtract(right.calculate(scope));
    }
}
