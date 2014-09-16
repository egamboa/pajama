// Generated from grammar/Pajama.g4 by ANTLR 4.4
package pajama.compile;
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
		NUMBER=33, STRING=34, ID=35, CS=36, WS=37;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'true'", "'!='", "'||'", "';'", "'{'", "'&&'", "'}'", 
		"'rule'", "'<='", "'when'", "'null'", "'('", "'*'", "','", "'.'", "'false'", 
		"'->'", "'case'", "':'", "'>='", "'['", "'=='", "'<'", "'|'", "']'", "'>'", 
		"'@'", "'!'", "')'", "'+'", "'-'", "NUMBER", "STRING", "ID", "CS", "WS"
	};
	public static final int
		RULE_rules = 0, RULE_ruleStatement = 1, RULE_formal = 2, RULE_ruleBody = 3, 
		RULE_caseRule = 4, RULE_pattern = 5, RULE_pattInit = 6, RULE_pattRest = 7, 
		RULE_pattArray = 8, RULE_pattObject = 9, RULE_pattList = 10, RULE_pattPair = 11, 
		RULE_pattConstant = 12, RULE_params = 13, RULE_object = 14, RULE_pairs = 15, 
		RULE_pair = 16, RULE_key = 17, RULE_expr = 18, RULE_relMonom = 19, RULE_relOperation = 20, 
		RULE_relOperator = 21, RULE_arithOperation = 22, RULE_arithMonom = 23, 
		RULE_arithSingle = 24, RULE_idSingle = 25, RULE_constant = 26, RULE_args = 27;
	public static final String[] ruleNames = {
		"rules", "ruleStatement", "formal", "ruleBody", "caseRule", "pattern", 
		"pattInit", "pattRest", "pattArray", "pattObject", "pattList", "pattPair", 
		"pattConstant", "params", "object", "pairs", "pair", "key", "expr", "relMonom", 
		"relOperation", "relOperator", "arithOperation", "arithMonom", "arithSingle", 
		"idSingle", "constant", "args"
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
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56); ruleStatement();
				}
				}
				setState(59); 
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
			setState(61); match(T__23);
			setState(62); match(ID);
			setState(63); formal();
			setState(64); match(T__26);
			setState(65); ruleBody();
			setState(66); match(T__24);
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
			setState(68); match(T__19);
			setState(69); match(ID);
			setState(70); match(T__2);
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
			setState(72); caseRule();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(73); match(T__7);
				setState(74); caseRule();
				}
				}
				setState(79);
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
			setState(80); match(T__13);
			setState(81); pattern();
			setState(82); match(T__14);
			setState(83); expr();
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
			setState(93);
			switch (_input.LA(1)) {
			case T__30:
			case T__26:
			case T__20:
			case T__15:
			case T__10:
			case NUMBER:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); pattInit();
				setState(87);
				_la = _input.LA(1);
				if (_la==T__21 || _la==T__4) {
					{
					setState(86); pattRest();
					}
				}

				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); match(T__19);
				setState(90); pattern();
				setState(91); match(T__2);
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
		public PattInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattInit; }
	 
		public PattInitContext() { }
		public void copyFrom(PattInitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PCteContext extends PattInitContext {
		public PattConstantContext pattConstant() {
			return getRuleContext(PattConstantContext.class,0);
		}
		public PCteContext(PattInitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPCte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PArrayContext extends PattInitContext {
		public PattArrayContext pattArray() {
			return getRuleContext(PattArrayContext.class,0);
		}
		public PArrayContext(PattInitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PObjectContext extends PattInitContext {
		public PattObjectContext pattObject() {
			return getRuleContext(PattObjectContext.class,0);
		}
		public PObjectContext(PattInitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PIdContext extends PattInitContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public PIdContext(PattInitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattInitContext pattInit() throws RecognitionException {
		PattInitContext _localctx = new PattInitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pattInit);
		try {
			setState(99);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new PIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95); match(ID);
				}
				break;
			case T__10:
				_localctx = new PArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96); pattArray();
				}
				break;
			case T__26:
				_localctx = new PObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(97); pattObject();
				}
				break;
			case T__30:
			case T__20:
			case T__15:
			case NUMBER:
			case STRING:
				_localctx = new PCteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(98); pattConstant();
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
			setState(105);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); match(T__4);
				setState(102); match(ID);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); match(T__21);
				setState(104); expr();
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
			setState(107); match(T__10);
			setState(109);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__26) | (1L << T__20) | (1L << T__19) | (1L << T__15) | (1L << T__10) | (1L << NUMBER) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(108); pattList();
				}
			}

			setState(111); match(T__6);
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
		public PattPairContext pattPair() {
			return getRuleContext(PattPairContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(T__26);
			setState(114); pattPair();
			setState(115); match(T__24);
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
			setState(117); pattern();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(118); match(T__17);
				setState(119); pattern();
				}
				}
				setState(124);
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
			setState(125); key();
			setState(126); match(T__12);
			setState(127); pattern();
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

	public static class PattConstantContext extends ParserRuleContext {
		public PattConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattConstant; }
	 
		public PattConstantContext() { }
		public void copyFrom(PattConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PatTrueContext extends PattConstantContext {
		public PatTrueContext(PattConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPatTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PatNumContext extends PattConstantContext {
		public TerminalNode NUMBER() { return getToken(PajamaParser.NUMBER, 0); }
		public PatNumContext(PattConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPatNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PatFalseContext extends PattConstantContext {
		public PatFalseContext(PattConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPatFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PatStringContext extends PattConstantContext {
		public TerminalNode STRING() { return getToken(PajamaParser.STRING, 0); }
		public PatStringContext(PattConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPatString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullPatContext extends PattConstantContext {
		public NullPatContext(PattConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitNullPat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattConstantContext pattConstant() throws RecognitionException {
		PattConstantContext _localctx = new PattConstantContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pattConstant);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new PatNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129); match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new PatStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130); match(STRING);
				}
				break;
			case T__30:
				_localctx = new PatTrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(131); match(T__30);
				}
				break;
			case T__15:
				_localctx = new PatFalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(132); match(T__15);
				}
				break;
			case T__20:
				_localctx = new NullPatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(133); match(T__20);
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
		enterRule(_localctx, 26, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(T__10);
			setState(137); args();
			setState(138); match(T__6);
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
		enterRule(_localctx, 28, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(T__26);
			setState(142);
			_la = _input.LA(1);
			if (_la==STRING || _la==ID) {
				{
				setState(141); pairs();
				}
			}

			setState(144); match(T__24);
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
		enterRule(_localctx, 30, RULE_pairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); pair();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(147); match(T__27);
				setState(148); pair();
				}
				}
				setState(153);
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
		enterRule(_localctx, 32, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); key();
			setState(155); match(T__12);
			setState(156); expr();
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
		enterRule(_localctx, 34, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		enterRule(_localctx, 36, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); relMonom();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(161); match(T__28);
				setState(162); relMonom();
				}
				}
				setState(167);
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
		enterRule(_localctx, 38, RULE_relMonom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); relOperation();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(169); match(T__25);
				setState(170); relOperation();
				}
				}
				setState(175);
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
		enterRule(_localctx, 40, RULE_relOperation);
		int _la;
		try {
			setState(187);
			switch (_input.LA(1)) {
			case T__30:
			case T__26:
			case T__20:
			case T__19:
			case T__15:
			case T__0:
			case NUMBER:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(176); arithOperation();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__22) | (1L << T__11) | (1L << T__9) | (1L << T__8) | (1L << T__5))) != 0)) {
					{
					{
					setState(177); relOperator();
					setState(178); arithOperation();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); match(T__3);
				setState(186); relOperation();
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
		enterRule(_localctx, 42, RULE_relOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		enterRule(_localctx, 44, RULE_arithOperation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191); arithMonom();
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==T__0) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(193); arithMonom();
					}
					} 
				}
				setState(198);
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
		enterRule(_localctx, 46, RULE_arithMonom);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199); arithSingle(0);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200);
					_la = _input.LA(1);
					if ( !(_la==T__31 || _la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(201); arithSingle(0);
					}
					} 
				}
				setState(206);
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
		public ArithSingleContext arithSingle() {
			return getRuleContext(ArithSingleContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PajamaParser.ID); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ArithOperationContext arithOperation() {
			return getRuleContext(ArithOperationContext.class,0);
		}
		public IdSingleContext idSingle() {
			return getRuleContext(IdSingleContext.class,0);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_arithSingle, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(208); match(T__0);
				setState(209); arithOperation();
				}
				break;
			case T__19:
				{
				setState(210); match(T__19);
				setState(211); expr();
				setState(212); match(T__2);
				}
				break;
			case ID:
				{
				setState(214); idSingle();
				}
				break;
			case T__26:
				{
				setState(215); object();
				}
				break;
			case T__30:
			case T__20:
			case T__15:
			case NUMBER:
			case STRING:
				{
				setState(216); constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ArithSingleContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithSingle);
						setState(219);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(220); match(T__19);
						setState(222);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__26) | (1L << T__20) | (1L << T__19) | (1L << T__15) | (1L << T__3) | (1L << T__0) | (1L << NUMBER) | (1L << STRING) | (1L << ID))) != 0)) {
							{
							setState(221); args();
							}
						}

						setState(224); match(T__2);
						}
						break;
					case 2:
						{
						_localctx = new ArithSingleContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithSingle);
						setState(225);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(228); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(226); match(T__16);
								setState(227); match(ID);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(230); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(236);
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

	public static class IdSingleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public IdSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idSingle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitIdSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdSingleContext idSingle() throws RecognitionException {
		IdSingleContext _localctx = new IdSingleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_idSingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(ID);
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprNumContext extends ConstantContext {
		public TerminalNode NUMBER() { return getToken(PajamaParser.NUMBER, 0); }
		public ExprNumContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitExprNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringContext extends ConstantContext {
		public TerminalNode STRING() { return getToken(PajamaParser.STRING, 0); }
		public ExprStringContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFalseContext extends ConstantContext {
		public ExprFalseContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitExprFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTrueContext extends ConstantContext {
		public ExprTrueContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitExprTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNullContext extends ConstantContext {
		public ExprNullContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitExprNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constant);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new ExprNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(239); match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new ExprStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(240); match(STRING);
				}
				break;
			case T__30:
				_localctx = new ExprTrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(241); match(T__30);
				}
				break;
			case T__15:
				_localctx = new ExprFalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(242); match(T__15);
				}
				break;
			case T__20:
				_localctx = new ExprNullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(243); match(T__20);
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
		enterRule(_localctx, 54, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); expr();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(247); match(T__17);
				setState(248); expr();
				}
				}
				setState(253);
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
		case 24: return arithSingle_sempred((ArithSingleContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u0101\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\6\2<\n\2\r\2\16\2=\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q"+
		"\13\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7Z\n\7\3\7\3\7\3\7\3\7\5\7`\n\7\3"+
		"\b\3\b\3\b\3\b\5\bf\n\b\3\t\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\5\np\n\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f{\n\f\f\f\16\f~\13\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0089\n\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\5\20\u0091\n\20\3\20\3\20\3\21\3\21\3\21\7\21\u0098\n\21\f\21"+
		"\16\21\u009b\13\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\7\24\u00a6"+
		"\n\24\f\24\16\24\u00a9\13\24\3\25\3\25\3\25\7\25\u00ae\n\25\f\25\16\25"+
		"\u00b1\13\25\3\26\3\26\3\26\3\26\7\26\u00b7\n\26\f\26\16\26\u00ba\13\26"+
		"\3\26\3\26\5\26\u00be\n\26\3\27\3\27\3\30\3\30\3\30\7\30\u00c5\n\30\f"+
		"\30\16\30\u00c8\13\30\3\31\3\31\3\31\7\31\u00cd\n\31\f\31\16\31\u00d0"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00dc\n"+
		"\32\3\32\3\32\3\32\5\32\u00e1\n\32\3\32\3\32\3\32\3\32\6\32\u00e7\n\32"+
		"\r\32\16\32\u00e8\7\32\u00eb\n\32\f\32\16\32\u00ee\13\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u00f7\n\34\3\35\3\35\3\35\7\35\u00fc\n\35\f"+
		"\35\16\35\u00ff\13\35\3\35\2\3\62\36\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668\2\6\3\2$%\7\2\5\5\f\f\27\27\31\32\35\35\3"+
		"\2!\"\4\2\3\3\20\20\u0107\2;\3\2\2\2\4?\3\2\2\2\6F\3\2\2\2\bJ\3\2\2\2"+
		"\nR\3\2\2\2\f_\3\2\2\2\16e\3\2\2\2\20k\3\2\2\2\22m\3\2\2\2\24s\3\2\2\2"+
		"\26w\3\2\2\2\30\177\3\2\2\2\32\u0088\3\2\2\2\34\u008a\3\2\2\2\36\u008e"+
		"\3\2\2\2 \u0094\3\2\2\2\"\u009c\3\2\2\2$\u00a0\3\2\2\2&\u00a2\3\2\2\2"+
		"(\u00aa\3\2\2\2*\u00bd\3\2\2\2,\u00bf\3\2\2\2.\u00c1\3\2\2\2\60\u00c9"+
		"\3\2\2\2\62\u00db\3\2\2\2\64\u00ef\3\2\2\2\66\u00f6\3\2\2\28\u00f8\3\2"+
		"\2\2:<\5\4\3\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?@\7"+
		"\13\2\2@A\7%\2\2AB\5\6\4\2BC\7\b\2\2CD\5\b\5\2DE\7\n\2\2E\5\3\2\2\2FG"+
		"\7\17\2\2GH\7%\2\2HI\7 \2\2I\7\3\2\2\2JO\5\n\6\2KL\7\33\2\2LN\5\n\6\2"+
		"MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\t\3\2\2\2QO\3\2\2\2RS\7\25\2"+
		"\2ST\5\f\7\2TU\7\24\2\2UV\5&\24\2V\13\3\2\2\2WY\5\16\b\2XZ\5\20\t\2YX"+
		"\3\2\2\2YZ\3\2\2\2Z`\3\2\2\2[\\\7\17\2\2\\]\5\f\7\2]^\7 \2\2^`\3\2\2\2"+
		"_W\3\2\2\2_[\3\2\2\2`\r\3\2\2\2af\7%\2\2bf\5\22\n\2cf\5\24\13\2df\5\32"+
		"\16\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\17\3\2\2\2gh\7\36\2\2h"+
		"l\7%\2\2ij\7\r\2\2jl\5&\24\2kg\3\2\2\2ki\3\2\2\2l\21\3\2\2\2mo\7\30\2"+
		"\2np\5\26\f\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\34\2\2r\23\3\2\2\2st\7"+
		"\b\2\2tu\5\30\r\2uv\7\n\2\2v\25\3\2\2\2w|\5\f\7\2xy\7\21\2\2y{\5\f\7\2"+
		"zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\27\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\5$\23\2\u0080\u0081\7\26\2\2\u0081\u0082\5\f\7\2\u0082\31\3\2\2\2\u0083"+
		"\u0089\7#\2\2\u0084\u0089\7$\2\2\u0085\u0089\7\4\2\2\u0086\u0089\7\23"+
		"\2\2\u0087\u0089\7\16\2\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088"+
		"\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\33\3\2\2"+
		"\2\u008a\u008b\7\30\2\2\u008b\u008c\58\35\2\u008c\u008d\7\34\2\2\u008d"+
		"\35\3\2\2\2\u008e\u0090\7\b\2\2\u008f\u0091\5 \21\2\u0090\u008f\3\2\2"+
		"\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\n\2\2\u0093\37"+
		"\3\2\2\2\u0094\u0099\5\"\22\2\u0095\u0096\7\7\2\2\u0096\u0098\5\"\22\2"+
		"\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a!\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\5$\23\2\u009d"+
		"\u009e\7\26\2\2\u009e\u009f\5&\24\2\u009f#\3\2\2\2\u00a0\u00a1\t\2\2\2"+
		"\u00a1%\3\2\2\2\u00a2\u00a7\5(\25\2\u00a3\u00a4\7\6\2\2\u00a4\u00a6\5"+
		"(\25\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\'\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00af\5*\26\2"+
		"\u00ab\u00ac\7\t\2\2\u00ac\u00ae\5*\26\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0)\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b8\5.\30\2\u00b3\u00b4\5,\27\2\u00b4\u00b5\5."+
		"\30\2\u00b5\u00b7\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00be\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00bc\7\37\2\2\u00bc\u00be\5*\26\2\u00bd\u00b2\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be+\3\2\2\2\u00bf\u00c0\t\3\2\2\u00c0-\3\2\2\2\u00c1"+
		"\u00c6\5\60\31\2\u00c2\u00c3\t\4\2\2\u00c3\u00c5\5\60\31\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"/\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ce\5\62\32\2\u00ca\u00cb\t\5\2"+
		"\2\u00cb\u00cd\5\62\32\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\61\3\2\2\2\u00d0\u00ce\3\2\2"+
		"\2\u00d1\u00d2\b\32\1\2\u00d2\u00d3\7\"\2\2\u00d3\u00dc\5.\30\2\u00d4"+
		"\u00d5\7\17\2\2\u00d5\u00d6\5&\24\2\u00d6\u00d7\7 \2\2\u00d7\u00dc\3\2"+
		"\2\2\u00d8\u00dc\5\64\33\2\u00d9\u00dc\5\36\20\2\u00da\u00dc\5\66\34\2"+
		"\u00db\u00d1\3\2\2\2\u00db\u00d4\3\2\2\2\u00db\u00d8\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00ec\3\2\2\2\u00dd\u00de\f\6\2\2\u00de"+
		"\u00e0\7\17\2\2\u00df\u00e1\58\35\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00eb\7 \2\2\u00e3\u00e6\f\5\2\2\u00e4"+
		"\u00e5\7\22\2\2\u00e5\u00e7\7%\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00dd\3\2\2\2\u00ea\u00e3\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\63\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0"+
		"\7%\2\2\u00f0\65\3\2\2\2\u00f1\u00f7\7#\2\2\u00f2\u00f7\7$\2\2\u00f3\u00f7"+
		"\7\4\2\2\u00f4\u00f7\7\23\2\2\u00f5\u00f7\7\16\2\2\u00f6\u00f1\3\2\2\2"+
		"\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5"+
		"\3\2\2\2\u00f7\67\3\2\2\2\u00f8\u00fd\5&\24\2\u00f9\u00fa\7\21\2\2\u00fa"+
		"\u00fc\5&\24\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe9\3\2\2\2\u00ff\u00fd\3\2\2\2\32=OY_eko"+
		"|\u0088\u0090\u0099\u00a7\u00af\u00b8\u00bd\u00c6\u00ce\u00db\u00e0\u00e8"+
		"\u00ea\u00ec\u00f6\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}