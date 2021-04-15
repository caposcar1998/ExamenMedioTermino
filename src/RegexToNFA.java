import java.util.*;

public class RegexToNFA {
    public static NFA nfaFinal = new NFA();
    public static StacksNFA op = new StacksNFA();
    public static NodeNFA initialNode;
    public static NodeNFA finalNode;
    public static RegexToNFA thompson = new RegexToNFA();
    public static Stack<Character> regexVisitor = new Stack<>();
    public static boolean flagToStopVisiting = false;

    public NodeNFA concat(NodeNFA iNode, NodeNFA fNode){
        fNode.adjustInitialState();

        for(NodeNFA.Paths p: fNode.getPaths()){
            int initialPath = p.getInitialState() + (iNode.getStates().size()-1);
            int nextPath = p.getNextState() + (iNode.getStates().size() - 1);
            iNode.addPath(initialPath, nextPath, p.getTransitionWith());
        }

        for (Integer state: fNode.getStates()){  iNode.setState(state + iNode.getStates().size() + 1); }
        iNode.setFinalState(iNode.getStates().size(), fNode.getStates().size() - 2);
        return iNode;
    }

    public NodeNFA union(NodeNFA iNode, NodeNFA fNode){
        int sizeFromUnion = iNode.getStates().size() + fNode.getStates().size() + 2;
        NodeNFA unionNFA = new NodeNFA(sizeFromUnion);
        Character emptyTransition = 'ñ';
        unionNFA.addPath(0,1,emptyTransition);
        for(NodeNFA.Paths p: iNode.getPaths()){
            int initialPath = p.getInitialState() + 1;
            int nextPath = p.getNextState() + 1;
            unionNFA.addPath(initialPath, nextPath, p.getTransitionWith());
        }
        int nextFinalState;
        nextFinalState = iNode.getStates().size() + fNode.getStates().size() + 1;
        unionNFA.addPath(iNode.getStates().size(), nextFinalState, emptyTransition);
        unionNFA.addPath(0, iNode.getStates().size() + 1, emptyTransition);

        for(NodeNFA.Paths p: fNode.getPaths()){
            int initialPath = p.getInitialState() + iNode.getStates().size() + 1;
            int nextPath = p.getNextState() + iNode.getStates().size() + 1;
            unionNFA.addPath(initialPath, nextPath, p.getTransitionWith());
        }

        unionNFA.addPath(fNode.getStates().size() + iNode.getStates().size(),
                iNode.getStates().size() + fNode.getStates().size() + 1, emptyTransition);

        unionNFA.setFinalState(iNode.getStates().size(),fNode.getStates().size() + 1);
        return unionNFA;
    }

    public NodeNFA star(NodeNFA iNode){
        NodeNFA starNFA = new NodeNFA(iNode.getStates().size() + 2);
        starNFA.addPath(0,1,'ñ');
        for(NodeNFA.Paths p: iNode.getPaths()){
            int initialPath = p.getInitialState() + 1;
            int nextPath = p.getNextState() + 1;
            starNFA.addPath(initialPath, nextPath, p.getTransitionWith());
        }

        starNFA.addPath(iNode.getStates().size(), iNode.getStates().size() + 1, 'ñ');
        starNFA.addPath(iNode.getStates().size(), 1, 'ñ');
        starNFA.addPath(0, iNode.getStates().size() + 1, 'ñ');
        starNFA.setFinalState(iNode.getStates().size(), 1);
        return starNFA;
    }

    public NodeNFA plus(NodeNFA iNode, Character initial){
        NodeNFA plusNFA = new NodeNFA(iNode.getStates().size() + 3);
        Character emptyTransition = 'ñ';
        plusNFA.addPath(0,1, initial);
        plusNFA.addPath(1,2,emptyTransition);

        for(NodeNFA.Paths p: iNode.getPaths()){
            int initialPath = p.getInitialState() + 2;
            int nextPath = p.getNextState() + 2;
            plusNFA.addPath(initialPath, nextPath, p.getTransitionWith());
        }

        plusNFA.addPath(iNode.getStates().size() + 1, iNode.getStates().size() , emptyTransition);

        plusNFA.addPath(iNode.getStates().size()+ 1, iNode.getStates().size()+ 2, emptyTransition);

        plusNFA.addPath(1, iNode.getStates().size() +2, emptyTransition);
        plusNFA.setFinalState(iNode.getStates().size(), 2);
        return plusNFA;
    }

    public void validateOperators(String operatorToAttend, StacksNFA op, NodeNFA initialNode, NodeNFA finalNode){
        if(operatorToAttend.equals("Union")){
            finalNode = op.getFirstAndRemoveActualNFA();
            if(!op.getOperators().isEmpty() && op.operatorToFollow().equals("Concat")){
                op.addConcatNode(op.getFirstAndRemoveActualNFA());
                while(!op.getOperators().empty() && op.operatorToFollow().equals("Concat")){
                    op.addConcatNode(op.getFirstAndRemoveActualNFA());
                    op.getOperators().pop();
                }
                initialNode = concat(op.getFirstAndRemoveConcatNFA(), op.getFirstAndRemoveConcatNFA());
                while (op.getConcatNFA().size() > 0){ initialNode =  concat(initialNode, op.getFirstAndRemoveConcatNFA()); }
            }else{ initialNode = op.getFirstAndRemoveActualNFA(); }
            op.addNodeNFA(union(initialNode, finalNode));
        }else if (operatorToAttend.equals("Concat")){
            finalNode = op.getFirstAndRemoveActualNFA();
            initialNode = op.getFirstAndRemoveActualNFA();
            NodeNFA nodeToConcat = concat(initialNode, finalNode);
            op.addNodeNFA(nodeToConcat);
        }
    }

    public NodeNFA popOperators(StacksNFA op, NodeNFA initialNode, NodeNFA finalNode){
        while(op.getOperators().size() > 0){
            String operatorToAttend = op.getOperators().pop();
            validateOperators(operatorToAttend, op, initialNode, finalNode);
        }

        return op.getActualNFA().pop();
    }

    public void popGroups(StacksNFA op, NodeNFA initialNode, NodeNFA finalNode){
        while(!op.operatorToFollow().equals("StartGroup") && !op.getOperators().empty() ){
            String operatorToAttend = op.getOperators().pop();
            validateOperators(operatorToAttend, op, initialNode, finalNode);
        }
    }



}
