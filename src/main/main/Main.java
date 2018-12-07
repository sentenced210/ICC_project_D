package main.main;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import d_grammar.DLexer;
import d_grammar.DParser;

import java.io.File;
import java.io.PrintWriter;

import parser.Body;
import parser.Parser;
import scope.Scope;

public class Main {

    public static void main(String[] args) throws Exception {

        CharStream stream = CharStreams.fromFileName("test");

        DLexer lexer = new DLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DParser parser = new DParser(tokens);

        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();

        parser.removeErrorListeners();
        parser.addErrorListener(syntaxErrorListener.INSTANCE);

        ParseTree tree = null;
        try {
            tree = parser.program();
        } catch (ParseCancellationException e) {
            System.out.println(e.getMessage());
        }

        String s = JsonCreater.toJson(tree);
        PrintWriter pw = new PrintWriter(new File("ast.json"));
        pw.write(s);
        pw.close();

        ScopeChecker sc = new ScopeChecker();
        sc.check(tree);

        Parser p = new Parser(tree);
        Body b = p.parse();
        b.execute(new Scope());
    }

}