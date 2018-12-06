package parser;

import scope.Scope;
import types.Value;

public class Equal extends Relation {
    Expression left, right;

    Equal(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).equal(right.calculate(scope));
    }
}
