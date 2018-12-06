package parser;

import scope.Scope;
import types.IntegerValue;
import types.Value;

import java.util.Scanner;

public class ReadInt extends Expression {
    public ReadInt() {}

    @Override
    public Value calculate(Scope scope) throws Exception {
        Scanner sc = new Scanner(System.in);
        return new IntegerValue(sc.nextInt());
    }
}
