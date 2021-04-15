import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.Stack;

public class MiVisitador extends BNFGrammarBaseVisitor<Node>{

    ArrayList<String> afterUnion = new ArrayList<>();

    @Override public Node visitStar(BNFGrammarParser.StarContext ctx) {
        RegexToNFA.regexVisitor.push(ctx.getChild(0).getText().charAt(0));
        RegexToNFA.regexVisitor.push(ctx.getChild(1).getText().charAt(0));
        char c = ctx.getChild(0).getText().charAt(0);
        RegexToNFA.op.addNodeNFA(new NodeNFA(c));
        RegexToNFA.nfaFinal.addToTable(RegexToNFA.nfaFinal.getStates()+1, c);
        RegexToNFA.flagToStopVisiting = true;
        RegexToNFA.op.addNodeNFA(RegexToNFA.thompson.star(RegexToNFA.op.getActualNFA().pop()));
        return visit(ctx.elementaryRE());
    }

    @Override public Node visitPlus(BNFGrammarParser.PlusContext ctx) {
        System.out.println("+");
        System.out.println(ctx.getText());
        return visit(ctx.elementaryRE());
    }

    @Override public Node visitUnion(BNFGrammarParser.UnionContext ctx) {
        RegexToNFA.op.addOperator("Union");
        for (int i = 2; i < ctx.getChildCount(); i++){
            afterUnion.add(ctx.getChild(i).getText());

        }
        System.out.println("After Union " + afterUnion);
        /*
        String afterUnionString = afterUnion.get(0);
        CharStream input = CharStreams.fromString(afterUnionString);
        BNFGrammarLexer lexer = new BNFGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BNFGrammarParser parser = new BNFGrammarParser(tokens);
        ParseTree tree = parser.re();
        System.out.println();
        System.out.println(tree.toStringTree(parser));
        MiVisitador eval = new MiVisitador();
        Node n = eval.visit(tree);
        */
        return visit(ctx.simpleRE());
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
        return visitChildren(ctx);
    }

    @Override public Node visitElementaryRE(BNFGrammarParser.ElementaryREContext ctx) {
        char c;
        if (RegexToNFA.flagToStopVisiting){
            RegexToNFA.flagToStopVisiting = false;
        }else{
            RegexToNFA.regexVisitor.push(ctx.getChild(0).getText().charAt(0));
            c = ctx.getChild(0).getText().charAt(0);
            RegexToNFA.op.addNodeNFA(new NodeNFA(c));
            RegexToNFA.nfaFinal.addToTable(RegexToNFA.nfaFinal.getStates()+1, c);
        }

        return visitChildren(ctx);
    }








}