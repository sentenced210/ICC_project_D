package parser;

import scope.Scope;
import types.BooleanValue;
import types.EmptyValue;
import types.Value;

public class WhileLoop extends Statement {
    private Expression cond;
    private Body body;

    public WhileLoop(Expression cond, Body body) {
        this.cond = cond;
        this.body = body;
    }

    private boolean check(Scope scope) throws Exception {
        Value execLoop = cond.calculate(scope);
        return (execLoop instanceof BooleanValue) && ((BooleanValue) execLoop).getValue();
    }

    @Override
    Value execute(Scope scope) throws Exception {
        while (check(scope)) {
            scope.newScope();
            body.execute(scope);
            scope.endOfScope();
        }
        return new EmptyValue();
    }
}
