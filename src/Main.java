import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.io.PrintWriter;
import java.io.*;
public class Main {
    public static void main(String [] args){
        try {

            CharStream input = CharStreams.fromString("ab");
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


            NFA nfa = new NFA();
            nfa.addToTable(0, 'a');
            nfa.addToTable(1, 'b');
            nfa.addToTable(2, 'ñ');



            //int key, Character header, List<Integer> states
            nfa.addToTransitionMap(0, 'a', 1);
            nfa.addToTransitionMap(0, 'b', 99);
            nfa.addToTransitionMap(0, 'ñ', 99);

            nfa.addToTransitionMap(1, 'a', 99);
            nfa.addToTransitionMap(1, 'b', 2);
            nfa.addToTransitionMap(1, 'ñ', 99);

            nfa.addToTransitionMap(2, 'a', 99);
            nfa.addToTransitionMap(2, 'b', 99);
            nfa.addToTransitionMap(2, 'ñ', 99);

            //nfa.get(1, 'a');
            //Map<Integer, String> transitions = new HashMap<String, String>();
            //transitions.put("")

            System.out.println(nfa.toString());
        }catch(Exception e) {
            System.out.println("Error " + e );
        }

    }
}
