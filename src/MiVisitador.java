public class MiVisitador extends BNFGrammarBaseVisitor<Node>{
    /*
    @Override public Node visitRe(BNFGrammarParser.ReContext ctx) {
        System.out.println(ctx.getText()+"re");
        return visit(ctx.simpleRE());
    }

    @Override public Node visitUnion(BNFGrammarParser.UnionContext ctx) {
        System.out.println(ctx.getText());
        return visit(ctx.simpleRE());
    }

    @Override public Node visitSimpleRE(BNFGrammarParser.SimpleREContext ctx) {
        System.out.println(ctx.getText()+"simpe");
        return visit(ctx.basicRE());
    }




    @Override public Node visitBasicRE(BNFGrammarParser.BasicREContext ctx) {
        System.out.println(ctx.getText()+"basire");
        return visit(ctx.elementaryRE());
    }

*/

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
        System.out.println(ctx.getText());
        return visit(ctx.simpleRE());
    }

    @Override public Node visitSimpleRE(BNFGrammarParser.SimpleREContext ctx) {
        System.out.println("simpe");
        System.out.println(ctx.getText());
        return visit(ctx.basicRE());
    }


/*
    @Override public Node visitPlus(BNFGrammarParser.PlusContext ctx) {
        System.out.println(ctx.getText()+"plus");
        return visitChildren(ctx);
    }
    */

}
