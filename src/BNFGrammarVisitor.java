// Generated from /Users/manuelortiz/Mac Documents/Tec/8vo ZoomSemestre/Diseño de Compiladores/2do Parcial/Examen Medio Termino/ExamenMedioTermino/src/BNFGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BNFGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BNFGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#re}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe(BNFGrammarParser.ReContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(BNFGrammarParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#simpleRE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleRE(BNFGrammarParser.SimpleREContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(BNFGrammarParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#basicRE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicRE(BNFGrammarParser.BasicREContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(BNFGrammarParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(BNFGrammarParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(BNFGrammarParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#elementaryRE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementaryRE(BNFGrammarParser.ElementaryREContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(BNFGrammarParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(BNFGrammarParser.AnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(BNFGrammarParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#chara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChara(BNFGrammarParser.CharaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(BNFGrammarParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#positiveset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositiveset(BNFGrammarParser.PositivesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#setitems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetitems(BNFGrammarParser.SetitemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#setitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetitem(BNFGrammarParser.SetitemContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(BNFGrammarParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#metacharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetacharacter(BNFGrammarParser.MetacharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNFGrammarParser#chars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChars(BNFGrammarParser.CharsContext ctx);
}