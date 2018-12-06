package parser;

import scope.Scope;
import types.Value;


public class Greater extends Factor {
    Expression left, right;

    Greater(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).greater(right.calculate(scope));
    }
}
