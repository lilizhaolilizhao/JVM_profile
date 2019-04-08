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
            DUMP_COMMAND = 8, RESET_COMMAND = 9, MONITOR_COMMAND = 10, THREAD_COMMAND = 11,
            JVM_COMMAND = 12, CLASSLOADER_COMMAND = 13, KEYMAP_COMMAND = 14, EXIT_COMMAND = 15,
            LOGOUT_COMMAND = 16, QUIT_COMMAND = 17, CLS_COMMAND = 18, HELP_COMMAND = 19, HELP = 20,
            DETAIL = 21, ALL_INFO = 22, FIELD = 23, REGEX = 24, FIND_MOST_BLOCKINGTHREAD = 25,
            EXTEND = 26, HASHCODE_FLAG = 27, NUMBER_LIMIT = 28, CYCLE_FLAG = 29, INCLUDEREFLECTIONCLASSLOADER_FLAG = 30,
            RESOURCE = 31, TREE = 32, LIST = 33, IDENTIFIER = 34, EXTEND_LEVEL = 35, HASHCODE = 36,
            NUMERIC_LITERAL = 37, BIND_PARAMETER = 38, STRING_LITERAL = 39, BLOB_LITERAL = 40,
            SINGLE_LINE_COMMENT = 41, MULTILINE_COMMENT = 42, SPACES = 43, UNEXPECTED_CHAR = 44;
    public static final int
            RULE_parse = 0, RULE_command_list = 1, RULE_help_command = 2, RULE_sc_command = 3,
            RULE_sm_command = 4, RULE_jad_command = 5, RULE_getstatic_command = 6,
            RULE_dump_command = 7, RULE_reset_command = 8, RULE_monitor_command = 9,
            RULE_thread_command = 10, RULE_jvm_command = 11, RULE_classloader_command = 12,
            RULE_keymap_command = 13, RULE_exit_command = 14, RULE_cls_command = 15,
            RULE_general_help = 16, RULE_field_flag = 17, RULE_resource_flag = 18,
            RULE_tree_flag = 19, RULE_list_flag = 20, RULE_regex_flag = 21, RULE_find_most_blockingthread_flag = 22,
            RULE_extend_flag = 23, RULE_hashcode_flag = 24, RULE_number_limit_flag = 25,
            RULE_cycle_flag = 26, RULE_top_N_Busy_flag = 27, RULE_setSampleInterval_flag = 28,
            RULE_includeReflectionClassLoader_flag = 29, RULE_detail_flag = 30, RULE_all_flag = 31,
            RULE_class_pattern = 32, RULE_field_pattern = 33, RULE_express_pattern = 34,
            RULE_id = 35, RULE_method_pattern = 36, RULE_any_name = 37;

    private static String[] makeRuleNames() {
        return new String[]{
                "parse", "command_list", "help_command", "sc_command", "sm_command",
                "jad_command", "getstatic_command", "dump_command", "reset_command",
                "monitor_command", "thread_command", "jvm_command", "classloader_command",
                "keymap_command", "exit_command", "cls_command", "general_help", "field_flag",
                "resource_flag", "tree_flag", "list_flag", "regex_flag", "find_most_blockingthread_flag",
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
                "DUMP_COMMAND", "RESET_COMMAND", "MONITOR_COMMAND", "THREAD_COMMAND",
                "JVM_COMMAND", "CLASSLOADER_COMMAND", "KEYMAP_COMMAND", "EXIT_COMMAND",
                "LOGOUT_COMMAND", "QUIT_COMMAND", "CLS_COMMAND", "HELP_COMMAND", "HELP",
                "DETAIL", "ALL_INFO", "FIELD", "REGEX", "FIND_MOST_BLOCKINGTHREAD", "EXTEND",
                "HASHCODE_FLAG", "NUMBER_LIMIT", "CYCLE_FLAG", "INCLUDEREFLECTIONCLASSLOADER_FLAG",
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
                setState(76);
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

        public Reset_commandContext reset_command() {
            return getRuleContext(Reset_commandContext.class, 0);
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
                setState(92);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case HELP_COMMAND: {
                        setState(78);
                        help_command();
                    }
                    break;
                    case SC_COMMAND: {
                        setState(79);
                        sc_command();
                    }
                    break;
                    case SM_COMMAND: {
                        setState(80);
                        sm_command();
                    }
                    break;
                    case CLASSLOADER_COMMAND: {
                        setState(81);
                        classloader_command();
                    }
                    break;
                    case JAD_COMMAND: {
                        setState(82);
                        jad_command();
                    }
                    break;
                    case GETSTATIC_COMMAND: {
                        setState(83);
                        getstatic_command();
                    }
                    break;
                    case MONITOR_COMMAND: {
                        setState(84);
                        monitor_command();
                    }
                    break;
                    case THREAD_COMMAND: {
                        setState(85);
                        thread_command();
                    }
                    break;
                    case JVM_COMMAND: {
                        setState(86);
                        jvm_command();
                    }
                    break;
                    case DUMP_COMMAND: {
                        setState(87);
                        dump_command();
                    }
                    break;
                    case RESET_COMMAND: {
                        setState(88);
                        reset_command();
                    }
                    break;
                    case KEYMAP_COMMAND: {
                        setState(89);
                        keymap_command();
                    }
                    break;
                    case EXIT_COMMAND:
                    case LOGOUT_COMMAND:
                    case QUIT_COMMAND: {
                        setState(90);
                        exit_command();
                    }
                    break;
                    case CLS_COMMAND: {
                        setState(91);
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
                setState(94);
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
                setState(96);
                match(SC_COMMAND);
                setState(113);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                    case 1: {
                        setState(98);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                            case 1: {
                                setState(97);
                                detail_flag();
                            }
                            break;
                        }
                        setState(101);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                            case 1: {
                                setState(100);
                                field_flag();
                            }
                            break;
                        }
                        setState(104);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                            case 1: {
                                setState(103);
                                regex_flag();
                            }
                            break;
                        }
                        setState(107);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(106);
                                extend_flag();
                            }
                        }

                        setState(109);
                        class_pattern();
                    }
                    break;
                    case 2: {
                        setState(111);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(110);
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
                setState(115);
                match(SM_COMMAND);
                setState(129);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                    case 1: {
                        setState(117);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                            case 1: {
                                setState(116);
                                detail_flag();
                            }
                            break;
                        }
                        setState(120);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(119);
                                regex_flag();
                            }
                        }

                        setState(122);
                        class_pattern();
                        setState(124);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(123);
                                method_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(127);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(126);
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
                setState(131);
                match(JAD_COMMAND);
                setState(145);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                    case 1: {
                        setState(133);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                            case 1: {
                                setState(132);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(136);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(135);
                                regex_flag();
                            }
                        }

                        setState(138);
                        class_pattern();
                        setState(140);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(139);
                                method_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(143);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(142);
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
                setState(147);
                match(GETSTATIC_COMMAND);
                setState(162);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
                    case 1: {
                        setState(149);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                            case 1: {
                                setState(148);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(152);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(151);
                                regex_flag();
                            }
                        }

                        setState(154);
                        class_pattern();
                        setState(155);
                        method_pattern();
                        setState(157);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(156);
                                express_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(160);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(159);
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
                setState(164);
                match(DUMP_COMMAND);
                setState(175);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                    case 1: {
                        setState(166);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                            case 1: {
                                setState(165);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(169);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(168);
                                regex_flag();
                            }
                        }

                        setState(171);
                        class_pattern();
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

    public static class Reset_commandContext extends ParserRuleContext {
        public TerminalNode RESET_COMMAND() {
            return getToken(CommandParser.RESET_COMMAND, 0);
        }

        public Class_patternContext class_pattern() {
            return getRuleContext(Class_patternContext.class, 0);
        }

        public Regex_flagContext regex_flag() {
            return getRuleContext(Regex_flagContext.class, 0);
        }

        public General_helpContext general_help() {
            return getRuleContext(General_helpContext.class, 0);
        }

        public Reset_commandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_reset_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).enterReset_command(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CommandListener) ((CommandListener) listener).exitReset_command(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CommandVisitor)
                return ((CommandVisitor<? extends T>) visitor).visitReset_command(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Reset_commandContext reset_command() throws RecognitionException {
        Reset_commandContext _localctx = new Reset_commandContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_reset_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(177);
                match(RESET_COMMAND);
                setState(185);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
                    case 1: {
                        setState(179);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(178);
                                regex_flag();
                            }
                        }

                        setState(181);
                        class_pattern();
                    }
                    break;
                    case 2: {
                        setState(183);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(182);
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
        enterRule(_localctx, 18, RULE_monitor_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(187);
                match(MONITOR_COMMAND);
                setState(204);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 34, _ctx)) {
                    case 1: {
                        setState(189);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 29, _ctx)) {
                            case 1: {
                                setState(188);
                                cycle_flag();
                            }
                            break;
                        }
                        setState(192);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
                            case 1: {
                                setState(191);
                                regex_flag();
                            }
                            break;
                        }
                        setState(195);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(194);
                                number_limit_flag();
                            }
                        }

                        setState(197);
                        class_pattern();
                        setState(199);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(198);
                                method_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(202);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(201);
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
        enterRule(_localctx, 20, RULE_thread_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(206);
                match(THREAD_COMMAND);
                setState(222);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 40, _ctx)) {
                    case 1: {
                        setState(208);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
                            case 1: {
                                setState(207);
                                top_N_Busy_flag();
                            }
                            break;
                        }
                        setState(211);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
                            case 1: {
                                setState(210);
                                find_most_blockingthread_flag();
                            }
                            break;
                        }
                        setState(214);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(213);
                                setSampleInterval_flag();
                            }
                        }

                        setState(217);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(216);
                                id();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(220);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(219);
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
        enterRule(_localctx, 22, RULE_jvm_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(224);
                match(JVM_COMMAND);
                setState(226);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__0) {
                    {
                        setState(225);
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
        enterRule(_localctx, 24, RULE_classloader_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(228);
                match(CLASSLOADER_COMMAND);
                setState(250);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 49, _ctx)) {
                    case 1: {
                        setState(230);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
                            case 1: {
                                setState(229);
                                all_flag();
                            }
                            break;
                        }
                        setState(233);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
                            case 1: {
                                setState(232);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(236);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 44, _ctx)) {
                            case 1: {
                                setState(235);
                                includeReflectionClassLoader_flag();
                            }
                            break;
                        }
                        setState(239);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 45, _ctx)) {
                            case 1: {
                                setState(238);
                                resource_flag();
                            }
                            break;
                        }
                        setState(242);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 46, _ctx)) {
                            case 1: {
                                setState(241);
                                tree_flag();
                            }
                            break;
                        }
                        setState(245);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(244);
                                list_flag();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(248);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(247);
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
        enterRule(_localctx, 26, RULE_keymap_command);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(252);
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
        enterRule(_localctx, 28, RULE_exit_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(254);
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
        enterRule(_localctx, 30, RULE_cls_command);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(256);
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
        enterRule(_localctx, 32, RULE_general_help);
        try {
            setState(262);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 50, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(258);
                    match(T__0);
                    setState(259);
                    match(HELP_COMMAND);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(260);
                    match(T__0);
                    setState(261);
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
        enterRule(_localctx, 34, RULE_field_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(264);
                match(T__0);
                setState(265);
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
        enterRule(_localctx, 36, RULE_resource_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(267);
                match(T__0);
                setState(268);
                match(RESOURCE);
                setState(269);
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
        enterRule(_localctx, 38, RULE_tree_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(271);
                match(T__0);
                setState(272);
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
        enterRule(_localctx, 40, RULE_list_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(274);
                match(T__0);
                setState(275);
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
        enterRule(_localctx, 42, RULE_regex_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(277);
                match(T__0);
                setState(278);
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
        enterRule(_localctx, 44, RULE_find_most_blockingthread_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(280);
                match(T__0);
                setState(281);
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
        enterRule(_localctx, 46, RULE_extend_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(283);
                match(T__0);
                setState(284);
                match(EXTEND);
                setState(285);
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
        enterRule(_localctx, 48, RULE_hashcode_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(287);
                match(T__0);
                setState(288);
                match(HASHCODE_FLAG);
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
        enterRule(_localctx, 50, RULE_number_limit_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(291);
                match(T__0);
                setState(292);
                match(NUMBER_LIMIT);
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
        enterRule(_localctx, 52, RULE_cycle_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(295);
                match(T__0);
                setState(296);
                match(HASHCODE_FLAG);
                setState(297);
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
        enterRule(_localctx, 54, RULE_top_N_Busy_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(299);
                match(T__0);
                setState(300);
                match(NUMBER_LIMIT);
                setState(301);
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
        enterRule(_localctx, 56, RULE_setSampleInterval_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(303);
                match(T__0);
                setState(304);
                match(INCLUDEREFLECTIONCLASSLOADER_FLAG);
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
        enterRule(_localctx, 58, RULE_includeReflectionClassLoader_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(307);
                match(T__0);
                setState(308);
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
        enterRule(_localctx, 60, RULE_detail_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(310);
                match(T__0);
                setState(311);
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
        enterRule(_localctx, 62, RULE_all_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(313);
                match(T__0);
                setState(314);
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
        enterRule(_localctx, 64, RULE_class_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(316);
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
        enterRule(_localctx, 66, RULE_field_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(318);
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
        enterRule(_localctx, 68, RULE_express_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(320);
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
        enterRule(_localctx, 70, RULE_id);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(322);
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
        enterRule(_localctx, 72, RULE_method_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(324);
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
        enterRule(_localctx, 74, RULE_any_name);
        try {
            setState(332);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(326);
                    match(IDENTIFIER);
                }
                break;
                case STRING_LITERAL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(327);
                    match(STRING_LITERAL);
                }
                break;
                case T__1:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(328);
                    match(T__1);
                    setState(329);
                    any_name();
                    setState(330);
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0151\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\4\3\4\3\5\3\5\5\5e\n" +
                    "\5\3\5\5\5h\n\5\3\5\5\5k\n\5\3\5\5\5n\n\5\3\5\3\5\5\5r\n\5\5\5t\n\5\3" +
                    "\6\3\6\5\6x\n\6\3\6\5\6{\n\6\3\6\3\6\5\6\177\n\6\3\6\5\6\u0082\n\6\5\6" +
                    "\u0084\n\6\3\7\3\7\5\7\u0088\n\7\3\7\5\7\u008b\n\7\3\7\3\7\5\7\u008f\n" +
                    "\7\3\7\5\7\u0092\n\7\5\7\u0094\n\7\3\b\3\b\5\b\u0098\n\b\3\b\5\b\u009b" +
                    "\n\b\3\b\3\b\3\b\5\b\u00a0\n\b\3\b\5\b\u00a3\n\b\5\b\u00a5\n\b\3\t\3\t" +
                    "\5\t\u00a9\n\t\3\t\5\t\u00ac\n\t\3\t\3\t\5\t\u00b0\n\t\5\t\u00b2\n\t\3" +
                    "\n\3\n\5\n\u00b6\n\n\3\n\3\n\5\n\u00ba\n\n\5\n\u00bc\n\n\3\13\3\13\5\13" +
                    "\u00c0\n\13\3\13\5\13\u00c3\n\13\3\13\5\13\u00c6\n\13\3\13\3\13\5\13\u00ca" +
                    "\n\13\3\13\5\13\u00cd\n\13\5\13\u00cf\n\13\3\f\3\f\5\f\u00d3\n\f\3\f\5" +
                    "\f\u00d6\n\f\3\f\5\f\u00d9\n\f\3\f\5\f\u00dc\n\f\3\f\5\f\u00df\n\f\5\f" +
                    "\u00e1\n\f\3\r\3\r\5\r\u00e5\n\r\3\16\3\16\5\16\u00e9\n\16\3\16\5\16\u00ec" +
                    "\n\16\3\16\5\16\u00ef\n\16\3\16\5\16\u00f2\n\16\3\16\5\16\u00f5\n\16\3" +
                    "\16\5\16\u00f8\n\16\3\16\5\16\u00fb\n\16\5\16\u00fd\n\16\3\17\3\17\3\20" +
                    "\3\20\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0109\n\22\3\23\3\23\3\23\3\24" +
                    "\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30" +
                    "\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34" +
                    "\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37" +
                    "\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'" +
                    "\3\'\5\'\u014f\n\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"" +
                    "$&(*,.\60\62\64\668:<>@BDFHJL\2\3\3\2\21\23\2\u016b\2N\3\2\2\2\4^\3\2" +
                    "\2\2\6`\3\2\2\2\bb\3\2\2\2\nu\3\2\2\2\f\u0085\3\2\2\2\16\u0095\3\2\2\2" +
                    "\20\u00a6\3\2\2\2\22\u00b3\3\2\2\2\24\u00bd\3\2\2\2\26\u00d0\3\2\2\2\30" +
                    "\u00e2\3\2\2\2\32\u00e6\3\2\2\2\34\u00fe\3\2\2\2\36\u0100\3\2\2\2 \u0102" +
                    "\3\2\2\2\"\u0108\3\2\2\2$\u010a\3\2\2\2&\u010d\3\2\2\2(\u0111\3\2\2\2" +
                    "*\u0114\3\2\2\2,\u0117\3\2\2\2.\u011a\3\2\2\2\60\u011d\3\2\2\2\62\u0121" +
                    "\3\2\2\2\64\u0125\3\2\2\2\66\u0129\3\2\2\28\u012d\3\2\2\2:\u0131\3\2\2" +
                    "\2<\u0135\3\2\2\2>\u0138\3\2\2\2@\u013b\3\2\2\2B\u013e\3\2\2\2D\u0140" +
                    "\3\2\2\2F\u0142\3\2\2\2H\u0144\3\2\2\2J\u0146\3\2\2\2L\u014e\3\2\2\2N" +
                    "O\5\4\3\2O\3\3\2\2\2P_\5\6\4\2Q_\5\b\5\2R_\5\n\6\2S_\5\32\16\2T_\5\f\7" +
                    "\2U_\5\16\b\2V_\5\24\13\2W_\5\26\f\2X_\5\30\r\2Y_\5\20\t\2Z_\5\22\n\2" +
                    "[_\5\34\17\2\\_\5\36\20\2]_\5 \21\2^P\3\2\2\2^Q\3\2\2\2^R\3\2\2\2^S\3" +
                    "\2\2\2^T\3\2\2\2^U\3\2\2\2^V\3\2\2\2^W\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3" +
                    "\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\5\3\2\2\2`a\7\25\2\2a\7\3\2\2\2" +
                    "bs\7\6\2\2ce\5> \2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\5$\23\2gf\3\2\2\2g" +
                    "h\3\2\2\2hj\3\2\2\2ik\5,\27\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\5\60\31" +
                    "\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2ot\5B\"\2pr\5\"\22\2qp\3\2\2\2qr\3\2\2" +
                    "\2rt\3\2\2\2sd\3\2\2\2sq\3\2\2\2t\t\3\2\2\2u\u0083\7\7\2\2vx\5> \2wv\3" +
                    "\2\2\2wx\3\2\2\2xz\3\2\2\2y{\5,\27\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|~\5" +
                    "B\"\2}\177\5J&\2~}\3\2\2\2~\177\3\2\2\2\177\u0084\3\2\2\2\u0080\u0082" +
                    "\5\"\22\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2" +
                    "\u0083w\3\2\2\2\u0083\u0081\3\2\2\2\u0084\13\3\2\2\2\u0085\u0093\7\b\2" +
                    "\2\u0086\u0088\5\62\32\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088" +
                    "\u008a\3\2\2\2\u0089\u008b\5,\27\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2" +
                    "\2\2\u008b\u008c\3\2\2\2\u008c\u008e\5B\"\2\u008d\u008f\5J&\2\u008e\u008d" +
                    "\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0094\3\2\2\2\u0090\u0092\5\"\22\2" +
                    "\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0087" +
                    "\3\2\2\2\u0093\u0091\3\2\2\2\u0094\r\3\2\2\2\u0095\u00a4\7\t\2\2\u0096" +
                    "\u0098\5\62\32\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3" +
                    "\2\2\2\u0099\u009b\5,\27\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b" +
                    "\u009c\3\2\2\2\u009c\u009d\5B\"\2\u009d\u009f\5J&\2\u009e\u00a0\5F$\2" +
                    "\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a5\3\2\2\2\u00a1\u00a3" +
                    "\5\"\22\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2" +
                    "\u00a4\u0097\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\17\3\2\2\2\u00a6\u00b1" +
                    "\7\n\2\2\u00a7\u00a9\5\62\32\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2" +
                    "\u00a9\u00ab\3\2\2\2\u00aa\u00ac\5,\27\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac" +
                    "\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b2\5B\"\2\u00ae\u00b0\5\"\22\2\u00af" +
                    "\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00a8\3\2" +
                    "\2\2\u00b1\u00af\3\2\2\2\u00b2\21\3\2\2\2\u00b3\u00bb\7\13\2\2\u00b4\u00b6" +
                    "\5,\27\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7" +
                    "\u00bc\5B\"\2\u00b8\u00ba\5\"\22\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2" +
                    "\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc" +
                    "\23\3\2\2\2\u00bd\u00ce\7\f\2\2\u00be\u00c0\5\66\34\2\u00bf\u00be\3\2" +
                    "\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00c3\5,\27\2\u00c2" +
                    "\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c6\5\64" +
                    "\33\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7" +
                    "\u00c9\5B\"\2\u00c8\u00ca\5J&\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2" +
                    "\2\u00ca\u00cf\3\2\2\2\u00cb\u00cd\5\"\22\2\u00cc\u00cb\3\2\2\2\u00cc" +
                    "\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00bf\3\2\2\2\u00ce\u00cc\3\2" +
                    "\2\2\u00cf\25\3\2\2\2\u00d0\u00e0\7\r\2\2\u00d1\u00d3\58\35\2\u00d2\u00d1" +
                    "\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d6\5.\30\2\u00d5" +
                    "\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d9\5:" +
                    "\36\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da" +
                    "\u00dc\5H%\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e1\3\2\2" +
                    "\2\u00dd\u00df\5\"\22\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df" +
                    "\u00e1\3\2\2\2\u00e0\u00d2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\27\3\2\2" +
                    "\2\u00e2\u00e4\7\16\2\2\u00e3\u00e5\5\"\22\2\u00e4\u00e3\3\2\2\2\u00e4" +
                    "\u00e5\3\2\2\2\u00e5\31\3\2\2\2\u00e6\u00fc\7\17\2\2\u00e7\u00e9\5@!\2" +
                    "\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec" +
                    "\5\62\32\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2" +
                    "\u00ed\u00ef\5<\37\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1" +
                    "\3\2\2\2\u00f0\u00f2\5&\24\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2" +
                    "\u00f4\3\2\2\2\u00f3\u00f5\5(\25\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2" +
                    "\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f8\5*\26\2\u00f7\u00f6\3\2\2\2\u00f7" +
                    "\u00f8\3\2\2\2\u00f8\u00fd\3\2\2\2\u00f9\u00fb\5\"\22\2\u00fa\u00f9\3" +
                    "\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00e8\3\2\2\2\u00fc" +
                    "\u00fa\3\2\2\2\u00fd\33\3\2\2\2\u00fe\u00ff\7\20\2\2\u00ff\35\3\2\2\2" +
                    "\u0100\u0101\t\2\2\2\u0101\37\3\2\2\2\u0102\u0103\7\24\2\2\u0103!\3\2" +
                    "\2\2\u0104\u0105\7\3\2\2\u0105\u0109\7\25\2\2\u0106\u0107\7\3\2\2\u0107" +
                    "\u0109\7\26\2\2\u0108\u0104\3\2\2\2\u0108\u0106\3\2\2\2\u0109#\3\2\2\2" +
                    "\u010a\u010b\7\3\2\2\u010b\u010c\7\31\2\2\u010c%\3\2\2\2\u010d\u010e\7" +
                    "\3\2\2\u010e\u010f\7!\2\2\u010f\u0110\5L\'\2\u0110\'\3\2\2\2\u0111\u0112" +
                    "\7\3\2\2\u0112\u0113\7\"\2\2\u0113)\3\2\2\2\u0114\u0115\7\3\2\2\u0115" +
                    "\u0116\7#\2\2\u0116+\3\2\2\2\u0117\u0118\7\3\2\2\u0118\u0119\7\32\2\2" +
                    "\u0119-\3\2\2\2\u011a\u011b\7\3\2\2\u011b\u011c\7\33\2\2\u011c/\3\2\2" +
                    "\2\u011d\u011e\7\3\2\2\u011e\u011f\7\34\2\2\u011f\u0120\7%\2\2\u0120\61" +
                    "\3\2\2\2\u0121\u0122\7\3\2\2\u0122\u0123\7\35\2\2\u0123\u0124\5L\'\2\u0124" +
                    "\63\3\2\2\2\u0125\u0126\7\3\2\2\u0126\u0127\7\36\2\2\u0127\u0128\5L\'" +
                    "\2\u0128\65\3\2\2\2\u0129\u012a\7\3\2\2\u012a\u012b\7\35\2\2\u012b\u012c" +
                    "\5L\'\2\u012c\67\3\2\2\2\u012d\u012e\7\3\2\2\u012e\u012f\7\36\2\2\u012f" +
                    "\u0130\5L\'\2\u01309\3\2\2\2\u0131\u0132\7\3\2\2\u0132\u0133\7 \2\2\u0133" +
                    "\u0134\5L\'\2\u0134;\3\2\2\2\u0135\u0136\7\3\2\2\u0136\u0137\7 \2\2\u0137" +
                    "=\3\2\2\2\u0138\u0139\7\3\2\2\u0139\u013a\7\27\2\2\u013a?\3\2\2\2\u013b" +
                    "\u013c\7\3\2\2\u013c\u013d\7\30\2\2\u013dA\3\2\2\2\u013e\u013f\5L\'\2" +
                    "\u013fC\3\2\2\2\u0140\u0141\5L\'\2\u0141E\3\2\2\2\u0142\u0143\5L\'\2\u0143" +
                    "G\3\2\2\2\u0144\u0145\5L\'\2\u0145I\3\2\2\2\u0146\u0147\5L\'\2\u0147K" +
                    "\3\2\2\2\u0148\u014f\7$\2\2\u0149\u014f\7)\2\2\u014a\u014b\7\4\2\2\u014b" +
                    "\u014c\5L\'\2\u014c\u014d\7\5\2\2\u014d\u014f\3\2\2\2\u014e\u0148\3\2" +
                    "\2\2\u014e\u0149\3\2\2\2\u014e\u014a\3\2\2\2\u014fM\3\2\2\2\66^dgjmqs" +
                    "wz~\u0081\u0083\u0087\u008a\u008e\u0091\u0093\u0097\u009a\u009f\u00a2" +
                    "\u00a4\u00a8\u00ab\u00af\u00b1\u00b5\u00b9\u00bb\u00bf\u00c2\u00c5\u00c9" +
                    "\u00cc\u00ce\u00d2\u00d5\u00d8\u00db\u00de\u00e0\u00e4\u00e8\u00eb\u00ee" +
                    "\u00f1\u00f4\u00f7\u00fa\u00fc\u0108\u014e";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}