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
            T__0 = 1, T__1 = 2, T__2 = 3, SC_COMMAND = 4, SM_COMMAND = 5, JAD_COMMAND = 6, GETSTATIC_COMMAND = 7,
            MONITOR_COMMAND = 8, THREAD_COMMAND = 9, JVM_COMMAND = 10, CLASSLOADER_COMMAND = 11,
            KEYMAP_COMMAND = 12, EXIT_COMMAND = 13, LOGOUT_COMMAND = 14, QUIT_COMMAND = 15,
            CLS_COMMAND = 16, HELP_COMMAND = 17, HELP = 18, DETAIL = 19, ALL_INFO = 20, FIELD = 21,
            REGEX = 22, FIND_MOST_BLOCKINGTHREAD = 23, EXTEND = 24, HASHCODE_FLAG = 25, NUMBER_LIMIT = 26,
            CYCLE_FLAG = 27, INCLUDEREFLECTIONCLASSLOADER_FLAG = 28, RESOURCE = 29, TREE = 30,
            LIST = 31, IDENTIFIER = 32, EXTEND_LEVEL = 33, HASHCODE = 34, NUMERIC_LITERAL = 35,
            BIND_PARAMETER = 36, STRING_LITERAL = 37, BLOB_LITERAL = 38, SINGLE_LINE_COMMENT = 39,
            MULTILINE_COMMENT = 40, SPACES = 41, UNEXPECTED_CHAR = 42;
    public static final int
            RULE_parse = 0, RULE_command_list = 1, RULE_help_command = 2, RULE_sc_command = 3,
            RULE_sm_command = 4, RULE_jad_command = 5, RULE_getstatic_command = 6,
            RULE_monitor_command = 7, RULE_thread_command = 8, RULE_jvm_command = 9,
            RULE_classloader_command = 10, RULE_keymap_command = 11, RULE_exit_command = 12,
            RULE_cls_command = 13, RULE_general_help = 14, RULE_field_flag = 15, RULE_resource_flag = 16,
            RULE_tree_flag = 17, RULE_list_flag = 18, RULE_regex_flag = 19, RULE_find_most_blockingthread_flag = 20,
            RULE_extend_flag = 21, RULE_hashcode_flag = 22, RULE_number_limit_flag = 23,
            RULE_cycle_flag = 24, RULE_top_N_Busy_flag = 25, RULE_setSampleInterval_flag = 26,
            RULE_includeReflectionClassLoader_flag = 27, RULE_detail_flag = 28, RULE_all_flag = 29,
            RULE_class_pattern = 30, RULE_field_pattern = 31, RULE_express_pattern = 32,
            RULE_id = 33, RULE_method_pattern = 34, RULE_any_name = 35;

    private static String[] makeRuleNames() {
        return new String[]{
                "parse", "command_list", "help_command", "sc_command", "sm_command",
                "jad_command", "getstatic_command", "monitor_command", "thread_command",
                "jvm_command", "classloader_command", "keymap_command", "exit_command",
                "cls_command", "general_help", "field_flag", "resource_flag", "tree_flag",
                "list_flag", "regex_flag", "find_most_blockingthread_flag", "extend_flag",
                "hashcode_flag", "number_limit_flag", "cycle_flag", "top_N_Busy_flag",
                "setSampleInterval_flag", "includeReflectionClassLoader_flag", "detail_flag",
                "all_flag", "class_pattern", "field_pattern", "express_pattern", "id",
                "method_pattern", "any_name"
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
                null, null, null, null, "SC_COMMAND", "SM_COMMAND", "JAD_COMMAND", "GETSTATIC_COMMAND",
                "MONITOR_COMMAND", "THREAD_COMMAND", "JVM_COMMAND", "CLASSLOADER_COMMAND",
                "KEYMAP_COMMAND", "EXIT_COMMAND", "LOGOUT_COMMAND", "QUIT_COMMAND", "CLS_COMMAND",
                "HELP_COMMAND", "HELP", "DETAIL", "ALL_INFO", "FIELD", "REGEX", "FIND_MOST_BLOCKINGTHREAD",
                "EXTEND", "HASHCODE_FLAG", "NUMBER_LIMIT", "CYCLE_FLAG", "INCLUDEREFLECTIONCLASSLOADER_FLAG",
                "RESOURCE", "TREE", "LIST", "IDENTIFIER", "EXTEND_LEVEL", "HASHCODE",
                "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL",
                "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
                setState(72);
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

        public Jad_commandContext jad_command() {
            return getRuleContext(Jad_commandContext.class, 0);
        }

        public Getstatic_commandContext getstatic_command() {
            return getRuleContext(Getstatic_commandContext.class, 0);
        }

        public Monitor_commandContext monitor_command() {
            return getRuleContext(Monitor_commandContext.class, 0);
        }

        public Thread_commandContext thread_command() {
            return getRuleContext(Thread_commandContext.class, 0);
        }

        public Jvm_commandContext jvm_command() {
            return getRuleContext(Jvm_commandContext.class, 0);
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
                setState(86);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case HELP_COMMAND: {
                        setState(74);
                        help_command();
                    }
                    break;
                    case SC_COMMAND: {
                        setState(75);
                        sc_command();
                    }
                    break;
                    case SM_COMMAND: {
                        setState(76);
                        sm_command();
                    }
                    break;
                    case CLASSLOADER_COMMAND: {
                        setState(77);
                        classloader_command();
                    }
                    break;
                    case JAD_COMMAND: {
                        setState(78);
                        jad_command();
                    }
                    break;
                    case GETSTATIC_COMMAND: {
                        setState(79);
                        getstatic_command();
                    }
                    break;
                    case MONITOR_COMMAND: {
                        setState(80);
                        monitor_command();
                    }
                    break;
                    case THREAD_COMMAND: {
                        setState(81);
                        thread_command();
                    }
                    break;
                    case JVM_COMMAND: {
                        setState(82);
                        jvm_command();
                    }
                    break;
                    case KEYMAP_COMMAND: {
                        setState(83);
                        keymap_command();
                    }
                    break;
                    case EXIT_COMMAND:
                    case LOGOUT_COMMAND:
                    case QUIT_COMMAND: {
                        setState(84);
                        exit_command();
                    }
                    break;
                    case CLS_COMMAND: {
                        setState(85);
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
                setState(88);
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
                setState(90);
                match(SC_COMMAND);
                setState(107);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                    case 1: {
                        setState(92);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                            case 1: {
                                setState(91);
                                detail_flag();
                            }
                            break;
                        }
                        setState(95);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                            case 1: {
                                setState(94);
                                field_flag();
                            }
                            break;
                        }
                        setState(98);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                            case 1: {
                                setState(97);
                                regex_flag();
                            }
                            break;
                        }
                        setState(101);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(100);
                                extend_flag();
                            }
                        }

                        setState(103);
                        class_pattern();
                    }
                    break;
                    case 2: {
                        setState(105);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(104);
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
                setState(109);
                match(SM_COMMAND);
                setState(123);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                    case 1: {
                        setState(111);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                            case 1: {
                                setState(110);
                                detail_flag();
                            }
                            break;
                        }
                        setState(114);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(113);
                                regex_flag();
                            }
                        }

                        setState(116);
                        class_pattern();
                        setState(118);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(117);
                                method_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(121);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(120);
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

    public static class Jad_commandContext extends ParserRuleContext {
        public TerminalNode JAD_COMMAND() {
            return getToken(CommandParser.JAD_COMMAND, 0);
        }

        public Class_patternContext class_pattern() {
            return getRuleContext(Class_patternContext.class, 0);
        }

        public Hashcode_flagContext hashcode_flag() {
            return getRuleContext(Hashcode_flagContext.class, 0);
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

        public Jad_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_jad_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterJad_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitJad_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitJad_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Jad_commandContext jad_command() throws RecognitionException {
        Jad_commandContext _localctx = new Jad_commandContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_jad_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(125);
                match(JAD_COMMAND);
                setState(139);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                    case 1: {
                        setState(127);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                            case 1: {
                                setState(126);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(130);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(129);
                                regex_flag();
                            }
                        }

                        setState(132);
                        class_pattern();
                        setState(134);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(133);
                                method_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(137);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(136);
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

    public static class Getstatic_commandContext extends ParserRuleContext {
        public TerminalNode GETSTATIC_COMMAND() {
            return getToken(CommandParser.GETSTATIC_COMMAND, 0);
        }

        public Class_patternContext class_pattern() {
            return getRuleContext(Class_patternContext.class, 0);
        }

        public Method_patternContext method_pattern() {
            return getRuleContext(Method_patternContext.class, 0);
        }

        public Hashcode_flagContext hashcode_flag() {
            return getRuleContext(Hashcode_flagContext.class, 0);
        }

        public Regex_flagContext regex_flag() {
            return getRuleContext(Regex_flagContext.class, 0);
        }

        public Express_patternContext express_pattern() {
            return getRuleContext(Express_patternContext.class, 0);
        }

        public General_helpContext general_help() {
            return getRuleContext(General_helpContext.class, 0);
        }

        public Getstatic_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_getstatic_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterGetstatic_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitGetstatic_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitGetstatic_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Getstatic_commandContext getstatic_command() throws RecognitionException {
        Getstatic_commandContext _localctx = new Getstatic_commandContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_getstatic_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(141);
                match(GETSTATIC_COMMAND);
                setState(156);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
                    case 1: {
                        setState(143);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                            case 1: {
                                setState(142);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(146);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(145);
                                regex_flag();
                            }
                        }

                        setState(148);
                        class_pattern();
                        setState(149);
                        method_pattern();
                        setState(151);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(150);
                                express_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(154);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(153);
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

    public static class Monitor_commandContext extends ParserRuleContext {
        public TerminalNode MONITOR_COMMAND() {
            return getToken(CommandParser.MONITOR_COMMAND, 0);
        }

        public Class_patternContext class_pattern() {
            return getRuleContext(Class_patternContext.class, 0);
        }

        public Cycle_flagContext cycle_flag() {
            return getRuleContext(Cycle_flagContext.class, 0);
        }

        public Regex_flagContext regex_flag() {
            return getRuleContext(Regex_flagContext.class, 0);
        }

        public Number_limit_flagContext number_limit_flag() {
            return getRuleContext(Number_limit_flagContext.class, 0);
        }

        public Method_patternContext method_pattern() {
            return getRuleContext(Method_patternContext.class, 0);
        }

        public General_helpContext general_help() {
            return getRuleContext(General_helpContext.class, 0);
        }

        public Monitor_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_monitor_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterMonitor_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitMonitor_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitMonitor_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Monitor_commandContext monitor_command() throws RecognitionException {
        Monitor_commandContext _localctx = new Monitor_commandContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_monitor_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(158);
                match(MONITOR_COMMAND);
                setState(175);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                    case 1: {
                        setState(160);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                            case 1: {
                                setState(159);
                                cycle_flag();
                            }
                            break;
                        }
                        setState(163);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                            case 1: {
                                setState(162);
                                regex_flag();
                            }
                            break;
                        }
                        setState(166);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(165);
                                number_limit_flag();
                            }
                        }

                        setState(168);
                        class_pattern();
                        setState(170);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(169);
                                method_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(173);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(172);
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

    public static class Thread_commandContext extends ParserRuleContext {
        public TerminalNode THREAD_COMMAND() {
            return getToken(CommandParser.THREAD_COMMAND, 0);
        }

        public Top_N_Busy_flagContext top_N_Busy_flag() {
            return getRuleContext(Top_N_Busy_flagContext.class, 0);
        }

        public Find_most_blockingthread_flagContext find_most_blockingthread_flag() {
            return getRuleContext(Find_most_blockingthread_flagContext.class, 0);
        }

        public SetSampleInterval_flagContext setSampleInterval_flag() {
            return getRuleContext(SetSampleInterval_flagContext.class, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public General_helpContext general_help() {
            return getRuleContext(General_helpContext.class, 0);
        }

        public Thread_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_thread_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterThread_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitThread_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitThread_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Thread_commandContext thread_command() throws RecognitionException {
        Thread_commandContext _localctx = new Thread_commandContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_thread_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(177);
                match(THREAD_COMMAND);
                setState(193);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 33, _ctx)) {
                    case 1: {
                        setState(179);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
                            case 1: {
                                setState(178);
                                top_N_Busy_flag();
                            }
                            break;
                        }
                        setState(182);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 29, _ctx)) {
                            case 1: {
                                setState(181);
                                find_most_blockingthread_flag();
                            }
                            break;
                        }
                        setState(185);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(184);
                                setSampleInterval_flag();
                            }
                        }

                        setState(188);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(187);
                                id();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(191);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(190);
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

    public static class Jvm_commandContext extends ParserRuleContext {
        public TerminalNode JVM_COMMAND() {
            return getToken(CommandParser.JVM_COMMAND, 0);
        }

        public General_helpContext general_help() {
            return getRuleContext(General_helpContext.class, 0);
        }

        public Jvm_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_jvm_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterJvm_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitJvm_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitJvm_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Jvm_commandContext jvm_command() throws RecognitionException {
        Jvm_commandContext _localctx = new Jvm_commandContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_jvm_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(195);
                match(JVM_COMMAND);
                setState(197);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__0) {
                    {
                        setState(196);
                        general_help();
                    }
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

        public List_flagContext list_flag() {
            return getRuleContext(List_flagContext.class, 0);
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
        enterRule(_localctx, 20, RULE_classloader_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(199);
                match(CLASSLOADER_COMMAND);
                setState(221);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
                    case 1: {
                        setState(201);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
                            case 1: {
                                setState(200);
                                all_flag();
                            }
                            break;
                        }
                        setState(204);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
                            case 1: {
                                setState(203);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(207);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
                            case 1: {
                                setState(206);
                                includeReflectionClassLoader_flag();
                            }
                            break;
                        }
                        setState(210);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 38, _ctx)) {
                            case 1: {
                                setState(209);
                                resource_flag();
                            }
                            break;
                        }
                        setState(213);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                            case 1: {
                                setState(212);
                                tree_flag();
                            }
                            break;
                        }
                        setState(216);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(215);
                                list_flag();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(219);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(218);
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
        enterRule(_localctx, 22, RULE_keymap_command);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(223);
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
        enterRule(_localctx, 24, RULE_exit_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(225);
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
        enterRule(_localctx, 26, RULE_cls_command);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(227);
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
        enterRule(_localctx, 28, RULE_general_help);
        try {
            setState(233);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(229);
                    match(T__0);
                    setState(230);
                    match(HELP_COMMAND);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(231);
                    match(T__0);
                    setState(232);
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
        enterRule(_localctx, 30, RULE_field_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(235);
                match(T__0);
                setState(236);
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
        enterRule(_localctx, 32, RULE_resource_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(238);
                match(T__0);
                setState(239);
                match(RESOURCE);
                setState(240);
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
        enterRule(_localctx, 34, RULE_tree_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(242);
                match(T__0);
                setState(243);
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

    public static class List_flagContext extends ParserRuleContext {
        public TerminalNode LIST() {
            return getToken(CommandParser.LIST, 0);
        }

        public List_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_list_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterList_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitList_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor) return ((CommandVisitor<? extends T>) visitor).visitList_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final List_flagContext list_flag() throws RecognitionException {
        List_flagContext _localctx = new List_flagContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_list_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(245);
                match(T__0);
                setState(246);
                match(LIST);
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
        enterRule(_localctx, 38, RULE_regex_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(248);
                match(T__0);
                setState(249);
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

    public static class Find_most_blockingthread_flagContext extends ParserRuleContext {
        public TerminalNode FIND_MOST_BLOCKINGTHREAD() {
            return getToken(CommandParser.FIND_MOST_BLOCKINGTHREAD, 0);
        }

        public Find_most_blockingthread_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_find_most_blockingthread_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener)
                ((CommandListener) listener).enterFind_most_blockingthread_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener)
                ((CommandListener) listener).exitFind_most_blockingthread_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitFind_most_blockingthread_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Find_most_blockingthread_flagContext find_most_blockingthread_flag() throws RecognitionException {
        Find_most_blockingthread_flagContext _localctx = new Find_most_blockingthread_flagContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_find_most_blockingthread_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(251);
                match(T__0);
                setState(252);
                match(FIND_MOST_BLOCKINGTHREAD);
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
        enterRule(_localctx, 42, RULE_extend_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(254);
                match(T__0);
                setState(255);
                match(EXTEND);
                setState(256);
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

        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
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
        enterRule(_localctx, 44, RULE_hashcode_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(258);
                match(T__0);
                setState(259);
                match(HASHCODE_FLAG);
                setState(260);
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

    public static class Number_limit_flagContext extends ParserRuleContext {
        public TerminalNode NUMBER_LIMIT() {
            return getToken(CommandParser.NUMBER_LIMIT, 0);
        }

        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Number_limit_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_number_limit_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterNumber_limit_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitNumber_limit_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitNumber_limit_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Number_limit_flagContext number_limit_flag() throws RecognitionException {
        Number_limit_flagContext _localctx = new Number_limit_flagContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_number_limit_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(262);
                match(T__0);
                setState(263);
                match(NUMBER_LIMIT);
                setState(264);
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

    public static class Cycle_flagContext extends ParserRuleContext {
        public TerminalNode HASHCODE_FLAG() {
            return getToken(CommandParser.HASHCODE_FLAG, 0);
        }

        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Cycle_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cycle_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterCycle_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitCycle_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor) return ((CommandVisitor<? extends T>) visitor).visitCycle_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Cycle_flagContext cycle_flag() throws RecognitionException {
        Cycle_flagContext _localctx = new Cycle_flagContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_cycle_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(266);
                match(T__0);
                setState(267);
                match(HASHCODE_FLAG);
                setState(268);
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

    public static class Top_N_Busy_flagContext extends ParserRuleContext {
        public TerminalNode NUMBER_LIMIT() {
            return getToken(CommandParser.NUMBER_LIMIT, 0);
        }

        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Top_N_Busy_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_top_N_Busy_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterTop_N_Busy_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitTop_N_Busy_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitTop_N_Busy_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Top_N_Busy_flagContext top_N_Busy_flag() throws RecognitionException {
        Top_N_Busy_flagContext _localctx = new Top_N_Busy_flagContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_top_N_Busy_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(270);
                match(T__0);
                setState(271);
                match(NUMBER_LIMIT);
                setState(272);
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

    public static class SetSampleInterval_flagContext extends ParserRuleContext {
        public TerminalNode INCLUDEREFLECTIONCLASSLOADER_FLAG() {
            return getToken(CommandParser.INCLUDEREFLECTIONCLASSLOADER_FLAG, 0);
        }

        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public SetSampleInterval_flagContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_setSampleInterval_flag;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterSetSampleInterval_flag(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitSetSampleInterval_flag(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitSetSampleInterval_flag(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SetSampleInterval_flagContext setSampleInterval_flag() throws RecognitionException {
        SetSampleInterval_flagContext _localctx = new SetSampleInterval_flagContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_setSampleInterval_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(274);
                match(T__0);
                setState(275);
                match(INCLUDEREFLECTIONCLASSLOADER_FLAG);
                setState(276);
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
        enterRule(_localctx, 54, RULE_includeReflectionClassLoader_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(278);
                match(T__0);
                setState(279);
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
        enterRule(_localctx, 56, RULE_detail_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(281);
                match(T__0);
                setState(282);
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
        enterRule(_localctx, 58, RULE_all_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(284);
                match(T__0);
                setState(285);
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
        enterRule(_localctx, 60, RULE_class_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(287);
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

    public static class Field_patternContext extends ParserRuleContext {
        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Field_patternContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_field_pattern;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterField_pattern(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitField_pattern(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitField_pattern(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Field_patternContext field_pattern() throws RecognitionException {
        Field_patternContext _localctx = new Field_patternContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_field_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(289);
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

    public static class Express_patternContext extends ParserRuleContext {
        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Express_patternContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_express_pattern;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterExpress_pattern(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitExpress_pattern(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitExpress_pattern(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Express_patternContext express_pattern() throws RecognitionException {
        Express_patternContext _localctx = new Express_patternContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_express_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(291);
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

    public static class IdContext extends ParserRuleContext {
        public Any_nameContext any_name() {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public IdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_id;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterId(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitId(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor) return ((CommandVisitor<? extends T>) visitor).visitId(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IdContext id() throws RecognitionException {
        IdContext _localctx = new IdContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_id);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(293);
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
        enterRule(_localctx, 68, RULE_method_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(295);
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
        enterRule(_localctx, 70, RULE_any_name);
        try {
            setState(303);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(297);
                    match(IDENTIFIER);
                }
                break;
                case STRING_LITERAL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(298);
                    match(STRING_LITERAL);
                }
                break;
                case T__1:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(299);
                    match(T__1);
                    setState(300);
                    any_name();
                    setState(301);
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0134\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\5\3Y\n\3\3\4\3\4\3\5\3\5\5\5_\n\5\3\5\5\5b\n\5\3\5\5" +
                    "\5e\n\5\3\5\5\5h\n\5\3\5\3\5\5\5l\n\5\5\5n\n\5\3\6\3\6\5\6r\n\6\3\6\5" +
                    "\6u\n\6\3\6\3\6\5\6y\n\6\3\6\5\6|\n\6\5\6~\n\6\3\7\3\7\5\7\u0082\n\7\3" +
                    "\7\5\7\u0085\n\7\3\7\3\7\5\7\u0089\n\7\3\7\5\7\u008c\n\7\5\7\u008e\n\7" +
                    "\3\b\3\b\5\b\u0092\n\b\3\b\5\b\u0095\n\b\3\b\3\b\3\b\5\b\u009a\n\b\3\b" +
                    "\5\b\u009d\n\b\5\b\u009f\n\b\3\t\3\t\5\t\u00a3\n\t\3\t\5\t\u00a6\n\t\3" +
                    "\t\5\t\u00a9\n\t\3\t\3\t\5\t\u00ad\n\t\3\t\5\t\u00b0\n\t\5\t\u00b2\n\t" +
                    "\3\n\3\n\5\n\u00b6\n\n\3\n\5\n\u00b9\n\n\3\n\5\n\u00bc\n\n\3\n\5\n\u00bf" +
                    "\n\n\3\n\5\n\u00c2\n\n\5\n\u00c4\n\n\3\13\3\13\5\13\u00c8\n\13\3\f\3\f" +
                    "\5\f\u00cc\n\f\3\f\5\f\u00cf\n\f\3\f\5\f\u00d2\n\f\3\f\5\f\u00d5\n\f\3" +
                    "\f\5\f\u00d8\n\f\3\f\5\f\u00db\n\f\3\f\5\f\u00de\n\f\5\f\u00e0\n\f\3\r" +
                    "\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00ec\n\20\3\21\3\21" +
                    "\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25" +
                    "\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31" +
                    "\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35" +
                    "\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$" +
                    "\3$\3%\3%\3%\3%\3%\3%\5%\u0132\n%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30" +
                    "\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\3\3\2\17\21\2\u0147\2J\3\2\2" +
                    "\2\4X\3\2\2\2\6Z\3\2\2\2\b\\\3\2\2\2\no\3\2\2\2\f\177\3\2\2\2\16\u008f" +
                    "\3\2\2\2\20\u00a0\3\2\2\2\22\u00b3\3\2\2\2\24\u00c5\3\2\2\2\26\u00c9\3" +
                    "\2\2\2\30\u00e1\3\2\2\2\32\u00e3\3\2\2\2\34\u00e5\3\2\2\2\36\u00eb\3\2" +
                    "\2\2 \u00ed\3\2\2\2\"\u00f0\3\2\2\2$\u00f4\3\2\2\2&\u00f7\3\2\2\2(\u00fa" +
                    "\3\2\2\2*\u00fd\3\2\2\2,\u0100\3\2\2\2.\u0104\3\2\2\2\60\u0108\3\2\2\2" +
                    "\62\u010c\3\2\2\2\64\u0110\3\2\2\2\66\u0114\3\2\2\28\u0118\3\2\2\2:\u011b" +
                    "\3\2\2\2<\u011e\3\2\2\2>\u0121\3\2\2\2@\u0123\3\2\2\2B\u0125\3\2\2\2D" +
                    "\u0127\3\2\2\2F\u0129\3\2\2\2H\u0131\3\2\2\2JK\5\4\3\2K\3\3\2\2\2LY\5" +
                    "\6\4\2MY\5\b\5\2NY\5\n\6\2OY\5\26\f\2PY\5\f\7\2QY\5\16\b\2RY\5\20\t\2" +
                    "SY\5\22\n\2TY\5\24\13\2UY\5\30\r\2VY\5\32\16\2WY\5\34\17\2XL\3\2\2\2X" +
                    "M\3\2\2\2XN\3\2\2\2XO\3\2\2\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2" +
                    "XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\5\3\2\2\2Z[\7\23\2\2[\7\3\2" +
                    "\2\2\\m\7\6\2\2]_\5:\36\2^]\3\2\2\2^_\3\2\2\2_a\3\2\2\2`b\5 \21\2a`\3" +
                    "\2\2\2ab\3\2\2\2bd\3\2\2\2ce\5(\25\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\5" +
                    ",\27\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2in\5> \2jl\5\36\20\2kj\3\2\2\2kl\3" +
                    "\2\2\2ln\3\2\2\2m^\3\2\2\2mk\3\2\2\2n\t\3\2\2\2o}\7\7\2\2pr\5:\36\2qp" +
                    "\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\5(\25\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2v" +
                    "x\5> \2wy\5F$\2xw\3\2\2\2xy\3\2\2\2y~\3\2\2\2z|\5\36\20\2{z\3\2\2\2{|" +
                    "\3\2\2\2|~\3\2\2\2}q\3\2\2\2}{\3\2\2\2~\13\3\2\2\2\177\u008d\7\b\2\2\u0080" +
                    "\u0082\5.\30\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2" +
                    "\2\2\u0083\u0085\5(\25\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085" +
                    "\u0086\3\2\2\2\u0086\u0088\5> \2\u0087\u0089\5F$\2\u0088\u0087\3\2\2\2" +
                    "\u0088\u0089\3\2\2\2\u0089\u008e\3\2\2\2\u008a\u008c\5\36\20\2\u008b\u008a" +
                    "\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u0081\3\2\2\2\u008d" +
                    "\u008b\3\2\2\2\u008e\r\3\2\2\2\u008f\u009e\7\t\2\2\u0090\u0092\5.\30\2" +
                    "\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0095" +
                    "\5(\25\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096" +
                    "\u0097\5> \2\u0097\u0099\5F$\2\u0098\u009a\5B\"\2\u0099\u0098\3\2\2\2" +
                    "\u0099\u009a\3\2\2\2\u009a\u009f\3\2\2\2\u009b\u009d\5\36\20\2\u009c\u009b" +
                    "\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u0091\3\2\2\2\u009e" +
                    "\u009c\3\2\2\2\u009f\17\3\2\2\2\u00a0\u00b1\7\n\2\2\u00a1\u00a3\5\62\32" +
                    "\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6" +
                    "\5(\25\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7" +
                    "\u00a9\5\60\31\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3" +
                    "\2\2\2\u00aa\u00ac\5> \2\u00ab\u00ad\5F$\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad" +
                    "\3\2\2\2\u00ad\u00b2\3\2\2\2\u00ae\u00b0\5\36\20\2\u00af\u00ae\3\2\2\2" +
                    "\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00a2\3\2\2\2\u00b1\u00af" +
                    "\3\2\2\2\u00b2\21\3\2\2\2\u00b3\u00c3\7\13\2\2\u00b4\u00b6\5\64\33\2\u00b5" +
                    "\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b9\5*" +
                    "\26\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba" +
                    "\u00bc\5\66\34\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3" +
                    "\2\2\2\u00bd\u00bf\5D#\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf" +
                    "\u00c4\3\2\2\2\u00c0\u00c2\5\36\20\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3" +
                    "\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00b5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4" +
                    "\23\3\2\2\2\u00c5\u00c7\7\f\2\2\u00c6\u00c8\5\36\20\2\u00c7\u00c6\3\2" +
                    "\2\2\u00c7\u00c8\3\2\2\2\u00c8\25\3\2\2\2\u00c9\u00df\7\r\2\2\u00ca\u00cc" +
                    "\5<\37\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd" +
                    "\u00cf\5.\30\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2" +
                    "\2\2\u00d0\u00d2\58\35\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2" +
                    "\u00d4\3\2\2\2\u00d3\u00d5\5\"\22\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3" +
                    "\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\5$\23\2\u00d7\u00d6\3\2\2\2\u00d7" +
                    "\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db\5&\24\2\u00da\u00d9\3\2" +
                    "\2\2\u00da\u00db\3\2\2\2\u00db\u00e0\3\2\2\2\u00dc\u00de\5\36\20\2\u00dd" +
                    "\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00cb\3\2" +
                    "\2\2\u00df\u00dd\3\2\2\2\u00e0\27\3\2\2\2\u00e1\u00e2\7\16\2\2\u00e2\31" +
                    "\3\2\2\2\u00e3\u00e4\t\2\2\2\u00e4\33\3\2\2\2\u00e5\u00e6\7\22\2\2\u00e6" +
                    "\35\3\2\2\2\u00e7\u00e8\7\3\2\2\u00e8\u00ec\7\23\2\2\u00e9\u00ea\7\3\2" +
                    "\2\u00ea\u00ec\7\24\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec" +
                    "\37\3\2\2\2\u00ed\u00ee\7\3\2\2\u00ee\u00ef\7\27\2\2\u00ef!\3\2\2\2\u00f0" +
                    "\u00f1\7\3\2\2\u00f1\u00f2\7\37\2\2\u00f2\u00f3\5H%\2\u00f3#\3\2\2\2\u00f4" +
                    "\u00f5\7\3\2\2\u00f5\u00f6\7 \2\2\u00f6%\3\2\2\2\u00f7\u00f8\7\3\2\2\u00f8" +
                    "\u00f9\7!\2\2\u00f9\'\3\2\2\2\u00fa\u00fb\7\3\2\2\u00fb\u00fc\7\30\2\2" +
                    "\u00fc)\3\2\2\2\u00fd\u00fe\7\3\2\2\u00fe\u00ff\7\31\2\2\u00ff+\3\2\2" +
                    "\2\u0100\u0101\7\3\2\2\u0101\u0102\7\32\2\2\u0102\u0103\7#\2\2\u0103-" +
                    "\3\2\2\2\u0104\u0105\7\3\2\2\u0105\u0106\7\33\2\2\u0106\u0107\5H%\2\u0107" +
                    "/\3\2\2\2\u0108\u0109\7\3\2\2\u0109\u010a\7\34\2\2\u010a\u010b\5H%\2\u010b" +
                    "\61\3\2\2\2\u010c\u010d\7\3\2\2\u010d\u010e\7\33\2\2\u010e\u010f\5H%\2" +
                    "\u010f\63\3\2\2\2\u0110\u0111\7\3\2\2\u0111\u0112\7\34\2\2\u0112\u0113" +
                    "\5H%\2\u0113\65\3\2\2\2\u0114\u0115\7\3\2\2\u0115\u0116\7\36\2\2\u0116" +
                    "\u0117\5H%\2\u0117\67\3\2\2\2\u0118\u0119\7\3\2\2\u0119\u011a\7\36\2\2" +
                    "\u011a9\3\2\2\2\u011b\u011c\7\3\2\2\u011c\u011d\7\25\2\2\u011d;\3\2\2" +
                    "\2\u011e\u011f\7\3\2\2\u011f\u0120\7\26\2\2\u0120=\3\2\2\2\u0121\u0122" +
                    "\5H%\2\u0122?\3\2\2\2\u0123\u0124\5H%\2\u0124A\3\2\2\2\u0125\u0126\5H" +
                    "%\2\u0126C\3\2\2\2\u0127\u0128\5H%\2\u0128E\3\2\2\2\u0129\u012a\5H%\2" +
                    "\u012aG\3\2\2\2\u012b\u0132\7\"\2\2\u012c\u0132\7\'\2\2\u012d\u012e\7" +
                    "\4\2\2\u012e\u012f\5H%\2\u012f\u0130\7\5\2\2\u0130\u0132\3\2\2\2\u0131" +
                    "\u012b\3\2\2\2\u0131\u012c\3\2\2\2\u0131\u012d\3\2\2\2\u0132I\3\2\2\2" +
                    "/X^adgkmqtx{}\u0081\u0084\u0088\u008b\u008d\u0091\u0094\u0099\u009c\u009e" +
                    "\u00a2\u00a5\u00a8\u00ac\u00af\u00b1\u00b5\u00b8\u00bb\u00be\u00c1\u00c3" +
                    "\u00c7\u00cb\u00ce\u00d1\u00d4\u00d7\u00da\u00dd\u00df\u00eb\u0131";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}