package parser;

import types.IntegerValue;
import types.Value;


public class Add extends Term {
    Expression left, right;

    Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate() throws Exception {
        return left.calculate().add(right.calculate());
    }
}
