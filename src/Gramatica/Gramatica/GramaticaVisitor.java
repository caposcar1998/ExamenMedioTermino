// Generated from C:/Users/oscar/Desktop/Compiladores/ExamenMedioTermino/src/Gramatica\Gramatica.g4 by ANTLR 4.9.1
package Gramatica;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#re}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe(GramaticaParser.ReContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(GramaticaParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#simpleRE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleRE(GramaticaParser.SimpleREContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(GramaticaParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#basicRE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicRE(GramaticaParser.BasicREContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(GramaticaParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(GramaticaParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#elementaryRE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementaryRE(GramaticaParser.ElementaryREContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(GramaticaParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(GramaticaParser.AnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(GramaticaParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#chara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChara(GramaticaParser.CharaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(GramaticaParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#positiveset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositiveset(GramaticaParser.PositivesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#setitems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetitems(GramaticaParser.SetitemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#setitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetitem(GramaticaParser.SetitemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(GramaticaParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#metacharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetacharacter(GramaticaParser.MetacharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#chars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChars(GramaticaParser.CharsContext ctx);
}