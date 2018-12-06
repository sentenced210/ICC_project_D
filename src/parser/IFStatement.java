package parser;

import scope.Scope;
import types.BooleanValue;
import types.EmptyValue;
import types.Value;

public class IFStatement extends Statement {
    private Expression exp;
    private Body body, elseBody;

    public IFStatement(Expression exp, Body body, Body elseBody) {
        this.exp = exp;
        this.body = body;
        this.elseBody = elseBody;
    }

    @Override
    Value execute(Scope scope) throws Exception {
        Value cond = exp.calculate(scope);
        if (!(cond instanceof BooleanValue)) {
            throw new Exception("non-boolean value was used in IF condition");
        }
        if (((BooleanValue) cond).getValue()) {
            scope.newScope();
            body.execute(scope);
            scope.endOfScope();
        } else {
            if (elseBody != null) {
                scope.newScope();
                elseBody.execute(scope);
                scope.endOfScope();
            }
        }
        return new EmptyValue();
    }
}
