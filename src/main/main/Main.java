package main.main;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import d_grammar.DLexer;
import d_grammar.DParser;

import java.io.File;
import java.io.PrintWriter;

import parser.Parser;

public class Main {

    public static void main(String[] args) throws Exception {

        CharStream stream = CharStreams.fromFileName("test");

        DLexer lexer = new DLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DParser parser = new DParser(tokens);
        ParseTree tree = parser.program();

        ScopeChecker sc = new ScopeChecker();
        sc.check(tree);

        String s = JsonCreater.toJson(tree);
        PrintWriter pw = new PrintWriter(new File("ast.json"));
        pw.write(s);
        pw.close();

        Parser p = new Parser(tree);
        p.parse();
    }

}