package parser;

import scope.Scope;
import types.TupleValue;
import types.Value;

import java.util.ArrayList;
import java.util.HashMap;

public class Tuple extends Literal {
    private HashMap<IDENT, Expression> identToExp;
    private ArrayList<IDENT> idents;

    public Tuple(ArrayList<IDENT> idents, ArrayList<Expression> exps) throws Exception {
        this.idents = idents;
        identToExp = new HashMap<>();
        for (int i = 0; i < idents.size(); i++) {
            if (idents.get(i) != null) {
                if (identToExp.containsKey(idents.get(i))) {
                    throw new Exception("Key " + idents.get(i).getVarName() + " already exists in tuple");
                }
                identToExp.put(idents.get(i), exps.get(i));
            }
        }
    }

    @Override
    public Value calculate(Scope scope) throws Exception {
        return new TupleValue(identToExp, idents);
    }
}
