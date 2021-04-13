import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.PrintWriter;

public class Main {
    public static void main(String [] args){
        try {

            CharStream input = CharStreams.fromString("(a*)|(b*)");
            BNFGrammarLexer lexer = new BNFGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BNFGrammarParser parser = new BNFGrammarParser(tokens);
            ParseTree tree = parser.re();
            System.out.println();
            System.out.println(tree.toStringTree(parser));

            MiVisitador eval = new MiVisitador();
            Node n;
            n = eval.visit(tree);
            n.gen();

        }catch(Exception e) {
            System.out.println("Error " + e );
        }

    }
}
