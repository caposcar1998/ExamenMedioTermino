import java.util.Stack;

public class StacksNFA{
    private Stack<String> operatorsToFollow;
    private Stack<NodeNFA> actualNFA; //operands
    private Stack<NodeNFA> concatNFA;

    public StacksNFA(){
        this.operatorsToFollow = new Stack<>();
        this.actualNFA = new Stack<>();
        this.concatNFA = new Stack<>();
    }

    public Stack<NodeNFA> getActualNFA(){
        return actualNFA;
    }

    public Stack<NodeNFA> getConcatNFA(){
        return concatNFA;
    }

    public Stack<String> getOperatorsToFollow(){
        return operatorsToFollow;
    }

    public NodeNFA getFirstAndRemoveActualNFA(){
        return actualNFA.pop();
    }

    public void addOperator(String operation){
        operatorsToFollow.add(operation);
    }

    public void addNodeNFA(NodeNFA node){
        actualNFA.push(node);
    }

    public void addConcatNode(NodeNFA node){
        concatNFA.push(node);
    }

    public Stack<String> getOperators(){
        return operatorsToFollow;
    }

    public void removeFirstOperator(){
        operatorsToFollow.pop();
    }


}
