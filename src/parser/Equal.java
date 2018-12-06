package parser;

import types.Value;

public class Equal extends Relation {
    Expression left, right;

    Equal(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate() throws Exception {
        return left.calculate().equal(right.calculate());
    }
}
