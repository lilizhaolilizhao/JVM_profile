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
            DETAIL = 12, FIELD = 13, REGEX = 14, EXTEND = 15, IDENTIFIER = 16, EXTEND_LEVEL = 17,
            NUMERIC_LITERAL = 18, BIND_PARAMETER = 19, STRING_LITERAL = 20, BLOB_LITERAL = 21,
            SINGLE_LINE_COMMENT = 22, MULTILINE_COMMENT = 23, SPACES = 24, UNEXPECTED_CHAR = 25;
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
                "DETAIL", "FIELD", "REGEX", "EXTEND", "IDENTIFIER", "EXTEND_LEVEL", "NUMERIC_LITERAL",
                "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT",
                "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR", "DIGIT", "A", "B",
                "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
                "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
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
                "DETAIL", "FIELD", "REGEX", "EXTEND", "IDENTIFIER", "EXTEND_LEVEL", "NUMERIC_LITERAL",
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0163\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
                    " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t" +
                    "+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64" +
                    "\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t" +
                    "\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16" +
                    "\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00a4\n\21\f\21\16" +
                    "\21\u00a7\13\21\3\21\3\21\3\21\3\21\3\21\7\21\u00ae\n\21\f\21\16\21\u00b1" +
                    "\13\21\3\21\3\21\3\21\7\21\u00b6\n\21\f\21\16\21\u00b9\13\21\3\21\3\21" +
                    "\3\21\7\21\u00be\n\21\f\21\16\21\u00c1\13\21\5\21\u00c3\n\21\3\22\5\22" +
                    "\u00c6\n\22\3\23\6\23\u00c9\n\23\r\23\16\23\u00ca\3\23\3\23\7\23\u00cf" +
                    "\n\23\f\23\16\23\u00d2\13\23\5\23\u00d4\n\23\3\23\3\23\5\23\u00d8\n\23" +
                    "\3\23\6\23\u00db\n\23\r\23\16\23\u00dc\5\23\u00df\n\23\3\23\3\23\6\23" +
                    "\u00e3\n\23\r\23\16\23\u00e4\3\23\3\23\5\23\u00e9\n\23\3\23\6\23\u00ec" +
                    "\n\23\r\23\16\23\u00ed\5\23\u00f0\n\23\5\23\u00f2\n\23\3\24\3\24\7\24" +
                    "\u00f6\n\24\f\24\16\24\u00f9\13\24\3\24\3\24\5\24\u00fd\n\24\3\25\3\25" +
                    "\3\25\3\25\7\25\u0103\n\25\f\25\16\25\u0106\13\25\3\25\3\25\3\26\3\26" +
                    "\3\26\3\27\3\27\3\27\3\27\7\27\u0111\n\27\f\27\16\27\u0114\13\27\3\27" +
                    "\3\27\3\30\3\30\3\30\3\30\7\30\u011c\n\30\f\30\16\30\u011f\13\30\3\30" +
                    "\3\30\3\30\5\30\u0124\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33" +
                    "\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3" +
                    "#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3." +
                    "\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\u011d" +
                    "\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35" +
                    "\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\2\67\29\2;\2" +
                    "=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2" +
                    "\3\2(\3\2$$\3\2bb\3\2__\7\2,,\60\60C\\aac|\b\2,,\60\60\62;C\\aac|\3\2" +
                    "\63\67\4\2--//\5\2&&<<BB\3\2))\4\2\f\f\17\17\5\2\13\r\17\17\"\"\3\2\62" +
                    ";\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2" +
                    "KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4" +
                    "\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\" +
                    "||\2\u0163\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2" +
                    "\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27" +
                    "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2" +
                    "\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2" +
                    "\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2" +
                    "\tq\3\2\2\2\13t\3\2\2\2\r{\3\2\2\2\17\u0080\3\2\2\2\21\u0087\3\2\2\2\23" +
                    "\u008c\3\2\2\2\25\u0090\3\2\2\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u0099" +
                    "\3\2\2\2\35\u009b\3\2\2\2\37\u009d\3\2\2\2!\u00c2\3\2\2\2#\u00c5\3\2\2" +
                    "\2%\u00f1\3\2\2\2\'\u00fc\3\2\2\2)\u00fe\3\2\2\2+\u0109\3\2\2\2-\u010c" +
                    "\3\2\2\2/\u0117\3\2\2\2\61\u0127\3\2\2\2\63\u012b\3\2\2\2\65\u012d\3\2" +
                    "\2\2\67\u012f\3\2\2\29\u0131\3\2\2\2;\u0133\3\2\2\2=\u0135\3\2\2\2?\u0137" +
                    "\3\2\2\2A\u0139\3\2\2\2C\u013b\3\2\2\2E\u013d\3\2\2\2G\u013f\3\2\2\2I" +
                    "\u0141\3\2\2\2K\u0143\3\2\2\2M\u0145\3\2\2\2O\u0147\3\2\2\2Q\u0149\3\2" +
                    "\2\2S\u014b\3\2\2\2U\u014d\3\2\2\2W\u014f\3\2\2\2Y\u0151\3\2\2\2[\u0153" +
                    "\3\2\2\2]\u0155\3\2\2\2_\u0157\3\2\2\2a\u0159\3\2\2\2c\u015b\3\2\2\2e" +
                    "\u015d\3\2\2\2g\u015f\3\2\2\2i\u0161\3\2\2\2kl\7/\2\2l\4\3\2\2\2mn\7*" +
                    "\2\2n\6\3\2\2\2op\7+\2\2p\b\3\2\2\2qr\5[.\2rs\5;\36\2s\n\3\2\2\2tu\5K" +
                    "&\2uv\5? \2vw\5g\64\2wx\5O(\2xy\5\67\34\2yz\5U+\2z\f\3\2\2\2{|\5? \2|" +
                    "}\5e\63\2}~\5G$\2~\177\5]/\2\177\16\3\2\2\2\u0080\u0081\5M\'\2\u0081\u0082" +
                    "\5S*\2\u0082\u0083\5C\"\2\u0083\u0084\5S*\2\u0084\u0085\5_\60\2\u0085" +
                    "\u0086\5]/\2\u0086\20\3\2\2\2\u0087\u0088\5W,\2\u0088\u0089\5_\60\2\u0089" +
                    "\u008a\5G$\2\u008a\u008b\5]/\2\u008b\22\3\2\2\2\u008c\u008d\5;\36\2\u008d" +
                    "\u008e\5M\'\2\u008e\u008f\5[.\2\u008f\24\3\2\2\2\u0090\u0091\5E#\2\u0091" +
                    "\u0092\5? \2\u0092\u0093\5M\'\2\u0093\u0094\5U+\2\u0094\26\3\2\2\2\u0095" +
                    "\u0096\5E#\2\u0096\30\3\2\2\2\u0097\u0098\5=\37\2\u0098\32\3\2\2\2\u0099" +
                    "\u009a\5A!\2\u009a\34\3\2\2\2\u009b\u009c\5? \2\u009c\36\3\2\2\2\u009d" +
                    "\u009e\5e\63\2\u009e \3\2\2\2\u009f\u00a5\7$\2\2\u00a0\u00a4\n\2\2\2\u00a1" +
                    "\u00a2\7$\2\2\u00a2\u00a4\7$\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2" +
                    "\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8" +
                    "\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00c3\7$\2\2\u00a9\u00af\7b\2\2\u00aa" +
                    "\u00ae\n\3\2\2\u00ab\u00ac\7b\2\2\u00ac\u00ae\7b\2\2\u00ad\u00aa\3\2\2" +
                    "\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0" +
                    "\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00c3\7b\2\2\u00b3" +
                    "\u00b7\7]\2\2\u00b4\u00b6\n\4\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2" +
                    "\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9" +
                    "\u00b7\3\2\2\2\u00ba\u00c3\7_\2\2\u00bb\u00bf\t\5\2\2\u00bc\u00be\t\6" +
                    "\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf" +
                    "\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u009f\3\2" +
                    "\2\2\u00c2\u00a9\3\2\2\2\u00c2\u00b3\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c3" +
                    "\"\3\2\2\2\u00c4\u00c6\t\7\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2" +
                    "\u00c6$\3\2\2\2\u00c7\u00c9\5\65\33\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca" +
                    "\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d3\3\2\2\2\u00cc" +
                    "\u00d0\7\60\2\2\u00cd\u00cf\5\65\33\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2" +
                    "\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2" +
                    "\u00d0\3\2\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00de\3\2" +
                    "\2\2\u00d5\u00d7\5? \2\u00d6\u00d8\t\b\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8" +
                    "\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db\5\65\33\2\u00da\u00d9\3\2\2\2" +
                    "\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df" +
                    "\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00f2\3\2\2\2\u00e0" +
                    "\u00e2\7\60\2\2\u00e1\u00e3\5\65\33\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4" +
                    "\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ef\3\2\2\2\u00e6" +
                    "\u00e8\5? \2\u00e7\u00e9\t\b\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2" +
                    "\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec\5\65\33\2\u00eb\u00ea\3\2\2\2\u00ec" +
                    "\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2" +
                    "\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1" +
                    "\u00c8\3\2\2\2\u00f1\u00e0\3\2\2\2\u00f2&\3\2\2\2\u00f3\u00f7\7A\2\2\u00f4" +
                    "\u00f6\5\65\33\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3" +
                    "\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fd\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa" +
                    "\u00fb\t\t\2\2\u00fb\u00fd\5!\21\2\u00fc\u00f3\3\2\2\2\u00fc\u00fa\3\2" +
                    "\2\2\u00fd(\3\2\2\2\u00fe\u0104\7)\2\2\u00ff\u0103\n\n\2\2\u0100\u0101" +
                    "\7)\2\2\u0101\u0103\7)\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0103" +
                    "\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2" +
                    "\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7)\2\2\u0108*\3\2\2\2\u0109\u010a" +
                    "\5e\63\2\u010a\u010b\5)\25\2\u010b,\3\2\2\2\u010c\u010d\7/\2\2\u010d\u010e" +
                    "\7/\2\2\u010e\u0112\3\2\2\2\u010f\u0111\n\13\2\2\u0110\u010f\3\2\2\2\u0111" +
                    "\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2" +
                    "\2\2\u0114\u0112\3\2\2\2\u0115\u0116\b\27\2\2\u0116.\3\2\2\2\u0117\u0118" +
                    "\7\61\2\2\u0118\u0119\7,\2\2\u0119\u011d\3\2\2\2\u011a\u011c\13\2\2\2" +
                    "\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011e\3\2\2\2\u011d\u011b" +
                    "\3\2\2\2\u011e\u0123\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7,\2\2\u0121" +
                    "\u0124\7\61\2\2\u0122\u0124\7\2\2\3\u0123\u0120\3\2\2\2\u0123\u0122\3" +
                    "\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b\30\2\2\u0126\60\3\2\2\2\u0127" +
                    "\u0128\t\f\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b\31\2\2\u012a\62\3\2\2" +
                    "\2\u012b\u012c\13\2\2\2\u012c\64\3\2\2\2\u012d\u012e\t\r\2\2\u012e\66" +
                    "\3\2\2\2\u012f\u0130\t\16\2\2\u01308\3\2\2\2\u0131\u0132\t\17\2\2\u0132" +
                    ":\3\2\2\2\u0133\u0134\t\20\2\2\u0134<\3\2\2\2\u0135\u0136\t\21\2\2\u0136" +
                    ">\3\2\2\2\u0137\u0138\t\22\2\2\u0138@\3\2\2\2\u0139\u013a\t\23\2\2\u013a" +
                    "B\3\2\2\2\u013b\u013c\t\24\2\2\u013cD\3\2\2\2\u013d\u013e\t\25\2\2\u013e" +
                    "F\3\2\2\2\u013f\u0140\t\26\2\2\u0140H\3\2\2\2\u0141\u0142\t\27\2\2\u0142" +
                    "J\3\2\2\2\u0143\u0144\t\30\2\2\u0144L\3\2\2\2\u0145\u0146\t\31\2\2\u0146" +
                    "N\3\2\2\2\u0147\u0148\t\32\2\2\u0148P\3\2\2\2\u0149\u014a\t\33\2\2\u014a" +
                    "R\3\2\2\2\u014b\u014c\t\34\2\2\u014cT\3\2\2\2\u014d\u014e\t\35\2\2\u014e" +
                    "V\3\2\2\2\u014f\u0150\t\36\2\2\u0150X\3\2\2\2\u0151\u0152\t\37\2\2\u0152" +
                    "Z\3\2\2\2\u0153\u0154\t \2\2\u0154\\\3\2\2\2\u0155\u0156\t!\2\2\u0156" +
                    "^\3\2\2\2\u0157\u0158\t\"\2\2\u0158`\3\2\2\2\u0159\u015a\t#\2\2\u015a" +
                    "b\3\2\2\2\u015b\u015c\t$\2\2\u015cd\3\2\2\2\u015d\u015e\t%\2\2\u015ef" +
                    "\3\2\2\2\u015f\u0160\t&\2\2\u0160h\3\2\2\2\u0161\u0162\t\'\2\2\u0162j" +
                    "\3\2\2\2\35\2\u00a3\u00a5\u00ad\u00af\u00b7\u00bf\u00c2\u00c5\u00ca\u00d0" +
                    "\u00d3\u00d7\u00dc\u00de\u00e4\u00e8\u00ed\u00ef\u00f1\u00f7\u00fc\u0102" +
                    "\u0104\u0112\u011d\u0123\3\2\3\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}