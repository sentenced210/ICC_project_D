import d_grammar.DLexer;
import d_grammar.DParser;
import main.main.SyntaxErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;
import org.junit.Test;

public class LexicalAndParserTests {
    @Test
    public void mathLaw(){
        Assert.assertNotEquals(5, 2*2);
    }

    @Test
    public void normalGrammar1(){
        CharStream stream = CharStreams.fromString("var x := 5");

        DLexer lexer = new DLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DParser parser = new DParser(tokens);

        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();

        parser.removeErrorListeners();
        parser.addErrorListener(syntaxErrorListener.INSTANCE);

        ParseTree tree = null;

        String assertMessage = "OK";
        try {
            tree = parser.program();
        } catch (ParseCancellationException e) {
            assertMessage = e.getMessage();
        }

        Assert.assertEquals("OK", assertMessage);
    }

    @Test
    public void normalGrammar2(){
        CharStream stream = CharStreams.fromString("var x := \'sometext\'");

        DLexer lexer = new DLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DParser parser = new DParser(tokens);

        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();

        parser.removeErrorListeners();
        parser.addErrorListener(syntaxErrorListener.INSTANCE);

        ParseTree tree = null;

        String assertMessage = "OK";
        try {
            tree = parser.program();
        } catch (ParseCancellationException e) {
            assertMessage = e.getMessage();
        }

        Assert.assertEquals("OK", assertMessage);
    }

    @Test
    public void normalGrammar3(){
        CharStream stream = CharStreams.fromString("var x := 2;\n"
                +"print x");

        DLexer lexer = new DLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DParser parser = new DParser(tokens);

        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();

        parser.removeErrorListeners();
        parser.addErrorListener(syntaxErrorListener.INSTANCE);

        ParseTree tree = null;

        String assertMessage = "OK";
        try {
            tree = parser.program();
        } catch (ParseCancellationException e) {
            assertMessage = e.getMessage();
        }

        Assert.assertEquals("OK", assertMessage);
    }

    @Test
    public void normalGrammar4(){
        CharStream stream = CharStreams.fromString("var x := 1.0;\n"
                + "if x is real then \n"
                +"print x + 1.0 end");

        DLexer lexer = new DLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DParser parser = new DParser(tokens);

        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();

        parser.removeErrorListeners();
        parser.addErrorListener(syntaxErrorListener.INSTANCE);

        ParseTree tree = null;

        String assertMessage = "OK";
        try {
            tree = parser.program();
        } catch (ParseCancellationException e) {
            assertMessage = e.getMessage();
        }

        Assert.assertEquals("OK", assertMessage);
    }

    @Test
    public void normalGrammar5(){
        CharStream stream = CharStreams.fromString("var i := 0, j := 0\n"
                +"while i<10 then\n"
                +"while j<10 then\n"
                +"print \"i = \", i, \" j = \", j;\r\n"
                +"end "+"end");

        DLexer lexer = new DLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DParser parser = new DParser(tokens);

        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();

        parser.removeErrorListeners();
        parser.addErrorListener(syntaxErrorListener.INSTANCE);

        ParseTree tree = null;

        String assertMessage = "OK";
        try {
            tree = parser.program();
        } catch (ParseCancellationException e) {
            assertMessage = e.getMessage();
        }

        Assert.assertEquals("OK", assertMessage);
    }


}
