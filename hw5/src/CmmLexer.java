// Generated from src/Cmm.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, SEMI=2, COMMA=3, SINGLEQUOTE=4, EQUAL=5, LPAREN=6, RPAREN=7, LBRACE=8, 
		RBRACE=9, IF=10, WHILE=11, INT=12, CHAR=13, VOID=14, FUNC=15, RETURN=16, 
		Whitespace=17, Newline=18, BlockComment=19, LineComment=20, Constant=21, 
		Integer=22, Character=23, Identifier=24, Ops=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VAR", "SEMI", "COMMA", "SINGLEQUOTE", "EQUAL", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "IF", "WHILE", "INT", "CHAR", "VOID", "FUNC", "RETURN", "Whitespace", 
		"Newline", "BlockComment", "LineComment", "Constant", "Integer", "Sign", 
		"Number", "Character", "Identifier", "Ops"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "';'", "','", "'''", "'='", "'('", "')'", "'{'", "'}'", 
		"'if'", "'while'", "'int'", "'char'", "'void'", "'func'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "SEMI", "COMMA", "SINGLEQUOTE", "EQUAL", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "IF", "WHILE", "INT", "CHAR", "VOID", "FUNC", "RETURN", 
		"Whitespace", "Newline", "BlockComment", "LineComment", "Constant", "Integer", 
		"Character", "Identifier", "Ops"
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\6\22r\n\22\r\22\16\22s\3\22\3\22\3\23\3\23\5\23z\n\23\3\23\5"+
		"\23}\n\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0085\n\24\f\24\16\24\u0088"+
		"\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0093\n\25\f"+
		"\25\16\25\u0096\13\25\3\25\3\25\3\26\3\26\5\26\u009c\n\26\3\27\5\27\u009f"+
		"\n\27\3\27\3\27\3\30\3\30\3\31\6\31\u00a6\n\31\r\31\16\31\u00a7\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\7\33\u00b0\n\33\f\33\16\33\u00b3\13\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00bf\n\34\3\u0086\2"+
		"\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\31\65\32\67\33\3\2\13"+
		"\4\2\13\13\"\"\4\2\f\f\17\17\4\2--//\3\2\62;\6\2\f\f\17\17))^^\4\2C\\"+
		"c|\5\2\62;C\\c|\5\2,-//\61\61\4\2>>@@\2\u00cb\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\39\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2"+
		"\2\2\17G\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27P\3\2\2\2\31V\3"+
		"\2\2\2\33Z\3\2\2\2\35_\3\2\2\2\37d\3\2\2\2!i\3\2\2\2#q\3\2\2\2%|\3\2\2"+
		"\2\'\u0080\3\2\2\2)\u008e\3\2\2\2+\u009b\3\2\2\2-\u009e\3\2\2\2/\u00a2"+
		"\3\2\2\2\61\u00a5\3\2\2\2\63\u00a9\3\2\2\2\65\u00ad\3\2\2\2\67\u00be\3"+
		"\2\2\29:\7x\2\2:;\7c\2\2;<\7t\2\2<\4\3\2\2\2=>\7=\2\2>\6\3\2\2\2?@\7."+
		"\2\2@\b\3\2\2\2AB\7)\2\2B\n\3\2\2\2CD\7?\2\2D\f\3\2\2\2EF\7*\2\2F\16\3"+
		"\2\2\2GH\7+\2\2H\20\3\2\2\2IJ\7}\2\2J\22\3\2\2\2KL\7\177\2\2L\24\3\2\2"+
		"\2MN\7k\2\2NO\7h\2\2O\26\3\2\2\2PQ\7y\2\2QR\7j\2\2RS\7k\2\2ST\7n\2\2T"+
		"U\7g\2\2U\30\3\2\2\2VW\7k\2\2WX\7p\2\2XY\7v\2\2Y\32\3\2\2\2Z[\7e\2\2["+
		"\\\7j\2\2\\]\7c\2\2]^\7t\2\2^\34\3\2\2\2_`\7x\2\2`a\7q\2\2ab\7k\2\2bc"+
		"\7f\2\2c\36\3\2\2\2de\7h\2\2ef\7w\2\2fg\7p\2\2gh\7e\2\2h \3\2\2\2ij\7"+
		"t\2\2jk\7g\2\2kl\7v\2\2lm\7w\2\2mn\7t\2\2no\7p\2\2o\"\3\2\2\2pr\t\2\2"+
		"\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\22\2\2v$\3\2"+
		"\2\2wy\7\17\2\2xz\7\f\2\2yx\3\2\2\2yz\3\2\2\2z}\3\2\2\2{}\7\f\2\2|w\3"+
		"\2\2\2|{\3\2\2\2}~\3\2\2\2~\177\b\23\2\2\177&\3\2\2\2\u0080\u0081\7\61"+
		"\2\2\u0081\u0082\7,\2\2\u0082\u0086\3\2\2\2\u0083\u0085\13\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7,\2\2\u008a"+
		"\u008b\7\61\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\24\2\2\u008d(\3\2\2"+
		"\2\u008e\u008f\7\61\2\2\u008f\u0090\7\61\2\2\u0090\u0094\3\2\2\2\u0091"+
		"\u0093\n\3\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\b\25\2\2\u0098*\3\2\2\2\u0099\u009c\5-\27\2\u009a\u009c\5\63\32"+
		"\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c,\3\2\2\2\u009d\u009f"+
		"\5/\30\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\5\61\31\2\u00a1.\3\2\2\2\u00a2\u00a3\t\4\2\2\u00a3\60\3\2\2\2\u00a4"+
		"\u00a6\t\5\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\62\3\2\2\2\u00a9\u00aa\5\t\5\2\u00aa\u00ab"+
		"\n\6\2\2\u00ab\u00ac\5\t\5\2\u00ac\64\3\2\2\2\u00ad\u00b1\t\7\2\2\u00ae"+
		"\u00b0\t\b\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\66\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00bf"+
		"\t\t\2\2\u00b5\u00b6\7?\2\2\u00b6\u00bf\7?\2\2\u00b7\u00b8\7#\2\2\u00b8"+
		"\u00bf\7?\2\2\u00b9\u00bf\t\n\2\2\u00ba\u00bb\7@\2\2\u00bb\u00bf\7?\2"+
		"\2\u00bc\u00bd\7>\2\2\u00bd\u00bf\7?\2\2\u00be\u00b4\3\2\2\2\u00be\u00b5"+
		"\3\2\2\2\u00be\u00b7\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf8\3\2\2\2\r\2sy|\u0086\u0094\u009b\u009e\u00a7\u00b1"+
		"\u00be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}