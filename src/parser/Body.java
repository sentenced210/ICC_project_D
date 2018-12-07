package parser;

import types.EmptyValue;
import types.Value;
import scope.Scope;

import java.util.ArrayList;

public class Body {
    private ArrayList<Statement> statements;
    private Body parentBody;
    private boolean needToReturn = false;
    private Value returnValue;

    public Body(Body parentBody) {
        statements = new ArrayList<>();
        this.parentBody = parentBody;
    }

    public void add(Statement s) {
        statements.add(s);
    }

    public void returnFromBody(Value returnValue) {
        if (parentBody != null) {
            parentBody.returnFromBody(returnValue);
        }
        this.returnValue = returnValue;
        needToReturn = true;
    }

    public Value execute(Scope scope) throws Exception {
        for (Statement s : statements) {
            if (s instanceof ReturnStatement) {
                returnFromBody(s.execute(scope));
            } else {
                s.execute(scope);
            }
            if (needToReturn) {
                needToReturn = false;
                return returnValue;
            }
        }
        return new EmptyValue();
    }
}
