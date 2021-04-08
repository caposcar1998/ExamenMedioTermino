// Generated from C:/Users/oscar/Desktop/Compiladores/ExamenMedioTermino/src/Gramatica\Gramatica.g4 by ANTLR 4.9.1
package Gramatica;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#re}.
	 * @param ctx the parse tree
	 */
	void enterRe(GramaticaParser.ReContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#re}.
	 * @param ctx the parse tree
	 */
	void exitRe(GramaticaParser.ReContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(GramaticaParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(GramaticaParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#simpleRE}.
	 * @param ctx the parse tree
	 */
	void enterSimpleRE(GramaticaParser.SimpleREContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#simpleRE}.
	 * @param ctx the parse tree
	 */
	void exitSimpleRE(GramaticaParser.SimpleREContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(GramaticaParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(GramaticaParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#basicRE}.
	 * @param ctx the parse tree
	 */
	void enterBasicRE(GramaticaParser.BasicREContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#basicRE}.
	 * @param ctx the parse tree
	 */
	void exitBasicRE(GramaticaParser.BasicREContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#star}.
	 * @param ctx the parse tree
	 */
	void enterStar(GramaticaParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#star}.
	 * @param ctx the parse tree
	 */
	void exitStar(GramaticaParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(GramaticaParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(GramaticaParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#elementaryRE}.
	 * @param ctx the parse tree
	 */
	void enterElementaryRE(GramaticaParser.ElementaryREContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#elementaryRE}.
	 * @param ctx the parse tree
	 */
	void exitElementaryRE(GramaticaParser.ElementaryREContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(GramaticaParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(GramaticaParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(GramaticaParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(GramaticaParser.AnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(GramaticaParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(GramaticaParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#chara}.
	 * @param ctx the parse tree
	 */
	void enterChara(GramaticaParser.CharaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#chara}.
	 * @param ctx the parse tree
	 */
	void exitChara(GramaticaParser.CharaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(GramaticaParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(GramaticaParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#positiveset}.
	 * @param ctx the parse tree
	 */
	void enterPositiveset(GramaticaParser.PositivesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#positiveset}.
	 * @param ctx the parse tree
	 */
	void exitPositiveset(GramaticaParser.PositivesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#setitems}.
	 * @param ctx the parse tree
	 */
	void enterSetitems(GramaticaParser.SetitemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#setitems}.
	 * @param ctx the parse tree
	 */
	void exitSetitems(GramaticaParser.SetitemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#setitem}.
	 * @param ctx the parse tree
	 */
	void enterSetitem(GramaticaParser.SetitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#setitem}.
	 * @param ctx the parse tree
	 */
	void exitSetitem(GramaticaParser.SetitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(GramaticaParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(GramaticaParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#metacharacter}.
	 * @param ctx the parse tree
	 */
	void enterMetacharacter(GramaticaParser.MetacharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#metacharacter}.
	 * @param ctx the parse tree
	 */
	void exitMetacharacter(GramaticaParser.MetacharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#chars}.
	 * @param ctx the parse tree
	 */
	void enterChars(GramaticaParser.CharsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#chars}.
	 * @param ctx the parse tree
	 */
	void exitChars(GramaticaParser.CharsContext ctx);
}