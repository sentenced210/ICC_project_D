package parser;

import scope.Scope;
import types.Value;

public abstract class Statement {
    abstract Value execute(Scope scope) throws Exception;
}
