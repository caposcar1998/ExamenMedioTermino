import java.util.*;

public class RegexToNFA {

    public NodeNFA concat(NodeNFA iNode, NodeNFA fNode){
        fNode.adjustInitialState();

        for(NodeNFA.Paths p: fNode.getPaths()){
            int initialPath = p.getInitialState() + (iNode.getStates().size()-1);
            int nextPath = p.getNextState() + (iNode.getStates().size() - 1);
            iNode.addPath(initialPath, nextPath, p.getTransitionWith());
        }

        for (Integer state: fNode.getStates()){
            iNode.setState(state + iNode.getStates().size() + 1);
        }

        iNode.setFinalState(iNode.getStates().size(), fNode.getStates().size() - 2);

        return iNode;
    }

    public NodeNFA star(NodeNFA iNode){
        NodeNFA starNFA = new NodeNFA(iNode.getStates().size() + 2);
        //Sabemos que al ser star, puede existir un estado vacio
        starNFA.addPath(0,1,'ñ');
        //Acceder a los caminos actuales del iNode (elemento antes de la *) para modificarlos de acuerdo a lo necesario
        for(NodeNFA.Paths p: iNode.getPaths()){
            int initialPath = p.getInitialState() + 1;
            int nextPath = p.getNextState() + 1;
            starNFA.addPath(initialPath, nextPath, p.getTransitionWith());
        }
        //Conectamos el finalState de iNode hacia el nuevo final que se genera por un starNFA
        starNFA.addPath(iNode.getPaths().size(), iNode.getStates().size() + 1, 'ñ');
        //Se genera el 'loop' que genera la estrella, regresando al elemento anterior
        starNFA.addPath(iNode.getStates().size(), 1, 'ñ');
        //Se agrega transición vacía del primer estado al último estado
        starNFA.addPath(0, iNode.getStates().size() + 1, 'ñ');
        starNFA.setFinalState(iNode.getStates().size(), 1);
        return starNFA;
    }



    public NodeNFA attendOperators(StacksNFA op, NodeNFA initialNode, NodeNFA finalNode){
        while(op.getOperators().size() > 0){
            String operatorToAttend = op.getOperators().pop();
            //Vamos atendiendo por orden los operators
            if (operatorToAttend.equals("Concat")){
                finalNode = op.getFirstAndRemoveActualNFA();
                initialNode = op.getFirstAndRemoveActualNFA();
                NodeNFA nodeToConcat = concat(initialNode, finalNode);
                op.addNodeNFA(nodeToConcat);
            }

        }

        return op.getActualNFA().pop();
    }



}
