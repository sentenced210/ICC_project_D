package parser;

import scope.Scope;
import types.Value;

public class XOR extends Relation {
    private Expression left, right;

    public XOR(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return left.calculate(scope).xor(right.calculate(scope));
    }
}
