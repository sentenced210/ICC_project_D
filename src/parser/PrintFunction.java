package parser;

import scope.Scope;
import types.EmptyValue;
import types.Value;

import java.util.ArrayList;

public class PrintFunction extends Statement {
    private ArrayList<Expression> exps;

    public PrintFunction(ArrayList<Expression> exps) {
        this.exps = exps;
    }

    @Override
    Value execute(Scope scope) throws Exception {
        for (Expression e : exps) {
            System.out.print(e.calculate(scope) + " ");
        }
        System.out.println();
        return new EmptyValue();
    }
}
