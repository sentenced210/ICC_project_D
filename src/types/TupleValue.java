package types;

import parser.Expression;
import parser.IDENT;
import parser.Tuple;

import java.util.HashMap;

public class TupleValue extends Value {
    private HashMap<IDENT, Expression> identToExp;

    public TupleValue(HashMap<IDENT, Expression> identToExp) {
        this.identToExp = identToExp;
    }

    public Expression getElement(IDENT key) {
        return identToExp.get(key);
    }

    @Override
    public Value add(Value v2) throws Exception {
        if (v2 instanceof TupleValue) {
            HashMap<IDENT, Expression> tmp = new HashMap<>();
            for (IDENT x : identToExp.keySet()) {
                tmp.put(x, identToExp.get(x));
            }
            int cnt = tmp.size();
            for (IDENT x : ((TupleValue) v2).identToExp.keySet()) {
                if (!tmp.containsKey(x)) {
                    cnt++;
                }
                tmp.put(new IDENT(String.valueOf(cnt)), identToExp.get(x));
            }
            return new TupleValue(tmp);
        }
        throw new Exception("Incorrect operation: (tuple) + (" + v2.getType() + ")");
    }

    @Override
    public Value multiply(Value v2) throws Exception {
        throw new Exception("Incorrect operation: (tuple) * (" + v2.getType() + ")");
    }

    @Override
    public Value subtract(Value v2) throws Exception {
        throw new Exception("Incorrect operation: (tuple) - (" + v2.getType() + ")");
    }

    @Override
    public Value divide(Value v2) throws Exception {
        throw new Exception("Incorrect operation: (tuple) / (" + v2.getType() + ")");
    }

    @Override
    public Value xor(Value v2) throws Exception {
        throw new Exception("Incorrect operation: (tuple) xor (" + v2.getType() + ")");
    }

    @Override
    public Value and(Value v2) throws Exception {
        throw new Exception("Incorrect operation: (tuple) and (" + v2.getType() + ")");
    }

    @Override
    public Value or(Value v2) throws Exception {
        throw new Exception("Incorrect operation: (tuple) or (" + v2.getType() + ")");
    }

    @Override
    public Value not() throws Exception {
        throw new Exception("Incorrect operation: not (tuple)");
    }

    @Override
    public Value equal(Value v2) throws Exception {
        throw new Exception("Incorrect operation: (tuple) = (" + v2.getType() + ")");
    }

    @Override
    public Value greater(Value v2) throws Exception {
        throw new Exception("Incorrect operation: (tuple) > (" + v2.getType() + ")");
    }

    @Override
    public Value less(Value v2) throws Exception {
        throw new Exception("Incorrect operation: (tuple) < (" + v2.getType() + ")");
    }

    @Override
    public Value lessOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrect operation: (tuple) <= (" + v2.getType() + ")");
    }

    @Override
    public Value greaterOrEqual(Value v2) throws Exception {
        throw new Exception("Incorrect operation: (tuple) >= (" + v2.getType() + ")");
    }

    @Override
    public Value notEqual(Value v2) throws Exception {
        throw new Exception("Incorrect operation: (tuple) /= (" + v2.getType() + ")");
    }

    @Override
    public String getType() {
        return "tuple";
    }
}
