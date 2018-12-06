package parser;

import types.Value;

public class Parenthesized extends Primary {
    Expression exp;
    
    public Parenthesized(Expression exp) {
        this.exp = exp;
    }

    @Override
    public Value calculate() throws Exception {
        return exp.calculate();
    }
}
