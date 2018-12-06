package parser;

import scope.Scope;
import types.Value;

public class Multiply extends Expression {
    private Expression left, right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).multiply(right.calculate(scope));
    }
}
