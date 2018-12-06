package parser;

import scope.Scope;
import types.Value;


public class Add extends Term {
    Expression left, right;

    Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).add(right.calculate(scope));
    }
}
