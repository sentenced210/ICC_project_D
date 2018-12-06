package parser;

import scope.Scope;
import types.FunctionValue;
import types.Value;

import java.util.ArrayList;

public class Function extends Primary {
    private ArrayList<IDENT> paramNames;
    private Body body;
    private Expression exp;

    public Function(ArrayList<IDENT> paramNames, Body body, Expression exp) {
        this.paramNames = paramNames;
        this.body = body;
        this.exp = exp;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        if (body != null) {
            return new FunctionValue(paramNames, body);
        } else {
            return new FunctionValue(paramNames, exp);
        }
    }
}
