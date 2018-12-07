package types;

import parser.Body;
import parser.Expression;
import parser.Function;
import parser.IDENT;

import java.util.ArrayList;

public class FunctionValue extends Value {
    private ArrayList<IDENT> paramNames;
    private Expression exp;
    private Body body;

    public FunctionValue(ArrayList<IDENT> paramNames, Expression exp) {
        this.paramNames = paramNames;
        this.exp = exp;
    }

    public FunctionValue(ArrayList<IDENT> paramNames, Body body) {
        this.paramNames = paramNames;
        this.body = body;
    }

    public ArrayList<IDENT> getParamNames() {
        return paramNames;
    }

    public Expression getExp() {
        return exp;
    }

    public Body getBody() {
        return body;
    }

    @Override
    public Value add(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (func) + (" + v2.getType() + ")");
    }

    @Override
    public Value multiply(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (func) * (" + v2.getType() + ")");
    }

    @Override
    public Value subtract(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (func) - (" + v2.getType() + ")");
    }

    @Override
    public Value divide(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (func) / (" + v2.getType() + ")");
    }

    @Override
    public Value xor(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (func) xor (" + v2.getType() + ")");
    }

    @Override
    public Value and(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (func) and (" + v2.getType() + ")");
    }

    @Override
    public Value or(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (func) or (" + v2.getType() + ")");
    }

    @Override
    public Value not() throws Exception {
        throw new Exception("Incorrent operation: not (func)");
    }

    @Override
    public Value equal(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (func) = (" + v2.getType() + ")");
    }

    @Override
    public Value greater(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (func) > (" + v2.getType() + ")");
    }

    @Override
    public Value less(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (func) < (" + v2.getType() + ")");
    }

    @Override
    public Value lessOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (func) <= (" + v2.getType() + ")");
    }

    @Override
    public Value greaterOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (func) >= (" + v2.getType() + ")");
    }

    @Override
    public Value notEqual(Value v2) throws Exception {
        throw new Exception("Incorrent operation: (func) /= (" + v2.getType() + ")");
    }

    @Override
    public String getType() {
        return "func";
    }
}
