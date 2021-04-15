import java.util.*;

public class MiVisitador extends BNFGrammarBaseVisitor<Node>{

    private ArrayList<String> leftUnion = new ArrayList<>();
    private Stack<String> operatorsOfGroups = new Stack<>();
    private Stack<String> splitedLeftSide = new Stack<>();
    private ArrayList<String> insideGroup = new ArrayList<>();
    private Stack<String> splitedGroup = new Stack<>();
    private Set<Character> alphabet = new HashSet<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' , 'j', 'k', 'l','m', 'n', 'o', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
    private boolean leftUnionResolved = false;
    private boolean groupResolved = false;
    private boolean isGroup = false;
    private boolean fromRange = false;

    private void checkWhenUnion(){
        if(!this.splitedLeftSide.isEmpty() && this.leftUnionResolved){
            this.splitedLeftSide.pop();

        }
        if(this.splitedLeftSide.isEmpty() && this.leftUnionResolved){
            RegexToNFA.op.addOperator("Union");
            this.leftUnionResolved = false;
        }
    }

    private void checkWhenGroup(){
        if(!this.splitedGroup.isEmpty() && !this.groupResolved){
            this.splitedGroup.pop();

        }
        if(this.splitedGroup.isEmpty() && !this.groupResolved){
            this.isGroup = false;
            this.groupResolved = true;
        }
    }

    @Override public Node visitStar(BNFGrammarParser.StarContext ctx) {
        RegexToNFA.regexVisitor.push(ctx.getChild(0).getText().charAt(0));
        RegexToNFA.regexVisitor.push(ctx.getChild(1).getText().charAt(0));
        char c = ctx.getChild(0).getText().charAt(0);
        if(c == '('){
            operatorsOfGroups.push("Star");
        }else{
            RegexToNFA.op.addNodeNFA(new NodeNFA(c));
            RegexToNFA.nfaFinal.addToTable(RegexToNFA.nfaFinal.getStates()+1, c);
            RegexToNFA.flagToStopVisiting = true;
            RegexToNFA.op.addNodeNFA(RegexToNFA.thompson.star(RegexToNFA.op.getActualNFA().pop()));
            checkWhenUnion();
        }


        return visit(ctx.elementaryRE());
    }

    @Override public Node visitPlus(BNFGrammarParser.PlusContext ctx) {
        RegexToNFA.regexVisitor.push(ctx.getChild(0).getText().charAt(0));
        RegexToNFA.regexVisitor.push(ctx.getChild(1).getText().charAt(0));
        char c = ctx.getChild(0).getText().charAt(0);
        if(c == '('){
            operatorsOfGroups.push("Plus");
        }else{
            RegexToNFA.op.addNodeNFA(new NodeNFA(c));
            RegexToNFA.nfaFinal.addToTable(RegexToNFA.nfaFinal.getStates()+1, c);
            RegexToNFA.flagToStopVisiting = true;
            RegexToNFA.op.addNodeNFA(RegexToNFA.thompson.plus(RegexToNFA.op.getActualNFA().pop(), c));
            checkWhenUnion();
        }

        return visit(ctx.elementaryRE());
    }

    @Override public Node visitUnion(BNFGrammarParser.UnionContext ctx) {
        this.leftUnion.add(ctx.getChild(0).getText());
        String[] l = this.leftUnion.get(0).split("");

        for (String cL: l){
            this.splitedLeftSide.add(cL);
        }
        this.leftUnionResolved = true;
        return visitChildren(ctx);
    }

    @Override public Node visitGroup(BNFGrammarParser.GroupContext ctx) {
        RegexToNFA.op.addOperator("StartGroup");
        this.insideGroup.add(ctx.getChild(1).getText());
        String[] g = this.insideGroup.get(0).split("");

        for (String cL: g){
            this.splitedGroup.add(cL);
        }

        this.isGroup = true;
        return visitChildren(ctx);
    }

    @Override public Node visitConcatenation(BNFGrammarParser.ConcatenationContext ctx) {
        RegexToNFA.op.addOperator("Concat");
        return visitChildren(ctx);
    }

    @Override public Node visitElementaryRE(BNFGrammarParser.ElementaryREContext ctx) {
        Character c;
        if (RegexToNFA.flagToStopVisiting){
            RegexToNFA.flagToStopVisiting = false;
        }else{
            c = ctx.getChild(0).getText().charAt(0);
            if(c!= '[' && c!= '('){
                RegexToNFA.regexVisitor.push(ctx.getChild(0).getText().charAt(0));
                RegexToNFA.op.addNodeNFA(new NodeNFA(c));
                RegexToNFA.nfaFinal.addToTable(RegexToNFA.nfaFinal.getStates()+1, c);
                checkWhenUnion();
            }

            if(isGroup){
                checkWhenGroup();
                if(groupResolved){
                    RegexToNFA.thompson.popGroups(RegexToNFA.op, RegexToNFA.initialNode, RegexToNFA.finalNode);
                    if(!this.operatorsOfGroups.isEmpty()){
                        String groupOperator = this.operatorsOfGroups.pop();
                        if(groupOperator.equals("Star")){
                            RegexToNFA.op.addNodeNFA(RegexToNFA.thompson.star(RegexToNFA.op.getActualNFA().pop()));
                        }else if(groupOperator.equals("Plus")){
                            RegexToNFA.op.addNodeNFA(RegexToNFA.thompson.star(RegexToNFA.op.getActualNFA().pop()));
                        }
                    }
                }
            }
        }

        return visitChildren(ctx);
    }

    @Override public Node visitRange(BNFGrammarParser.RangeContext ctx) {
        Character initRange = ctx.getChild(0).getText().charAt(0);
        Character limitRange = ctx.getChild(2).getText().charAt(0);
        for(Character letter : alphabet){
            System.out.println(letter);
            if(letter == initRange){
                this.fromRange = true;
            }

            if (letter == limitRange){
                RegexToNFA.regexVisitor.push(letter);
                RegexToNFA.op.addNodeNFA(new NodeNFA(letter));
                RegexToNFA.nfaFinal.addToTable(RegexToNFA.nfaFinal.getStates()+1, letter);
                break;
            }

            if(this.fromRange){
                RegexToNFA.regexVisitor.push(letter);
                RegexToNFA.op.addNodeNFA(new NodeNFA(letter));
                RegexToNFA.nfaFinal.addToTable(RegexToNFA.nfaFinal.getStates()+1, letter);
                RegexToNFA.op.addOperator("Union");
            }

        }

        return visitChildren(ctx);
    }









}