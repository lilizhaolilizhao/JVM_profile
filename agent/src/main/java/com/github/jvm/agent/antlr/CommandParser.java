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
            IDENTIFIER = 22, EXTEND_LEVEL = 23, HASHCODE = 24, NUMERIC_LITERAL = 25, BIND_PARAMETER = 26,
            STRING_LITERAL = 27, BLOB_LITERAL = 28, SINGLE_LINE_COMMENT = 29, MULTILINE_COMMENT = 30,
            SPACES = 31, UNEXPECTED_CHAR = 32;
    public static final int
            RULE_parse = 0, RULE_command_list = 1, RULE_help_command = 2, RULE_sc_command = 3,
            RULE_sm_command = 4, RULE_classloader_command = 5, RULE_keymap_command = 6,
            RULE_exit_command = 7, RULE_cls_command = 8, RULE_general_help = 9, RULE_field_flag = 10,
            RULE_resource_flag = 11, RULE_regex_flag = 12, RULE_extend_flag = 13,
            RULE_hashcode_flag = 14, RULE_includeReflectionClassLoader_flag = 15,
            RULE_detail_flag = 16, RULE_all_flag = 17, RULE_class_pattern = 18, RULE_method_pattern = 19,
            RULE_any_name = 20;

    private static String[] makeRuleNames() {
        return new String[]{
                "parse", "command_list", "help_command", "sc_command", "sm_command",
                "classloader_command", "keymap_command", "exit_command", "cls_command",
                "general_help", "field_flag", "resource_flag", "regex_flag", "extend_flag",
                "hashcode_flag", "includeReflectionClassLoader_flag", "detail_flag",
                "all_flag", "class_pattern", "method_pattern", "any_name"
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
                "HASHCODE_FLAG", "INCLUDEREFLECTIONCLASSLOADER_FLAG", "RESOURCE", "IDENTIFIER",
                "EXTEND_LEVEL", "HASHCODE", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL",
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
                setState(42);
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
                setState(51);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case HELP_COMMAND: {
                        setState(44);
                        help_command();
                    }
                    break;
                    case SC_COMMAND: {
                        setState(45);
                        sc_command();
                    }
                    break;
                    case SM_COMMAND: {
                        setState(46);
                        sm_command();
                    }
                    break;
                    case CLASSLOADER_COMMAND: {
                        setState(47);
                        classloader_command();
                    }
                    break;
                    case KEYMAP_COMMAND: {
                        setState(48);
                        keymap_command();
                    }
                    break;
                    case EXIT_COMMAND:
                    case LOGOUT_COMMAND:
                    case QUIT_COMMAND: {
                        setState(49);
                        exit_command();
                    }
                    break;
                    case CLS_COMMAND: {
                        setState(50);
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
                setState(53);
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
                setState(55);
                match(SC_COMMAND);
                setState(72);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                    case 1: {
                        setState(57);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                            case 1: {
                                setState(56);
                                detail_flag();
                            }
                            break;
                        }
                        setState(60);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                            case 1: {
                                setState(59);
                                field_flag();
                            }
                            break;
                        }
                        setState(63);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                            case 1: {
                                setState(62);
                                regex_flag();
                            }
                            break;
                        }
                        setState(66);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(65);
                                extend_flag();
                            }
                        }

                        setState(68);
                        class_pattern();
                    }
                    break;
                    case 2: {
                        setState(70);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(69);
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
                setState(74);
                match(SM_COMMAND);
                setState(88);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                    case 1: {
                        setState(76);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                            case 1: {
                                setState(75);
                                detail_flag();
                            }
                            break;
                        }
                        setState(79);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(78);
                                regex_flag();
                            }
                        }

                        setState(81);
                        class_pattern();
                        setState(83);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(82);
                                method_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(86);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(85);
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
                setState(90);
                match(CLASSLOADER_COMMAND);
                setState(106);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                    case 1: {
                        setState(92);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                            case 1: {
                                setState(91);
                                all_flag();
                            }
                            break;
                        }
                        setState(95);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                            case 1: {
                                setState(94);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(98);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                            case 1: {
                                setState(97);
                                includeReflectionClassLoader_flag();
                            }
                            break;
                        }
                        setState(101);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(100);
                                resource_flag();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(104);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(103);
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
                setState(108);
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
                setState(110);
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
                setState(112);
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
            setState(118);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(114);
                    match(T__0);
                    setState(115);
                    match(HELP_COMMAND);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(116);
                    match(T__0);
                    setState(117);
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
                setState(120);
                match(T__0);
                setState(121);
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
                setState(123);
                match(T__0);
                setState(124);
                match(RESOURCE);
                setState(125);
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
        enterRule(_localctx, 24, RULE_regex_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(127);
                match(T__0);
                setState(128);
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
        enterRule(_localctx, 26, RULE_extend_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(130);
                match(T__0);
                setState(131);
                match(EXTEND);
                setState(132);
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
        enterRule(_localctx, 28, RULE_hashcode_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(134);
                match(T__0);
                setState(135);
                match(HASHCODE_FLAG);
                setState(136);
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
        enterRule(_localctx, 30, RULE_includeReflectionClassLoader_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(138);
                match(T__0);
                setState(139);
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
        enterRule(_localctx, 32, RULE_detail_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(141);
                match(T__0);
                setState(142);
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
        enterRule(_localctx, 34, RULE_all_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(144);
                match(T__0);
                setState(145);
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
        enterRule(_localctx, 36, RULE_class_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(147);
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
        enterRule(_localctx, 38, RULE_method_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(149);
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
        enterRule(_localctx, 40, RULE_any_name);
        try {
            setState(157);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(151);
                    match(IDENTIFIER);
                }
                break;
                case STRING_LITERAL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(152);
                    match(STRING_LITERAL);
                }
                break;
                case T__1:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(153);
                    match(T__1);
                    setState(154);
                    any_name();
                    setState(155);
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00a2\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\5\3\66\n\3\3\4\3\4\3\5\3\5\5\5<\n\5\3\5\5\5?\n\5\3\5\5\5B\n\5\3" +
                    "\5\5\5E\n\5\3\5\3\5\5\5I\n\5\5\5K\n\5\3\6\3\6\5\6O\n\6\3\6\5\6R\n\6\3" +
                    "\6\3\6\5\6V\n\6\3\6\5\6Y\n\6\5\6[\n\6\3\7\3\7\5\7_\n\7\3\7\5\7b\n\7\3" +
                    "\7\5\7e\n\7\3\7\5\7h\n\7\3\7\5\7k\n\7\5\7m\n\7\3\b\3\b\3\t\3\t\3\n\3\n" +
                    "\3\13\3\13\3\13\3\13\5\13y\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16" +
                    "\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22" +
                    "\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26" +
                    "\5\26\u00a0\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"" +
                    "$&(*\2\3\3\2\n\f\2\u00a6\2,\3\2\2\2\4\65\3\2\2\2\6\67\3\2\2\2\b9\3\2\2" +
                    "\2\nL\3\2\2\2\f\\\3\2\2\2\16n\3\2\2\2\20p\3\2\2\2\22r\3\2\2\2\24x\3\2" +
                    "\2\2\26z\3\2\2\2\30}\3\2\2\2\32\u0081\3\2\2\2\34\u0084\3\2\2\2\36\u0088" +
                    "\3\2\2\2 \u008c\3\2\2\2\"\u008f\3\2\2\2$\u0092\3\2\2\2&\u0095\3\2\2\2" +
                    "(\u0097\3\2\2\2*\u009f\3\2\2\2,-\5\4\3\2-\3\3\2\2\2.\66\5\6\4\2/\66\5" +
                    "\b\5\2\60\66\5\n\6\2\61\66\5\f\7\2\62\66\5\16\b\2\63\66\5\20\t\2\64\66" +
                    "\5\22\n\2\65.\3\2\2\2\65/\3\2\2\2\65\60\3\2\2\2\65\61\3\2\2\2\65\62\3" +
                    "\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\678\7\16\2\28\7\3\2\2" +
                    "\29J\7\6\2\2:<\5\"\22\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\5\26\f\2>=\3\2" +
                    "\2\2>?\3\2\2\2?A\3\2\2\2@B\5\32\16\2A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2CE\5" +
                    "\34\17\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FK\5&\24\2GI\5\24\13\2HG\3\2\2\2" +
                    "HI\3\2\2\2IK\3\2\2\2J;\3\2\2\2JH\3\2\2\2K\t\3\2\2\2LZ\7\7\2\2MO\5\"\22" +
                    "\2NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\5\32\16\2QP\3\2\2\2QR\3\2\2\2RS\3\2" +
                    "\2\2SU\5&\24\2TV\5(\25\2UT\3\2\2\2UV\3\2\2\2V[\3\2\2\2WY\5\24\13\2XW\3" +
                    "\2\2\2XY\3\2\2\2Y[\3\2\2\2ZN\3\2\2\2ZX\3\2\2\2[\13\3\2\2\2\\l\7\b\2\2" +
                    "]_\5$\23\2^]\3\2\2\2^_\3\2\2\2_a\3\2\2\2`b\5\36\20\2a`\3\2\2\2ab\3\2\2" +
                    "\2bd\3\2\2\2ce\5 \21\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\5\30\r\2gf\3\2" +
                    "\2\2gh\3\2\2\2hm\3\2\2\2ik\5\24\13\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2l^\3" +
                    "\2\2\2lj\3\2\2\2m\r\3\2\2\2no\7\t\2\2o\17\3\2\2\2pq\t\2\2\2q\21\3\2\2" +
                    "\2rs\7\r\2\2s\23\3\2\2\2tu\7\3\2\2uy\7\16\2\2vw\7\3\2\2wy\7\17\2\2xt\3" +
                    "\2\2\2xv\3\2\2\2y\25\3\2\2\2z{\7\3\2\2{|\7\22\2\2|\27\3\2\2\2}~\7\3\2" +
                    "\2~\177\7\27\2\2\177\u0080\5*\26\2\u0080\31\3\2\2\2\u0081\u0082\7\3\2" +
                    "\2\u0082\u0083\7\23\2\2\u0083\33\3\2\2\2\u0084\u0085\7\3\2\2\u0085\u0086" +
                    "\7\24\2\2\u0086\u0087\7\31\2\2\u0087\35\3\2\2\2\u0088\u0089\7\3\2\2\u0089" +
                    "\u008a\7\25\2\2\u008a\u008b\7\32\2\2\u008b\37\3\2\2\2\u008c\u008d\7\3" +
                    "\2\2\u008d\u008e\7\26\2\2\u008e!\3\2\2\2\u008f\u0090\7\3\2\2\u0090\u0091" +
                    "\7\20\2\2\u0091#\3\2\2\2\u0092\u0093\7\3\2\2\u0093\u0094\7\21\2\2\u0094" +
                    "%\3\2\2\2\u0095\u0096\5*\26\2\u0096\'\3\2\2\2\u0097\u0098\5*\26\2\u0098" +
                    ")\3\2\2\2\u0099\u00a0\7\30\2\2\u009a\u00a0\7\35\2\2\u009b\u009c\7\4\2" +
                    "\2\u009c\u009d\5*\26\2\u009d\u009e\7\5\2\2\u009e\u00a0\3\2\2\2\u009f\u0099" +
                    "\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009b\3\2\2\2\u00a0+\3\2\2\2\26\65" +
                    ";>ADHJNQUXZ^adgjlx\u009f";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}