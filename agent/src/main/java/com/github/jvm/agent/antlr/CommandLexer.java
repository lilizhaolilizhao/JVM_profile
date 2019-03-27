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
            DETAIL = 12, FIELD = 13, IDENTIFIER = 14, NUMERIC_LITERAL = 15, BIND_PARAMETER = 16,
            STRING_LITERAL = 17, BLOB_LITERAL = 18, SINGLE_LINE_COMMENT = 19, MULTILINE_COMMENT = 20,
            SPACES = 21, UNEXPECTED_CHAR = 22;
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
                "DETAIL", "FIELD", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER",
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
                "DETAIL", "FIELD", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER",
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0156\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
                    " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t" +
                    "+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3" +
                    "\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7" +
                    "\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13" +
                    "\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17" +
                    "\u009a\n\17\f\17\16\17\u009d\13\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a4" +
                    "\n\17\f\17\16\17\u00a7\13\17\3\17\3\17\3\17\7\17\u00ac\n\17\f\17\16\17" +
                    "\u00af\13\17\3\17\3\17\3\17\7\17\u00b4\n\17\f\17\16\17\u00b7\13\17\5\17" +
                    "\u00b9\n\17\3\20\6\20\u00bc\n\20\r\20\16\20\u00bd\3\20\3\20\7\20\u00c2" +
                    "\n\20\f\20\16\20\u00c5\13\20\5\20\u00c7\n\20\3\20\3\20\5\20\u00cb\n\20" +
                    "\3\20\6\20\u00ce\n\20\r\20\16\20\u00cf\5\20\u00d2\n\20\3\20\3\20\6\20" +
                    "\u00d6\n\20\r\20\16\20\u00d7\3\20\3\20\5\20\u00dc\n\20\3\20\6\20\u00df" +
                    "\n\20\r\20\16\20\u00e0\5\20\u00e3\n\20\5\20\u00e5\n\20\3\21\3\21\7\21" +
                    "\u00e9\n\21\f\21\16\21\u00ec\13\21\3\21\3\21\5\21\u00f0\n\21\3\22\3\22" +
                    "\3\22\3\22\7\22\u00f6\n\22\f\22\16\22\u00f9\13\22\3\22\3\22\3\23\3\23" +
                    "\3\23\3\24\3\24\3\24\3\24\7\24\u0104\n\24\f\24\16\24\u0107\13\24\3\24" +
                    "\3\24\3\25\3\25\3\25\3\25\7\25\u010f\n\25\f\25\16\25\u0112\13\25\3\25" +
                    "\3\25\3\25\5\25\u0117\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30" +
                    "\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37" +
                    "\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)" +
                    "\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\u0110" +
                    "\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35" +
                    "\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\2\67\29\2;\2=\2" +
                    "?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2\3\2\'\3\2$$" +
                    "\3\2bb\3\2__\7\2,,\60\60C\\aac|\b\2,,\60\60\62;C\\aac|\4\2--//\5\2&&<" +
                    "<BB\3\2))\4\2\f\f\17\17\5\2\13\r\17\17\"\"\3\2\62;\4\2CCcc\4\2DDdd\4\2" +
                    "EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4" +
                    "\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVv" +
                    "v\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u0155\2\3\3\2\2" +
                    "\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3" +
                    "\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2" +
                    "\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2" +
                    "\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3e\3\2\2\2\5g\3\2\2" +
                    "\2\7i\3\2\2\2\tk\3\2\2\2\13n\3\2\2\2\ru\3\2\2\2\17z\3\2\2\2\21\u0081\3" +
                    "\2\2\2\23\u0086\3\2\2\2\25\u008a\3\2\2\2\27\u008f\3\2\2\2\31\u0091\3\2" +
                    "\2\2\33\u0093\3\2\2\2\35\u00b8\3\2\2\2\37\u00e4\3\2\2\2!\u00ef\3\2\2\2" +
                    "#\u00f1\3\2\2\2%\u00fc\3\2\2\2\'\u00ff\3\2\2\2)\u010a\3\2\2\2+\u011a\3" +
                    "\2\2\2-\u011e\3\2\2\2/\u0120\3\2\2\2\61\u0122\3\2\2\2\63\u0124\3\2\2\2" +
                    "\65\u0126\3\2\2\2\67\u0128\3\2\2\29\u012a\3\2\2\2;\u012c\3\2\2\2=\u012e" +
                    "\3\2\2\2?\u0130\3\2\2\2A\u0132\3\2\2\2C\u0134\3\2\2\2E\u0136\3\2\2\2G" +
                    "\u0138\3\2\2\2I\u013a\3\2\2\2K\u013c\3\2\2\2M\u013e\3\2\2\2O\u0140\3\2" +
                    "\2\2Q\u0142\3\2\2\2S\u0144\3\2\2\2U\u0146\3\2\2\2W\u0148\3\2\2\2Y\u014a" +
                    "\3\2\2\2[\u014c\3\2\2\2]\u014e\3\2\2\2_\u0150\3\2\2\2a\u0152\3\2\2\2c" +
                    "\u0154\3\2\2\2ef\7/\2\2f\4\3\2\2\2gh\7*\2\2h\6\3\2\2\2ij\7+\2\2j\b\3\2" +
                    "\2\2kl\5U+\2lm\5\65\33\2m\n\3\2\2\2no\5E#\2op\59\35\2pq\5a\61\2qr\5I%" +
                    "\2rs\5\61\31\2st\5O(\2t\f\3\2\2\2uv\59\35\2vw\5_\60\2wx\5A!\2xy\5W,\2" +
                    "y\16\3\2\2\2z{\5G$\2{|\5M\'\2|}\5=\37\2}~\5M\'\2~\177\5Y-\2\177\u0080" +
                    "\5W,\2\u0080\20\3\2\2\2\u0081\u0082\5Q)\2\u0082\u0083\5Y-\2\u0083\u0084" +
                    "\5A!\2\u0084\u0085\5W,\2\u0085\22\3\2\2\2\u0086\u0087\5\65\33\2\u0087" +
                    "\u0088\5G$\2\u0088\u0089\5U+\2\u0089\24\3\2\2\2\u008a\u008b\5? \2\u008b" +
                    "\u008c\59\35\2\u008c\u008d\5G$\2\u008d\u008e\5O(\2\u008e\26\3\2\2\2\u008f" +
                    "\u0090\5? \2\u0090\30\3\2\2\2\u0091\u0092\5\67\34\2\u0092\32\3\2\2\2\u0093" +
                    "\u0094\5;\36\2\u0094\34\3\2\2\2\u0095\u009b\7$\2\2\u0096\u009a\n\2\2\2" +
                    "\u0097\u0098\7$\2\2\u0098\u009a\7$\2\2\u0099\u0096\3\2\2\2\u0099\u0097" +
                    "\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c" +
                    "\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00b9\7$\2\2\u009f\u00a5\7b\2" +
                    "\2\u00a0\u00a4\n\3\2\2\u00a1\u00a2\7b\2\2\u00a2\u00a4\7b\2\2\u00a3\u00a0" +
                    "\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5" +
                    "\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00b9\7b" +
                    "\2\2\u00a9\u00ad\7]\2\2\u00aa\u00ac\n\4\2\2\u00ab\u00aa\3\2\2\2\u00ac" +
                    "\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2" +
                    "\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b9\7_\2\2\u00b1\u00b5\t\5\2\2\u00b2" +
                    "\u00b4\t\6\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2" +
                    "\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8" +
                    "\u0095\3\2\2\2\u00b8\u009f\3\2\2\2\u00b8\u00a9\3\2\2\2\u00b8\u00b1\3\2" +
                    "\2\2\u00b9\36\3\2\2\2\u00ba\u00bc\5/\30\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd" +
                    "\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c6\3\2\2\2\u00bf" +
                    "\u00c3\7\60\2\2\u00c0\u00c2\5/\30\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3" +
                    "\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5" +
                    "\u00c3\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00d1\3\2" +
                    "\2\2\u00c8\u00ca\59\35\2\u00c9\u00cb\t\7\2\2\u00ca\u00c9\3\2\2\2\u00ca" +
                    "\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ce\5/\30\2\u00cd\u00cc\3\2" +
                    "\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0" +
                    "\u00d2\3\2\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00e5\3\2" +
                    "\2\2\u00d3\u00d5\7\60\2\2\u00d4\u00d6\5/\30\2\u00d5\u00d4\3\2\2\2\u00d6" +
                    "\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00e2\3\2" +
                    "\2\2\u00d9\u00db\59\35\2\u00da\u00dc\t\7\2\2\u00db\u00da\3\2\2\2\u00db" +
                    "\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00df\5/\30\2\u00de\u00dd\3\2" +
                    "\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1" +
                    "\u00e3\3\2\2\2\u00e2\u00d9\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2" +
                    "\2\2\u00e4\u00bb\3\2\2\2\u00e4\u00d3\3\2\2\2\u00e5 \3\2\2\2\u00e6\u00ea" +
                    "\7A\2\2\u00e7\u00e9\5/\30\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea" +
                    "\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f0\3\2\2\2\u00ec\u00ea\3\2" +
                    "\2\2\u00ed\u00ee\t\b\2\2\u00ee\u00f0\5\35\17\2\u00ef\u00e6\3\2\2\2\u00ef" +
                    "\u00ed\3\2\2\2\u00f0\"\3\2\2\2\u00f1\u00f7\7)\2\2\u00f2\u00f6\n\t\2\2" +
                    "\u00f3\u00f4\7)\2\2\u00f4\u00f6\7)\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3" +
                    "\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8" +
                    "\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7)\2\2\u00fb$\3\2\2\2\u00fc" +
                    "\u00fd\5_\60\2\u00fd\u00fe\5#\22\2\u00fe&\3\2\2\2\u00ff\u0100\7/\2\2\u0100" +
                    "\u0101\7/\2\2\u0101\u0105\3\2\2\2\u0102\u0104\n\n\2\2\u0103\u0102\3\2" +
                    "\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106" +
                    "\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\b\24\2\2\u0109(\3\2\2\2" +
                    "\u010a\u010b\7\61\2\2\u010b\u010c\7,\2\2\u010c\u0110\3\2\2\2\u010d\u010f" +
                    "\13\2\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u0111\3\2\2\2" +
                    "\u0110\u010e\3\2\2\2\u0111\u0116\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114" +
                    "\7,\2\2\u0114\u0117\7\61\2\2\u0115\u0117\7\2\2\3\u0116\u0113\3\2\2\2\u0116" +
                    "\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\b\25\2\2\u0119*\3\2\2\2" +
                    "\u011a\u011b\t\13\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b\26\2\2\u011d," +
                    "\3\2\2\2\u011e\u011f\13\2\2\2\u011f.\3\2\2\2\u0120\u0121\t\f\2\2\u0121" +
                    "\60\3\2\2\2\u0122\u0123\t\r\2\2\u0123\62\3\2\2\2\u0124\u0125\t\16\2\2" +
                    "\u0125\64\3\2\2\2\u0126\u0127\t\17\2\2\u0127\66\3\2\2\2\u0128\u0129\t" +
                    "\20\2\2\u01298\3\2\2\2\u012a\u012b\t\21\2\2\u012b:\3\2\2\2\u012c\u012d" +
                    "\t\22\2\2\u012d<\3\2\2\2\u012e\u012f\t\23\2\2\u012f>\3\2\2\2\u0130\u0131" +
                    "\t\24\2\2\u0131@\3\2\2\2\u0132\u0133\t\25\2\2\u0133B\3\2\2\2\u0134\u0135" +
                    "\t\26\2\2\u0135D\3\2\2\2\u0136\u0137\t\27\2\2\u0137F\3\2\2\2\u0138\u0139" +
                    "\t\30\2\2\u0139H\3\2\2\2\u013a\u013b\t\31\2\2\u013bJ\3\2\2\2\u013c\u013d" +
                    "\t\32\2\2\u013dL\3\2\2\2\u013e\u013f\t\33\2\2\u013fN\3\2\2\2\u0140\u0141" +
                    "\t\34\2\2\u0141P\3\2\2\2\u0142\u0143\t\35\2\2\u0143R\3\2\2\2\u0144\u0145" +
                    "\t\36\2\2\u0145T\3\2\2\2\u0146\u0147\t\37\2\2\u0147V\3\2\2\2\u0148\u0149" +
                    "\t \2\2\u0149X\3\2\2\2\u014a\u014b\t!\2\2\u014bZ\3\2\2\2\u014c\u014d\t" +
                    "\"\2\2\u014d\\\3\2\2\2\u014e\u014f\t#\2\2\u014f^\3\2\2\2\u0150\u0151\t" +
                    "$\2\2\u0151`\3\2\2\2\u0152\u0153\t%\2\2\u0153b\3\2\2\2\u0154\u0155\t&" +
                    "\2\2\u0155d\3\2\2\2\34\2\u0099\u009b\u00a3\u00a5\u00ad\u00b5\u00b8\u00bd" +
                    "\u00c3\u00c6\u00ca\u00cf\u00d1\u00d7\u00db\u00e0\u00e2\u00e4\u00ea\u00ef" +
                    "\u00f5\u00f7\u0105\u0110\u0116\3\2\3\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}