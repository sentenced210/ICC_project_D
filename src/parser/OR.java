package parser;

import scope.Scope;
import types.Value;

public class OR extends Relation {
    public Expression left, right;

    public OR(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).or(right.calculate(scope));
    }
}
