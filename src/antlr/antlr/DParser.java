// Generated from C:/Users/aNazy/Documents/GitHub/ICC_project_D/src/antlr/antlr\D.g4 by ANTLR 4.7
package antlr.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, INTEGER=48, REAL=49, STRING=50, BOOLEAN=51, EMPTY=52, 
		IDENT=53, Comment=54, WS=55;
	public static final int
		RULE_compilation_unit = 0, RULE_program = 1, RULE_scope = 2, RULE_statement = 3, 
		RULE_invocation = 4, RULE_r_if = 5, RULE_r_while = 6, RULE_r_for = 7, 
		RULE_print = 8, RULE_r_return = 9, RULE_assignment = 10, RULE_declaration = 11, 
		RULE_var_definition = 12, RULE_reference = 13, RULE_expression = 14, RULE_relation = 15, 
		RULE_simple = 16, RULE_summand = 17, RULE_factor = 18, RULE_primary = 19, 
		RULE_readInt = 20, RULE_readReal = 21, RULE_readString = 22, RULE_function_literal = 23, 
		RULE_body = 24, RULE_type_indicator = 25, RULE_literal = 26, RULE_object = 27, 
		RULE_tuple = 28;
	public static final String[] ruleNames = {
		"compilation_unit", "program", "scope", "statement", "invocation", "r_if", 
		"r_while", "r_for", "print", "r_return", "assignment", "declaration", 
		"var_definition", "reference", "expression", "relation", "simple", "summand", 
		"factor", "primary", "readInt", "readReal", "readString", "function_literal", 
		"body", "type_indicator", "literal", "object", "tuple"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "','", "')'", "'if'", "'then'", "'else'", "'end'", 
		"'while'", "'loop'", "'for'", "'in'", "'..'", "'print'", "'return'", "':='", 
		"'var'", "'['", "']'", "'.'", "'or'", "'and'", "'xor'", "'<'", "'<='", 
		"'>'", "'>='", "'='", "'/='", "'+'", "'-'", "'*'", "'/'", "'is'", "'not'", 
		"'size'", "'@int'", "'@real'", "'@string'", "'func'", "'=>'", "'int'", 
		"'real'", "'bool'", "'string'", "'{'", "'}'", null, null, null, null, 
		"'empty'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"INTEGER", "REAL", "STRING", "BOOLEAN", "EMPTY", "IDENT", "Comment", "WS"
	};
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
	public String getGrammarFileName() { return "D.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Compilation_unitContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DParser.EOF, 0); }
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterCompilation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitCompilation_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitCompilation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			program();
			setState(59);
			match(EOF);
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

	public static class ProgramContext extends ParserRuleContext {
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			scope();
			setState(62);
			match(EOF);
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

	public static class ScopeContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << IDENT))) != 0)) {
				{
				{
				setState(64);
				statement();
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(65);
					match(T__0);
					}
				}

				}
				}
				setState(72);
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public R_ifContext r_if() {
			return getRuleContext(R_ifContext.class,0);
		}
		public R_whileContext r_while() {
			return getRuleContext(R_whileContext.class,0);
		}
		public R_forContext r_for() {
			return getRuleContext(R_forContext.class,0);
		}
		public R_returnContext r_return() {
			return getRuleContext(R_returnContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				r_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				r_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				r_for();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				r_return();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				print();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				invocation();
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

	public static class InvocationContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IDENT);
			setState(84);
			match(T__1);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__17) | (1L << T__29) | (1L << T__30) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__45) | (1L << INTEGER) | (1L << REAL) | (1L << STRING) | (1L << BOOLEAN) | (1L << EMPTY) | (1L << IDENT))) != 0)) {
				{
				setState(85);
				expression();
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(86);
					match(T__2);
					setState(87);
					expression();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(95);
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

	public static class R_ifContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public R_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterR_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitR_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitR_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_ifContext r_if() throws RecognitionException {
		R_ifContext _localctx = new R_ifContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_r_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__4);
			setState(98);
			expression();
			setState(99);
			match(T__5);
			setState(100);
			scope();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(101);
				match(T__6);
				setState(102);
				scope();
				}
			}

			setState(105);
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

	public static class R_whileContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public R_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterR_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitR_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitR_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_whileContext r_while() throws RecognitionException {
		R_whileContext _localctx = new R_whileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_r_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__8);
			setState(108);
			expression();
			setState(109);
			match(T__9);
			setState(110);
			scope();
			setState(111);
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

	public static class R_forContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public R_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterR_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitR_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitR_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_forContext r_for() throws RecognitionException {
		R_forContext _localctx = new R_forContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_r_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__10);
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(114);
				match(IDENT);
				setState(115);
				match(T__11);
				}
				break;
			}
			setState(118);
			expression();
			setState(119);
			match(T__12);
			setState(120);
			expression();
			setState(121);
			match(T__9);
			setState(122);
			scope();
			setState(123);
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

	public static class PrintContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__13);
			setState(126);
			expression();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(127);
				match(T__2);
				setState(128);
				expression();
				}
				}
				setState(133);
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

	public static class R_returnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public R_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterR_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitR_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitR_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_returnContext r_return() throws RecognitionException {
		R_returnContext _localctx = new R_returnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_r_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__14);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(135);
				expression();
				}
				break;
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

	public static class AssignmentContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			reference(0);
			setState(139);
			match(T__15);
			setState(140);
			expression();
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

	public static class DeclarationContext extends ParserRuleContext {
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__16);
			setState(143);
			var_definition();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(144);
				match(T__2);
				setState(145);
				var_definition();
				}
				}
				setState(150);
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

	public static class Var_definitionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterVar_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitVar_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitVar_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IDENT);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(152);
				match(T__15);
				setState(153);
				expression();
				}
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(DParser.IDENT, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		return reference(0);
	}

	private ReferenceContext reference(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ReferenceContext _localctx = new ReferenceContext(_ctx, _parentState);
		ReferenceContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_reference, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(157);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ReferenceContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_reference);
						setState(159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(160);
						match(T__17);
						setState(161);
						expression();
						setState(162);
						match(T__18);
						}
						break;
					case 2:
						{
						_localctx = new ReferenceContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_reference);
						setState(164);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(165);
						match(T__1);
						setState(174);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__17) | (1L << T__29) | (1L << T__30) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__45) | (1L << INTEGER) | (1L << REAL) | (1L << STRING) | (1L << BOOLEAN) | (1L << EMPTY) | (1L << IDENT))) != 0)) {
							{
							setState(166);
							expression();
							setState(171);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__2) {
								{
								{
								setState(167);
								match(T__2);
								setState(168);
								expression();
								}
								}
								setState(173);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(176);
						match(T__3);
						}
						break;
					case 3:
						{
						_localctx = new ReferenceContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_reference);
						setState(177);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(178);
						match(T__19);
						setState(179);
						match(IDENT);
						}
						break;
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			relation();
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(187);
					relation();
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

	public static class RelationContext extends ParserRuleContext {
		public List<SimpleContext> simple() {
			return getRuleContexts(SimpleContext.class);
		}
		public SimpleContext simple(int i) {
			return getRuleContext(SimpleContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			simple();
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(194);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
				simple();
				}
				break;
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

	public static class SimpleContext extends ParserRuleContext {
		public List<SummandContext> summand() {
			return getRuleContexts(SummandContext.class);
		}
		public SummandContext summand(int i) {
			return getRuleContext(SummandContext.class,i);
		}
		public SimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleContext simple() throws RecognitionException {
		SimpleContext _localctx = new SimpleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			summand();
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					_la = _input.LA(1);
					if ( !(_la==T__29 || _la==T__30) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(200);
					summand();
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class SummandContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public SummandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterSummand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitSummand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitSummand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummandContext summand() throws RecognitionException {
		SummandContext _localctx = new SummandContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_summand);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			factor();
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					_la = _input.LA(1);
					if ( !(_la==T__31 || _la==T__32) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(208);
					factor();
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public Type_indicatorContext type_indicator() {
			return getRuleContext(Type_indicatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				reference(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				reference(0);
				setState(216);
				match(T__33);
				setState(217);
				type_indicator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(T__1);
				setState(220);
				expression();
				setState(221);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__34))) != 0)) {
					{
					setState(223);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__34))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(226);
				primary();
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

	public static class PrimaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Function_literalContext function_literal() {
			return getRuleContext(Function_literalContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ReadIntContext readInt() {
			return getRuleContext(ReadIntContext.class,0);
		}
		public ReadRealContext readReal() {
			return getRuleContext(ReadRealContext.class,0);
		}
		public ReadStringContext readString() {
			return getRuleContext(ReadStringContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primary);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__45:
			case INTEGER:
			case REAL:
			case STRING:
			case BOOLEAN:
			case EMPTY:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				literal();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				function_literal();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(T__35);
				setState(232);
				expression();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(T__4);
				setState(234);
				expression();
				setState(235);
				match(T__5);
				setState(236);
				expression();
				setState(237);
				match(T__6);
				setState(238);
				expression();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				readInt();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				readReal();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				readString();
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

	public static class ReadIntContext extends ParserRuleContext {
		public ReadIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterReadInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitReadInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitReadInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadIntContext readInt() throws RecognitionException {
		ReadIntContext _localctx = new ReadIntContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_readInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__36);
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

	public static class ReadRealContext extends ParserRuleContext {
		public ReadRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterReadReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitReadReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitReadReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadRealContext readReal() throws RecognitionException {
		ReadRealContext _localctx = new ReadRealContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_readReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__37);
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

	public static class ReadStringContext extends ParserRuleContext {
		public ReadStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterReadString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitReadString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitReadString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStringContext readString() throws RecognitionException {
		ReadStringContext _localctx = new ReadStringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_readString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__38);
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

	public static class Function_literalContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(DParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(DParser.IDENT, i);
		}
		public Function_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterFunction_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitFunction_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitFunction_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_literalContext function_literal() throws RecognitionException {
		Function_literalContext _localctx = new Function_literalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__39);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(252);
				match(T__1);
				setState(253);
				match(IDENT);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(254);
					match(T__2);
					setState(255);
					match(IDENT);
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				match(T__3);
				}
			}

			setState(264);
			body();
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

	public static class BodyContext extends ParserRuleContext {
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_body);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__7:
			case T__8:
			case T__10:
			case T__13:
			case T__14:
			case T__16:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				scope();
				setState(267);
				match(T__7);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(T__40);
				setState(270);
				expression();
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

	public static class Type_indicatorContext extends ParserRuleContext {
		public Type_indicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_indicator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterType_indicator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitType_indicator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitType_indicator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_indicatorContext type_indicator() throws RecognitionException {
		Type_indicatorContext _localctx = new Type_indicatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type_indicator);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(T__44);
				}
				break;
			case EMPTY:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				match(EMPTY);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				match(T__17);
				setState(279);
				match(T__18);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 7);
				{
				setState(280);
				match(T__45);
				setState(281);
				match(T__46);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 8);
				{
				setState(282);
				match(T__39);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(DParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(DParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(DParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(DParser.BOOLEAN, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(INTEGER);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(REAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(STRING);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				match(BOOLEAN);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 5);
				{
				setState(289);
				object();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(290);
				tuple();
				}
				break;
			case EMPTY:
				enterOuterAlt(_localctx, 7);
				{
				setState(291);
				match(EMPTY);
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

	public static class ObjectContext extends ParserRuleContext {
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__45);
			setState(295);
			var_definition();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(296);
				match(T__2);
				setState(297);
				var_definition();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(T__46);
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

	public static class TupleContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DListener ) ((DListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DVisitor ) return ((DVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__17);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__17) | (1L << T__29) | (1L << T__30) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__45) | (1L << INTEGER) | (1L << REAL) | (1L << STRING) | (1L << BOOLEAN) | (1L << EMPTY) | (1L << IDENT))) != 0)) {
				{
				setState(306);
				expression();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(307);
					match(T__2);
					setState(308);
					expression();
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(316);
			match(T__18);
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
		case 13:
			return reference_sempred((ReferenceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean reference_sempred(ReferenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0141\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\5\4E\n\4\7\4G\n\4\f\4\16\4J\13\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5T\n\5\3\6\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\5\6`\n\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7j\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\5\tw\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\7\n\u0084\n\n\f\n\16\n\u0087\13\n\3\13\3\13\5\13\u008b\n\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\7\r\u0095\n\r\f\r\16\r\u0098\13\r\3\16\3\16\3\16"+
		"\5\16\u009d\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00ac\n\17\f\17\16\17\u00af\13\17\5\17\u00b1\n\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00b7\n\17\f\17\16\17\u00ba\13\17\3\20\3\20\3\20"+
		"\7\20\u00bf\n\20\f\20\16\20\u00c2\13\20\3\21\3\21\3\21\5\21\u00c7\n\21"+
		"\3\22\3\22\3\22\7\22\u00cc\n\22\f\22\16\22\u00cf\13\22\3\23\3\23\3\23"+
		"\7\23\u00d4\n\23\f\23\16\23\u00d7\13\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00e3\n\24\3\24\5\24\u00e6\n\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f6"+
		"\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u0103"+
		"\n\31\f\31\16\31\u0106\13\31\3\31\5\31\u0109\n\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0112\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u011e\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0127"+
		"\n\34\3\35\3\35\3\35\3\35\7\35\u012d\n\35\f\35\16\35\u0130\13\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\7\36\u0138\n\36\f\36\16\36\u013b\13\36\5\36"+
		"\u013d\n\36\3\36\3\36\3\36\2\3\34\37\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:\2\7\3\2\27\31\3\2\32\37\3\2 !\3\2\"#\4\2"+
		" !%%\2\u015a\2<\3\2\2\2\4?\3\2\2\2\6H\3\2\2\2\bS\3\2\2\2\nU\3\2\2\2\f"+
		"c\3\2\2\2\16m\3\2\2\2\20s\3\2\2\2\22\177\3\2\2\2\24\u0088\3\2\2\2\26\u008c"+
		"\3\2\2\2\30\u0090\3\2\2\2\32\u0099\3\2\2\2\34\u009e\3\2\2\2\36\u00bb\3"+
		"\2\2\2 \u00c3\3\2\2\2\"\u00c8\3\2\2\2$\u00d0\3\2\2\2&\u00e5\3\2\2\2(\u00f5"+
		"\3\2\2\2*\u00f7\3\2\2\2,\u00f9\3\2\2\2.\u00fb\3\2\2\2\60\u00fd\3\2\2\2"+
		"\62\u0111\3\2\2\2\64\u011d\3\2\2\2\66\u0126\3\2\2\28\u0128\3\2\2\2:\u0133"+
		"\3\2\2\2<=\5\4\3\2=>\7\2\2\3>\3\3\2\2\2?@\5\6\4\2@A\7\2\2\3A\5\3\2\2\2"+
		"BD\5\b\5\2CE\7\3\2\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2FB\3\2\2\2GJ\3\2\2\2"+
		"HF\3\2\2\2HI\3\2\2\2I\7\3\2\2\2JH\3\2\2\2KT\5\30\r\2LT\5\26\f\2MT\5\f"+
		"\7\2NT\5\16\b\2OT\5\20\t\2PT\5\24\13\2QT\5\22\n\2RT\5\n\6\2SK\3\2\2\2"+
		"SL\3\2\2\2SM\3\2\2\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2"+
		"T\t\3\2\2\2UV\7\67\2\2V_\7\4\2\2W\\\5\36\20\2XY\7\5\2\2Y[\5\36\20\2ZX"+
		"\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2\2_W\3\2\2"+
		"\2_`\3\2\2\2`a\3\2\2\2ab\7\6\2\2b\13\3\2\2\2cd\7\7\2\2de\5\36\20\2ef\7"+
		"\b\2\2fi\5\6\4\2gh\7\t\2\2hj\5\6\4\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7"+
		"\n\2\2l\r\3\2\2\2mn\7\13\2\2no\5\36\20\2op\7\f\2\2pq\5\6\4\2qr\7\n\2\2"+
		"r\17\3\2\2\2sv\7\r\2\2tu\7\67\2\2uw\7\16\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2"+
		"\2\2xy\5\36\20\2yz\7\17\2\2z{\5\36\20\2{|\7\f\2\2|}\5\6\4\2}~\7\n\2\2"+
		"~\21\3\2\2\2\177\u0080\7\20\2\2\u0080\u0085\5\36\20\2\u0081\u0082\7\5"+
		"\2\2\u0082\u0084\5\36\20\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\23\3\2\2\2\u0087\u0085\3\2\2"+
		"\2\u0088\u008a\7\21\2\2\u0089\u008b\5\36\20\2\u008a\u0089\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\25\3\2\2\2\u008c\u008d\5\34\17\2\u008d\u008e\7\22"+
		"\2\2\u008e\u008f\5\36\20\2\u008f\27\3\2\2\2\u0090\u0091\7\23\2\2\u0091"+
		"\u0096\5\32\16\2\u0092\u0093\7\5\2\2\u0093\u0095\5\32\16\2\u0094\u0092"+
		"\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\31\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009c\7\67\2\2\u009a\u009b\7\22"+
		"\2\2\u009b\u009d\5\36\20\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\33\3\2\2\2\u009e\u009f\b\17\1\2\u009f\u00a0\7\67\2\2\u00a0\u00b8\3\2"+
		"\2\2\u00a1\u00a2\f\5\2\2\u00a2\u00a3\7\24\2\2\u00a3\u00a4\5\36\20\2\u00a4"+
		"\u00a5\7\25\2\2\u00a5\u00b7\3\2\2\2\u00a6\u00a7\f\4\2\2\u00a7\u00b0\7"+
		"\4\2\2\u00a8\u00ad\5\36\20\2\u00a9\u00aa\7\5\2\2\u00aa\u00ac\5\36\20\2"+
		"\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b7\7\6\2\2\u00b3\u00b4\f\3"+
		"\2\2\u00b4\u00b5\7\26\2\2\u00b5\u00b7\7\67\2\2\u00b6\u00a1\3\2\2\2\u00b6"+
		"\u00a6\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\35\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00c0"+
		"\5 \21\2\u00bc\u00bd\t\2\2\2\u00bd\u00bf\5 \21\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\37\3\2\2"+
		"\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\5\"\22\2\u00c4\u00c5\t\3\2\2\u00c5"+
		"\u00c7\5\"\22\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7!\3\2\2\2"+
		"\u00c8\u00cd\5$\23\2\u00c9\u00ca\t\4\2\2\u00ca\u00cc\5$\23\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"#\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d5\5&\24\2\u00d1\u00d2\t\5\2\2"+
		"\u00d2\u00d4\5&\24\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6%\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00e6\5\34\17\2\u00d9\u00da\5\34\17\2\u00da\u00db\7$\2\2\u00db\u00dc"+
		"\5\64\33\2\u00dc\u00e6\3\2\2\2\u00dd\u00de\7\4\2\2\u00de\u00df\5\36\20"+
		"\2\u00df\u00e0\7\6\2\2\u00e0\u00e6\3\2\2\2\u00e1\u00e3\t\6\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\5(\25\2\u00e5"+
		"\u00d8\3\2\2\2\u00e5\u00d9\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00e2\3\2"+
		"\2\2\u00e6\'\3\2\2\2\u00e7\u00f6\5\66\34\2\u00e8\u00f6\5\60\31\2\u00e9"+
		"\u00ea\7&\2\2\u00ea\u00f6\5\36\20\2\u00eb\u00ec\7\7\2\2\u00ec\u00ed\5"+
		"\36\20\2\u00ed\u00ee\7\b\2\2\u00ee\u00ef\5\36\20\2\u00ef\u00f0\7\t\2\2"+
		"\u00f0\u00f1\5\36\20\2\u00f1\u00f6\3\2\2\2\u00f2\u00f6\5*\26\2\u00f3\u00f6"+
		"\5,\27\2\u00f4\u00f6\5.\30\2\u00f5\u00e7\3\2\2\2\u00f5\u00e8\3\2\2\2\u00f5"+
		"\u00e9\3\2\2\2\u00f5\u00eb\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f4\3\2\2\2\u00f6)\3\2\2\2\u00f7\u00f8\7\'\2\2\u00f8+\3\2"+
		"\2\2\u00f9\u00fa\7(\2\2\u00fa-\3\2\2\2\u00fb\u00fc\7)\2\2\u00fc/\3\2\2"+
		"\2\u00fd\u0108\7*\2\2\u00fe\u00ff\7\4\2\2\u00ff\u0104\7\67\2\2\u0100\u0101"+
		"\7\5\2\2\u0101\u0103\7\67\2\2\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2"+
		"\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0107\u0109\7\6\2\2\u0108\u00fe\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\5\62\32\2\u010b\61\3\2\2\2\u010c\u010d\5\6"+
		"\4\2\u010d\u010e\7\n\2\2\u010e\u0112\3\2\2\2\u010f\u0110\7+\2\2\u0110"+
		"\u0112\5\36\20\2\u0111\u010c\3\2\2\2\u0111\u010f\3\2\2\2\u0112\63\3\2"+
		"\2\2\u0113\u011e\7,\2\2\u0114\u011e\7-\2\2\u0115\u011e\7.\2\2\u0116\u011e"+
		"\7/\2\2\u0117\u011e\7\66\2\2\u0118\u0119\7\24\2\2\u0119\u011e\7\25\2\2"+
		"\u011a\u011b\7\60\2\2\u011b\u011e\7\61\2\2\u011c\u011e\7*\2\2\u011d\u0113"+
		"\3\2\2\2\u011d\u0114\3\2\2\2\u011d\u0115\3\2\2\2\u011d\u0116\3\2\2\2\u011d"+
		"\u0117\3\2\2\2\u011d\u0118\3\2\2\2\u011d\u011a\3\2\2\2\u011d\u011c\3\2"+
		"\2\2\u011e\65\3\2\2\2\u011f\u0127\7\62\2\2\u0120\u0127\7\63\2\2\u0121"+
		"\u0127\7\64\2\2\u0122\u0127\7\65\2\2\u0123\u0127\58\35\2\u0124\u0127\5"+
		":\36\2\u0125\u0127\7\66\2\2\u0126\u011f\3\2\2\2\u0126\u0120\3\2\2\2\u0126"+
		"\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0125\3\2\2\2\u0127\67\3\2\2\2\u0128\u0129\7\60\2\2\u0129\u012e"+
		"\5\32\16\2\u012a\u012b\7\5\2\2\u012b\u012d\5\32\16\2\u012c\u012a\3\2\2"+
		"\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7\61\2\2\u01329\3\2\2\2\u0133"+
		"\u013c\7\24\2\2\u0134\u0139\5\36\20\2\u0135\u0136\7\5\2\2\u0136\u0138"+
		"\5\36\20\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0134"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7\25\2\2"+
		"\u013f;\3\2\2\2 DHS\\_iv\u0085\u008a\u0096\u009c\u00ad\u00b0\u00b6\u00b8"+
		"\u00c0\u00c6\u00cd\u00d5\u00e2\u00e5\u00f5\u0104\u0108\u0111\u011d\u0126"+
		"\u012e\u0139\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}