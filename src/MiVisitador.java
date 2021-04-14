public class MiVisitador extends BNFGrammarBaseVisitor<Node>{
    //NFAfinal guardará todos los resultados finales, es decir, es el NFA ya resuelto
    public static NFA nfaFinal = new NFA();
    //De la clase operators, tendremos:
    // - operators: todas las operaciones a realizar que se irán colocando en una Pila
    public static StacksNFA op = new StacksNFA();
    //Por cada elemento que surge es importante tener en cuenta que puede surgir un nueva NFA al cual podemos concatenar
    public static NodeNFA initialNode;
    public static NodeNFA finalNode;

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
        op.addOperator("Concat");

        return visitChildren(ctx);
    }

    @Override public Node visitElementaryRE(BNFGrammarParser.ElementaryREContext ctx) {
        char character = ctx.getChild(0).getText().charAt(0);
        op.addNodeNFA(new NodeNFA(character));
        nfaFinal.addToTable(1, character);
        return visitChildren(ctx);
    }








}