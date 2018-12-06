package parser;

import types.Value;

import java.math.BigInteger;

public class Multiply extends Expression {
    Expression left, right;

    Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate() throws Exception {
        return left.calculate().multiply(right.calculate());
    }
}
