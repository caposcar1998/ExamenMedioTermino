import java.util.*;

public class RegexToNFA {

    public NodeNFA concat(NodeNFA iNode, NodeNFA fNode){
        fNode.adjustInitialState();

        for(NodeNFA.Paths p: fNode.getPaths()){
            iNode.getPaths().add(new NodeNFA.Paths(p.getInitialState() + (iNode.getStates().size()-1),
                    p.getNextState() + iNode.getStates().size() - 1, p.getTransitionWith()));

        }

        for (Integer state: fNode.getStates()){
            iNode.setState(state + iNode.getStates().size() + 1);
        }

        iNode.setFinalState(iNode.getStates().size(), fNode.getStates().size() - 2);

        return iNode;
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
