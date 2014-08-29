// Generated from Pajama.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PajamaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__31=1, T__30=2, T__29=3, T__28=4, T__27=5, T__26=6, T__25=7, T__24=8, 
		T__23=9, T__22=10, T__21=11, T__20=12, T__19=13, T__18=14, T__17=15, T__16=16, 
		T__15=17, T__14=18, T__13=19, T__12=20, T__11=21, T__10=22, T__9=23, T__8=24, 
		T__7=25, T__6=26, T__5=27, T__4=28, T__3=29, T__2=30, T__1=31, T__0=32, 
		NUMBER=33, STRING=34, ID=35, WS=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'true'", "'!='", "'||'", "';'", "'{'", "'&&'", "'}'", 
		"'rule'", "'<='", "'when'", "'null'", "'('", "'*'", "','", "'false'", 
		"'.'", "'->'", "'case'", "':'", "'>='", "'['", "'=='", "'<'", "'|'", "']'", 
		"'>'", "'@'", "'!'", "')'", "'+'", "'-'", "NUMBER", "STRING", "ID", "WS"
	};
	public static final int
		RULE_rules = 0, RULE_ruleStatement = 1, RULE_formal = 2, RULE_ruleBody = 3, 
		RULE_caseRule = 4, RULE_pattern = 5, RULE_pattInit = 6, RULE_pattRest = 7, 
		RULE_pattArray = 8, RULE_pattObject = 9, RULE_pattList = 10, RULE_pattPair = 11, 
		RULE_params = 12, RULE_object = 13, RULE_pairs = 14, RULE_pair = 15, RULE_key = 16, 
		RULE_expr = 17, RULE_relMonom = 18, RULE_relOperation = 19, RULE_relOperator = 20, 
		RULE_arithOperation = 21, RULE_arithMonom = 22, RULE_arithSingle = 23, 
		RULE_constant = 24, RULE_args = 25;
	public static final String[] ruleNames = {
		"rules", "ruleStatement", "formal", "ruleBody", "caseRule", "pattern", 
		"pattInit", "pattRest", "pattArray", "pattObject", "pattList", "pattPair", 
		"params", "object", "pairs", "pair", "key", "expr", "relMonom", "relOperation", 
		"relOperator", "arithOperation", "arithMonom", "arithSingle", "constant", 
		"args"
	};

	@Override
	public String getGrammarFileName() { return "Pajama.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PajamaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RulesContext extends ParserRuleContext {
		public List<RuleStatementContext> ruleStatement() {
			return getRuleContexts(RuleStatementContext.class);
		}
		public RuleStatementContext ruleStatement(int i) {
			return getRuleContext(RuleStatementContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52); ruleStatement();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__23 );
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

	public static class RuleStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public RuleBodyContext ruleBody() {
			return getRuleContext(RuleBodyContext.class,0);
		}
		public FormalContext formal() {
			return getRuleContext(FormalContext.class,0);
		}
		public RuleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitRuleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleStatementContext ruleStatement() throws RecognitionException {
		RuleStatementContext _localctx = new RuleStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ruleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(T__23);
			setState(58); match(ID);
			setState(59); formal();
			setState(60); match(T__26);
			setState(61); ruleBody();
			setState(62); match(T__24);
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

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(T__19);
			setState(65); match(ID);
			setState(66); match(T__2);
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

	public static class RuleBodyContext extends ParserRuleContext {
		public List<CaseRuleContext> caseRule() {
			return getRuleContexts(CaseRuleContext.class);
		}
		public CaseRuleContext caseRule(int i) {
			return getRuleContext(CaseRuleContext.class,i);
		}
		public RuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitRuleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleBodyContext ruleBody() throws RecognitionException {
		RuleBodyContext _localctx = new RuleBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ruleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); caseRule();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(69); match(T__7);
				setState(70); caseRule();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CaseRuleContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseRule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitCaseRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseRuleContext caseRule() throws RecognitionException {
		CaseRuleContext _localctx = new CaseRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_caseRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(T__13);
			setState(77); pattern();
			setState(78); match(T__14);
			setState(79); expr();
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

	public static class PatternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PattRestContext pattRest() {
			return getRuleContext(PattRestContext.class,0);
		}
		public PattInitContext pattInit() {
			return getRuleContext(PattInitContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pattern);
		int _la;
		try {
			setState(89);
			switch (_input.LA(1)) {
			case T__30:
			case T__26:
			case T__20:
			case T__16:
			case T__10:
			case NUMBER:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); pattInit();
				setState(83);
				_la = _input.LA(1);
				if (_la==T__21 || _la==T__4) {
					{
					setState(82); pattRest();
					}
				}

				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); match(T__19);
				setState(86); pattern();
				setState(87); match(T__2);
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

	public static class PattInitContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PattObjectContext pattObject() {
			return getRuleContext(PattObjectContext.class,0);
		}
		public PattArrayContext pattArray() {
			return getRuleContext(PattArrayContext.class,0);
		}
		public PattInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattInitContext pattInit() throws RecognitionException {
		PattInitContext _localctx = new PattInitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pattInit);
		try {
			setState(95);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); match(ID);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(92); pattArray();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(93); pattObject();
				}
				break;
			case T__30:
			case T__20:
			case T__16:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(94); constant();
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

	public static class PattRestContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PattRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattRestContext pattRest() throws RecognitionException {
		PattRestContext _localctx = new PattRestContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pattRest);
		try {
			setState(101);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(97); match(T__4);
				setState(98); match(ID);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); match(T__21);
				setState(100); expr();
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

	public static class PattArrayContext extends ParserRuleContext {
		public PattListContext pattList() {
			return getRuleContext(PattListContext.class,0);
		}
		public PattArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattArrayContext pattArray() throws RecognitionException {
		PattArrayContext _localctx = new PattArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pattArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(T__10);
			setState(105);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__26) | (1L << T__20) | (1L << T__19) | (1L << T__16) | (1L << T__10) | (1L << NUMBER) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(104); pattList();
				}
			}

			setState(107); match(T__6);
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

	public static class PattObjectContext extends ParserRuleContext {
		public List<PattPairContext> pattPair() {
			return getRuleContexts(PattPairContext.class);
		}
		public PattPairContext pattPair(int i) {
			return getRuleContext(PattPairContext.class,i);
		}
		public PattObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattObject; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattObjectContext pattObject() throws RecognitionException {
		PattObjectContext _localctx = new PattObjectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pattObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(T__26);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING || _la==ID) {
				{
				{
				setState(110); pattPair();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116); match(T__24);
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

	public static class PattListContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public PattListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattListContext pattList() throws RecognitionException {
		PattListContext _localctx = new PattListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pattList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); pattern();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(119); match(T__17);
				setState(120); pattern();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PattPairContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public PattPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattPair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattPairContext pattPair() throws RecognitionException {
		PattPairContext _localctx = new PattPairContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pattPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); key();
			setState(127); match(T__12);
			setState(128); pattern();
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

	public static class ParamsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(T__10);
			setState(131); args();
			setState(132); match(T__6);
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

	public static class ObjectContext extends ParserRuleContext {
		public PairsContext pairs() {
			return getRuleContext(PairsContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(T__26);
			setState(136);
			_la = _input.LA(1);
			if (_la==STRING || _la==ID) {
				{
				setState(135); pairs();
				}
			}

			setState(138); match(T__24);
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

	public static class PairsContext extends ParserRuleContext {
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairsContext pairs() throws RecognitionException {
		PairsContext _localctx = new PairsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); pair();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(141); match(T__27);
				setState(142); pair();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PairContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); key();
			setState(149); match(T__12);
			setState(150); expr();
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PajamaParser.STRING, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExprContext extends ParserRuleContext {
		public RelMonomContext relMonom(int i) {
			return getRuleContext(RelMonomContext.class,i);
		}
		public List<RelMonomContext> relMonom() {
			return getRuleContexts(RelMonomContext.class);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); relMonom();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(155); match(T__28);
				setState(156); relMonom();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RelMonomContext extends ParserRuleContext {
		public RelOperationContext relOperation(int i) {
			return getRuleContext(RelOperationContext.class,i);
		}
		public List<RelOperationContext> relOperation() {
			return getRuleContexts(RelOperationContext.class);
		}
		public RelMonomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relMonom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitRelMonom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelMonomContext relMonom() throws RecognitionException {
		RelMonomContext _localctx = new RelMonomContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relMonom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); relOperation();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(163); match(T__25);
				setState(164); relOperation();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RelOperationContext extends ParserRuleContext {
		public ArithOperationContext arithOperation(int i) {
			return getRuleContext(ArithOperationContext.class,i);
		}
		public RelOperatorContext relOperator(int i) {
			return getRuleContext(RelOperatorContext.class,i);
		}
		public List<ArithOperationContext> arithOperation() {
			return getRuleContexts(ArithOperationContext.class);
		}
		public List<RelOperatorContext> relOperator() {
			return getRuleContexts(RelOperatorContext.class);
		}
		public RelOperationContext relOperation() {
			return getRuleContext(RelOperationContext.class,0);
		}
		public RelOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitRelOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOperationContext relOperation() throws RecognitionException {
		RelOperationContext _localctx = new RelOperationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relOperation);
		int _la;
		try {
			setState(181);
			switch (_input.LA(1)) {
			case T__30:
			case T__26:
			case T__20:
			case T__19:
			case T__16:
			case T__0:
			case NUMBER:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); arithOperation();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__22) | (1L << T__11) | (1L << T__9) | (1L << T__8) | (1L << T__5))) != 0)) {
					{
					{
					setState(171); relOperator();
					setState(172); arithOperation();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(179); match(T__3);
				setState(180); relOperation();
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

	public static class RelOperatorContext extends ParserRuleContext {
		public RelOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitRelOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOperatorContext relOperator() throws RecognitionException {
		RelOperatorContext _localctx = new RelOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__22) | (1L << T__11) | (1L << T__9) | (1L << T__8) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ArithOperationContext extends ParserRuleContext {
		public List<ArithMonomContext> arithMonom() {
			return getRuleContexts(ArithMonomContext.class);
		}
		public ArithMonomContext arithMonom(int i) {
			return getRuleContext(ArithMonomContext.class,i);
		}
		public ArithOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitArithOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithOperationContext arithOperation() throws RecognitionException {
		ArithOperationContext _localctx = new ArithOperationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arithOperation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185); arithMonom();
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==T__0) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(187); arithMonom();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ArithMonomContext extends ParserRuleContext {
		public List<ArithSingleContext> arithSingle() {
			return getRuleContexts(ArithSingleContext.class);
		}
		public ArithSingleContext arithSingle(int i) {
			return getRuleContext(ArithSingleContext.class,i);
		}
		public ArithMonomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithMonom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitArithMonom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithMonomContext arithMonom() throws RecognitionException {
		ArithMonomContext _localctx = new ArithMonomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arithMonom);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193); arithSingle(0);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					_la = _input.LA(1);
					if ( !(_la==T__31 || _la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(195); arithSingle(0);
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class ArithSingleContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PajamaParser.ID); }
		public ArithSingleContext arithSingle() {
			return getRuleContext(ArithSingleContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ArithOperationContext arithOperation() {
			return getRuleContext(ArithOperationContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(PajamaParser.ID, i);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArithSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithSingle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitArithSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithSingleContext arithSingle() throws RecognitionException {
		return arithSingle(0);
	}

	private ArithSingleContext arithSingle(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithSingleContext _localctx = new ArithSingleContext(_ctx, _parentState);
		ArithSingleContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_arithSingle, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(202); match(T__0);
				setState(203); arithOperation();
				}
				break;
			case T__19:
				{
				setState(204); match(T__19);
				setState(205); expr();
				setState(206); match(T__2);
				}
				break;
			case ID:
				{
				setState(208); match(ID);
				}
				break;
			case T__26:
				{
				setState(209); object();
				}
				break;
			case T__30:
			case T__20:
			case T__16:
			case NUMBER:
			case STRING:
				{
				setState(210); constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(226);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ArithSingleContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithSingle);
						setState(213);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(214); match(T__19);
						setState(216);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__26) | (1L << T__20) | (1L << T__19) | (1L << T__16) | (1L << T__3) | (1L << T__0) | (1L << NUMBER) | (1L << STRING) | (1L << ID))) != 0)) {
							{
							setState(215); args();
							}
						}

						setState(218); match(T__2);
						}
						break;
					case 2:
						{
						_localctx = new ArithSingleContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithSingle);
						setState(219);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(222); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(220); match(T__15);
								setState(221); match(ID);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(224); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PajamaParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(PajamaParser.NUMBER, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__20) | (1L << T__16) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); expr();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(234); match(T__17);
				setState(235); expr();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23: return arithSingle_sempred((ArithSingleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithSingle_sempred(ArithSingleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		case 1: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\6\28\n\2\r\2\16\29\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\5\7V\n\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\b\3\b\5\bb\n"+
		"\b\3\t\3\t\3\t\3\t\5\th\n\t\3\n\3\n\5\nl\n\n\3\n\3\n\3\13\3\13\7\13r\n"+
		"\13\f\13\16\13u\13\13\3\13\3\13\3\f\3\f\3\f\7\f|\n\f\f\f\16\f\177\13\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u008b\n\17\3\17\3"+
		"\17\3\20\3\20\3\20\7\20\u0092\n\20\f\20\16\20\u0095\13\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\7\23\u00a0\n\23\f\23\16\23\u00a3\13"+
		"\23\3\24\3\24\3\24\7\24\u00a8\n\24\f\24\16\24\u00ab\13\24\3\25\3\25\3"+
		"\25\3\25\7\25\u00b1\n\25\f\25\16\25\u00b4\13\25\3\25\3\25\5\25\u00b8\n"+
		"\25\3\26\3\26\3\27\3\27\3\27\7\27\u00bf\n\27\f\27\16\27\u00c2\13\27\3"+
		"\30\3\30\3\30\7\30\u00c7\n\30\f\30\16\30\u00ca\13\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00d6\n\31\3\31\3\31\3\31\5\31"+
		"\u00db\n\31\3\31\3\31\3\31\3\31\6\31\u00e1\n\31\r\31\16\31\u00e2\7\31"+
		"\u00e5\n\31\f\31\16\31\u00e8\13\31\3\32\3\32\3\33\3\33\3\33\7\33\u00ef"+
		"\n\33\f\33\16\33\u00f2\13\33\3\33\2\3\60\34\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\2\7\3\2$%\7\2\5\5\f\f\27\27\31\32\35\35"+
		"\3\2!\"\4\2\3\3\20\20\6\2\4\4\16\16\22\22#$\u00f5\2\67\3\2\2\2\4;\3\2"+
		"\2\2\6B\3\2\2\2\bF\3\2\2\2\nN\3\2\2\2\f[\3\2\2\2\16a\3\2\2\2\20g\3\2\2"+
		"\2\22i\3\2\2\2\24o\3\2\2\2\26x\3\2\2\2\30\u0080\3\2\2\2\32\u0084\3\2\2"+
		"\2\34\u0088\3\2\2\2\36\u008e\3\2\2\2 \u0096\3\2\2\2\"\u009a\3\2\2\2$\u009c"+
		"\3\2\2\2&\u00a4\3\2\2\2(\u00b7\3\2\2\2*\u00b9\3\2\2\2,\u00bb\3\2\2\2."+
		"\u00c3\3\2\2\2\60\u00d5\3\2\2\2\62\u00e9\3\2\2\2\64\u00eb\3\2\2\2\668"+
		"\5\4\3\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;<\7"+
		"\13\2\2<=\7%\2\2=>\5\6\4\2>?\7\b\2\2?@\5\b\5\2@A\7\n\2\2A\5\3\2\2\2BC"+
		"\7\17\2\2CD\7%\2\2DE\7 \2\2E\7\3\2\2\2FK\5\n\6\2GH\7\33\2\2HJ\5\n\6\2"+
		"IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\t\3\2\2\2MK\3\2\2\2NO\7\25\2"+
		"\2OP\5\f\7\2PQ\7\24\2\2QR\5$\23\2R\13\3\2\2\2SU\5\16\b\2TV\5\20\t\2UT"+
		"\3\2\2\2UV\3\2\2\2V\\\3\2\2\2WX\7\17\2\2XY\5\f\7\2YZ\7 \2\2Z\\\3\2\2\2"+
		"[S\3\2\2\2[W\3\2\2\2\\\r\3\2\2\2]b\7%\2\2^b\5\22\n\2_b\5\24\13\2`b\5\62"+
		"\32\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\17\3\2\2\2cd\7\36\2\2d"+
		"h\7%\2\2ef\7\r\2\2fh\5$\23\2gc\3\2\2\2ge\3\2\2\2h\21\3\2\2\2ik\7\30\2"+
		"\2jl\5\26\f\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\34\2\2n\23\3\2\2\2os\7"+
		"\b\2\2pr\5\30\r\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us"+
		"\3\2\2\2vw\7\n\2\2w\25\3\2\2\2x}\5\f\7\2yz\7\21\2\2z|\5\f\7\2{y\3\2\2"+
		"\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\27\3\2\2\2\177}\3\2\2\2\u0080\u0081"+
		"\5\"\22\2\u0081\u0082\7\26\2\2\u0082\u0083\5\f\7\2\u0083\31\3\2\2\2\u0084"+
		"\u0085\7\30\2\2\u0085\u0086\5\64\33\2\u0086\u0087\7\34\2\2\u0087\33\3"+
		"\2\2\2\u0088\u008a\7\b\2\2\u0089\u008b\5\36\20\2\u008a\u0089\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\n\2\2\u008d\35\3\2\2"+
		"\2\u008e\u0093\5 \21\2\u008f\u0090\7\7\2\2\u0090\u0092\5 \21\2\u0091\u008f"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\37\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5\"\22\2\u0097\u0098\7\26"+
		"\2\2\u0098\u0099\5$\23\2\u0099!\3\2\2\2\u009a\u009b\t\2\2\2\u009b#\3\2"+
		"\2\2\u009c\u00a1\5&\24\2\u009d\u009e\7\6\2\2\u009e\u00a0\5&\24\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2%\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a9\5(\25\2\u00a5\u00a6"+
		"\7\t\2\2\u00a6\u00a8\5(\25\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\'\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ac\u00b2\5,\27\2\u00ad\u00ae\5*\26\2\u00ae\u00af\5,\27\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b8\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\37"+
		"\2\2\u00b6\u00b8\5(\25\2\u00b7\u00ac\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		")\3\2\2\2\u00b9\u00ba\t\3\2\2\u00ba+\3\2\2\2\u00bb\u00c0\5.\30\2\u00bc"+
		"\u00bd\t\4\2\2\u00bd\u00bf\5.\30\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1-\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c8\5\60\31\2\u00c4\u00c5\t\5\2\2\u00c5\u00c7\5\60\31"+
		"\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9/\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\b\31\1\2\u00cc"+
		"\u00cd\7\"\2\2\u00cd\u00d6\5,\27\2\u00ce\u00cf\7\17\2\2\u00cf\u00d0\5"+
		"$\23\2\u00d0\u00d1\7 \2\2\u00d1\u00d6\3\2\2\2\u00d2\u00d6\7%\2\2\u00d3"+
		"\u00d6\5\34\17\2\u00d4\u00d6\5\62\32\2\u00d5\u00cb\3\2\2\2\u00d5\u00ce"+
		"\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00e6\3\2\2\2\u00d7\u00d8\f\6\2\2\u00d8\u00da\7\17\2\2\u00d9\u00db\5"+
		"\64\33\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00e5\7 \2\2\u00dd\u00e0\f\5\2\2\u00de\u00df\7\23\2\2\u00df\u00e1\7%"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00d7\3\2\2\2\u00e4\u00dd\3\2"+
		"\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\61\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\t\6\2\2\u00ea\63\3\2\2\2\u00eb"+
		"\u00f0\5$\23\2\u00ec\u00ed\7\21\2\2\u00ed\u00ef\5$\23\2\u00ee\u00ec\3"+
		"\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\65\3\2\2\2\u00f2\u00f0\3\2\2\2\319KU[agks}\u008a\u0093\u00a1\u00a9\u00b2"+
		"\u00b7\u00c0\u00c8\u00d5\u00da\u00e2\u00e4\u00e6\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}