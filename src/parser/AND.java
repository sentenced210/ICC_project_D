package parser;

import scope.Scope;
import types.Value;

public class AND extends Relation {
    public Expression left, right;

    public AND(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).and(right.calculate(scope));
    }
}
