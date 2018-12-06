package parser;

import scope.Scope;
import types.Value;

import java.math.BigInteger;

public class Multiply extends Expression {
    Expression left, right;

    Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).multiply(right.calculate(scope));
    }
}
