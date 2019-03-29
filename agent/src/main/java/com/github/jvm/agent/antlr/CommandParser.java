// Generated from /Users/oneapm/git/JVM_profile/agent/src/main/antlr/Command.g4 by ANTLR 4.7.2
package com.github.jvm.agent.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, SC_COMMAND = 4, SM_COMMAND = 5, CLASSLOADER_COMMAND = 6,
            KEYMAP_COMMAND = 7, EXIT_COMMAND = 8, LOGOUT_COMMAND = 9, QUIT_COMMAND = 10, CLS_COMMAND = 11,
            HELP_COMMAND = 12, HELP = 13, DETAIL = 14, ALL_INFO = 15, FIELD = 16, REGEX = 17,
            EXTEND = 18, HASHCODE_FLAG = 19, INCLUDEREFLECTIONCLASSLOADER_FLAG = 20, RESOURCE = 21,
            TREE = 22, IDENTIFIER = 23, EXTEND_LEVEL = 24, HASHCODE = 25, NUMERIC_LITERAL = 26,
            BIND_PARAMETER = 27, STRING_LITERAL = 28, BLOB_LITERAL = 29, SINGLE_LINE_COMMENT = 30,
            MULTILINE_COMMENT = 31, SPACES = 32, UNEXPECTED_CHAR = 33;
    public static final int
            RULE_parse = 0, RULE_command_list = 1, RULE_help_command = 2, RULE_sc_command = 3,
            RULE_sm_command = 4, RULE_classloader_command = 5, RULE_keymap_command = 6,
            RULE_exit_command = 7, RULE_cls_command = 8, RULE_general_help = 9, RULE_field_flag = 10,
            RULE_resource_flag = 11, RULE_tree_flag = 12, RULE_regex_flag = 13, RULE_extend_flag = 14,
            RULE_hashcode_flag = 15, RULE_includeReflectionClassLoader_flag = 16,
            RULE_detail_flag = 17, RULE_all_flag = 18, RULE_class_pattern = 19, RULE_method_pattern = 20,
            RULE_any_name = 21;

    private static String[] makeRuleNames() {
        return new String[]{
                "parse", "command_list", "help_command", "sc_command", "sm_command",
                "classloader_command", "keymap_command", "exit_command", "cls_command",
                "general_help", "field_flag", "resource_flag", "tree_flag", "regex_flag",
                "extend_flag", "hashcode_flag", "includeReflectionClassLoader_flag",
                "detail_flag", "all_flag", "class_pattern", "method_pattern", "any_name"
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
                null, null, null, null, "SC_COMMAND", "SM_COMMAND", "CLASSLOADER_COMMAND",
                "KEYMAP_COMMAND", "EXIT_COMMAND", "LOGOUT_COMMAND", "QUIT_COMMAND", "CLS_COMMAND",
                "HELP_COMMAND", "HELP", "DETAIL", "ALL_INFO", "FIELD", "REGEX", "EXTEND",
                "HASHCODE_FLAG", "INCLUDEREFLECTIONCLASSLOADER_FLAG", "RESOURCE", "TREE",
                "IDENTIFIER", "EXTEND_LEVEL", "HASHCODE", "NUMERIC_LITERAL", "BIND_PARAMETER",
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
    public ATN getATN() {
        return _ATN;
    }

    public CommandParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ParseContext extends ParserRuleContext {
        public Command_listContext command_list() {
            return getRuleContext(Command_listContext.class, 0);
        }

        public ParseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parse;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterParse(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitParse(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor) return ((CommandVisitor<? extends T>) visitor).visitParse(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ParseContext parse() throws RecognitionException {
        ParseContext _localctx = new ParseContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_parse);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(44);
                command_list();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Command_listContext extends ParserRuleContext {
        public Help_commandContext help_command() {
            return getRuleContext(Help_commandContext.class, 0);
        }

        public Sc_commandContext sc_command() {
            return getRuleContext(Sc_commandContext.class, 0);
        }

        public Sm_commandContext sm_command() {
            return getRuleContext(Sm_commandContext.class, 0);
        }

        public Classloader_commandContext classloader_command() {
            return getRuleContext(Classloader_commandContext.class, 0);
        }

        public Keymap_commandContext keymap_command() {
            return getRuleContext(Keymap_commandContext.class, 0);
        }

        public Exit_commandContext exit_command() {
            return getRuleContext(Exit_commandContext.class, 0);
        }

        public Cls_commandContext cls_command() {
            return getRuleContext(Cls_commandContext.class, 0);
        }

        public Command_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_command_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterCommand_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitCommand_list(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitCommand_list(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Command_listContext command_list() throws RecognitionException {
        Command_listContext _localctx = new Command_listContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_command_list);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(53);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case HELP_COMMAND: {
                        setState(46);
                        help_command();
                    }
                    break;
                    case SC_COMMAND: {
                        setState(47);
                        sc_command();
                    }
                    break;
                    case SM_COMMAND: {
                        setState(48);
                        sm_command();
                    }
                    break;
                    case CLASSLOADER_COMMAND: {
                        setState(49);
                        classloader_command();
                    }
                    break;
                    case KEYMAP_COMMAND: {
                        setState(50);
                        keymap_command();
                    }
                    break;
                    case EXIT_COMMAND:
                    case LOGOUT_COMMAND:
                    case QUIT_COMMAND: {
                        setState(51);
                        exit_command();
                    }
                    break;
                    case CLS_COMMAND: {
                        setState(52);
                        cls_command();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Help_commandContext extends ParserRuleContext {
        public TerminalNode HELP_COMMAND() {
            return getToken(CommandParser.HELP_COMMAND, 0);
        }

        public Help_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_help_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterHelp_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitHelp_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitHelp_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Help_commandContext help_command() throws RecognitionException {
        Help_commandContext _localctx = new Help_commandContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_help_command);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(55);
                match(HELP_COMMAND);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Sc_commandContext extends ParserRuleContext {
        public TerminalNode SC_COMMAND() {
            return getToken(CommandParser.SC_COMMAND, 0);
        }

        public Class_patternContext class_pattern() {
            return getRuleContext(Class_patternContext.class, 0);
        }

        public Detail_flagContext detail_flag() {
            return getRuleContext(Detail_flagContext.class, 0);
        }

        public Field_flagContext field_flag() {
            return getRuleContext(Field_flagContext.class, 0);
        }

        public Regex_flagContext regex_flag() {
            return getRuleContext(Regex_flagContext.class, 0);
        }

        public Extend_flagContext extend_flag() {
            return getRuleContext(Extend_flagContext.class, 0);
        }

        public General_helpContext general_help() {
            return getRuleContext(General_helpContext.class, 0);
        }

        public Sc_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sc_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterSc_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitSc_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor) return ((CommandVisitor<? extends T>) visitor).visitSc_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Sc_commandContext sc_command() throws RecognitionException {
        Sc_commandContext _localctx = new Sc_commandContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_sc_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(57);
                match(SC_COMMAND);
                setState(74);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                    case 1: {
                        setState(59);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                            case 1: {
                                setState(58);
                                detail_flag();
                            }
                            break;
                        }
                        setState(62);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                            case 1: {
                                setState(61);
                                field_flag();
                            }
                            break;
                        }
                        setState(65);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                            case 1: {
                                setState(64);
                                regex_flag();
                            }
                            break;
                        }
                        setState(68);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(67);
                                extend_flag();
                            }
                        }

                        setState(70);
                        class_pattern();
                    }
                    break;
                    case 2: {
                        setState(72);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(71);
                                general_help();
                            }
                        }

                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Sm_commandContext extends ParserRuleContext {
        public TerminalNode SM_COMMAND() {
            return getToken(CommandParser.SM_COMMAND, 0);
        }

        public Class_patternContext class_pattern() {
            return getRuleContext(Class_patternContext.class, 0);
        }

        public Detail_flagContext detail_flag() {
            return getRuleContext(Detail_flagContext.class, 0);
        }

        public Regex_flagContext regex_flag() {
            return getRuleContext(Regex_flagContext.class, 0);
        }

        public Method_patternContext method_pattern() {
            return getRuleContext(Method_patternContext.class, 0);
        }

        public General_helpContext general_help() {
            return getRuleContext(General_helpContext.class, 0);
        }

        public Sm_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sm_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterSm_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitSm_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor) return ((CommandVisitor<? extends T>) visitor).visitSm_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Sm_commandContext sm_command() throws RecognitionException {
        Sm_commandContext _localctx = new Sm_commandContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_sm_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(76);
                match(SM_COMMAND);
                setState(90);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                    case 1: {
                        setState(78);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                            case 1: {
                                setState(77);
                                detail_flag();
                            }
                            break;
                        }
                        setState(81);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(80);
                                regex_flag();
                            }
                        }

                        setState(83);
                        class_pattern();
                        setState(85);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(84);
                                method_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(88);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(87);
                                general_help();
                            }
                        }

                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Classloader_commandContext extends ParserRuleContext {
        public TerminalNode CLASSLOADER_COMMAND() {
            return getToken(CommandParser.CLASSLOADER_COMMAND, 0);
        }

        public All_flagContext all_flag() {
            return getRuleContext(All_flagContext.class, 0);
        }

        public Hashcode_flagContext hashcode_flag() {
            return getRuleContext(Hashcode_flagContext.class, 0);
        }

        public IncludeReflectionClassLoader_flagContext includeReflectionClassLoader_flag() {
            return getRuleContext(IncludeReflectionClassLoader_flagContext.class, 0);
        }

        public Resource_flagContext resource_flag() {
            return getRuleContext(Resource_flagContext.class, 0);
        }

        public Tree_flagContext tree_flag() {
            return getRuleContext(Tree_flagContext.class, 0);
        }

        public General_helpContext general_help() {
            return getRuleContext(General_helpContext.class, 0);
        }

        public Classloader_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classloader_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterClassloader_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitClassloader_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitClassloader_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Classloader_commandContext classloader_command() throws RecognitionException {
        Classloader_commandContext _localctx = new Classloader_commandContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_classloader_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                match(CLASSLOADER_COMMAND);
                setState(111);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                    case 1: {
                        setState(94);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                            case 1: {
                                setState(93);
                                all_flag();
                            }
                            break;
                        }
                        setState(97);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                            case 1: {
                                setState(96);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(100);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                            case 1: {
                                setState(99);
                                includeReflectionClassLoader_flag();
                            }
                            break;
                        }
                        setState(103);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                            case 1: {
                                setState(102);
                                resource_flag();
                            }
                            break;
                        }
                        setState(106);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(105);
                                tree_flag();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(109);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(108);
                                general_help();
                            }
                        }

                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Keymap_commandContext extends ParserRuleContext {
        public TerminalNode KEYMAP_COMMAND() {
            return getToken(CommandParser.KEYMAP_COMMAND, 0);
        }

        public Keymap_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_keymap_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterKeymap_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitKeymap_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitKeymap_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Keymap_commandContext keymap_command() throws RecognitionException {
        Keymap_commandContext _localctx = new Keymap_commandContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_keymap_command);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(113);
                match(KEYMAP_COMMAND);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Exit_commandContext extends ParserRuleContext {
        public TerminalNode EXIT_COMMAND() {
            return getToken(CommandParser.EXIT_COMMAND, 0);
        }

        public TerminalNode LOGOUT_COMMAND() {
            return getToken(CommandParser.LOGOUT_COMMAND, 0);
        }

        public TerminalNode QUIT_COMMAND() {
            return getToken(CommandParser.QUIT_COMMAND, 0);
        }

        public Exit_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exit_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterExit_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitExit_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitExit_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Exit_commandContext exit_command() throws RecognitionException {
        Exit_commandContext _localctx = new Exit_commandContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_exit_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(115);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXIT_COMMAND) | (1L << LOGOUT_COMMAND) | (1L << QUIT_COMMAND))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Cls_commandContext extends ParserRuleContext {
        public TerminalNode CLS_COMMAND() {
            return getToken(CommandParser.CLS_COMMAND, 0);
        }

        public Cls_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cls_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterCls_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitCls_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitCls_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Cls_commandContext cls_command() throws RecognitionException {
        Cls_commandContext _localctx = new Cls_commandContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_cls_command);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(117);
                match(CLS_COMMAND);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class General_helpContext extends ParserRuleContext {
        public TerminalNode HELP_COMMAND() {
            return getToken(CommandParser.HELP_COMMAND, 0);
        }

        public TerminalNode HELP() {
            return getToken(CommandParser.HELP, 0);
        }

        public General_helpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_general_help;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterGeneral_help(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitGeneral_help(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitGeneral_help(this);
            else return visitor.visitChildren(this);
        }
    }

    public final General_helpContext general_help() throws RecognitionException {
        General_helpContext _localctx = new General_helpContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_general_help);
        try {
            setState(123);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(119);
                    match(T__0);
                    setState(120);
                    match(HELP_COMMAND);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(121);
                    match(T__0);
                    setState(122);
                    match(HELP);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Field_flagContext extends ParserRuleContext {
        public TerminalNode FIELD() {
            return getToken(CommandParser.FIELD, 0);
        }

        public Field_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_field_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterField_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitField_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor) return ((CommandVisitor<? extends T>) visitor).visitField_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Field_flagContext field_flag() throws RecognitionException {
        Field_flagContext _localctx = new Field_flagContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_field_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(125);
                match(T__0);
                setState(126);
                match(FIELD);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Resource_flagContext extends ParserRuleContext {
        public TerminalNode RESOURCE() {
            return getToken(CommandParser.RESOURCE, 0);
        }

        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Resource_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_resource_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterResource_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitResource_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitResource_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Resource_flagContext resource_flag() throws RecognitionException {
        Resource_flagContext _localctx = new Resource_flagContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_resource_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(128);
                match(T__0);
                setState(129);
                match(RESOURCE);
                setState(130);
                any_name();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Tree_flagContext extends ParserRuleContext {
        public TerminalNode TREE() {
            return getToken(CommandParser.TREE, 0);
        }

        public Tree_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tree_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterTree_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitTree_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor) return ((CommandVisitor<? extends T>) visitor).visitTree_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Tree_flagContext tree_flag() throws RecognitionException {
        Tree_flagContext _localctx = new Tree_flagContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_tree_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(132);
                match(T__0);
                setState(133);
                match(TREE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Regex_flagContext extends ParserRuleContext {
        public TerminalNode REGEX() {
            return getToken(CommandParser.REGEX, 0);
        }

        public Regex_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_regex_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterRegex_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitRegex_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor) return ((CommandVisitor<? extends T>) visitor).visitRegex_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Regex_flagContext regex_flag() throws RecognitionException {
        Regex_flagContext _localctx = new Regex_flagContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_regex_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(135);
                match(T__0);
                setState(136);
                match(REGEX);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Extend_flagContext extends ParserRuleContext {
        public TerminalNode EXTEND() {
            return getToken(CommandParser.EXTEND, 0);
        }

        public TerminalNode EXTEND_LEVEL() {
            return getToken(CommandParser.EXTEND_LEVEL, 0);
        }

        public Extend_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_extend_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterExtend_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitExtend_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitExtend_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Extend_flagContext extend_flag() throws RecognitionException {
        Extend_flagContext _localctx = new Extend_flagContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_extend_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(138);
                match(T__0);
                setState(139);
                match(EXTEND);
                setState(140);
                match(EXTEND_LEVEL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Hashcode_flagContext extends ParserRuleContext {
        public TerminalNode HASHCODE_FLAG() {
            return getToken(CommandParser.HASHCODE_FLAG, 0);
        }

        public TerminalNode HASHCODE() {
            return getToken(CommandParser.HASHCODE, 0);
        }

        public Hashcode_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_hashcode_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterHashcode_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitHashcode_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitHashcode_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Hashcode_flagContext hashcode_flag() throws RecognitionException {
        Hashcode_flagContext _localctx = new Hashcode_flagContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_hashcode_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(142);
                match(T__0);
                setState(143);
                match(HASHCODE_FLAG);
                setState(144);
                match(HASHCODE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IncludeReflectionClassLoader_flagContext extends ParserRuleContext {
        public TerminalNode INCLUDEREFLECTIONCLASSLOADER_FLAG() {
            return getToken(CommandParser.INCLUDEREFLECTIONCLASSLOADER_FLAG, 0);
        }

        public IncludeReflectionClassLoader_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_includeReflectionClassLoader_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener)
                ((CommandListener) listener).enterIncludeReflectionClassLoader_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener)
                ((CommandListener) listener).exitIncludeReflectionClassLoader_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitIncludeReflectionClassLoader_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IncludeReflectionClassLoader_flagContext includeReflectionClassLoader_flag() throws RecognitionException {
        IncludeReflectionClassLoader_flagContext _localctx = new IncludeReflectionClassLoader_flagContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_includeReflectionClassLoader_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(146);
                match(T__0);
                setState(147);
                match(INCLUDEREFLECTIONCLASSLOADER_FLAG);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Detail_flagContext extends ParserRuleContext {
        public TerminalNode DETAIL() {
            return getToken(CommandParser.DETAIL, 0);
        }

        public Detail_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_detail_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterDetail_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitDetail_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitDetail_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Detail_flagContext detail_flag() throws RecognitionException {
        Detail_flagContext _localctx = new Detail_flagContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_detail_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(149);
                match(T__0);
                setState(150);
                match(DETAIL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class All_flagContext extends ParserRuleContext {
        public TerminalNode ALL_INFO() {
            return getToken(CommandParser.ALL_INFO, 0);
        }

        public All_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_all_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterAll_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitAll_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor) return ((CommandVisitor<? extends T>) visitor).visitAll_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final All_flagContext all_flag() throws RecognitionException {
        All_flagContext _localctx = new All_flagContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_all_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(152);
                match(T__0);
                setState(153);
                match(ALL_INFO);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_patternContext extends ParserRuleContext {
        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Class_patternContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_pattern;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterClass_pattern(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitClass_pattern(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitClass_pattern(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Class_patternContext class_pattern() throws RecognitionException {
        Class_patternContext _localctx = new Class_patternContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_class_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(155);
                any_name();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Method_patternContext extends ParserRuleContext {
        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Method_patternContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_method_pattern;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterMethod_pattern(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitMethod_pattern(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitMethod_pattern(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Method_patternContext method_pattern() throws RecognitionException {
        Method_patternContext _localctx = new Method_patternContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_method_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(157);
                any_name();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Any_nameContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(CommandParser.IDENTIFIER, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(CommandParser.STRING_LITERAL, 0);
        }

        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Any_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_any_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterAny_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitAny_name(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor) return ((CommandVisitor<? extends T>) visitor).visitAny_name(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Any_nameContext any_name() throws RecognitionException {
        Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_any_name);
        try {
            setState(165);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(159);
                    match(IDENTIFIER);
                }
                break;
                case STRING_LITERAL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(160);
                    match(STRING_LITERAL);
                }
                break;
                case T__1:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(161);
                    match(T__1);
                    setState(162);
                    any_name();
                    setState(163);
                    match(T__2);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00aa\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\5\38\n\3\3\4\3\4\3\5\3\5\5\5>\n\5\3\5\5\5A\n\5\3\5\5" +
                    "\5D\n\5\3\5\5\5G\n\5\3\5\3\5\5\5K\n\5\5\5M\n\5\3\6\3\6\5\6Q\n\6\3\6\5" +
                    "\6T\n\6\3\6\3\6\5\6X\n\6\3\6\5\6[\n\6\5\6]\n\6\3\7\3\7\5\7a\n\7\3\7\5" +
                    "\7d\n\7\3\7\5\7g\n\7\3\7\5\7j\n\7\3\7\5\7m\n\7\3\7\5\7p\n\7\5\7r\n\7\3" +
                    "\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13~\n\13\3\f\3\f\3\f\3\r" +
                    "\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3" +
                    "\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3" +
                    "\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00a8\n\27\3\27\2\2\30\2\4" +
                    "\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\3\3\2\n\f\2\u00ae\2.\3\2" +
                    "\2\2\4\67\3\2\2\2\69\3\2\2\2\b;\3\2\2\2\nN\3\2\2\2\f^\3\2\2\2\16s\3\2" +
                    "\2\2\20u\3\2\2\2\22w\3\2\2\2\24}\3\2\2\2\26\177\3\2\2\2\30\u0082\3\2\2" +
                    "\2\32\u0086\3\2\2\2\34\u0089\3\2\2\2\36\u008c\3\2\2\2 \u0090\3\2\2\2\"" +
                    "\u0094\3\2\2\2$\u0097\3\2\2\2&\u009a\3\2\2\2(\u009d\3\2\2\2*\u009f\3\2" +
                    "\2\2,\u00a7\3\2\2\2./\5\4\3\2/\3\3\2\2\2\608\5\6\4\2\618\5\b\5\2\628\5" +
                    "\n\6\2\638\5\f\7\2\648\5\16\b\2\658\5\20\t\2\668\5\22\n\2\67\60\3\2\2" +
                    "\2\67\61\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2" +
                    "\2\67\66\3\2\2\28\5\3\2\2\29:\7\16\2\2:\7\3\2\2\2;L\7\6\2\2<>\5$\23\2" +
                    "=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?A\5\26\f\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2" +
                    "\2BD\5\34\17\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2EG\5\36\20\2FE\3\2\2\2FG\3" +
                    "\2\2\2GH\3\2\2\2HM\5(\25\2IK\5\24\13\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2L" +
                    "=\3\2\2\2LJ\3\2\2\2M\t\3\2\2\2N\\\7\7\2\2OQ\5$\23\2PO\3\2\2\2PQ\3\2\2" +
                    "\2QS\3\2\2\2RT\5\34\17\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UW\5(\25\2VX\5*" +
                    "\26\2WV\3\2\2\2WX\3\2\2\2X]\3\2\2\2Y[\5\24\13\2ZY\3\2\2\2Z[\3\2\2\2[]" +
                    "\3\2\2\2\\P\3\2\2\2\\Z\3\2\2\2]\13\3\2\2\2^q\7\b\2\2_a\5&\24\2`_\3\2\2" +
                    "\2`a\3\2\2\2ac\3\2\2\2bd\5 \21\2cb\3\2\2\2cd\3\2\2\2df\3\2\2\2eg\5\"\22" +
                    "\2fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2hj\5\30\r\2ih\3\2\2\2ij\3\2\2\2jl\3\2" +
                    "\2\2km\5\32\16\2lk\3\2\2\2lm\3\2\2\2mr\3\2\2\2np\5\24\13\2on\3\2\2\2o" +
                    "p\3\2\2\2pr\3\2\2\2q`\3\2\2\2qo\3\2\2\2r\r\3\2\2\2st\7\t\2\2t\17\3\2\2" +
                    "\2uv\t\2\2\2v\21\3\2\2\2wx\7\r\2\2x\23\3\2\2\2yz\7\3\2\2z~\7\16\2\2{|" +
                    "\7\3\2\2|~\7\17\2\2}y\3\2\2\2}{\3\2\2\2~\25\3\2\2\2\177\u0080\7\3\2\2" +
                    "\u0080\u0081\7\22\2\2\u0081\27\3\2\2\2\u0082\u0083\7\3\2\2\u0083\u0084" +
                    "\7\27\2\2\u0084\u0085\5,\27\2\u0085\31\3\2\2\2\u0086\u0087\7\3\2\2\u0087" +
                    "\u0088\7\30\2\2\u0088\33\3\2\2\2\u0089\u008a\7\3\2\2\u008a\u008b\7\23" +
                    "\2\2\u008b\35\3\2\2\2\u008c\u008d\7\3\2\2\u008d\u008e\7\24\2\2\u008e\u008f" +
                    "\7\32\2\2\u008f\37\3\2\2\2\u0090\u0091\7\3\2\2\u0091\u0092\7\25\2\2\u0092" +
                    "\u0093\7\33\2\2\u0093!\3\2\2\2\u0094\u0095\7\3\2\2\u0095\u0096\7\26\2" +
                    "\2\u0096#\3\2\2\2\u0097\u0098\7\3\2\2\u0098\u0099\7\20\2\2\u0099%\3\2" +
                    "\2\2\u009a\u009b\7\3\2\2\u009b\u009c\7\21\2\2\u009c\'\3\2\2\2\u009d\u009e" +
                    "\5,\27\2\u009e)\3\2\2\2\u009f\u00a0\5,\27\2\u00a0+\3\2\2\2\u00a1\u00a8" +
                    "\7\31\2\2\u00a2\u00a8\7\36\2\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\5,\27\2" +
                    "\u00a5\u00a6\7\5\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2" +
                    "\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8-\3\2\2\2\27\67=@CFJLPSWZ\\`cfiloq}" +
                    "\u00a7";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}