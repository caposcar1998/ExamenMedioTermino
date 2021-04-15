// Generated from /Users/manuelortiz/Mac Documents/Tec/8vo ZoomSemestre/Diseño de Compiladores/2do Parcial/Examen Medio Termino/ExamenMedioTermino/src/BNFGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BNFGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		LETTER=18, DIGIT=19, WS=20;
	public static final int
		RULE_re = 0, RULE_union = 1, RULE_simpleRE = 2, RULE_concatenation = 3, 
		RULE_basicRE = 4, RULE_star = 5, RULE_plus = 6, RULE_lambda = 7, RULE_elementaryRE = 8, 
		RULE_group = 9, RULE_any = 10, RULE_eos = 11, RULE_chara = 12, RULE_set = 13, 
		RULE_positiveset = 14, RULE_setitems = 15, RULE_setitem = 16, RULE_range = 17, 
		RULE_metacharacter = 18, RULE_chars = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"re", "union", "simpleRE", "concatenation", "basicRE", "star", "plus", 
			"lambda", "elementaryRE", "group", "any", "eos", "chara", "set", "positiveset", 
			"setitems", "setitem", "range", "metacharacter", "chars"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'*'", "'+'", "'\u00F1'", "'('", "')'", "'.'", "'$'", "'/'", 
			"'['", "']'", "'-'", "'#'", "'\"'", "'&'", "'!'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "LETTER", "DIGIT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BNFGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BNFGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ReContext extends ParserRuleContext {
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public SimpleREContext simpleRE() {
			return getRuleContext(SimpleREContext.class,0);
		}
		public ReContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_re; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterRe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitRe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitRe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReContext re() throws RecognitionException {
		ReContext _localctx = new ReContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_re);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				union();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				simpleRE();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionContext extends ParserRuleContext {
		public SimpleREContext simpleRE() {
			return getRuleContext(SimpleREContext.class,0);
		}
		public ReContext re() {
			return getRuleContext(ReContext.class,0);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			simpleRE();
			setState(45);
			match(T__0);
			setState(46);
			re();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleREContext extends ParserRuleContext {
		public BasicREContext basicRE() {
			return getRuleContext(BasicREContext.class,0);
		}
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public SimpleREContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleRE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterSimpleRE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitSimpleRE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitSimpleRE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleREContext simpleRE() throws RecognitionException {
		SimpleREContext _localctx = new SimpleREContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleRE);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				basicRE();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				concatenation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcatenationContext extends ParserRuleContext {
		public BasicREContext basicRE() {
			return getRuleContext(BasicREContext.class,0);
		}
		public SimpleREContext simpleRE() {
			return getRuleContext(SimpleREContext.class,0);
		}
		public ConcatenationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatenationContext concatenation() throws RecognitionException {
		ConcatenationContext _localctx = new ConcatenationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_concatenation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			basicRE();
			setState(53);
			simpleRE();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicREContext extends ParserRuleContext {
		public StarContext star() {
			return getRuleContext(StarContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public ElementaryREContext elementaryRE() {
			return getRuleContext(ElementaryREContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public BasicREContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicRE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterBasicRE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitBasicRE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitBasicRE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicREContext basicRE() throws RecognitionException {
		BasicREContext _localctx = new BasicREContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_basicRE);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				star();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				plus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				elementaryRE();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				lambda();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StarContext extends ParserRuleContext {
		public ElementaryREContext elementaryRE() {
			return getRuleContext(ElementaryREContext.class,0);
		}
		public StarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarContext star() throws RecognitionException {
		StarContext _localctx = new StarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_star);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			elementaryRE();
			setState(62);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusContext extends ParserRuleContext {
		public ElementaryREContext elementaryRE() {
			return getRuleContext(ElementaryREContext.class,0);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			elementaryRE();
			setState(65);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaContext extends ParserRuleContext {
		public ElementaryREContext elementaryRE() {
			return getRuleContext(ElementaryREContext.class,0);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			elementaryRE();
			setState(68);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementaryREContext extends ParserRuleContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public CharaContext chara() {
			return getRuleContext(CharaContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public ElementaryREContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryRE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterElementaryRE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitElementaryRE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitElementaryRE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementaryREContext elementaryRE() throws RecognitionException {
		ElementaryREContext _localctx = new ElementaryREContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elementaryRE);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				group();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				any();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				eos();
				}
				break;
			case T__8:
			case LETTER:
			case DIGIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				chara();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				set();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupContext extends ParserRuleContext {
		public ReContext re() {
			return getRuleContext(ReContext.class,0);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__4);
			setState(78);
			re();
			setState(79);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyContext extends ParserRuleContext {
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_any);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EosContext extends ParserRuleContext {
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharaContext extends ParserRuleContext {
		public CharsContext chars() {
			return getRuleContext(CharsContext.class,0);
		}
		public MetacharacterContext metacharacter() {
			return getRuleContext(MetacharacterContext.class,0);
		}
		public CharaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterChara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitChara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitChara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharaContext chara() throws RecognitionException {
		CharaContext _localctx = new CharaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_chara);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				chars();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__8);
				setState(87);
				metacharacter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public PositivesetContext positiveset() {
			return getRuleContext(PositivesetContext.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			positiveset();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositivesetContext extends ParserRuleContext {
		public SetitemsContext setitems() {
			return getRuleContext(SetitemsContext.class,0);
		}
		public PositivesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positiveset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterPositiveset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitPositiveset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitPositiveset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositivesetContext positiveset() throws RecognitionException {
		PositivesetContext _localctx = new PositivesetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_positiveset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__9);
			setState(93);
			setitems();
			setState(94);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetitemsContext extends ParserRuleContext {
		public SetitemContext setitem() {
			return getRuleContext(SetitemContext.class,0);
		}
		public SetitemsContext setitems() {
			return getRuleContext(SetitemsContext.class,0);
		}
		public SetitemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setitems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterSetitems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitSetitems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitSetitems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetitemsContext setitems() throws RecognitionException {
		SetitemsContext _localctx = new SetitemsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_setitems);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				setitem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				setitem();
				setState(98);
				setitems();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetitemContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public CharaContext chara() {
			return getRuleContext(CharaContext.class,0);
		}
		public SetitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterSetitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitSetitem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitSetitem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetitemContext setitem() throws RecognitionException {
		SetitemContext _localctx = new SetitemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_setitem);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				chara();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public List<CharaContext> chara() {
			return getRuleContexts(CharaContext.class);
		}
		public CharaContext chara(int i) {
			return getRuleContext(CharaContext.class,i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			chara();
			setState(107);
			match(T__11);
			setState(108);
			chara();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetacharacterContext extends ParserRuleContext {
		public MetacharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metacharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterMetacharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitMetacharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitMetacharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetacharacterContext metacharacter() throws RecognitionException {
		MetacharacterContext _localctx = new MetacharacterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_metacharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharsContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(BNFGrammarParser.LETTER, 0); }
		public TerminalNode DIGIT() { return getToken(BNFGrammarParser.DIGIT, 0); }
		public CharsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).enterChars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNFGrammarListener ) ((BNFGrammarListener)listener).exitChars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNFGrammarVisitor ) return ((BNFGrammarVisitor<? extends T>)visitor).visitChars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharsContext chars() throws RecognitionException {
		CharsContext _localctx = new CharsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_chars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==LETTER || _la==DIGIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\4\24\t\24\4\25\t\25\3\2\3\2\5\2-\n\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4"+
		"\65\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6>\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nN\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\16\5\16[\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\5\21g\n\21\3\22\3\22\5\22k\n\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(\2\4\3\2\17\23\3\2\24\25\2l\2,\3\2\2\2\4.\3\2\2\2\6\64\3\2\2\2\b\66"+
		"\3\2\2\2\n=\3\2\2\2\f?\3\2\2\2\16B\3\2\2\2\20E\3\2\2\2\22M\3\2\2\2\24"+
		"O\3\2\2\2\26S\3\2\2\2\30U\3\2\2\2\32Z\3\2\2\2\34\\\3\2\2\2\36^\3\2\2\2"+
		" f\3\2\2\2\"j\3\2\2\2$l\3\2\2\2&p\3\2\2\2(r\3\2\2\2*-\5\4\3\2+-\5\6\4"+
		"\2,*\3\2\2\2,+\3\2\2\2-\3\3\2\2\2./\5\6\4\2/\60\7\3\2\2\60\61\5\2\2\2"+
		"\61\5\3\2\2\2\62\65\5\n\6\2\63\65\5\b\5\2\64\62\3\2\2\2\64\63\3\2\2\2"+
		"\65\7\3\2\2\2\66\67\5\n\6\2\678\5\6\4\28\t\3\2\2\29>\5\f\7\2:>\5\16\b"+
		"\2;>\5\22\n\2<>\5\20\t\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\13\3"+
		"\2\2\2?@\5\22\n\2@A\7\4\2\2A\r\3\2\2\2BC\5\22\n\2CD\7\5\2\2D\17\3\2\2"+
		"\2EF\5\22\n\2FG\7\6\2\2G\21\3\2\2\2HN\5\24\13\2IN\5\26\f\2JN\5\30\r\2"+
		"KN\5\32\16\2LN\5\34\17\2MH\3\2\2\2MI\3\2\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2"+
		"\2\2N\23\3\2\2\2OP\7\7\2\2PQ\5\2\2\2QR\7\b\2\2R\25\3\2\2\2ST\7\t\2\2T"+
		"\27\3\2\2\2UV\7\n\2\2V\31\3\2\2\2W[\5(\25\2XY\7\13\2\2Y[\5&\24\2ZW\3\2"+
		"\2\2ZX\3\2\2\2[\33\3\2\2\2\\]\5\36\20\2]\35\3\2\2\2^_\7\f\2\2_`\5 \21"+
		"\2`a\7\r\2\2a\37\3\2\2\2bg\5\"\22\2cd\5\"\22\2de\5 \21\2eg\3\2\2\2fb\3"+
		"\2\2\2fc\3\2\2\2g!\3\2\2\2hk\5$\23\2ik\5\32\16\2jh\3\2\2\2ji\3\2\2\2k"+
		"#\3\2\2\2lm\5\32\16\2mn\7\16\2\2no\5\32\16\2o%\3\2\2\2pq\t\2\2\2q\'\3"+
		"\2\2\2rs\t\3\2\2s)\3\2\2\2\t,\64=MZfj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}