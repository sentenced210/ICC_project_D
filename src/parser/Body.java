package parser;

import java.util.ArrayList;

public class Body {
    private ArrayList<Statement> statements;

    public Body() {
        statements = new ArrayList<>();
    }

    public void add(Statement s) {
        statements.add(s);
    }
}
