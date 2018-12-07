import d_grammar.DLexer;
import d_grammar.DParser;
import main.main.JsonCreater;
import main.main.ScopeChecker;
import main.main.SyntaxErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;
import org.junit.Test;
import parser.Body;
import parser.Parser;
import scope.Scope;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SemanticTests {

    @Test
    public void normalSemantic1(){
        CharStream stream = CharStreams.fromString("var x := 1; print x; ");

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


        ScopeChecker sc = new ScopeChecker();

        String assertMessage = "OK";
        try {
            sc.check(tree);
        } catch (Exception e) {
            assertMessage = e.getMessage();
//            e.printStackTrace();
        }

        Assert.assertEquals("OK", assertMessage);
    }

    @Test
    public void normalSemantic2(){
        CharStream stream = CharStreams.fromString("var a := func(x) is " +
                "    print x " +
                " end\n " +
                " print a(4) ");

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


        ScopeChecker sc = new ScopeChecker();

        String assertMessage = "OK";
        try {
            sc.check(tree);
        } catch (Exception e) {
            assertMessage = e.getMessage();
            e.printStackTrace();
        }

        Assert.assertEquals("OK", assertMessage);
    }

    @Test
    public void notNormalSemantic1(){
        CharStream stream = CharStreams.fromString("a := 0");

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


        ScopeChecker sc = new ScopeChecker();

        String assertMessage = "OK";
        try {
            sc.check(tree);
        } catch (Exception e) {
            assertMessage = e.getMessage();
        }

        Assert.assertNotEquals("OK", assertMessage);
    }

    @Test
    public void notNormalSemantic2(){
        CharStream stream = CharStreams.fromString("if 1>0 then var a:=0 end print a");

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


        ScopeChecker sc = new ScopeChecker();

        String assertMessage = "OK";
        try {
            sc.check(tree);
        } catch (Exception e) {
            assertMessage = e.getMessage();
        }

        Assert.assertNotEquals("OK", assertMessage);
    }

    @Test
    public void normalSemantic3(){
        CharStream stream = CharStreams.fromString("var i := 0;\n for i in 0..10 loop print i end;");

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


        ScopeChecker sc = new ScopeChecker();

        String assertMessage = "OK";
        try {
            sc.check(tree);
        } catch (Exception e) {
            assertMessage = e.getMessage();
        }

        Assert.assertEquals("OK", assertMessage);
    }



}
