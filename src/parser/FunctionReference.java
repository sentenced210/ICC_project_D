package parser;

import scope.Scope;
import types.EmptyValue;
import types.FunctionValue;
import types.Value;

import java.util.ArrayList;

public class FunctionReference extends Reference {
    private ArrayList<Expression> params;
    private Expression ref;

    public FunctionReference(Expression ref, ArrayList<Expression> params) {
        this.ref = ref;
        this.params = params;
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        FunctionValue fv = ((FunctionValue) ref.calculate(scope));
        ArrayList<IDENT> paramNames = fv.getParamNames();
        if (params.size() != paramNames.size()) {
            throw new Exception("Incorrent number of params");
        }
        scope.newScope();
        for (int i = 0; i < params.size(); i++) {
            scope.newVariable(paramNames.get(i).getVarName(), params.get(i).calculate(scope));
        }
        Value v = new EmptyValue();
        if (fv.getExp() != null) {
            v = fv.getExp().calculate(scope);
        } else {
            v = fv.getBody().execute(scope);
        }
        scope.endOfScope();
        return v;
    }
}
