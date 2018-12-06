package parser;

import scope.Scope;
import types.Value;

public abstract class Statement {
    abstract Value calculate(Scope scope) throws Exception;
}
