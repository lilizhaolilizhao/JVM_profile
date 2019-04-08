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
            DUMP_COMMAND = 8, MONITOR_COMMAND = 9, THREAD_COMMAND = 10, JVM_COMMAND = 11,
            CLASSLOADER_COMMAND = 12, KEYMAP_COMMAND = 13, EXIT_COMMAND = 14, LOGOUT_COMMAND = 15,
            QUIT_COMMAND = 16, CLS_COMMAND = 17, HELP_COMMAND = 18, HELP = 19, DETAIL = 20,
            ALL_INFO = 21, FIELD = 22, REGEX = 23, FIND_MOST_BLOCKINGTHREAD = 24, EXTEND = 25,
            HASHCODE_FLAG = 26, NUMBER_LIMIT = 27, CYCLE_FLAG = 28, INCLUDEREFLECTIONCLASSLOADER_FLAG = 29,
            RESOURCE = 30, TREE = 31, LIST = 32, IDENTIFIER = 33, EXTEND_LEVEL = 34, HASHCODE = 35,
            NUMERIC_LITERAL = 36, BIND_PARAMETER = 37, STRING_LITERAL = 38, BLOB_LITERAL = 39,
            SINGLE_LINE_COMMENT = 40, MULTILINE_COMMENT = 41, SPACES = 42, UNEXPECTED_CHAR = 43;
    public static final int
            RULE_parse = 0, RULE_command_list = 1, RULE_help_command = 2, RULE_sc_command = 3,
            RULE_sm_command = 4, RULE_jad_command = 5, RULE_getstatic_command = 6,
            RULE_dump_command = 7, RULE_monitor_command = 8, RULE_thread_command = 9,
            RULE_jvm_command = 10, RULE_classloader_command = 11, RULE_keymap_command = 12,
            RULE_exit_command = 13, RULE_cls_command = 14, RULE_general_help = 15,
            RULE_field_flag = 16, RULE_resource_flag = 17, RULE_tree_flag = 18, RULE_list_flag = 19,
            RULE_regex_flag = 20, RULE_find_most_blockingthread_flag = 21, RULE_extend_flag = 22,
            RULE_hashcode_flag = 23, RULE_number_limit_flag = 24, RULE_cycle_flag = 25,
            RULE_top_N_Busy_flag = 26, RULE_setSampleInterval_flag = 27, RULE_includeReflectionClassLoader_flag = 28,
            RULE_detail_flag = 29, RULE_all_flag = 30, RULE_class_pattern = 31, RULE_field_pattern = 32,
            RULE_express_pattern = 33, RULE_id = 34, RULE_method_pattern = 35, RULE_any_name = 36;

    private static String[] makeRuleNames() {
        return new String[]{
                "parse", "command_list", "help_command", "sc_command", "sm_command",
                "jad_command", "getstatic_command", "dump_command", "monitor_command",
                "thread_command", "jvm_command", "classloader_command", "keymap_command",
                "exit_command", "cls_command", "general_help", "field_flag", "resource_flag",
                "tree_flag", "list_flag", "regex_flag", "find_most_blockingthread_flag",
                "extend_flag", "hashcode_flag", "number_limit_flag", "cycle_flag", "top_N_Busy_flag",
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
                "DUMP_COMMAND", "MONITOR_COMMAND", "THREAD_COMMAND", "JVM_COMMAND", "CLASSLOADER_COMMAND",
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
                setState(74);
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

        public Dump_commandContext dump_command() {
            return getRuleContext(Dump_commandContext.class, 0);
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
                setState(89);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case HELP_COMMAND: {
                        setState(76);
                        help_command();
                    }
                    break;
                    case SC_COMMAND: {
                        setState(77);
                        sc_command();
                    }
                    break;
                    case SM_COMMAND: {
                        setState(78);
                        sm_command();
                    }
                    break;
                    case CLASSLOADER_COMMAND: {
                        setState(79);
                        classloader_command();
                    }
                    break;
                    case JAD_COMMAND: {
                        setState(80);
                        jad_command();
                    }
                    break;
                    case GETSTATIC_COMMAND: {
                        setState(81);
                        getstatic_command();
                    }
                    break;
                    case MONITOR_COMMAND: {
                        setState(82);
                        monitor_command();
                    }
                    break;
                    case THREAD_COMMAND: {
                        setState(83);
                        thread_command();
                    }
                    break;
                    case JVM_COMMAND: {
                        setState(84);
                        jvm_command();
                    }
                    break;
                    case DUMP_COMMAND: {
                        setState(85);
                        dump_command();
                    }
                    break;
                    case KEYMAP_COMMAND: {
                        setState(86);
                        keymap_command();
                    }
                    break;
                    case EXIT_COMMAND:
                    case LOGOUT_COMMAND:
                    case QUIT_COMMAND: {
                        setState(87);
                        exit_command();
                    }
                    break;
                    case CLS_COMMAND: {
                        setState(88);
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
                setState(91);
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
                setState(93);
                match(SC_COMMAND);
                setState(110);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                    case 1: {
                        setState(95);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                            case 1: {
                                setState(94);
                                detail_flag();
                            }
                            break;
                        }
                        setState(98);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                            case 1: {
                                setState(97);
                                field_flag();
                            }
                            break;
                        }
                        setState(101);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                            case 1: {
                                setState(100);
                                regex_flag();
                            }
                            break;
                        }
                        setState(104);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(103);
                                extend_flag();
                            }
                        }

                        setState(106);
                        class_pattern();
                    }
                    break;
                    case 2: {
                        setState(108);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(107);
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
                setState(112);
                match(SM_COMMAND);
                setState(126);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                    case 1: {
                        setState(114);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                            case 1: {
                                setState(113);
                                detail_flag();
                            }
                            break;
                        }
                        setState(117);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(116);
                                regex_flag();
                            }
                        }

                        setState(119);
                        class_pattern();
                        setState(121);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(120);
                                method_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(124);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(123);
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
                setState(128);
                match(JAD_COMMAND);
                setState(142);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                    case 1: {
                        setState(130);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                            case 1: {
                                setState(129);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(133);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(132);
                                regex_flag();
                            }
                        }

                        setState(135);
                        class_pattern();
                        setState(137);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(136);
                                method_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(140);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(139);
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
                setState(144);
                match(GETSTATIC_COMMAND);
                setState(159);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
                    case 1: {
                        setState(146);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                            case 1: {
                                setState(145);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(149);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(148);
                                regex_flag();
                            }
                        }

                        setState(151);
                        class_pattern();
                        setState(152);
                        method_pattern();
                        setState(154);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(153);
                                express_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(157);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(156);
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

    public static class Dump_commandContext extends ParserRuleContext {
        public TerminalNode DUMP_COMMAND() {
            return getToken(CommandParser.DUMP_COMMAND, 0);
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

        public General_helpContext general_help() {
            return getRuleContext(General_helpContext.class, 0);
        }

        public Dump_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dump_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterDump_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitDump_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitDump_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Dump_commandContext dump_command() throws RecognitionException {
        Dump_commandContext _localctx = new Dump_commandContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_dump_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(161);
                match(DUMP_COMMAND);
                setState(172);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                    case 1: {
                        setState(163);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                            case 1: {
                                setState(162);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(166);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(165);
                                regex_flag();
                            }
                        }

                        setState(168);
                        class_pattern();
                    }
                    break;
                    case 2: {
                        setState(170);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(169);
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
        enterRule(_localctx, 16, RULE_monitor_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(174);
                match(MONITOR_COMMAND);
                setState(191);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
                    case 1: {
                        setState(176);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
                            case 1: {
                                setState(175);
                                cycle_flag();
                            }
                            break;
                        }
                        setState(179);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                            case 1: {
                                setState(178);
                                regex_flag();
                            }
                            break;
                        }
                        setState(182);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(181);
                                number_limit_flag();
                            }
                        }

                        setState(184);
                        class_pattern();
                        setState(186);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(185);
                                method_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(189);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(188);
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
        enterRule(_localctx, 18, RULE_thread_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(193);
                match(THREAD_COMMAND);
                setState(209);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
                    case 1: {
                        setState(195);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 32, _ctx)) {
                            case 1: {
                                setState(194);
                                top_N_Busy_flag();
                            }
                            break;
                        }
                        setState(198);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 33, _ctx)) {
                            case 1: {
                                setState(197);
                                find_most_blockingthread_flag();
                            }
                            break;
                        }
                        setState(201);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(200);
                                setSampleInterval_flag();
                            }
                        }

                        setState(204);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(203);
                                id();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(207);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(206);
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
        enterRule(_localctx, 20, RULE_jvm_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(211);
                match(JVM_COMMAND);
                setState(213);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__0) {
                    {
                        setState(212);
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
        enterRule(_localctx, 22, RULE_classloader_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(215);
                match(CLASSLOADER_COMMAND);
                setState(237);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 46, _ctx)) {
                    case 1: {
                        setState(217);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                            case 1: {
                                setState(216);
                                all_flag();
                            }
                            break;
                        }
                        setState(220);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 40, _ctx)) {
                            case 1: {
                                setState(219);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(223);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 41, _ctx)) {
                            case 1: {
                                setState(222);
                                includeReflectionClassLoader_flag();
                            }
                            break;
                        }
                        setState(226);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
                            case 1: {
                                setState(225);
                                resource_flag();
                            }
                            break;
                        }
                        setState(229);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
                            case 1: {
                                setState(228);
                                tree_flag();
                            }
                            break;
                        }
                        setState(232);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(231);
                                list_flag();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(235);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(234);
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
        enterRule(_localctx, 24, RULE_keymap_command);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(239);
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
        enterRule(_localctx, 26, RULE_exit_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(241);
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
        enterRule(_localctx, 28, RULE_cls_command);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(243);
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
        enterRule(_localctx, 30, RULE_general_help);
        try {
            setState(249);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 47, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(245);
                    match(T__0);
                    setState(246);
                    match(HELP_COMMAND);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(247);
                    match(T__0);
                    setState(248);
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
        enterRule(_localctx, 32, RULE_field_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(251);
                match(T__0);
                setState(252);
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
        enterRule(_localctx, 34, RULE_resource_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(254);
                match(T__0);
                setState(255);
                match(RESOURCE);
                setState(256);
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
        enterRule(_localctx, 36, RULE_tree_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(258);
                match(T__0);
                setState(259);
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
        enterRule(_localctx, 38, RULE_list_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(261);
                match(T__0);
                setState(262);
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
        enterRule(_localctx, 40, RULE_regex_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(264);
                match(T__0);
                setState(265);
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
        enterRule(_localctx, 42, RULE_find_most_blockingthread_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(267);
                match(T__0);
                setState(268);
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
        enterRule(_localctx, 44, RULE_extend_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(270);
                match(T__0);
                setState(271);
                match(EXTEND);
                setState(272);
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
        enterRule(_localctx, 46, RULE_hashcode_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(274);
                match(T__0);
                setState(275);
                match(HASHCODE_FLAG);
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
        enterRule(_localctx, 48, RULE_number_limit_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(278);
                match(T__0);
                setState(279);
                match(NUMBER_LIMIT);
                setState(280);
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
        enterRule(_localctx, 50, RULE_cycle_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(282);
                match(T__0);
                setState(283);
                match(HASHCODE_FLAG);
                setState(284);
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
        enterRule(_localctx, 52, RULE_top_N_Busy_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(286);
                match(T__0);
                setState(287);
                match(NUMBER_LIMIT);
                setState(288);
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
        enterRule(_localctx, 54, RULE_setSampleInterval_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(290);
                match(T__0);
                setState(291);
                match(INCLUDEREFLECTIONCLASSLOADER_FLAG);
                setState(292);
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
        enterRule(_localctx, 56, RULE_includeReflectionClassLoader_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(294);
                match(T__0);
                setState(295);
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
        enterRule(_localctx, 58, RULE_detail_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(297);
                match(T__0);
                setState(298);
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
        enterRule(_localctx, 60, RULE_all_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(300);
                match(T__0);
                setState(301);
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
        enterRule(_localctx, 62, RULE_class_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(303);
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
        enterRule(_localctx, 64, RULE_field_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(305);
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
        enterRule(_localctx, 66, RULE_express_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(307);
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
        enterRule(_localctx, 68, RULE_id);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(309);
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
        enterRule(_localctx, 70, RULE_method_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(311);
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
        enterRule(_localctx, 72, RULE_any_name);
        try {
            setState(319);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(313);
                    match(IDENTIFIER);
                }
                break;
                case STRING_LITERAL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(314);
                    match(STRING_LITERAL);
                }
                break;
                case T__1:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(315);
                    match(T__1);
                    setState(316);
                    any_name();
                    setState(317);
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0144\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\\\n\3\3\4\3\4\3\5\3\5\5\5b\n\5\3\5\5\5" +
                    "e\n\5\3\5\5\5h\n\5\3\5\5\5k\n\5\3\5\3\5\5\5o\n\5\5\5q\n\5\3\6\3\6\5\6" +
                    "u\n\6\3\6\5\6x\n\6\3\6\3\6\5\6|\n\6\3\6\5\6\177\n\6\5\6\u0081\n\6\3\7" +
                    "\3\7\5\7\u0085\n\7\3\7\5\7\u0088\n\7\3\7\3\7\5\7\u008c\n\7\3\7\5\7\u008f" +
                    "\n\7\5\7\u0091\n\7\3\b\3\b\5\b\u0095\n\b\3\b\5\b\u0098\n\b\3\b\3\b\3\b" +
                    "\5\b\u009d\n\b\3\b\5\b\u00a0\n\b\5\b\u00a2\n\b\3\t\3\t\5\t\u00a6\n\t\3" +
                    "\t\5\t\u00a9\n\t\3\t\3\t\5\t\u00ad\n\t\5\t\u00af\n\t\3\n\3\n\5\n\u00b3" +
                    "\n\n\3\n\5\n\u00b6\n\n\3\n\5\n\u00b9\n\n\3\n\3\n\5\n\u00bd\n\n\3\n\5\n" +
                    "\u00c0\n\n\5\n\u00c2\n\n\3\13\3\13\5\13\u00c6\n\13\3\13\5\13\u00c9\n\13" +
                    "\3\13\5\13\u00cc\n\13\3\13\5\13\u00cf\n\13\3\13\5\13\u00d2\n\13\5\13\u00d4" +
                    "\n\13\3\f\3\f\5\f\u00d8\n\f\3\r\3\r\5\r\u00dc\n\r\3\r\5\r\u00df\n\r\3" +
                    "\r\5\r\u00e2\n\r\3\r\5\r\u00e5\n\r\3\r\5\r\u00e8\n\r\3\r\5\r\u00eb\n\r" +
                    "\3\r\5\r\u00ee\n\r\5\r\u00f0\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3" +
                    "\21\3\21\3\21\5\21\u00fc\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24" +
                    "\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30" +
                    "\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34" +
                    "\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3" +
                    " \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\5&\u0142\n&\3&" +
                    "\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<" +
                    ">@BDFHJ\2\3\3\2\20\22\2\u015b\2L\3\2\2\2\4[\3\2\2\2\6]\3\2\2\2\b_\3\2" +
                    "\2\2\nr\3\2\2\2\f\u0082\3\2\2\2\16\u0092\3\2\2\2\20\u00a3\3\2\2\2\22\u00b0" +
                    "\3\2\2\2\24\u00c3\3\2\2\2\26\u00d5\3\2\2\2\30\u00d9\3\2\2\2\32\u00f1\3" +
                    "\2\2\2\34\u00f3\3\2\2\2\36\u00f5\3\2\2\2 \u00fb\3\2\2\2\"\u00fd\3\2\2" +
                    "\2$\u0100\3\2\2\2&\u0104\3\2\2\2(\u0107\3\2\2\2*\u010a\3\2\2\2,\u010d" +
                    "\3\2\2\2.\u0110\3\2\2\2\60\u0114\3\2\2\2\62\u0118\3\2\2\2\64\u011c\3\2" +
                    "\2\2\66\u0120\3\2\2\28\u0124\3\2\2\2:\u0128\3\2\2\2<\u012b\3\2\2\2>\u012e" +
                    "\3\2\2\2@\u0131\3\2\2\2B\u0133\3\2\2\2D\u0135\3\2\2\2F\u0137\3\2\2\2H" +
                    "\u0139\3\2\2\2J\u0141\3\2\2\2LM\5\4\3\2M\3\3\2\2\2N\\\5\6\4\2O\\\5\b\5" +
                    "\2P\\\5\n\6\2Q\\\5\30\r\2R\\\5\f\7\2S\\\5\16\b\2T\\\5\22\n\2U\\\5\24\13" +
                    "\2V\\\5\26\f\2W\\\5\20\t\2X\\\5\32\16\2Y\\\5\34\17\2Z\\\5\36\20\2[N\3" +
                    "\2\2\2[O\3\2\2\2[P\3\2\2\2[Q\3\2\2\2[R\3\2\2\2[S\3\2\2\2[T\3\2\2\2[U\3" +
                    "\2\2\2[V\3\2\2\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\5\3\2\2\2]" +
                    "^\7\24\2\2^\7\3\2\2\2_p\7\6\2\2`b\5<\37\2a`\3\2\2\2ab\3\2\2\2bd\3\2\2" +
                    "\2ce\5\"\22\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\5*\26\2gf\3\2\2\2gh\3\2" +
                    "\2\2hj\3\2\2\2ik\5.\30\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lq\5@!\2mo\5 \21" +
                    "\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2pa\3\2\2\2pn\3\2\2\2q\t\3\2\2\2r\u0080" +
                    "\7\7\2\2su\5<\37\2ts\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\5*\26\2wv\3\2\2\2w" +
                    "x\3\2\2\2xy\3\2\2\2y{\5@!\2z|\5H%\2{z\3\2\2\2{|\3\2\2\2|\u0081\3\2\2\2" +
                    "}\177\5 \21\2~}\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080t\3\2\2\2" +
                    "\u0080~\3\2\2\2\u0081\13\3\2\2\2\u0082\u0090\7\b\2\2\u0083\u0085\5\60" +
                    "\31\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086" +
                    "\u0088\5*\26\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2" +
                    "\2\2\u0089\u008b\5@!\2\u008a\u008c\5H%\2\u008b\u008a\3\2\2\2\u008b\u008c" +
                    "\3\2\2\2\u008c\u0091\3\2\2\2\u008d\u008f\5 \21\2\u008e\u008d\3\2\2\2\u008e" +
                    "\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u0084\3\2\2\2\u0090\u008e\3\2" +
                    "\2\2\u0091\r\3\2\2\2\u0092\u00a1\7\t\2\2\u0093\u0095\5\60\31\2\u0094\u0093" +
                    "\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5*\26\2\u0097" +
                    "\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\5@" +
                    "!\2\u009a\u009c\5H%\2\u009b\u009d\5D#\2\u009c\u009b\3\2\2\2\u009c\u009d" +
                    "\3\2\2\2\u009d\u00a2\3\2\2\2\u009e\u00a0\5 \21\2\u009f\u009e\3\2\2\2\u009f" +
                    "\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u0094\3\2\2\2\u00a1\u009f\3\2" +
                    "\2\2\u00a2\17\3\2\2\2\u00a3\u00ae\7\n\2\2\u00a4\u00a6\5\60\31\2\u00a5" +
                    "\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\5*" +
                    "\26\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa" +
                    "\u00af\5@!\2\u00ab\u00ad\5 \21\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2" +
                    "\2\u00ad\u00af\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\21" +
                    "\3\2\2\2\u00b0\u00c1\7\13\2\2\u00b1\u00b3\5\64\33\2\u00b2\u00b1\3\2\2" +
                    "\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b6\5*\26\2\u00b5\u00b4" +
                    "\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b9\5\62\32\2" +
                    "\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc" +
                    "\5@!\2\u00bb\u00bd\5H%\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd" +
                    "\u00c2\3\2\2\2\u00be\u00c0\5 \21\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2" +
                    "\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00b2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2" +
                    "\23\3\2\2\2\u00c3\u00d3\7\f\2\2\u00c4\u00c6\5\66\34\2\u00c5\u00c4\3\2" +
                    "\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c9\5,\27\2\u00c8" +
                    "\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00cc\58" +
                    "\35\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd" +
                    "\u00cf\5F$\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d4\3\2\2" +
                    "\2\u00d0\u00d2\5 \21\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4" +
                    "\3\2\2\2\u00d3\u00c5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\25\3\2\2\2\u00d5" +
                    "\u00d7\7\r\2\2\u00d6\u00d8\5 \21\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2" +
                    "\2\2\u00d8\27\3\2\2\2\u00d9\u00ef\7\16\2\2\u00da\u00dc\5> \2\u00db\u00da" +
                    "\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00df\5\60\31\2" +
                    "\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00e2" +
                    "\5:\36\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3" +
                    "\u00e5\5$\23\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2" +
                    "\2\2\u00e6\u00e8\5&\24\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8" +
                    "\u00ea\3\2\2\2\u00e9\u00eb\5(\25\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2" +
                    "\2\2\u00eb\u00f0\3\2\2\2\u00ec\u00ee\5 \21\2\u00ed\u00ec\3\2\2\2\u00ed" +
                    "\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00db\3\2\2\2\u00ef\u00ed\3\2" +
                    "\2\2\u00f0\31\3\2\2\2\u00f1\u00f2\7\17\2\2\u00f2\33\3\2\2\2\u00f3\u00f4" +
                    "\t\2\2\2\u00f4\35\3\2\2\2\u00f5\u00f6\7\23\2\2\u00f6\37\3\2\2\2\u00f7" +
                    "\u00f8\7\3\2\2\u00f8\u00fc\7\24\2\2\u00f9\u00fa\7\3\2\2\u00fa\u00fc\7" +
                    "\25\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc!\3\2\2\2\u00fd\u00fe" +
                    "\7\3\2\2\u00fe\u00ff\7\30\2\2\u00ff#\3\2\2\2\u0100\u0101\7\3\2\2\u0101" +
                    "\u0102\7 \2\2\u0102\u0103\5J&\2\u0103%\3\2\2\2\u0104\u0105\7\3\2\2\u0105" +
                    "\u0106\7!\2\2\u0106\'\3\2\2\2\u0107\u0108\7\3\2\2\u0108\u0109\7\"\2\2" +
                    "\u0109)\3\2\2\2\u010a\u010b\7\3\2\2\u010b\u010c\7\31\2\2\u010c+\3\2\2" +
                    "\2\u010d\u010e\7\3\2\2\u010e\u010f\7\32\2\2\u010f-\3\2\2\2\u0110\u0111" +
                    "\7\3\2\2\u0111\u0112\7\33\2\2\u0112\u0113\7$\2\2\u0113/\3\2\2\2\u0114" +
                    "\u0115\7\3\2\2\u0115\u0116\7\34\2\2\u0116\u0117\5J&\2\u0117\61\3\2\2\2" +
                    "\u0118\u0119\7\3\2\2\u0119\u011a\7\35\2\2\u011a\u011b\5J&\2\u011b\63\3" +
                    "\2\2\2\u011c\u011d\7\3\2\2\u011d\u011e\7\34\2\2\u011e\u011f\5J&\2\u011f" +
                    "\65\3\2\2\2\u0120\u0121\7\3\2\2\u0121\u0122\7\35\2\2\u0122\u0123\5J&\2" +
                    "\u0123\67\3\2\2\2\u0124\u0125\7\3\2\2\u0125\u0126\7\37\2\2\u0126\u0127" +
                    "\5J&\2\u01279\3\2\2\2\u0128\u0129\7\3\2\2\u0129\u012a\7\37\2\2\u012a;" +
                    "\3\2\2\2\u012b\u012c\7\3\2\2\u012c\u012d\7\26\2\2\u012d=\3\2\2\2\u012e" +
                    "\u012f\7\3\2\2\u012f\u0130\7\27\2\2\u0130?\3\2\2\2\u0131\u0132\5J&\2\u0132" +
                    "A\3\2\2\2\u0133\u0134\5J&\2\u0134C\3\2\2\2\u0135\u0136\5J&\2\u0136E\3" +
                    "\2\2\2\u0137\u0138\5J&\2\u0138G\3\2\2\2\u0139\u013a\5J&\2\u013aI\3\2\2" +
                    "\2\u013b\u0142\7#\2\2\u013c\u0142\7(\2\2\u013d\u013e\7\4\2\2\u013e\u013f" +
                    "\5J&\2\u013f\u0140\7\5\2\2\u0140\u0142\3\2\2\2\u0141\u013b\3\2\2\2\u0141" +
                    "\u013c\3\2\2\2\u0141\u013d\3\2\2\2\u0142K\3\2\2\2\63[adgjnptw{~\u0080" +
                    "\u0084\u0087\u008b\u008e\u0090\u0094\u0097\u009c\u009f\u00a1\u00a5\u00a8" +
                    "\u00ac\u00ae\u00b2\u00b5\u00b8\u00bc\u00bf\u00c1\u00c5\u00c8\u00cb\u00ce" +
                    "\u00d1\u00d3\u00d7\u00db\u00de\u00e1\u00e4\u00e7\u00ea\u00ed\u00ef\u00fb" +
                    "\u0141";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}