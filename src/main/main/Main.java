package main.main;


import antlr.antlr.DBaseVisitor;
import antlr.antlr.DLexer;
import antlr.antlr.DParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static jdk.nashorn.internal.objects.Global.print;


public class Main {

    public static void main(String[] args) throws Exception {

        CharStream stream = CharStreams.fromFileName("test");

        DLexer lexer = new DLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DParser parser = new DParser(tokens);
        ParseTree tree = parser.compilation_unit();

        String s = JsonCreater.toJson(tree);
        System.out.println(s);

    }

}