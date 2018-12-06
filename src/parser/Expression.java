package parser;

import types.Value;

public abstract class Expression extends Statement {
    public abstract Value calculate() throws Exception;
}
