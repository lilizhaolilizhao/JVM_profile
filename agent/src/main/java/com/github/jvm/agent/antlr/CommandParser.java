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
            T__0 = 1, T__1 = 2, T__2 = 3, SC_COMMAND = 4, SM_COMMAND = 5, JAD_COMMAND = 6, CLASSLOADER_COMMAND = 7,
            KEYMAP_COMMAND = 8, EXIT_COMMAND = 9, LOGOUT_COMMAND = 10, QUIT_COMMAND = 11,
            CLS_COMMAND = 12, HELP_COMMAND = 13, HELP = 14, DETAIL = 15, ALL_INFO = 16, FIELD = 17,
            REGEX = 18, EXTEND = 19, HASHCODE_FLAG = 20, INCLUDEREFLECTIONCLASSLOADER_FLAG = 21,
            RESOURCE = 22, TREE = 23, LIST = 24, IDENTIFIER = 25, EXTEND_LEVEL = 26, HASHCODE = 27,
            NUMERIC_LITERAL = 28, BIND_PARAMETER = 29, STRING_LITERAL = 30, BLOB_LITERAL = 31,
            SINGLE_LINE_COMMENT = 32, MULTILINE_COMMENT = 33, SPACES = 34, UNEXPECTED_CHAR = 35;
    public static final int
            RULE_parse = 0, RULE_command_list = 1, RULE_help_command = 2, RULE_sc_command = 3,
            RULE_sm_command = 4, RULE_jad_command = 5, RULE_classloader_command = 6,
            RULE_keymap_command = 7, RULE_exit_command = 8, RULE_cls_command = 9,
            RULE_general_help = 10, RULE_field_flag = 11, RULE_resource_flag = 12,
            RULE_tree_flag = 13, RULE_list_flag = 14, RULE_regex_flag = 15, RULE_extend_flag = 16,
            RULE_hashcode_flag = 17, RULE_includeReflectionClassLoader_flag = 18,
            RULE_detail_flag = 19, RULE_all_flag = 20, RULE_class_pattern = 21, RULE_method_pattern = 22,
            RULE_any_name = 23;

    private static String[] makeRuleNames() {
        return new String[]{
                "parse", "command_list", "help_command", "sc_command", "sm_command",
                "jad_command", "classloader_command", "keymap_command", "exit_command",
                "cls_command", "general_help", "field_flag", "resource_flag", "tree_flag",
                "list_flag", "regex_flag", "extend_flag", "hashcode_flag", "includeReflectionClassLoader_flag",
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
                null, null, null, null, "SC_COMMAND", "SM_COMMAND", "JAD_COMMAND", "CLASSLOADER_COMMAND",
                "KEYMAP_COMMAND", "EXIT_COMMAND", "LOGOUT_COMMAND", "QUIT_COMMAND", "CLS_COMMAND",
                "HELP_COMMAND", "HELP", "DETAIL", "ALL_INFO", "FIELD", "REGEX", "EXTEND",
                "HASHCODE_FLAG", "INCLUDEREFLECTIONCLASSLOADER_FLAG", "RESOURCE", "TREE",
                "LIST", "IDENTIFIER", "EXTEND_LEVEL", "HASHCODE", "NUMERIC_LITERAL",
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
                setState(48);
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
                setState(58);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case HELP_COMMAND: {
                        setState(50);
                        help_command();
                    }
                    break;
                    case SC_COMMAND: {
                        setState(51);
                        sc_command();
                    }
                    break;
                    case SM_COMMAND: {
                        setState(52);
                        sm_command();
                    }
                    break;
                    case CLASSLOADER_COMMAND: {
                        setState(53);
                        classloader_command();
                    }
                    break;
                    case JAD_COMMAND: {
                        setState(54);
                        jad_command();
                    }
                    break;
                    case KEYMAP_COMMAND: {
                        setState(55);
                        keymap_command();
                    }
                    break;
                    case EXIT_COMMAND:
                    case LOGOUT_COMMAND:
                    case QUIT_COMMAND: {
                        setState(56);
                        exit_command();
                    }
                    break;
                    case CLS_COMMAND: {
                        setState(57);
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
                setState(60);
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
                setState(62);
                match(SC_COMMAND);
                setState(79);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                    case 1: {
                        setState(64);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                            case 1: {
                                setState(63);
                                detail_flag();
                            }
                            break;
                        }
                        setState(67);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                            case 1: {
                                setState(66);
                                field_flag();
                            }
                            break;
                        }
                        setState(70);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                            case 1: {
                                setState(69);
                                regex_flag();
                            }
                            break;
                        }
                        setState(73);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(72);
                                extend_flag();
                            }
                        }

                        setState(75);
                        class_pattern();
                    }
                    break;
                    case 2: {
                        setState(77);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(76);
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
                setState(81);
                match(SM_COMMAND);
                setState(95);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                    case 1: {
                        setState(83);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                            case 1: {
                                setState(82);
                                detail_flag();
                            }
                            break;
                        }
                        setState(86);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(85);
                                regex_flag();
                            }
                        }

                        setState(88);
                        class_pattern();
                        setState(90);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(89);
                                method_pattern();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(93);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(92);
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
                setState(97);
                match(JAD_COMMAND);
                setState(111);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                    case 1: {
                        setState(99);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                            case 1: {
                                setState(98);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(102);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(101);
                                regex_flag();
                            }
                        }

                        setState(104);
                        class_pattern();
                        setState(106);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
                            {
                                setState(105);
                                method_pattern();
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
        enterRule(_localctx, 12, RULE_classloader_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(113);
                match(CLASSLOADER_COMMAND);
                setState(135);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
                    case 1: {
                        setState(115);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                            case 1: {
                                setState(114);
                                all_flag();
                            }
                            break;
                        }
                        setState(118);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                            case 1: {
                                setState(117);
                                hashcode_flag();
                            }
                            break;
                        }
                        setState(121);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                            case 1: {
                                setState(120);
                                includeReflectionClassLoader_flag();
                            }
                            break;
                        }
                        setState(124);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                            case 1: {
                                setState(123);
                                resource_flag();
                            }
                            break;
                        }
                        setState(127);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
                            case 1: {
                                setState(126);
                                tree_flag();
                            }
                            break;
                        }
                        setState(130);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(129);
                                list_flag();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(133);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(132);
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
        enterRule(_localctx, 14, RULE_keymap_command);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(137);
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
        enterRule(_localctx, 16, RULE_exit_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(139);
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
        enterRule(_localctx, 18, RULE_cls_command);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(141);
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
        enterRule(_localctx, 20, RULE_general_help);
        try {
            setState(147);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(143);
                    match(T__0);
                    setState(144);
                    match(HELP_COMMAND);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(145);
                    match(T__0);
                    setState(146);
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
        enterRule(_localctx, 22, RULE_field_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(149);
                match(T__0);
                setState(150);
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
        enterRule(_localctx, 24, RULE_resource_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(152);
                match(T__0);
                setState(153);
                match(RESOURCE);
                setState(154);
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
        enterRule(_localctx, 26, RULE_tree_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(156);
                match(T__0);
                setState(157);
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
        enterRule(_localctx, 28, RULE_list_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(159);
                match(T__0);
                setState(160);
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
        enterRule(_localctx, 30, RULE_regex_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(162);
                match(T__0);
                setState(163);
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
        enterRule(_localctx, 32, RULE_extend_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(165);
                match(T__0);
                setState(166);
                match(EXTEND);
                setState(167);
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
        enterRule(_localctx, 34, RULE_hashcode_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(169);
                match(T__0);
                setState(170);
                match(HASHCODE_FLAG);
                setState(171);
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
        enterRule(_localctx, 36, RULE_includeReflectionClassLoader_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(173);
                match(T__0);
                setState(174);
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
        enterRule(_localctx, 38, RULE_detail_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(176);
                match(T__0);
                setState(177);
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
        enterRule(_localctx, 40, RULE_all_flag);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(179);
                match(T__0);
                setState(180);
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
        enterRule(_localctx, 42, RULE_class_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(182);
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
        enterRule(_localctx, 44, RULE_method_pattern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(184);
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
        enterRule(_localctx, 46, RULE_any_name);
        try {
            setState(192);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(186);
                    match(IDENTIFIER);
                }
                break;
                case STRING_LITERAL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(187);
                    match(STRING_LITERAL);
                }
                break;
                case T__1:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(188);
                    match(T__1);
                    setState(189);
                    any_name();
                    setState(190);
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00c5\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\5\3\5\5\5" +
                    "C\n\5\3\5\5\5F\n\5\3\5\5\5I\n\5\3\5\5\5L\n\5\3\5\3\5\5\5P\n\5\5\5R\n\5" +
                    "\3\6\3\6\5\6V\n\6\3\6\5\6Y\n\6\3\6\3\6\5\6]\n\6\3\6\5\6`\n\6\5\6b\n\6" +
                    "\3\7\3\7\5\7f\n\7\3\7\5\7i\n\7\3\7\3\7\5\7m\n\7\3\7\5\7p\n\7\5\7r\n\7" +
                    "\3\b\3\b\5\bv\n\b\3\b\5\by\n\b\3\b\5\b|\n\b\3\b\5\b\177\n\b\3\b\5\b\u0082" +
                    "\n\b\3\b\5\b\u0085\n\b\3\b\5\b\u0088\n\b\5\b\u008a\n\b\3\t\3\t\3\n\3\n" +
                    "\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0096\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3" +
                    "\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3" +
                    "\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3" +
                    "\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00c3\n\31\3\31\2\2\32" +
                    "\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\3\3\2\13\r\2\u00ce" +
                    "\2\62\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nS\3\2\2\2\fc\3\2\2\2\16" +
                    "s\3\2\2\2\20\u008b\3\2\2\2\22\u008d\3\2\2\2\24\u008f\3\2\2\2\26\u0095" +
                    "\3\2\2\2\30\u0097\3\2\2\2\32\u009a\3\2\2\2\34\u009e\3\2\2\2\36\u00a1\3" +
                    "\2\2\2 \u00a4\3\2\2\2\"\u00a7\3\2\2\2$\u00ab\3\2\2\2&\u00af\3\2\2\2(\u00b2" +
                    "\3\2\2\2*\u00b5\3\2\2\2,\u00b8\3\2\2\2.\u00ba\3\2\2\2\60\u00c2\3\2\2\2" +
                    "\62\63\5\4\3\2\63\3\3\2\2\2\64=\5\6\4\2\65=\5\b\5\2\66=\5\n\6\2\67=\5" +
                    "\16\b\28=\5\f\7\29=\5\20\t\2:=\5\22\n\2;=\5\24\13\2<\64\3\2\2\2<\65\3" +
                    "\2\2\2<\66\3\2\2\2<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2" +
                    "=\5\3\2\2\2>?\7\17\2\2?\7\3\2\2\2@Q\7\6\2\2AC\5(\25\2BA\3\2\2\2BC\3\2" +
                    "\2\2CE\3\2\2\2DF\5\30\r\2ED\3\2\2\2EF\3\2\2\2FH\3\2\2\2GI\5 \21\2HG\3" +
                    "\2\2\2HI\3\2\2\2IK\3\2\2\2JL\5\"\22\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MR" +
                    "\5,\27\2NP\5\26\f\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QB\3\2\2\2QO\3\2\2\2" +
                    "R\t\3\2\2\2Sa\7\7\2\2TV\5(\25\2UT\3\2\2\2UV\3\2\2\2VX\3\2\2\2WY\5 \21" +
                    "\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z\\\5,\27\2[]\5.\30\2\\[\3\2\2\2\\]\3" +
                    "\2\2\2]b\3\2\2\2^`\5\26\f\2_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2aU\3\2\2\2a_" +
                    "\3\2\2\2b\13\3\2\2\2cq\7\b\2\2df\5$\23\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2" +
                    "gi\5 \21\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jl\5,\27\2km\5.\30\2lk\3\2\2\2" +
                    "lm\3\2\2\2mr\3\2\2\2np\5\26\f\2on\3\2\2\2op\3\2\2\2pr\3\2\2\2qe\3\2\2" +
                    "\2qo\3\2\2\2r\r\3\2\2\2s\u0089\7\t\2\2tv\5*\26\2ut\3\2\2\2uv\3\2\2\2v" +
                    "x\3\2\2\2wy\5$\23\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\5&\24\2{z\3\2\2\2" +
                    "{|\3\2\2\2|~\3\2\2\2}\177\5\32\16\2~}\3\2\2\2~\177\3\2\2\2\177\u0081\3" +
                    "\2\2\2\u0080\u0082\5\34\17\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082" +
                    "\u0084\3\2\2\2\u0083\u0085\5\36\20\2\u0084\u0083\3\2\2\2\u0084\u0085\3" +
                    "\2\2\2\u0085\u008a\3\2\2\2\u0086\u0088\5\26\f\2\u0087\u0086\3\2\2\2\u0087" +
                    "\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089u\3\2\2\2\u0089\u0087\3\2\2\2" +
                    "\u008a\17\3\2\2\2\u008b\u008c\7\n\2\2\u008c\21\3\2\2\2\u008d\u008e\t\2" +
                    "\2\2\u008e\23\3\2\2\2\u008f\u0090\7\16\2\2\u0090\25\3\2\2\2\u0091\u0092" +
                    "\7\3\2\2\u0092\u0096\7\17\2\2\u0093\u0094\7\3\2\2\u0094\u0096\7\20\2\2" +
                    "\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0096\27\3\2\2\2\u0097\u0098" +
                    "\7\3\2\2\u0098\u0099\7\23\2\2\u0099\31\3\2\2\2\u009a\u009b\7\3\2\2\u009b" +
                    "\u009c\7\30\2\2\u009c\u009d\5\60\31\2\u009d\33\3\2\2\2\u009e\u009f\7\3" +
                    "\2\2\u009f\u00a0\7\31\2\2\u00a0\35\3\2\2\2\u00a1\u00a2\7\3\2\2\u00a2\u00a3" +
                    "\7\32\2\2\u00a3\37\3\2\2\2\u00a4\u00a5\7\3\2\2\u00a5\u00a6\7\24\2\2\u00a6" +
                    "!\3\2\2\2\u00a7\u00a8\7\3\2\2\u00a8\u00a9\7\25\2\2\u00a9\u00aa\7\34\2" +
                    "\2\u00aa#\3\2\2\2\u00ab\u00ac\7\3\2\2\u00ac\u00ad\7\26\2\2\u00ad\u00ae" +
                    "\5\60\31\2\u00ae%\3\2\2\2\u00af\u00b0\7\3\2\2\u00b0\u00b1\7\27\2\2\u00b1" +
                    "\'\3\2\2\2\u00b2\u00b3\7\3\2\2\u00b3\u00b4\7\21\2\2\u00b4)\3\2\2\2\u00b5" +
                    "\u00b6\7\3\2\2\u00b6\u00b7\7\22\2\2\u00b7+\3\2\2\2\u00b8\u00b9\5\60\31" +
                    "\2\u00b9-\3\2\2\2\u00ba\u00bb\5\60\31\2\u00bb/\3\2\2\2\u00bc\u00c3\7\33" +
                    "\2\2\u00bd\u00c3\7 \2\2\u00be\u00bf\7\4\2\2\u00bf\u00c0\5\60\31\2\u00c0" +
                    "\u00c1\7\5\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bd\3\2" +
                    "\2\2\u00c2\u00be\3\2\2\2\u00c3\61\3\2\2\2\35<BEHKOQUX\\_aehloqux{~\u0081" +
                    "\u0084\u0087\u0089\u0095\u00c2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}