package parser;

import scope.Scope;
import types.Value;

import java.math.BigInteger;

public class Subtract extends Term {
    Expression left, right;

    Subtract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).subtract(right.calculate(scope));
    }
}
