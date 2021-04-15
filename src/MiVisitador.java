import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.concurrent.TimeUnit;

import java.util.ArrayList;
import java.util.Stack;

public class MiVisitador extends BNFGrammarBaseVisitor<Node>{

    private ArrayList<String> leftUnion = new ArrayList<>();
    private Stack<String> splitedLeftSide = new Stack<>();
    private boolean leftUnionResolved = false;

    private void checkWhenUnion(){
        if(!this.splitedLeftSide.isEmpty() && this.leftUnionResolved){
            this.splitedLeftSide.pop();
        }
        if(this.splitedLeftSide.isEmpty() && this.leftUnionResolved){
            RegexToNFA.op.addOperator("Union");
            this.leftUnionResolved = false;
        }
    }

    @Override public Node visitStar(BNFGrammarParser.StarContext ctx) {
        RegexToNFA.regexVisitor.push(ctx.getChild(0).getText().charAt(0));
        RegexToNFA.regexVisitor.push(ctx.getChild(1).getText().charAt(0));
        char c = ctx.getChild(0).getText().charAt(0);
        System.out.println("Se va a agregar el " + c);
        RegexToNFA.op.addNodeNFA(new NodeNFA(c));
        RegexToNFA.nfaFinal.addToTable(RegexToNFA.nfaFinal.getStates()+1, c);
        RegexToNFA.flagToStopVisiting = true;
        RegexToNFA.op.addNodeNFA(RegexToNFA.thompson.star(RegexToNFA.op.getActualNFA().pop()));
        checkWhenUnion();

        return visit(ctx.elementaryRE());
    }

    @Override public Node visitPlus(BNFGrammarParser.PlusContext ctx) {
        RegexToNFA.regexVisitor.push(ctx.getChild(0).getText().charAt(0));
        RegexToNFA.regexVisitor.push(ctx.getChild(1).getText().charAt(0));
        char c = ctx.getChild(0).getText().charAt(0);
        System.out.println("Se va a agregar el " + c);
        RegexToNFA.op.addNodeNFA(new NodeNFA(c));
        RegexToNFA.nfaFinal.addToTable(RegexToNFA.nfaFinal.getStates()+1, c);
        RegexToNFA.flagToStopVisiting = true;
        RegexToNFA.op.addNodeNFA(RegexToNFA.thompson.plus(RegexToNFA.op.getActualNFA().pop(), c));

        checkWhenUnion();
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
        System.out.println("Group");
        System.out.println(ctx.getChild(0).getText());
        System.out.println(ctx.getChild(1).getText());
        System.out.println(ctx.getChild(2).getText());
        return visitChildren(ctx);
    }

    @Override public Node visitConcatenation(BNFGrammarParser.ConcatenationContext ctx) {
        RegexToNFA.op.addOperator("Concat");
        System.out.println("To Concat: " + ctx.getText());
        return visitChildren(ctx);
    }

    @Override public Node visitElementaryRE(BNFGrammarParser.ElementaryREContext ctx) {
        char c;
        if (RegexToNFA.flagToStopVisiting){
            RegexToNFA.flagToStopVisiting = false;
        }else{
            RegexToNFA.regexVisitor.push(ctx.getChild(0).getText().charAt(0));
            c = ctx.getChild(0).getText().charAt(0);
            System.out.println("Se va a agregar el " + c);
            RegexToNFA.op.addNodeNFA(new NodeNFA(c));
            RegexToNFA.nfaFinal.addToTable(RegexToNFA.nfaFinal.getStates()+1, c);
            checkWhenUnion();
        }

        return visitChildren(ctx);
    }

    @Override public Node visitRe(BNFGrammarParser.ReContext ctx) {
        System.out.println("Re0: " + ctx.getChild(0).getText());
        return visitChildren(ctx);
    }








}