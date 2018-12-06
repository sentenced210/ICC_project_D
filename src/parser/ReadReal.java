package parser;

import scope.Scope;
import types.RealValue;
import types.Value;

import java.util.Scanner;

public class ReadReal extends Expression {
    public ReadReal(){}

    @Override
    public Value calculate(Scope scope) throws Exception {
        Scanner sc = new Scanner(System.in);
        return new RealValue(sc.nextDouble());
    }
}
