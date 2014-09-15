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
		RULE_arithSingle = 24, RULE_constant = 25, RULE_args = 26;
	public static final String[] ruleNames = {
		"rules", "ruleStatement", "formal", "ruleBody", "caseRule", "pattern", 
		"pattInit", "pattRest", "pattArray", "pattObject", "pattList", "pattPair", 
		"pattConstant", "params", "object", "pairs", "pair", "key", "expr", "relMonom", 
		"relOperation", "relOperator", "arithOperation", "arithMonom", "arithSingle", 
		"constant", "args"
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
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54); ruleStatement();
				}
				}
				setState(57); 
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
			setState(59); match(T__23);
			setState(60); match(ID);
			setState(61); formal();
			setState(62); match(T__26);
			setState(63); ruleBody();
			setState(64); match(T__24);
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
			setState(66); match(T__19);
			setState(67); match(ID);
			setState(68); match(T__2);
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
			setState(70); caseRule();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(71); match(T__7);
				setState(72); caseRule();
				}
				}
				setState(77);
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
			setState(78); match(T__13);
			setState(79); pattern();
			setState(80); match(T__14);
			setState(81); expr();
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
			setState(91);
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
				setState(83); pattInit();
				setState(85);
				_la = _input.LA(1);
				if (_la==T__21 || _la==T__4) {
					{
					setState(84); pattRest();
					}
				}

				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); match(T__19);
				setState(88); pattern();
				setState(89); match(T__2);
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
	public static class IdContext extends PattInitContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public IdContext(PattInitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattInitContext pattInit() throws RecognitionException {
		PattInitContext _localctx = new PattInitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pattInit);
		try {
			setState(97);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93); match(ID);
				}
				break;
			case T__10:
				_localctx = new PArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94); pattArray();
				}
				break;
			case T__26:
				_localctx = new PObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95); pattObject();
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
				setState(96); pattConstant();
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
			setState(103);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); match(T__4);
				setState(100); match(ID);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); match(T__21);
				setState(102); expr();
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
			setState(105); match(T__10);
			setState(107);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__26) | (1L << T__20) | (1L << T__19) | (1L << T__15) | (1L << T__10) | (1L << NUMBER) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(106); pattList();
				}
			}

			setState(109); match(T__6);
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
			setState(111); match(T__26);
			setState(112); pattPair();
			setState(113); match(T__24);
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
			setState(115); pattern();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(116); match(T__17);
				setState(117); pattern();
				}
				}
				setState(122);
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
			setState(123); key();
			setState(124); match(T__12);
			setState(125); pattern();
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
			setState(132);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new PatNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127); match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new PatStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128); match(STRING);
				}
				break;
			case T__30:
				_localctx = new PatTrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(129); match(T__30);
				}
				break;
			case T__15:
				_localctx = new PatFalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(130); match(T__15);
				}
				break;
			case T__20:
				_localctx = new NullPatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(131); match(T__20);
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
			setState(134); match(T__10);
			setState(135); args();
			setState(136); match(T__6);
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
			setState(138); match(T__26);
			setState(140);
			_la = _input.LA(1);
			if (_la==STRING || _la==ID) {
				{
				setState(139); pairs();
				}
			}

			setState(142); match(T__24);
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
			setState(144); pair();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(145); match(T__27);
				setState(146); pair();
				}
				}
				setState(151);
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
			setState(152); key();
			setState(153); match(T__12);
			setState(154); expr();
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
			setState(156);
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
			setState(158); relMonom();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(159); match(T__28);
				setState(160); relMonom();
				}
				}
				setState(165);
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
			setState(166); relOperation();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(167); match(T__25);
				setState(168); relOperation();
				}
				}
				setState(173);
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
			setState(185);
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
				setState(174); arithOperation();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__22) | (1L << T__11) | (1L << T__9) | (1L << T__8) | (1L << T__5))) != 0)) {
					{
					{
					setState(175); relOperator();
					setState(176); arithOperation();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); match(T__3);
				setState(184); relOperation();
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
			setState(187);
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
			setState(189); arithMonom();
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==T__0) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(191); arithMonom();
					}
					} 
				}
				setState(196);
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
			setState(197); arithSingle(0);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198);
					_la = _input.LA(1);
					if ( !(_la==T__31 || _la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(199); arithSingle(0);
					}
					} 
				}
				setState(204);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_arithSingle, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(206); match(T__0);
				setState(207); arithOperation();
				}
				break;
			case T__19:
				{
				setState(208); match(T__19);
				setState(209); expr();
				setState(210); match(T__2);
				}
				break;
			case ID:
				{
				setState(212); match(ID);
				}
				break;
			case T__26:
				{
				setState(213); object();
				}
				break;
			case T__30:
			case T__20:
			case T__15:
			case NUMBER:
			case STRING:
				{
				setState(214); constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ArithSingleContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithSingle);
						setState(217);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(218); match(T__19);
						setState(220);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__26) | (1L << T__20) | (1L << T__19) | (1L << T__15) | (1L << T__3) | (1L << T__0) | (1L << NUMBER) | (1L << STRING) | (1L << ID))) != 0)) {
							{
							setState(219); args();
							}
						}

						setState(222); match(T__2);
						}
						break;
					case 2:
						{
						_localctx = new ArithSingleContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithSingle);
						setState(223);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(226); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(224); match(T__16);
								setState(225); match(ID);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(228); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(234);
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
		enterRule(_localctx, 50, RULE_constant);
		try {
			setState(240);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new ExprNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235); match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new ExprStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236); match(STRING);
				}
				break;
			case T__30:
				_localctx = new ExprTrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(237); match(T__30);
				}
				break;
			case T__15:
				_localctx = new ExprFalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(238); match(T__15);
				}
				break;
			case T__20:
				_localctx = new ExprNullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(239); match(T__20);
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
		enterRule(_localctx, 52, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); expr();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(243); match(T__17);
				setState(244); expr();
				}
				}
				setState(249);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2:\n\2\r\2\16\2;\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\5\7X\n\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\b\3\b\3\b\3"+
		"\b\5\bd\n\b\3\t\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\5\nn\n\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\7\fy\n\f\f\f\16\f|\13\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u0087\n\16\3\17\3\17\3\17\3\17\3\20\3\20\5\20"+
		"\u008f\n\20\3\20\3\20\3\21\3\21\3\21\7\21\u0096\n\21\f\21\16\21\u0099"+
		"\13\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\7\24\u00a4\n\24\f"+
		"\24\16\24\u00a7\13\24\3\25\3\25\3\25\7\25\u00ac\n\25\f\25\16\25\u00af"+
		"\13\25\3\26\3\26\3\26\3\26\7\26\u00b5\n\26\f\26\16\26\u00b8\13\26\3\26"+
		"\3\26\5\26\u00bc\n\26\3\27\3\27\3\30\3\30\3\30\7\30\u00c3\n\30\f\30\16"+
		"\30\u00c6\13\30\3\31\3\31\3\31\7\31\u00cb\n\31\f\31\16\31\u00ce\13\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00da\n\32\3\32"+
		"\3\32\3\32\5\32\u00df\n\32\3\32\3\32\3\32\3\32\6\32\u00e5\n\32\r\32\16"+
		"\32\u00e6\7\32\u00e9\n\32\f\32\16\32\u00ec\13\32\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u00f3\n\33\3\34\3\34\3\34\7\34\u00f8\n\34\f\34\16\34\u00fb\13"+
		"\34\3\34\2\3\62\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\66\2\6\3\2$%\7\2\5\5\f\f\27\27\31\32\35\35\3\2!\"\4\2\3\3\20\20"+
		"\u0104\29\3\2\2\2\4=\3\2\2\2\6D\3\2\2\2\bH\3\2\2\2\nP\3\2\2\2\f]\3\2\2"+
		"\2\16c\3\2\2\2\20i\3\2\2\2\22k\3\2\2\2\24q\3\2\2\2\26u\3\2\2\2\30}\3\2"+
		"\2\2\32\u0086\3\2\2\2\34\u0088\3\2\2\2\36\u008c\3\2\2\2 \u0092\3\2\2\2"+
		"\"\u009a\3\2\2\2$\u009e\3\2\2\2&\u00a0\3\2\2\2(\u00a8\3\2\2\2*\u00bb\3"+
		"\2\2\2,\u00bd\3\2\2\2.\u00bf\3\2\2\2\60\u00c7\3\2\2\2\62\u00d9\3\2\2\2"+
		"\64\u00f2\3\2\2\2\66\u00f4\3\2\2\28:\5\4\3\298\3\2\2\2:;\3\2\2\2;9\3\2"+
		"\2\2;<\3\2\2\2<\3\3\2\2\2=>\7\13\2\2>?\7%\2\2?@\5\6\4\2@A\7\b\2\2AB\5"+
		"\b\5\2BC\7\n\2\2C\5\3\2\2\2DE\7\17\2\2EF\7%\2\2FG\7 \2\2G\7\3\2\2\2HM"+
		"\5\n\6\2IJ\7\33\2\2JL\5\n\6\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2"+
		"N\t\3\2\2\2OM\3\2\2\2PQ\7\25\2\2QR\5\f\7\2RS\7\24\2\2ST\5&\24\2T\13\3"+
		"\2\2\2UW\5\16\b\2VX\5\20\t\2WV\3\2\2\2WX\3\2\2\2X^\3\2\2\2YZ\7\17\2\2"+
		"Z[\5\f\7\2[\\\7 \2\2\\^\3\2\2\2]U\3\2\2\2]Y\3\2\2\2^\r\3\2\2\2_d\7%\2"+
		"\2`d\5\22\n\2ad\5\24\13\2bd\5\32\16\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb"+
		"\3\2\2\2d\17\3\2\2\2ef\7\36\2\2fj\7%\2\2gh\7\r\2\2hj\5&\24\2ie\3\2\2\2"+
		"ig\3\2\2\2j\21\3\2\2\2km\7\30\2\2ln\5\26\f\2ml\3\2\2\2mn\3\2\2\2no\3\2"+
		"\2\2op\7\34\2\2p\23\3\2\2\2qr\7\b\2\2rs\5\30\r\2st\7\n\2\2t\25\3\2\2\2"+
		"uz\5\f\7\2vw\7\21\2\2wy\5\f\7\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2"+
		"\2{\27\3\2\2\2|z\3\2\2\2}~\5$\23\2~\177\7\26\2\2\177\u0080\5\f\7\2\u0080"+
		"\31\3\2\2\2\u0081\u0087\7#\2\2\u0082\u0087\7$\2\2\u0083\u0087\7\4\2\2"+
		"\u0084\u0087\7\23\2\2\u0085\u0087\7\16\2\2\u0086\u0081\3\2\2\2\u0086\u0082"+
		"\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\33\3\2\2\2\u0088\u0089\7\30\2\2\u0089\u008a\5\66\34\2\u008a\u008b\7\34"+
		"\2\2\u008b\35\3\2\2\2\u008c\u008e\7\b\2\2\u008d\u008f\5 \21\2\u008e\u008d"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\n\2\2\u0091"+
		"\37\3\2\2\2\u0092\u0097\5\"\22\2\u0093\u0094\7\7\2\2\u0094\u0096\5\"\22"+
		"\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098!\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\5$\23\2\u009b"+
		"\u009c\7\26\2\2\u009c\u009d\5&\24\2\u009d#\3\2\2\2\u009e\u009f\t\2\2\2"+
		"\u009f%\3\2\2\2\u00a0\u00a5\5(\25\2\u00a1\u00a2\7\6\2\2\u00a2\u00a4\5"+
		"(\25\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\'\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ad\5*\26\2"+
		"\u00a9\u00aa\7\t\2\2\u00aa\u00ac\5*\26\2\u00ab\u00a9\3\2\2\2\u00ac\u00af"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae)\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b6\5.\30\2\u00b1\u00b2\5,\27\2\u00b2\u00b3\5."+
		"\30\2\u00b3\u00b5\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bc\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00ba\7\37\2\2\u00ba\u00bc\5*\26\2\u00bb\u00b0\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc+\3\2\2\2\u00bd\u00be\t\3\2\2\u00be-\3\2\2\2\u00bf"+
		"\u00c4\5\60\31\2\u00c0\u00c1\t\4\2\2\u00c1\u00c3\5\60\31\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"/\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00cc\5\62\32\2\u00c8\u00c9\t\5\2"+
		"\2\u00c9\u00cb\5\62\32\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\61\3\2\2\2\u00ce\u00cc\3\2\2"+
		"\2\u00cf\u00d0\b\32\1\2\u00d0\u00d1\7\"\2\2\u00d1\u00da\5.\30\2\u00d2"+
		"\u00d3\7\17\2\2\u00d3\u00d4\5&\24\2\u00d4\u00d5\7 \2\2\u00d5\u00da\3\2"+
		"\2\2\u00d6\u00da\7%\2\2\u00d7\u00da\5\36\20\2\u00d8\u00da\5\64\33\2\u00d9"+
		"\u00cf\3\2\2\2\u00d9\u00d2\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00d8\3\2\2\2\u00da\u00ea\3\2\2\2\u00db\u00dc\f\6\2\2\u00dc"+
		"\u00de\7\17\2\2\u00dd\u00df\5\66\34\2\u00de\u00dd\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e9\7 \2\2\u00e1\u00e4\f\5\2\2\u00e2"+
		"\u00e3\7\22\2\2\u00e3\u00e5\7%\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00db\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\63\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f3"+
		"\7#\2\2\u00ee\u00f3\7$\2\2\u00ef\u00f3\7\4\2\2\u00f0\u00f3\7\23\2\2\u00f1"+
		"\u00f3\7\16\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef\3"+
		"\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\65\3\2\2\2\u00f4"+
		"\u00f9\5&\24\2\u00f5\u00f6\7\21\2\2\u00f6\u00f8\5&\24\2\u00f7\u00f5\3"+
		"\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\67\3\2\2\2\u00fb\u00f9\3\2\2\2\32;MW]cimz\u0086\u008e\u0097\u00a5\u00ad"+
		"\u00b6\u00bb\u00c4\u00cc\u00d9\u00de\u00e6\u00e8\u00ea\u00f2\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}