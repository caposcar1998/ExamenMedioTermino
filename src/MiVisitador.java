public class MiVisitador extends BNFGrammarBaseVisitor<Node>{
    @Override public Node visitRe(BNFGrammarParser.ReContext ctx) {
        return visit(ctx.simpleRE());
    }

    @Override public Node visitUnion(BNFGrammarParser.UnionContext ctx) {
        return visit(ctx.simpleRE());
    }

    @Override public Node visitSimpleRE(BNFGrammarParser.SimpleREContext ctx) {
        return visit(ctx.basicRE());
    }


    @Override public Node visitConcatenation(BNFGrammarParser.ConcatenationContext ctx) {
        return visit(ctx.basicRE());
    }

    @Override public Node visitBasicRE(BNFGrammarParser.BasicREContext ctx) {
        return visit(ctx.elementaryRE());
    }
}
