package parser;

import types.Value;

import java.math.BigInteger;

public class Subtract extends Term {
    Expression left, right;

    Subtract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate() throws Exception {
        return left.calculate().subtract(right.calculate());
    }
}
