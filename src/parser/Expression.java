package parser;

import scope.Scope;
import types.Value;

public abstract class Expression {
    public abstract Value calculate(Scope scope) throws Exception;
}
