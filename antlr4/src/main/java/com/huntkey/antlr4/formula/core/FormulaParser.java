// Generated from src/main/resources/Formula.g4 by ANTLR 4.5.3
package com.huntkey.antlr4.formula.core;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormulaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, NUM=17, 
		DIGIT=18, WS=19;
	public static final int
		RULE_logicExpression = 0, RULE_logicAtomExpression = 1, RULE_conditionExpression = 2, 
		RULE_arithmeticAtomExpression = 3, RULE_arithmeticMulExpression = 4, RULE_arithmeticAddExpression = 5;
	public static final String[] ruleNames = {
		"logicExpression", "logicAtomExpression", "conditionExpression", "arithmeticAtomExpression", 
		"arithmeticMulExpression", "arithmeticAddExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&&'", "'||'", "'TRUE'", "'FALSE'", "'('", "')'", "'=='", "'!='", 
		"'>'", "'<'", "'>='", "'<='", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "NUM", "DIGIT", "WS"
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
	public String getGrammarFileName() { return "Formula.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FormulaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LogicExpressionContext extends ParserRuleContext {
		public List<LogicAtomExpressionContext> logicAtomExpression() {
			return getRuleContexts(LogicAtomExpressionContext.class);
		}
		public LogicAtomExpressionContext logicAtomExpression(int i) {
			return getRuleContext(LogicAtomExpressionContext.class,i);
		}
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_logicExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			logicAtomExpression();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(13);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(14);
				logicAtomExpression();
				}
				}
				setState(19);
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

	public static class LogicAtomExpressionContext extends ParserRuleContext {
		public ConditionExpressionContext conditionExpression() {
			return getRuleContext(ConditionExpressionContext.class,0);
		}
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public LogicAtomExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicAtomExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitLogicAtomExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicAtomExpressionContext logicAtomExpression() throws RecognitionException {
		LogicAtomExpressionContext _localctx = new LogicAtomExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_logicAtomExpression);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				conditionExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				match(T__4);
				setState(24);
				logicExpression();
				setState(25);
				match(T__5);
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

	public static class ConditionExpressionContext extends ParserRuleContext {
		public Token op;
		public List<ArithmeticAddExpressionContext> arithmeticAddExpression() {
			return getRuleContexts(ArithmeticAddExpressionContext.class);
		}
		public ArithmeticAddExpressionContext arithmeticAddExpression(int i) {
			return getRuleContext(ArithmeticAddExpressionContext.class,i);
		}
		public ConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExpressionContext conditionExpression() throws RecognitionException {
		ConditionExpressionContext _localctx = new ConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conditionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			arithmeticAddExpression();
			setState(30);
			((ConditionExpressionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
				((ConditionExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(31);
			arithmeticAddExpression();
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

	public static class ArithmeticAtomExpressionContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(FormulaParser.NUM, 0); }
		public ArithmeticAddExpressionContext arithmeticAddExpression() {
			return getRuleContext(ArithmeticAddExpressionContext.class,0);
		}
		public ArithmeticAtomExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticAtomExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitArithmeticAtomExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticAtomExpressionContext arithmeticAtomExpression() throws RecognitionException {
		ArithmeticAtomExpressionContext _localctx = new ArithmeticAtomExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arithmeticAtomExpression);
		try {
			setState(38);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(NUM);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__4);
				setState(35);
				arithmeticAddExpression();
				setState(36);
				match(T__5);
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

	public static class ArithmeticMulExpressionContext extends ParserRuleContext {
		public List<ArithmeticAtomExpressionContext> arithmeticAtomExpression() {
			return getRuleContexts(ArithmeticAtomExpressionContext.class);
		}
		public ArithmeticAtomExpressionContext arithmeticAtomExpression(int i) {
			return getRuleContext(ArithmeticAtomExpressionContext.class,i);
		}
		public ArithmeticMulExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticMulExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitArithmeticMulExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticMulExpressionContext arithmeticMulExpression() throws RecognitionException {
		ArithmeticMulExpressionContext _localctx = new ArithmeticMulExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arithmeticMulExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			arithmeticAtomExpression();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				{
				setState(41);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(42);
				arithmeticAtomExpression();
				}
				}
				setState(47);
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

	public static class ArithmeticAddExpressionContext extends ParserRuleContext {
		public List<ArithmeticMulExpressionContext> arithmeticMulExpression() {
			return getRuleContexts(ArithmeticMulExpressionContext.class);
		}
		public ArithmeticMulExpressionContext arithmeticMulExpression(int i) {
			return getRuleContext(ArithmeticMulExpressionContext.class,i);
		}
		public ArithmeticAddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticAddExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitArithmeticAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticAddExpressionContext arithmeticAddExpression() throws RecognitionException {
		ArithmeticAddExpressionContext _localctx = new ArithmeticAddExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arithmeticAddExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			arithmeticMulExpression();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__15) {
				{
				{
				setState(49);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(50);
				arithmeticMulExpression();
				}
				}
				setState(55);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\5\5)\n\5\3\6\3\6\3\6\7\6.\n\6\f\6\16\6\61\13\6\3\7\3\7\3\7"+
		"\7\7\66\n\7\f\7\16\79\13\7\3\7\2\2\b\2\4\6\b\n\f\2\6\3\2\3\4\3\2\t\16"+
		"\3\2\17\20\3\2\21\22;\2\16\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b(\3\2\2"+
		"\2\n*\3\2\2\2\f\62\3\2\2\2\16\23\5\4\3\2\17\20\t\2\2\2\20\22\5\4\3\2\21"+
		"\17\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25"+
		"\23\3\2\2\2\26\36\7\5\2\2\27\36\7\6\2\2\30\36\5\6\4\2\31\32\7\7\2\2\32"+
		"\33\5\2\2\2\33\34\7\b\2\2\34\36\3\2\2\2\35\26\3\2\2\2\35\27\3\2\2\2\35"+
		"\30\3\2\2\2\35\31\3\2\2\2\36\5\3\2\2\2\37 \5\f\7\2 !\t\3\2\2!\"\5\f\7"+
		"\2\"\7\3\2\2\2#)\7\23\2\2$%\7\7\2\2%&\5\f\7\2&\'\7\b\2\2\')\3\2\2\2(#"+
		"\3\2\2\2($\3\2\2\2)\t\3\2\2\2*/\5\b\5\2+,\t\4\2\2,.\5\b\5\2-+\3\2\2\2"+
		".\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\13\3\2\2\2\61/\3\2\2\2\62\67\5\n"+
		"\6\2\63\64\t\5\2\2\64\66\5\n\6\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2"+
		"\2\678\3\2\2\28\r\3\2\2\29\67\3\2\2\2\7\23\35(/\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}