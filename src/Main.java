import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String [] args){
        try {
            CharStream input = CharStreams.fromString("ab|b");
            BNFGrammarLexer lexer = new BNFGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BNFGrammarParser parser = new BNFGrammarParser(tokens);
            ParseTree tree = parser.re();
            System.out.println();
            System.out.println(tree.toStringTree(parser));
            MiVisitador eval = new MiVisitador();
            Node n = eval.visit(tree);
            //n.gen();
            RegexToNFA.nfaFinal.addToTable(RegexToNFA.nfaFinal.getStates()+1, 'ñ');

            System.out.println(RegexToNFA.op.getOperators());
            NodeNFA resultNFA = new NodeNFA();
            resultNFA = RegexToNFA.thompson.attendOperators(RegexToNFA.op, RegexToNFA.initialNode, RegexToNFA.finalNode);
            RegexToNFA.nfaFinal.setStates(resultNFA.getStates().size());
            for(int i = 0; i<RegexToNFA.nfaFinal.getStates(); i++){
                for (Character c : RegexToNFA.nfaFinal.getAlphabet()) {
                    //99 default value porque no sabía como hacerlo en Java
                    RegexToNFA.nfaFinal.addToTransitionMap(i, c, 99);
                }
            }
            for (NodeNFA.Paths p: resultNFA.getPaths()){
                RegexToNFA.nfaFinal.addToTransitionMap(p.getInitialState(),p.getTransitionWith(), p.getNextState());
            }
            System.out.println(RegexToNFA.regexVisitor.toString());
            resultNFA.display();
            System.out.println(RegexToNFA.nfaFinal.toString());
        }catch(Exception e) {
            System.out.println("Error " + e );
        }

    }
}
