public class MiVisitador extends BNFGrammarBaseVisitor<Node>{

    //public static NFA nfa = new NFA();
    //public static Map<String, Map<String, List<Integer> >> myBoard = new HashMap<String, Map<String, List<Integer> >>();



    @Override public Node visitStar(BNFGrammarParser.StarContext ctx) {
        System.out.println("star");
        System.out.println(ctx.getText());
        return visit(ctx.elementaryRE());
    }

    @Override public Node visitPlus(BNFGrammarParser.PlusContext ctx) {
        System.out.println("suma");
        System.out.println(ctx.getText());
        return visit(ctx.elementaryRE());
    }

    @Override public Node visitUnion(BNFGrammarParser.UnionContext ctx) {
        System.out.println("Union");
        System.out.println(ctx.getChild(0).getText());
        System.out.println(ctx.getChild(1).getText());
        System.out.println(ctx.getChild(2).getText());
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
        System.out.println("concat");
        System.out.println(ctx.getText());
        return visitChildren(ctx);
    }

    @Override public Node visitElementaryRE(BNFGrammarParser.ElementaryREContext ctx) {
        System.out.println("simpe re");
        String a = ctx.getChild(0).getText();

        return visitChildren(ctx);
    }





}