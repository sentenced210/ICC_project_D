package parser;

import scope.Scope;
import types.StringValue;
import types.Value;

import java.util.Scanner;

public class ReadString extends Expression {
    public ReadString(){}

    @Override
    public Value calculate(Scope scope) throws Exception {
        Scanner sc = new Scanner(System.in);
        return new StringValue(sc.nextLine());
    }
}
