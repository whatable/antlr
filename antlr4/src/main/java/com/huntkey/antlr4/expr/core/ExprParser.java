// Generated from src/main/resources/Expr.g4 by ANTLR 4.5.3
package com.huntkey.antlr4.expr.core;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUM=7, DIGIT=8, ID=9, 
		WS=10;
	public static final int
		RULE_expr = 0, RULE_expr1 = 1, RULE_expr0 = 2;
	public static final String[] ruleNames = {
		"expr", "expr1", "expr0"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "NUM", "DIGIT", "ID", "WS"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			expr1();
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(7);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(8);
				expr1();
				}
				}
				setState(13);
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

	public static class Expr1Context extends ParserRuleContext {
		public List<Expr0Context> expr0() {
			return getRuleContexts(Expr0Context.class);
		}
		public Expr0Context expr0(int i) {
			return getRuleContext(Expr0Context.class,i);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			expr0();
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(15);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(16);
				expr0();
				}
				}
				setState(21);
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

	public static class Expr0Context extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitExpr0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr0);
		try {
			setState(27);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(NUM);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(T__4);
				setState(24);
				expr();
				setState(25);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f \4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\3\3\3\3\3\7\3\24\n"+
		"\3\f\3\16\3\27\13\3\3\4\3\4\3\4\3\4\3\4\5\4\36\n\4\3\4\2\2\5\2\4\6\2\4"+
		"\3\2\3\4\3\2\5\6\37\2\b\3\2\2\2\4\20\3\2\2\2\6\35\3\2\2\2\b\r\5\4\3\2"+
		"\t\n\t\2\2\2\n\f\5\4\3\2\13\t\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3"+
		"\2\2\2\16\3\3\2\2\2\17\r\3\2\2\2\20\25\5\6\4\2\21\22\t\3\2\2\22\24\5\6"+
		"\4\2\23\21\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\5\3\2"+
		"\2\2\27\25\3\2\2\2\30\36\7\t\2\2\31\32\7\7\2\2\32\33\5\2\2\2\33\34\7\b"+
		"\2\2\34\36\3\2\2\2\35\30\3\2\2\2\35\31\3\2\2\2\36\7\3\2\2\2\5\r\25\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}