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

    @Override
    Value execute(Scope scope) throws Exception {
        Value execLoop = cond.calculate(scope);
        while ((execLoop instanceof BooleanValue) && ((BooleanValue) execLoop).getValue()) {
            scope.newScope();
            body.execute(scope);
            scope.endOfScope();
            execLoop = cond.calculate(scope);
        }
        return new EmptyValue();
    }
}
