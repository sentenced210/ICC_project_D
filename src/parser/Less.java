package parser;

import types.Value;

import java.math.BigInteger;

public class Less extends Relation {
    Expression left, right;

    Less(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate() throws Exception {
        return left.calculate().less(right.calculate());
    }
}
