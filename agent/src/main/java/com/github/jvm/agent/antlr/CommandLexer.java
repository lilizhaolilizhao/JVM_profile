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
            IDENTIFIER = 12, NUMERIC_LITERAL = 13, BIND_PARAMETER = 14, STRING_LITERAL = 15,
            BLOB_LITERAL = 16, SINGLE_LINE_COMMENT = 17, MULTILINE_COMMENT = 18, SPACES = 19,
            UNEXPECTED_CHAR = 20;
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
                "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL",
                "BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES",
                "UNEXPECTED_CHAR", "DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I",
                "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
                "X", "Y", "Z"
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
                "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL",
                "BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES",
                "UNEXPECTED_CHAR"
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u014e\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
                    " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t" +
                    "+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3" +
                    "\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b" +
                    "\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13" +
                    "\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u0092\n\r\f\r\16\r\u0095\13\r\3\r\3\r\3\r" +
                    "\3\r\3\r\7\r\u009c\n\r\f\r\16\r\u009f\13\r\3\r\3\r\3\r\7\r\u00a4\n\r\f" +
                    "\r\16\r\u00a7\13\r\3\r\3\r\3\r\7\r\u00ac\n\r\f\r\16\r\u00af\13\r\5\r\u00b1" +
                    "\n\r\3\16\6\16\u00b4\n\16\r\16\16\16\u00b5\3\16\3\16\7\16\u00ba\n\16\f" +
                    "\16\16\16\u00bd\13\16\5\16\u00bf\n\16\3\16\3\16\5\16\u00c3\n\16\3\16\6" +
                    "\16\u00c6\n\16\r\16\16\16\u00c7\5\16\u00ca\n\16\3\16\3\16\6\16\u00ce\n" +
                    "\16\r\16\16\16\u00cf\3\16\3\16\5\16\u00d4\n\16\3\16\6\16\u00d7\n\16\r" +
                    "\16\16\16\u00d8\5\16\u00db\n\16\5\16\u00dd\n\16\3\17\3\17\7\17\u00e1\n" +
                    "\17\f\17\16\17\u00e4\13\17\3\17\3\17\5\17\u00e8\n\17\3\20\3\20\3\20\3" +
                    "\20\7\20\u00ee\n\20\f\20\16\20\u00f1\13\20\3\20\3\20\3\21\3\21\3\21\3" +
                    "\22\3\22\3\22\3\22\7\22\u00fc\n\22\f\22\16\22\u00ff\13\22\3\22\3\22\3" +
                    "\23\3\23\3\23\3\23\7\23\u0107\n\23\f\23\16\23\u010a\13\23\3\23\3\23\3" +
                    "\23\5\23\u010f\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26" +
                    "\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35" +
                    "\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3" +
                    "\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\u0108\2" +
                    "\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35" +
                    "\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?" +
                    "\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2\3\2\'\3\2$$\3\2bb\3" +
                    "\2__\7\2,,\60\60C\\aac|\b\2,,\60\60\62;C\\aac|\4\2--//\5\2&&<<BB\3\2)" +
                    ")\4\2\f\f\17\17\5\2\13\r\17\17\"\"\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2" +
                    "FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4" +
                    "\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWw" +
                    "w\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u014d\2\3\3\2\2\2\2\5\3" +
                    "\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2" +
                    "\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3" +
                    "\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'" +
                    "\3\2\2\2\2)\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13j\3" +
                    "\2\2\2\rq\3\2\2\2\17v\3\2\2\2\21}\3\2\2\2\23\u0082\3\2\2\2\25\u0086\3" +
                    "\2\2\2\27\u008b\3\2\2\2\31\u00b0\3\2\2\2\33\u00dc\3\2\2\2\35\u00e7\3\2" +
                    "\2\2\37\u00e9\3\2\2\2!\u00f4\3\2\2\2#\u00f7\3\2\2\2%\u0102\3\2\2\2\'\u0112" +
                    "\3\2\2\2)\u0116\3\2\2\2+\u0118\3\2\2\2-\u011a\3\2\2\2/\u011c\3\2\2\2\61" +
                    "\u011e\3\2\2\2\63\u0120\3\2\2\2\65\u0122\3\2\2\2\67\u0124\3\2\2\29\u0126" +
                    "\3\2\2\2;\u0128\3\2\2\2=\u012a\3\2\2\2?\u012c\3\2\2\2A\u012e\3\2\2\2C" +
                    "\u0130\3\2\2\2E\u0132\3\2\2\2G\u0134\3\2\2\2I\u0136\3\2\2\2K\u0138\3\2" +
                    "\2\2M\u013a\3\2\2\2O\u013c\3\2\2\2Q\u013e\3\2\2\2S\u0140\3\2\2\2U\u0142" +
                    "\3\2\2\2W\u0144\3\2\2\2Y\u0146\3\2\2\2[\u0148\3\2\2\2]\u014a\3\2\2\2_" +
                    "\u014c\3\2\2\2ab\7/\2\2b\4\3\2\2\2cd\7*\2\2d\6\3\2\2\2ef\7+\2\2f\b\3\2" +
                    "\2\2gh\5Q)\2hi\5\61\31\2i\n\3\2\2\2jk\5A!\2kl\5\65\33\2lm\5]/\2mn\5E#" +
                    "\2no\5-\27\2op\5K&\2p\f\3\2\2\2qr\5\65\33\2rs\5[.\2st\5=\37\2tu\5S*\2" +
                    "u\16\3\2\2\2vw\5C\"\2wx\5I%\2xy\59\35\2yz\5I%\2z{\5U+\2{|\5S*\2|\20\3" +
                    "\2\2\2}~\5M\'\2~\177\5U+\2\177\u0080\5=\37\2\u0080\u0081\5S*\2\u0081\22" +
                    "\3\2\2\2\u0082\u0083\5\61\31\2\u0083\u0084\5C\"\2\u0084\u0085\5Q)\2\u0085" +
                    "\24\3\2\2\2\u0086\u0087\5;\36\2\u0087\u0088\5\65\33\2\u0088\u0089\5C\"" +
                    "\2\u0089\u008a\5K&\2\u008a\26\3\2\2\2\u008b\u008c\5;\36\2\u008c\30\3\2" +
                    "\2\2\u008d\u0093\7$\2\2\u008e\u0092\n\2\2\2\u008f\u0090\7$\2\2\u0090\u0092" +
                    "\7$\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093" +
                    "\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2" +
                    "\2\2\u0096\u00b1\7$\2\2\u0097\u009d\7b\2\2\u0098\u009c\n\3\2\2\u0099\u009a" +
                    "\7b\2\2\u009a\u009c\7b\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009c" +
                    "\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2" +
                    "\2\2\u009f\u009d\3\2\2\2\u00a0\u00b1\7b\2\2\u00a1\u00a5\7]\2\2\u00a2\u00a4" +
                    "\n\4\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5" +
                    "\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00b1\7_" +
                    "\2\2\u00a9\u00ad\t\5\2\2\u00aa\u00ac\t\6\2\2\u00ab\u00aa\3\2\2\2\u00ac" +
                    "\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2" +
                    "\2\2\u00af\u00ad\3\2\2\2\u00b0\u008d\3\2\2\2\u00b0\u0097\3\2\2\2\u00b0" +
                    "\u00a1\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b1\32\3\2\2\2\u00b2\u00b4\5+\26" +
                    "\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6" +
                    "\3\2\2\2\u00b6\u00be\3\2\2\2\u00b7\u00bb\7\60\2\2\u00b8\u00ba\5+\26\2" +
                    "\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc" +
                    "\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b7\3\2\2\2\u00be" +
                    "\u00bf\3\2\2\2\u00bf\u00c9\3\2\2\2\u00c0\u00c2\5\65\33\2\u00c1\u00c3\t" +
                    "\7\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4" +
                    "\u00c6\5+\26\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2" +
                    "\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9" +
                    "\u00ca\3\2\2\2\u00ca\u00dd\3\2\2\2\u00cb\u00cd\7\60\2\2\u00cc\u00ce\5" +
                    "+\26\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf" +
                    "\u00d0\3\2\2\2\u00d0\u00da\3\2\2\2\u00d1\u00d3\5\65\33\2\u00d2\u00d4\t" +
                    "\7\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5" +
                    "\u00d7\5+\26\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2" +
                    "\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d1\3\2\2\2\u00da" +
                    "\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00b3\3\2\2\2\u00dc\u00cb\3\2" +
                    "\2\2\u00dd\34\3\2\2\2\u00de\u00e2\7A\2\2\u00df\u00e1\5+\26\2\u00e0\u00df" +
                    "\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3" +
                    "\u00e8\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\t\b\2\2\u00e6\u00e8\5\31" +
                    "\r\2\u00e7\u00de\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\36\3\2\2\2\u00e9\u00ef" +
                    "\7)\2\2\u00ea\u00ee\n\t\2\2\u00eb\u00ec\7)\2\2\u00ec\u00ee\7)\2\2\u00ed" +
                    "\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2" +
                    "\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2" +
                    "\u00f3\7)\2\2\u00f3 \3\2\2\2\u00f4\u00f5\5[.\2\u00f5\u00f6\5\37\20\2\u00f6" +
                    "\"\3\2\2\2\u00f7\u00f8\7/\2\2\u00f8\u00f9\7/\2\2\u00f9\u00fd\3\2\2\2\u00fa" +
                    "\u00fc\n\n\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2" +
                    "\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100" +
                    "\u0101\b\22\2\2\u0101$\3\2\2\2\u0102\u0103\7\61\2\2\u0103\u0104\7,\2\2" +
                    "\u0104\u0108\3\2\2\2\u0105\u0107\13\2\2\2\u0106\u0105\3\2\2\2\u0107\u010a" +
                    "\3\2\2\2\u0108\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010e\3\2\2\2\u010a" +
                    "\u0108\3\2\2\2\u010b\u010c\7,\2\2\u010c\u010f\7\61\2\2\u010d\u010f\7\2" +
                    "\2\3\u010e\u010b\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110" +
                    "\u0111\b\23\2\2\u0111&\3\2\2\2\u0112\u0113\t\13\2\2\u0113\u0114\3\2\2" +
                    "\2\u0114\u0115\b\24\2\2\u0115(\3\2\2\2\u0116\u0117\13\2\2\2\u0117*\3\2" +
                    "\2\2\u0118\u0119\t\f\2\2\u0119,\3\2\2\2\u011a\u011b\t\r\2\2\u011b.\3\2" +
                    "\2\2\u011c\u011d\t\16\2\2\u011d\60\3\2\2\2\u011e\u011f\t\17\2\2\u011f" +
                    "\62\3\2\2\2\u0120\u0121\t\20\2\2\u0121\64\3\2\2\2\u0122\u0123\t\21\2\2" +
                    "\u0123\66\3\2\2\2\u0124\u0125\t\22\2\2\u01258\3\2\2\2\u0126\u0127\t\23" +
                    "\2\2\u0127:\3\2\2\2\u0128\u0129\t\24\2\2\u0129<\3\2\2\2\u012a\u012b\t" +
                    "\25\2\2\u012b>\3\2\2\2\u012c\u012d\t\26\2\2\u012d@\3\2\2\2\u012e\u012f" +
                    "\t\27\2\2\u012fB\3\2\2\2\u0130\u0131\t\30\2\2\u0131D\3\2\2\2\u0132\u0133" +
                    "\t\31\2\2\u0133F\3\2\2\2\u0134\u0135\t\32\2\2\u0135H\3\2\2\2\u0136\u0137" +
                    "\t\33\2\2\u0137J\3\2\2\2\u0138\u0139\t\34\2\2\u0139L\3\2\2\2\u013a\u013b" +
                    "\t\35\2\2\u013bN\3\2\2\2\u013c\u013d\t\36\2\2\u013dP\3\2\2\2\u013e\u013f" +
                    "\t\37\2\2\u013fR\3\2\2\2\u0140\u0141\t \2\2\u0141T\3\2\2\2\u0142\u0143" +
                    "\t!\2\2\u0143V\3\2\2\2\u0144\u0145\t\"\2\2\u0145X\3\2\2\2\u0146\u0147" +
                    "\t#\2\2\u0147Z\3\2\2\2\u0148\u0149\t$\2\2\u0149\\\3\2\2\2\u014a\u014b" +
                    "\t%\2\2\u014b^\3\2\2\2\u014c\u014d\t&\2\2\u014d`\3\2\2\2\34\2\u0091\u0093" +
                    "\u009b\u009d\u00a5\u00ad\u00b0\u00b5\u00bb\u00be\u00c2\u00c7\u00c9\u00cf" +
                    "\u00d3\u00d8\u00da\u00dc\u00e2\u00e7\u00ed\u00ef\u00fd\u0108\u010e\3\2" +
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