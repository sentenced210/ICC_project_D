package parser;

import scope.Scope;
import types.Value;

public class Parenthesized extends Primary {
    Expression exp;
    
    public Parenthesized(Expression exp) {
        this.exp = exp;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return exp.calculate(scope);
    }
}
