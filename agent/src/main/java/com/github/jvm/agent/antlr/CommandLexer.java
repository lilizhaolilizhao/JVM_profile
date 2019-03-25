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
            T__0 = 1, SC_COMMAND = 2, KEYMAP_COMMAND = 3, EXIT_COMMAND = 4, LOGOUT_COMMAND = 5,
            QUIT_COMMAND = 6, CLS_COMMAND = 7, HELP_COMMAND = 8, IDENTIFIER = 9, NUMERIC_LITERAL = 10,
            BIND_PARAMETER = 11, STRING_LITERAL = 12, BLOB_LITERAL = 13, SINGLE_LINE_COMMENT = 14,
            MULTILINE_COMMENT = 15, SPACES = 16, UNEXPECTED_CHAR = 17;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "SC_COMMAND", "KEYMAP_COMMAND", "EXIT_COMMAND", "LOGOUT_COMMAND",
                "QUIT_COMMAND", "CLS_COMMAND", "HELP_COMMAND", "IDENTIFIER", "NUMERIC_LITERAL",
                "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT",
                "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR", "DIGIT", "A", "B",
                "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
                "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'-'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, "SC_COMMAND", "KEYMAP_COMMAND", "EXIT_COMMAND", "LOGOUT_COMMAND",
                "QUIT_COMMAND", "CLS_COMMAND", "HELP_COMMAND", "IDENTIFIER", "NUMERIC_LITERAL",
                "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT",
                "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0142\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
                    " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t" +
                    "+\4,\t,\4-\t-\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5" +
                    "\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3" +
                    "\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0086\n\n\f\n\16\n\u0089" +
                    "\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u0090\n\n\f\n\16\n\u0093\13\n\3\n\3\n\3" +
                    "\n\7\n\u0098\n\n\f\n\16\n\u009b\13\n\3\n\3\n\3\n\7\n\u00a0\n\n\f\n\16" +
                    "\n\u00a3\13\n\5\n\u00a5\n\n\3\13\6\13\u00a8\n\13\r\13\16\13\u00a9\3\13" +
                    "\3\13\7\13\u00ae\n\13\f\13\16\13\u00b1\13\13\5\13\u00b3\n\13\3\13\3\13" +
                    "\5\13\u00b7\n\13\3\13\6\13\u00ba\n\13\r\13\16\13\u00bb\5\13\u00be\n\13" +
                    "\3\13\3\13\6\13\u00c2\n\13\r\13\16\13\u00c3\3\13\3\13\5\13\u00c8\n\13" +
                    "\3\13\6\13\u00cb\n\13\r\13\16\13\u00cc\5\13\u00cf\n\13\5\13\u00d1\n\13" +
                    "\3\f\3\f\7\f\u00d5\n\f\f\f\16\f\u00d8\13\f\3\f\3\f\5\f\u00dc\n\f\3\r\3" +
                    "\r\3\r\3\r\7\r\u00e2\n\r\f\r\16\r\u00e5\13\r\3\r\3\r\3\16\3\16\3\16\3" +
                    "\17\3\17\3\17\3\17\7\17\u00f0\n\17\f\17\16\17\u00f3\13\17\3\17\3\17\3" +
                    "\20\3\20\3\20\3\20\7\20\u00fb\n\20\f\20\16\20\u00fe\13\20\3\20\3\20\3" +
                    "\20\5\20\u0103\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23" +
                    "\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32" +
                    "\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"" +
                    "\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3" +
                    "\u00fc\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33" +
                    "\17\35\20\37\21!\22#\23%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=" +
                    "\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2\3\2\'\3\2$$\3\2bb\3\2__\5" +
                    "\2C\\aac|\6\2\62;C\\aac|\4\2--//\5\2&&<<BB\3\2))\4\2\f\f\17\17\5\2\13" +
                    "\r\17\17\"\"\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4" +
                    "\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQq" +
                    "q\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2" +
                    "ZZzz\4\2[[{{\4\2\\\\||\2\u0141\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t" +
                    "\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2" +
                    "\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2" +
                    "\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7`\3\2\2\2\tg" +
                    "\3\2\2\2\13l\3\2\2\2\rs\3\2\2\2\17x\3\2\2\2\21|\3\2\2\2\23\u00a4\3\2\2" +
                    "\2\25\u00d0\3\2\2\2\27\u00db\3\2\2\2\31\u00dd\3\2\2\2\33\u00e8\3\2\2\2" +
                    "\35\u00eb\3\2\2\2\37\u00f6\3\2\2\2!\u0106\3\2\2\2#\u010a\3\2\2\2%\u010c" +
                    "\3\2\2\2\'\u010e\3\2\2\2)\u0110\3\2\2\2+\u0112\3\2\2\2-\u0114\3\2\2\2" +
                    "/\u0116\3\2\2\2\61\u0118\3\2\2\2\63\u011a\3\2\2\2\65\u011c\3\2\2\2\67" +
                    "\u011e\3\2\2\29\u0120\3\2\2\2;\u0122\3\2\2\2=\u0124\3\2\2\2?\u0126\3\2" +
                    "\2\2A\u0128\3\2\2\2C\u012a\3\2\2\2E\u012c\3\2\2\2G\u012e\3\2\2\2I\u0130" +
                    "\3\2\2\2K\u0132\3\2\2\2M\u0134\3\2\2\2O\u0136\3\2\2\2Q\u0138\3\2\2\2S" +
                    "\u013a\3\2\2\2U\u013c\3\2\2\2W\u013e\3\2\2\2Y\u0140\3\2\2\2[\\\7/\2\2" +
                    "\\\4\3\2\2\2]^\5K&\2^_\5+\26\2_\6\3\2\2\2`a\5;\36\2ab\5/\30\2bc\5W,\2" +
                    "cd\5? \2de\5\'\24\2ef\5E#\2f\b\3\2\2\2gh\5/\30\2hi\5U+\2ij\5\67\34\2j" +
                    "k\5M\'\2k\n\3\2\2\2lm\5=\37\2mn\5C\"\2no\5\63\32\2op\5C\"\2pq\5O(\2qr" +
                    "\5M\'\2r\f\3\2\2\2st\5G$\2tu\5O(\2uv\5\67\34\2vw\5M\'\2w\16\3\2\2\2xy" +
                    "\5+\26\2yz\5=\37\2z{\5K&\2{\20\3\2\2\2|}\5\65\33\2}~\5/\30\2~\177\5=\37" +
                    "\2\177\u0080\5E#\2\u0080\22\3\2\2\2\u0081\u0087\7$\2\2\u0082\u0086\n\2" +
                    "\2\2\u0083\u0084\7$\2\2\u0084\u0086\7$\2\2\u0085\u0082\3\2\2\2\u0085\u0083" +
                    "\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088" +
                    "\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u00a5\7$\2\2\u008b\u0091\7b\2" +
                    "\2\u008c\u0090\n\3\2\2\u008d\u008e\7b\2\2\u008e\u0090\7b\2\2\u008f\u008c" +
                    "\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091" +
                    "\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u00a5\7b" +
                    "\2\2\u0095\u0099\7]\2\2\u0096\u0098\n\4\2\2\u0097\u0096\3\2\2\2\u0098" +
                    "\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2" +
                    "\2\2\u009b\u0099\3\2\2\2\u009c\u00a5\7_\2\2\u009d\u00a1\t\5\2\2\u009e" +
                    "\u00a0\t\6\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2" +
                    "\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4" +
                    "\u0081\3\2\2\2\u00a4\u008b\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4\u009d\3\2" +
                    "\2\2\u00a5\24\3\2\2\2\u00a6\u00a8\5%\23\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9" +
                    "\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b2\3\2\2\2\u00ab" +
                    "\u00af\7\60\2\2\u00ac\u00ae\5%\23\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3" +
                    "\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1" +
                    "\u00af\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00bd\3\2" +
                    "\2\2\u00b4\u00b6\5/\30\2\u00b5\u00b7\t\7\2\2\u00b6\u00b5\3\2\2\2\u00b6" +
                    "\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00ba\5%\23\2\u00b9\u00b8\3\2" +
                    "\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc" +
                    "\u00be\3\2\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00d1\3\2" +
                    "\2\2\u00bf\u00c1\7\60\2\2\u00c0\u00c2\5%\23\2\u00c1\u00c0\3\2\2\2\u00c2" +
                    "\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00ce\3\2" +
                    "\2\2\u00c5\u00c7\5/\30\2\u00c6\u00c8\t\7\2\2\u00c7\u00c6\3\2\2\2\u00c7" +
                    "\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00cb\5%\23\2\u00ca\u00c9\3\2" +
                    "\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd" +
                    "\u00cf\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2" +
                    "\2\2\u00d0\u00a7\3\2\2\2\u00d0\u00bf\3\2\2\2\u00d1\26\3\2\2\2\u00d2\u00d6" +
                    "\7A\2\2\u00d3\u00d5\5%\23\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6" +
                    "\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00dc\3\2\2\2\u00d8\u00d6\3\2" +
                    "\2\2\u00d9\u00da\t\b\2\2\u00da\u00dc\5\23\n\2\u00db\u00d2\3\2\2\2\u00db" +
                    "\u00d9\3\2\2\2\u00dc\30\3\2\2\2\u00dd\u00e3\7)\2\2\u00de\u00e2\n\t\2\2" +
                    "\u00df\u00e0\7)\2\2\u00e0\u00e2\7)\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df" +
                    "\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4" +
                    "\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7)\2\2\u00e7\32\3\2\2\2" +
                    "\u00e8\u00e9\5U+\2\u00e9\u00ea\5\31\r\2\u00ea\34\3\2\2\2\u00eb\u00ec\7" +
                    "/\2\2\u00ec\u00ed\7/\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00f0\n\n\2\2\u00ef" +
                    "\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2" +
                    "\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\b\17\2\2\u00f5" +
                    "\36\3\2\2\2\u00f6\u00f7\7\61\2\2\u00f7\u00f8\7,\2\2\u00f8\u00fc\3\2\2" +
                    "\2\u00f9\u00fb\13\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc" +
                    "\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0102\3\2\2\2\u00fe\u00fc\3\2" +
                    "\2\2\u00ff\u0100\7,\2\2\u0100\u0103\7\61\2\2\u0101\u0103\7\2\2\3\u0102" +
                    "\u00ff\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b\20" +
                    "\2\2\u0105 \3\2\2\2\u0106\u0107\t\13\2\2\u0107\u0108\3\2\2\2\u0108\u0109" +
                    "\b\21\2\2\u0109\"\3\2\2\2\u010a\u010b\13\2\2\2\u010b$\3\2\2\2\u010c\u010d" +
                    "\t\f\2\2\u010d&\3\2\2\2\u010e\u010f\t\r\2\2\u010f(\3\2\2\2\u0110\u0111" +
                    "\t\16\2\2\u0111*\3\2\2\2\u0112\u0113\t\17\2\2\u0113,\3\2\2\2\u0114\u0115" +
                    "\t\20\2\2\u0115.\3\2\2\2\u0116\u0117\t\21\2\2\u0117\60\3\2\2\2\u0118\u0119" +
                    "\t\22\2\2\u0119\62\3\2\2\2\u011a\u011b\t\23\2\2\u011b\64\3\2\2\2\u011c" +
                    "\u011d\t\24\2\2\u011d\66\3\2\2\2\u011e\u011f\t\25\2\2\u011f8\3\2\2\2\u0120" +
                    "\u0121\t\26\2\2\u0121:\3\2\2\2\u0122\u0123\t\27\2\2\u0123<\3\2\2\2\u0124" +
                    "\u0125\t\30\2\2\u0125>\3\2\2\2\u0126\u0127\t\31\2\2\u0127@\3\2\2\2\u0128" +
                    "\u0129\t\32\2\2\u0129B\3\2\2\2\u012a\u012b\t\33\2\2\u012bD\3\2\2\2\u012c" +
                    "\u012d\t\34\2\2\u012dF\3\2\2\2\u012e\u012f\t\35\2\2\u012fH\3\2\2\2\u0130" +
                    "\u0131\t\36\2\2\u0131J\3\2\2\2\u0132\u0133\t\37\2\2\u0133L\3\2\2\2\u0134" +
                    "\u0135\t \2\2\u0135N\3\2\2\2\u0136\u0137\t!\2\2\u0137P\3\2\2\2\u0138\u0139" +
                    "\t\"\2\2\u0139R\3\2\2\2\u013a\u013b\t#\2\2\u013bT\3\2\2\2\u013c\u013d" +
                    "\t$\2\2\u013dV\3\2\2\2\u013e\u013f\t%\2\2\u013fX\3\2\2\2\u0140\u0141\t" +
                    "&\2\2\u0141Z\3\2\2\2\34\2\u0085\u0087\u008f\u0091\u0099\u00a1\u00a4\u00a9" +
                    "\u00af\u00b2\u00b6\u00bb\u00bd\u00c3\u00c7\u00cc\u00ce\u00d0\u00d6\u00db" +
                    "\u00e1\u00e3\u00f1\u00fc\u0102\3\2\3\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}