import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String [] args){
        try {

            CharStream input = CharStreams.fromString("abc");
            BNFGrammarLexer lexer = new BNFGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BNFGrammarParser parser = new BNFGrammarParser(tokens);
            ParseTree tree = parser.re();
            System.out.println();
            System.out.println(tree.toStringTree(parser));

            MiVisitador eval = new MiVisitador();

            Node n;
            n = eval.visit(tree);
            //n.gen();
            System.out.println(MiVisitador.op.getOperators().toString());
            //Una vez que hayas acabado de visitar el árbol
            RegexToNFA thompson = new RegexToNFA();
            NodeNFA resultNFA = new NodeNFA();
            resultNFA = thompson.attendOperators(MiVisitador.op, MiVisitador.initialNode, MiVisitador.finalNode);
            resultNFA.display();



            System.out.println(MiVisitador.nfaFinal.toString());
        }catch(Exception e) {
            System.out.println("Error " + e );
        }

    }
}
