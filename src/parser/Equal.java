package parser;

import scope.Scope;
import types.Value;

public class Equal extends Factor {
    private Expression left, right;

    public Equal(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).equal(right.calculate(scope));
    }
}
