import d_grammar.DLexer;
import d_grammar.DParser;
import main.main.ScopeChecker;
import main.main.SyntaxErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.junit.Assert;
import parser.Body;
import parser.Parser;
import scope.Scope;

public class InterpreterTest {
    @Test
    public void nestedFunction(){
        CharStream stream = CharStreams.fromString("var f := func(n) is\n" +
                "    n := n*2\n" +
                "    var f1:=func(q) is\n" +
                "        return q+1\n" +
                "    end\n" +
                "\n" +
                "    var b:=f1(n)\n" +
                "\n" +
                "    return b\n" +
                "end\n" +
                "\n" +
                "var a:=f(4)\n" +
                "print(a)");

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
        Parser p = new Parser(tree);

        Body b = null;

        try {
            b = p.parse();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scope scope = new Scope();

        try {
            b.execute(scope);
        } catch (Exception e) {
            e.printStackTrace();
        }


        Assert.assertEquals("OK", assertMessage);
    }
}