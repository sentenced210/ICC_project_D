package main.main;

import d_grammar.DLexer;
import d_grammar.DParser;

import interpreter.DVisitorInterpreter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.PrintWriter;


public class Main {

    public static void main(String[] args) throws Exception {

        CharStream stream = CharStreams.fromFileName("test");

        DLexer lexer = new DLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DParser parser = new DParser(tokens);
        ParseTree tree = parser.program();

        ScopeChecker.check(tree);

        String s = JsonCreater.toJson(tree);
        PrintWriter pw = new PrintWriter(new File("ast.json"));
        pw.write(s);
        pw.close();


        DVisitorInterpreter interpreter = new DVisitorInterpreter();
        interpreter.visit(tree);
        System.out.println(interpreter.code);

        System.out.println(interpreter.globalScope.keySet());
        System.out.println(interpreter.globalScope.values());
    }


}