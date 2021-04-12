// Generated from /Users/manuelortiz/Mac Documents/Tec/8vo ZoomSemestre/Diseño de Compiladores/2do Parcial/Mid-Term/src/BNFGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BNFGrammarParser}.
 */
public interface BNFGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#re}.
	 * @param ctx the parse tree
	 */
	void enterRe(BNFGrammarParser.ReContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#re}.
	 * @param ctx the parse tree
	 */
	void exitRe(BNFGrammarParser.ReContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(BNFGrammarParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(BNFGrammarParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#simpleRE}.
	 * @param ctx the parse tree
	 */
	void enterSimpleRE(BNFGrammarParser.SimpleREContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#simpleRE}.
	 * @param ctx the parse tree
	 */
	void exitSimpleRE(BNFGrammarParser.SimpleREContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(BNFGrammarParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(BNFGrammarParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#basicRE}.
	 * @param ctx the parse tree
	 */
	void enterBasicRE(BNFGrammarParser.BasicREContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#basicRE}.
	 * @param ctx the parse tree
	 */
	void exitBasicRE(BNFGrammarParser.BasicREContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#star}.
	 * @param ctx the parse tree
	 */
	void enterStar(BNFGrammarParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#star}.
	 * @param ctx the parse tree
	 */
	void exitStar(BNFGrammarParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(BNFGrammarParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(BNFGrammarParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#elementaryRE}.
	 * @param ctx the parse tree
	 */
	void enterElementaryRE(BNFGrammarParser.ElementaryREContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#elementaryRE}.
	 * @param ctx the parse tree
	 */
	void exitElementaryRE(BNFGrammarParser.ElementaryREContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(BNFGrammarParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(BNFGrammarParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(BNFGrammarParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(BNFGrammarParser.AnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(BNFGrammarParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(BNFGrammarParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#chara}.
	 * @param ctx the parse tree
	 */
	void enterChara(BNFGrammarParser.CharaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#chara}.
	 * @param ctx the parse tree
	 */
	void exitChara(BNFGrammarParser.CharaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(BNFGrammarParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(BNFGrammarParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#positiveset}.
	 * @param ctx the parse tree
	 */
	void enterPositiveset(BNFGrammarParser.PositivesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#positiveset}.
	 * @param ctx the parse tree
	 */
	void exitPositiveset(BNFGrammarParser.PositivesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#setitems}.
	 * @param ctx the parse tree
	 */
	void enterSetitems(BNFGrammarParser.SetitemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#setitems}.
	 * @param ctx the parse tree
	 */
	void exitSetitems(BNFGrammarParser.SetitemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#setitem}.
	 * @param ctx the parse tree
	 */
	void enterSetitem(BNFGrammarParser.SetitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#setitem}.
	 * @param ctx the parse tree
	 */
	void exitSetitem(BNFGrammarParser.SetitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(BNFGrammarParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(BNFGrammarParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#metacharacter}.
	 * @param ctx the parse tree
	 */
	void enterMetacharacter(BNFGrammarParser.MetacharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#metacharacter}.
	 * @param ctx the parse tree
	 */
	void exitMetacharacter(BNFGrammarParser.MetacharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BNFGrammarParser#chars}.
	 * @param ctx the parse tree
	 */
	void enterChars(BNFGrammarParser.CharsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BNFGrammarParser#chars}.
	 * @param ctx the parse tree
	 */
	void exitChars(BNFGrammarParser.CharsContext ctx);
}