import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String [] args){
        try {
            CharStream input = CharStreams.fromString("a*");
            BNFGrammarLexer lexer = new BNFGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BNFGrammarParser parser = new BNFGrammarParser(tokens);
            ParseTree tree = parser.re();
            System.out.println();
            System.out.println(tree.toStringTree(parser));
            MiVisitador eval = new MiVisitador();
            Node n = eval.visit(tree);
            //n.gen();
            MiVisitador.nfaFinal.addToTable(MiVisitador.nfaFinal.getStates()+1, 'ñ');
            System.out.println(MiVisitador.op.getOperators());
            NodeNFA resultNFA = new NodeNFA();
            resultNFA = MiVisitador.thompson.attendOperators(MiVisitador.op, MiVisitador.initialNode, MiVisitador.finalNode);
            MiVisitador.nfaFinal.setStates(resultNFA.getStates().size());
            for(int i = 0; i<MiVisitador.nfaFinal.getStates(); i++){
                for (Character c : MiVisitador.nfaFinal.getAlphabet()) {
                    //99 default value porque no sabía como hacerlo en Java
                    MiVisitador.nfaFinal.addToTransitionMap(i, c, 99);
                }
            }
            for (NodeNFA.Paths p: resultNFA.getPaths()){
                MiVisitador.nfaFinal.addToTransitionMap(p.getInitialState(),p.getTransitionWith(), p.getNextState());
            }
            System.out.println(MiVisitador.regexVisitor.toString());
            resultNFA.display();
            System.out.println(MiVisitador.nfaFinal.toString());
        }catch(Exception e) {
            System.out.println("Error " + e );
        }

    }
}
