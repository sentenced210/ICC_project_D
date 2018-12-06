package parser;

import types.IntegerValue;
import types.Value;


public class Greater extends Relation {
    Expression left, right;

    Greater(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate() throws Exception {
        return left.calculate().greater(right.calculate());
    }
}
