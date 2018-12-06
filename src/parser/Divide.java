package parser;

import scope.Scope;
import types.Value;

public class Divide extends Expression {
    private Expression left, right;

    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).divide(right.calculate(scope));
    }
}
