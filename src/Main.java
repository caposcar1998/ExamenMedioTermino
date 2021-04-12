import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.PrintWriter;

public class Main {
    public static void main(String [] args){
        try {
            //out = new PrintWriter((args.length==0)?"salida.txt" : args[0]);
            CharStream input = CharStreams.fromStream(System.in);
            //CharStream input = CharStreams.fromString("{a = 0\ni = 0\n while(i < 10) {a = a+i\n i = i + 1} print(a)}");
            BNFGrammarLexer lexer = new BNFGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BNFGrammarParser parser = new BNFGrammarParser(tokens);
            ParseTree tree = parser.re();
            System.out.println();
            System.out.println(tree.toStringTree(parser));
            MiVisitador eval = new MiVisitador();
            Node n = eval.visit(tree);
            n.gen();

        }catch(Exception e) {
            System.out.println("Error " + e );
        }

    }
}
