package parser;

import scope.Scope;
import types.ArrayValue;
import types.Value;

import java.util.ArrayList;
import java.util.HashMap;

public class Array extends Literal {
    private HashMap<java.lang.Integer, Expression> indexToExp;

    public Array(ArrayList<Expression> exps) {
        indexToExp = new HashMap<>();
        for (int i = 0; i < exps.size(); i++) {
            indexToExp.put(i + 1, exps.get(i));
        }
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return new ArrayValue(indexToExp);
    }
}
