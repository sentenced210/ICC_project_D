package parser;

import scope.Scope;
import types.BooleanValue;
import types.EmptyValue;
import types.Value;

public class ForLoop extends Statement {
    private String varName;
    private Expression left, right;
    private Body body;

    public ForLoop(String varName, Expression left, Expression right, Body body) {
        this.varName = varName;
        this.left = left;
        this.right = right;
        this.body = body;
    }

    private boolean check1(Scope scope) throws Exception {
        Value leftValue, rightValue;
        leftValue = left.calculate(scope);
        rightValue = right.calculate(scope);
        return ((BooleanValue) leftValue.lessOrEqual(scope.getValue(varName))).getValue()
                && (((BooleanValue) rightValue.greaterOrEqual(scope.getValue(varName)))).getValue();
    }

    private boolean check2(Scope scope) throws Exception {
        Value leftValue, rightValue;
        leftValue = left.calculate(scope);
        rightValue = right.calculate(scope);
        return ((BooleanValue) leftValue.greaterOrEqual(scope.getValue(varName))).getValue()
                && (((BooleanValue) rightValue.lessOrEqual(scope.getValue(varName)))).getValue();
    }

    @Override
    Value execute(Scope scope) throws Exception {
        for (; check1(scope) || check2(scope);) {
            scope.newScope();
            body.execute(scope);
            scope.endOfScope();
        }
        return new EmptyValue();
    }
}
