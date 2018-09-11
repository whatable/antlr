// Generated from src/main/resources/Expr.g4 by ANTLR 4.5.3
package com.huntkey.antlr4.expr.core;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUM=7, DIGIT=8, ID=9, 
		WS=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NUM", "DIGIT", "ID", 
		"WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f]\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\b%\n\b\r\b\16"+
		"\b&\3\b\3\b\3\b\6\b,\n\b\r\b\16\b-\3\b\3\b\3\b\6\b\63\n\b\r\b\16\b\64"+
		"\3\b\3\b\6\b9\n\b\r\b\16\b:\3\b\3\b\3\b\6\b@\n\b\r\b\16\bA\3\b\3\b\6\b"+
		"F\n\b\r\b\16\bG\3\b\3\b\5\bL\n\b\3\t\3\t\3\n\3\n\7\nR\n\n\f\n\16\nU\13"+
		"\n\3\13\6\13X\n\13\r\13\16\13Y\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\3\2\6\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17"+
		"\17\"\"g\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27"+
		"\3\2\2\2\5\31\3\2\2\2\7\33\3\2\2\2\t\35\3\2\2\2\13\37\3\2\2\2\r!\3\2\2"+
		"\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25W\3\2\2\2\27\30\7-\2\2\30\4\3"+
		"\2\2\2\31\32\7/\2\2\32\6\3\2\2\2\33\34\7,\2\2\34\b\3\2\2\2\35\36\7\61"+
		"\2\2\36\n\3\2\2\2\37 \7*\2\2 \f\3\2\2\2!\"\7+\2\2\"\16\3\2\2\2#%\5\21"+
		"\t\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'L\3\2\2\2()\7*\2\2)+\7"+
		"/\2\2*,\5\21\t\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60"+
		"\7+\2\2\60L\3\2\2\2\61\63\5\21\t\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3"+
		"\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\668\7\60\2\2\679\5\21\t\28\67\3\2\2"+
		"\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;L\3\2\2\2<=\7*\2\2=?\7/\2\2>@\5\21\t"+
		"\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CE\7\60\2\2DF\5\21"+
		"\t\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7+\2\2JL\3\2"+
		"\2\2K$\3\2\2\2K(\3\2\2\2K\62\3\2\2\2K<\3\2\2\2L\20\3\2\2\2MN\t\2\2\2N"+
		"\22\3\2\2\2OS\t\3\2\2PR\t\4\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2"+
		"\2T\24\3\2\2\2US\3\2\2\2VX\t\5\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2"+
		"\2\2Z[\3\2\2\2[\\\b\13\2\2\\\26\3\2\2\2\f\2&-\64:AGKSY\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}