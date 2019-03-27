package com.github.jvm.agent.antlr;// Generated from /Users/oneapm/git/JVM_profile/agent/src/main/antlr/Command.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, SC_COMMAND = 4, KEYMAP_COMMAND = 5, EXIT_COMMAND = 6,
            LOGOUT_COMMAND = 7, QUIT_COMMAND = 8, CLS_COMMAND = 9, HELP_COMMAND = 10, HELP = 11,
            DETAIL = 12, FIELD = 13, REGEX = 14, IDENTIFIER = 15, NUMERIC_LITERAL = 16, BIND_PARAMETER = 17,
            STRING_LITERAL = 18, BLOB_LITERAL = 19, SINGLE_LINE_COMMENT = 20, MULTILINE_COMMENT = 21,
            SPACES = 22, UNEXPECTED_CHAR = 23;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "SC_COMMAND", "KEYMAP_COMMAND", "EXIT_COMMAND",
                "LOGOUT_COMMAND", "QUIT_COMMAND", "CLS_COMMAND", "HELP_COMMAND", "HELP",
                "DETAIL", "FIELD", "REGEX", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER",
                "STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT",
                "SPACES", "UNEXPECTED_CHAR", "DIGIT", "A", "B", "C", "D", "E", "F", "G",
                "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
                "V", "W", "X", "Y", "Z"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'-'", "'('", "')'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, "SC_COMMAND", "KEYMAP_COMMAND", "EXIT_COMMAND",
                "LOGOUT_COMMAND", "QUIT_COMMAND", "CLS_COMMAND", "HELP_COMMAND", "HELP",
                "DETAIL", "FIELD", "REGEX", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER",
                "STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT",
                "SPACES", "UNEXPECTED_CHAR"
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


    public CommandLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "Command.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u015a\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
                    " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t" +
                    "+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2" +
                    "\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3" +
                    "\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n" +
                    "\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20" +
                    "\3\20\3\20\3\20\7\20\u009e\n\20\f\20\16\20\u00a1\13\20\3\20\3\20\3\20" +
                    "\3\20\3\20\7\20\u00a8\n\20\f\20\16\20\u00ab\13\20\3\20\3\20\3\20\7\20" +
                    "\u00b0\n\20\f\20\16\20\u00b3\13\20\3\20\3\20\3\20\7\20\u00b8\n\20\f\20" +
                    "\16\20\u00bb\13\20\5\20\u00bd\n\20\3\21\6\21\u00c0\n\21\r\21\16\21\u00c1" +
                    "\3\21\3\21\7\21\u00c6\n\21\f\21\16\21\u00c9\13\21\5\21\u00cb\n\21\3\21" +
                    "\3\21\5\21\u00cf\n\21\3\21\6\21\u00d2\n\21\r\21\16\21\u00d3\5\21\u00d6" +
                    "\n\21\3\21\3\21\6\21\u00da\n\21\r\21\16\21\u00db\3\21\3\21\5\21\u00e0" +
                    "\n\21\3\21\6\21\u00e3\n\21\r\21\16\21\u00e4\5\21\u00e7\n\21\5\21\u00e9" +
                    "\n\21\3\22\3\22\7\22\u00ed\n\22\f\22\16\22\u00f0\13\22\3\22\3\22\5\22" +
                    "\u00f4\n\22\3\23\3\23\3\23\3\23\7\23\u00fa\n\23\f\23\16\23\u00fd\13\23" +
                    "\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0108\n\25\f\25\16" +
                    "\25\u010b\13\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0113\n\26\f\26\16" +
                    "\26\u0116\13\26\3\26\3\26\3\26\5\26\u011b\n\26\3\26\3\26\3\27\3\27\3\27" +
                    "\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36" +
                    "\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3" +
                    "(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62" +
                    "\3\62\3\63\3\63\3\u0114\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13" +
                    "\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61" +
                    "\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[" +
                    "\2]\2_\2a\2c\2e\2\3\2\'\3\2$$\3\2bb\3\2__\7\2,,\60\60C\\aac|\b\2,,\60" +
                    "\60\62;C\\aac|\4\2--//\5\2&&<<BB\3\2))\4\2\f\f\17\17\5\2\13\r\17\17\"" +
                    "\"\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2" +
                    "JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4" +
                    "\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{" +
                    "{\4\2\\\\||\2\u0159\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2" +
                    "\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3" +
                    "\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2" +
                    "\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2" +
                    "\2-\3\2\2\2\2/\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13" +
                    "p\3\2\2\2\rw\3\2\2\2\17|\3\2\2\2\21\u0083\3\2\2\2\23\u0088\3\2\2\2\25" +
                    "\u008c\3\2\2\2\27\u0091\3\2\2\2\31\u0093\3\2\2\2\33\u0095\3\2\2\2\35\u0097" +
                    "\3\2\2\2\37\u00bc\3\2\2\2!\u00e8\3\2\2\2#\u00f3\3\2\2\2%\u00f5\3\2\2\2" +
                    "\'\u0100\3\2\2\2)\u0103\3\2\2\2+\u010e\3\2\2\2-\u011e\3\2\2\2/\u0122\3" +
                    "\2\2\2\61\u0124\3\2\2\2\63\u0126\3\2\2\2\65\u0128\3\2\2\2\67\u012a\3\2" +
                    "\2\29\u012c\3\2\2\2;\u012e\3\2\2\2=\u0130\3\2\2\2?\u0132\3\2\2\2A\u0134" +
                    "\3\2\2\2C\u0136\3\2\2\2E\u0138\3\2\2\2G\u013a\3\2\2\2I\u013c\3\2\2\2K" +
                    "\u013e\3\2\2\2M\u0140\3\2\2\2O\u0142\3\2\2\2Q\u0144\3\2\2\2S\u0146\3\2" +
                    "\2\2U\u0148\3\2\2\2W\u014a\3\2\2\2Y\u014c\3\2\2\2[\u014e\3\2\2\2]\u0150" +
                    "\3\2\2\2_\u0152\3\2\2\2a\u0154\3\2\2\2c\u0156\3\2\2\2e\u0158\3\2\2\2g" +
                    "h\7/\2\2h\4\3\2\2\2ij\7*\2\2j\6\3\2\2\2kl\7+\2\2l\b\3\2\2\2mn\5W,\2no" +
                    "\5\67\34\2o\n\3\2\2\2pq\5G$\2qr\5;\36\2rs\5c\62\2st\5K&\2tu\5\63\32\2" +
                    "uv\5Q)\2v\f\3\2\2\2wx\5;\36\2xy\5a\61\2yz\5C\"\2z{\5Y-\2{\16\3\2\2\2|" +
                    "}\5I%\2}~\5O(\2~\177\5? \2\177\u0080\5O(\2\u0080\u0081\5[.\2\u0081\u0082" +
                    "\5Y-\2\u0082\20\3\2\2\2\u0083\u0084\5S*\2\u0084\u0085\5[.\2\u0085\u0086" +
                    "\5C\"\2\u0086\u0087\5Y-\2\u0087\22\3\2\2\2\u0088\u0089\5\67\34\2\u0089" +
                    "\u008a\5I%\2\u008a\u008b\5W,\2\u008b\24\3\2\2\2\u008c\u008d\5A!\2\u008d" +
                    "\u008e\5;\36\2\u008e\u008f\5I%\2\u008f\u0090\5Q)\2\u0090\26\3\2\2\2\u0091" +
                    "\u0092\5A!\2\u0092\30\3\2\2\2\u0093\u0094\59\35\2\u0094\32\3\2\2\2\u0095" +
                    "\u0096\5=\37\2\u0096\34\3\2\2\2\u0097\u0098\5;\36\2\u0098\36\3\2\2\2\u0099" +
                    "\u009f\7$\2\2\u009a\u009e\n\2\2\2\u009b\u009c\7$\2\2\u009c\u009e\7$\2" +
                    "\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d" +
                    "\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2" +
                    "\u00bd\7$\2\2\u00a3\u00a9\7b\2\2\u00a4\u00a8\n\3\2\2\u00a5\u00a6\7b\2" +
                    "\2\u00a6\u00a8\7b\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab" +
                    "\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab" +
                    "\u00a9\3\2\2\2\u00ac\u00bd\7b\2\2\u00ad\u00b1\7]\2\2\u00ae\u00b0\n\4\2" +
                    "\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2" +
                    "\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00bd\7_\2\2\u00b5" +
                    "\u00b9\t\5\2\2\u00b6\u00b8\t\6\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2" +
                    "\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb" +
                    "\u00b9\3\2\2\2\u00bc\u0099\3\2\2\2\u00bc\u00a3\3\2\2\2\u00bc\u00ad\3\2" +
                    "\2\2\u00bc\u00b5\3\2\2\2\u00bd \3\2\2\2\u00be\u00c0\5\61\31\2\u00bf\u00be" +
                    "\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2" +
                    "\u00ca\3\2\2\2\u00c3\u00c7\7\60\2\2\u00c4\u00c6\5\61\31\2\u00c5\u00c4" +
                    "\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8" +
                    "\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00c3\3\2\2\2\u00ca\u00cb\3\2" +
                    "\2\2\u00cb\u00d5\3\2\2\2\u00cc\u00ce\5;\36\2\u00cd\u00cf\t\7\2\2\u00ce" +
                    "\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00d2\5\61" +
                    "\31\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3" +
                    "\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00d6\3\2" +
                    "\2\2\u00d6\u00e9\3\2\2\2\u00d7\u00d9\7\60\2\2\u00d8\u00da\5\61\31\2\u00d9" +
                    "\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2" +
                    "\2\2\u00dc\u00e6\3\2\2\2\u00dd\u00df\5;\36\2\u00de\u00e0\t\7\2\2\u00df" +
                    "\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00e3\5\61" +
                    "\31\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4" +
                    "\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00e7\3\2" +
                    "\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00bf\3\2\2\2\u00e8\u00d7\3\2\2\2\u00e9" +
                    "\"\3\2\2\2\u00ea\u00ee\7A\2\2\u00eb\u00ed\5\61\31\2\u00ec\u00eb\3\2\2" +
                    "\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f4" +
                    "\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\t\b\2\2\u00f2\u00f4\5\37\20\2" +
                    "\u00f3\u00ea\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4$\3\2\2\2\u00f5\u00fb\7" +
                    ")\2\2\u00f6\u00fa\n\t\2\2\u00f7\u00f8\7)\2\2\u00f8\u00fa\7)\2\2\u00f9" +
                    "\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2" +
                    "\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe" +
                    "\u00ff\7)\2\2\u00ff&\3\2\2\2\u0100\u0101\5a\61\2\u0101\u0102\5%\23\2\u0102" +
                    "(\3\2\2\2\u0103\u0104\7/\2\2\u0104\u0105\7/\2\2\u0105\u0109\3\2\2\2\u0106" +
                    "\u0108\n\n\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2" +
                    "\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c" +
                    "\u010d\b\25\2\2\u010d*\3\2\2\2\u010e\u010f\7\61\2\2\u010f\u0110\7,\2\2" +
                    "\u0110\u0114\3\2\2\2\u0111\u0113\13\2\2\2\u0112\u0111\3\2\2\2\u0113\u0116" +
                    "\3\2\2\2\u0114\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u011a\3\2\2\2\u0116" +
                    "\u0114\3\2\2\2\u0117\u0118\7,\2\2\u0118\u011b\7\61\2\2\u0119\u011b\7\2" +
                    "\2\3\u011a\u0117\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c" +
                    "\u011d\b\26\2\2\u011d,\3\2\2\2\u011e\u011f\t\13\2\2\u011f\u0120\3\2\2" +
                    "\2\u0120\u0121\b\27\2\2\u0121.\3\2\2\2\u0122\u0123\13\2\2\2\u0123\60\3" +
                    "\2\2\2\u0124\u0125\t\f\2\2\u0125\62\3\2\2\2\u0126\u0127\t\r\2\2\u0127" +
                    "\64\3\2\2\2\u0128\u0129\t\16\2\2\u0129\66\3\2\2\2\u012a\u012b\t\17\2\2" +
                    "\u012b8\3\2\2\2\u012c\u012d\t\20\2\2\u012d:\3\2\2\2\u012e\u012f\t\21\2" +
                    "\2\u012f<\3\2\2\2\u0130\u0131\t\22\2\2\u0131>\3\2\2\2\u0132\u0133\t\23" +
                    "\2\2\u0133@\3\2\2\2\u0134\u0135\t\24\2\2\u0135B\3\2\2\2\u0136\u0137\t" +
                    "\25\2\2\u0137D\3\2\2\2\u0138\u0139\t\26\2\2\u0139F\3\2\2\2\u013a\u013b" +
                    "\t\27\2\2\u013bH\3\2\2\2\u013c\u013d\t\30\2\2\u013dJ\3\2\2\2\u013e\u013f" +
                    "\t\31\2\2\u013fL\3\2\2\2\u0140\u0141\t\32\2\2\u0141N\3\2\2\2\u0142\u0143" +
                    "\t\33\2\2\u0143P\3\2\2\2\u0144\u0145\t\34\2\2\u0145R\3\2\2\2\u0146\u0147" +
                    "\t\35\2\2\u0147T\3\2\2\2\u0148\u0149\t\36\2\2\u0149V\3\2\2\2\u014a\u014b" +
                    "\t\37\2\2\u014bX\3\2\2\2\u014c\u014d\t \2\2\u014dZ\3\2\2\2\u014e\u014f" +
                    "\t!\2\2\u014f\\\3\2\2\2\u0150\u0151\t\"\2\2\u0151^\3\2\2\2\u0152\u0153" +
                    "\t#\2\2\u0153`\3\2\2\2\u0154\u0155\t$\2\2\u0155b\3\2\2\2\u0156\u0157\t" +
                    "%\2\2\u0157d\3\2\2\2\u0158\u0159\t&\2\2\u0159f\3\2\2\2\34\2\u009d\u009f" +
                    "\u00a7\u00a9\u00b1\u00b9\u00bc\u00c1\u00c7\u00ca\u00ce\u00d3\u00d5\u00db" +
                    "\u00df\u00e4\u00e6\u00e8\u00ee\u00f3\u00f9\u00fb\u0109\u0114\u011a\3\2" +
                    "\3\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}