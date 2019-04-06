// Generated from /Users/oneapm/git/JVM_profile/agent/src/main/antlr/Command.g4 by ANTLR 4.7.2
package com.github.jvm.agent.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SC_COMMAND=4, SM_COMMAND=5, JAD_COMMAND=6, GETSTATIC_COMMAND=7, 
		MONITOR_COMMAND=8, THREAD_COMMAND=9, CLASSLOADER_COMMAND=10, KEYMAP_COMMAND=11, 
		EXIT_COMMAND=12, LOGOUT_COMMAND=13, QUIT_COMMAND=14, CLS_COMMAND=15, HELP_COMMAND=16, 
		HELP=17, DETAIL=18, ALL_INFO=19, FIELD=20, REGEX=21, FIND_MOST_BLOCKINGTHREAD=22, 
		EXTEND=23, HASHCODE_FLAG=24, NUMBER_LIMIT=25, CYCLE_FLAG=26, INCLUDEREFLECTIONCLASSLOADER_FLAG=27, 
		RESOURCE=28, TREE=29, LIST=30, IDENTIFIER=31, EXTEND_LEVEL=32, HASHCODE=33, 
		NUMERIC_LITERAL=34, BIND_PARAMETER=35, STRING_LITERAL=36, BLOB_LITERAL=37, 
		SINGLE_LINE_COMMENT=38, MULTILINE_COMMENT=39, SPACES=40, UNEXPECTED_CHAR=41;
	public static final int
		RULE_parse = 0, RULE_command_list = 1, RULE_help_command = 2, RULE_sc_command = 3, 
		RULE_sm_command = 4, RULE_jad_command = 5, RULE_getstatic_command = 6, 
		RULE_monitor_command = 7, RULE_thread_command = 8, RULE_classloader_command = 9, 
		RULE_keymap_command = 10, RULE_exit_command = 11, RULE_cls_command = 12, 
		RULE_general_help = 13, RULE_field_flag = 14, RULE_resource_flag = 15, 
		RULE_tree_flag = 16, RULE_list_flag = 17, RULE_regex_flag = 18, RULE_find_most_blockingthread_flag = 19, 
		RULE_extend_flag = 20, RULE_hashcode_flag = 21, RULE_number_limit_flag = 22, 
		RULE_cycle_flag = 23, RULE_top_N_Busy_flag = 24, RULE_setSampleInterval_flag = 25, 
		RULE_includeReflectionClassLoader_flag = 26, RULE_detail_flag = 27, RULE_all_flag = 28, 
		RULE_class_pattern = 29, RULE_field_pattern = 30, RULE_express_pattern = 31, 
		RULE_id = 32, RULE_method_pattern = 33, RULE_any_name = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "command_list", "help_command", "sc_command", "sm_command", 
			"jad_command", "getstatic_command", "monitor_command", "thread_command", 
			"classloader_command", "keymap_command", "exit_command", "cls_command", 
			"general_help", "field_flag", "resource_flag", "tree_flag", "list_flag", 
			"regex_flag", "find_most_blockingthread_flag", "extend_flag", "hashcode_flag", 
			"number_limit_flag", "cycle_flag", "top_N_Busy_flag", "setSampleInterval_flag", 
			"includeReflectionClassLoader_flag", "detail_flag", "all_flag", "class_pattern", 
			"field_pattern", "express_pattern", "id", "method_pattern", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "SC_COMMAND", "SM_COMMAND", "JAD_COMMAND", "GETSTATIC_COMMAND", 
			"MONITOR_COMMAND", "THREAD_COMMAND", "CLASSLOADER_COMMAND", "KEYMAP_COMMAND", 
			"EXIT_COMMAND", "LOGOUT_COMMAND", "QUIT_COMMAND", "CLS_COMMAND", "HELP_COMMAND", 
			"HELP", "DETAIL", "ALL_INFO", "FIELD", "REGEX", "FIND_MOST_BLOCKINGTHREAD", 
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
	public String getGrammarFileName() { return "Command.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			command_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Command_listContext extends ParserRuleContext {
		public Help_commandContext help_command() {
			return getRuleContext(Help_commandContext.class,0);
		}
		public Sc_commandContext sc_command() {
			return getRuleContext(Sc_commandContext.class,0);
		}
		public Sm_commandContext sm_command() {
			return getRuleContext(Sm_commandContext.class,0);
		}
		public Classloader_commandContext classloader_command() {
			return getRuleContext(Classloader_commandContext.class,0);
		}
		public Jad_commandContext jad_command() {
			return getRuleContext(Jad_commandContext.class,0);
		}
		public Getstatic_commandContext getstatic_command() {
			return getRuleContext(Getstatic_commandContext.class,0);
		}
		public Monitor_commandContext monitor_command() {
			return getRuleContext(Monitor_commandContext.class,0);
		}
		public Thread_commandContext thread_command() {
			return getRuleContext(Thread_commandContext.class,0);
		}
		public Keymap_commandContext keymap_command() {
			return getRuleContext(Keymap_commandContext.class,0);
		}
		public Exit_commandContext exit_command() {
			return getRuleContext(Exit_commandContext.class,0);
		}
		public Cls_commandContext cls_command() {
			return getRuleContext(Cls_commandContext.class,0);
		}
		public Command_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterCommand_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitCommand_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitCommand_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Command_listContext command_list() throws RecognitionException {
		Command_listContext _localctx = new Command_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HELP_COMMAND:
				{
				setState(72);
				help_command();
				}
				break;
			case SC_COMMAND:
				{
				setState(73);
				sc_command();
				}
				break;
			case SM_COMMAND:
				{
				setState(74);
				sm_command();
				}
				break;
			case CLASSLOADER_COMMAND:
				{
				setState(75);
				classloader_command();
				}
				break;
			case JAD_COMMAND:
				{
				setState(76);
				jad_command();
				}
				break;
			case GETSTATIC_COMMAND:
				{
				setState(77);
				getstatic_command();
				}
				break;
			case MONITOR_COMMAND:
				{
				setState(78);
				monitor_command();
				}
				break;
			case THREAD_COMMAND:
				{
				setState(79);
				thread_command();
				}
				break;
			case KEYMAP_COMMAND:
				{
				setState(80);
				keymap_command();
				}
				break;
			case EXIT_COMMAND:
			case LOGOUT_COMMAND:
			case QUIT_COMMAND:
				{
				setState(81);
				exit_command();
				}
				break;
			case CLS_COMMAND:
				{
				setState(82);
				cls_command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Help_commandContext extends ParserRuleContext {
		public TerminalNode HELP_COMMAND() { return getToken(CommandParser.HELP_COMMAND, 0); }
		public Help_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_help_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterHelp_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitHelp_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitHelp_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Help_commandContext help_command() throws RecognitionException {
		Help_commandContext _localctx = new Help_commandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_help_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(HELP_COMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sc_commandContext extends ParserRuleContext {
		public TerminalNode SC_COMMAND() { return getToken(CommandParser.SC_COMMAND, 0); }
		public Class_patternContext class_pattern() {
			return getRuleContext(Class_patternContext.class,0);
		}
		public Detail_flagContext detail_flag() {
			return getRuleContext(Detail_flagContext.class,0);
		}
		public Field_flagContext field_flag() {
			return getRuleContext(Field_flagContext.class,0);
		}
		public Regex_flagContext regex_flag() {
			return getRuleContext(Regex_flagContext.class,0);
		}
		public Extend_flagContext extend_flag() {
			return getRuleContext(Extend_flagContext.class,0);
		}
		public General_helpContext general_help() {
			return getRuleContext(General_helpContext.class,0);
		}
		public Sc_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sc_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterSc_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitSc_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitSc_command(this);
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
			setState(87);
			match(SC_COMMAND);
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(88);
					detail_flag();
					}
					break;
				}
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(91);
					field_flag();
					}
					break;
				}
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(94);
					regex_flag();
					}
					break;
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(97);
					extend_flag();
					}
				}

				setState(100);
				class_pattern();
				}
				break;
			case 2:
				{
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(101);
					general_help();
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sm_commandContext extends ParserRuleContext {
		public TerminalNode SM_COMMAND() { return getToken(CommandParser.SM_COMMAND, 0); }
		public Class_patternContext class_pattern() {
			return getRuleContext(Class_patternContext.class,0);
		}
		public Detail_flagContext detail_flag() {
			return getRuleContext(Detail_flagContext.class,0);
		}
		public Regex_flagContext regex_flag() {
			return getRuleContext(Regex_flagContext.class,0);
		}
		public Method_patternContext method_pattern() {
			return getRuleContext(Method_patternContext.class,0);
		}
		public General_helpContext general_help() {
			return getRuleContext(General_helpContext.class,0);
		}
		public Sm_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sm_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterSm_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitSm_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitSm_command(this);
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
			setState(106);
			match(SM_COMMAND);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(107);
					detail_flag();
					}
					break;
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(110);
					regex_flag();
					}
				}

				setState(113);
				class_pattern();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(114);
					method_pattern();
					}
				}

				}
				break;
			case 2:
				{
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(117);
					general_help();
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jad_commandContext extends ParserRuleContext {
		public TerminalNode JAD_COMMAND() { return getToken(CommandParser.JAD_COMMAND, 0); }
		public Class_patternContext class_pattern() {
			return getRuleContext(Class_patternContext.class,0);
		}
		public Hashcode_flagContext hashcode_flag() {
			return getRuleContext(Hashcode_flagContext.class,0);
		}
		public Regex_flagContext regex_flag() {
			return getRuleContext(Regex_flagContext.class,0);
		}
		public Method_patternContext method_pattern() {
			return getRuleContext(Method_patternContext.class,0);
		}
		public General_helpContext general_help() {
			return getRuleContext(General_helpContext.class,0);
		}
		public Jad_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jad_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterJad_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitJad_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitJad_command(this);
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
			setState(122);
			match(JAD_COMMAND);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(123);
					hashcode_flag();
					}
					break;
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(126);
					regex_flag();
					}
				}

				setState(129);
				class_pattern();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(130);
					method_pattern();
					}
				}

				}
				break;
			case 2:
				{
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(133);
					general_help();
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getstatic_commandContext extends ParserRuleContext {
		public TerminalNode GETSTATIC_COMMAND() { return getToken(CommandParser.GETSTATIC_COMMAND, 0); }
		public Class_patternContext class_pattern() {
			return getRuleContext(Class_patternContext.class,0);
		}
		public Method_patternContext method_pattern() {
			return getRuleContext(Method_patternContext.class,0);
		}
		public Hashcode_flagContext hashcode_flag() {
			return getRuleContext(Hashcode_flagContext.class,0);
		}
		public Regex_flagContext regex_flag() {
			return getRuleContext(Regex_flagContext.class,0);
		}
		public Express_patternContext express_pattern() {
			return getRuleContext(Express_patternContext.class,0);
		}
		public General_helpContext general_help() {
			return getRuleContext(General_helpContext.class,0);
		}
		public Getstatic_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getstatic_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterGetstatic_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitGetstatic_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitGetstatic_command(this);
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
			setState(138);
			match(GETSTATIC_COMMAND);
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(139);
					hashcode_flag();
					}
					break;
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(142);
					regex_flag();
					}
				}

				setState(145);
				class_pattern();
				setState(146);
				method_pattern();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(147);
					express_pattern();
					}
				}

				}
				break;
			case 2:
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(150);
					general_help();
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Monitor_commandContext extends ParserRuleContext {
		public TerminalNode MONITOR_COMMAND() { return getToken(CommandParser.MONITOR_COMMAND, 0); }
		public Class_patternContext class_pattern() {
			return getRuleContext(Class_patternContext.class,0);
		}
		public Cycle_flagContext cycle_flag() {
			return getRuleContext(Cycle_flagContext.class,0);
		}
		public Regex_flagContext regex_flag() {
			return getRuleContext(Regex_flagContext.class,0);
		}
		public Number_limit_flagContext number_limit_flag() {
			return getRuleContext(Number_limit_flagContext.class,0);
		}
		public Method_patternContext method_pattern() {
			return getRuleContext(Method_patternContext.class,0);
		}
		public General_helpContext general_help() {
			return getRuleContext(General_helpContext.class,0);
		}
		public Monitor_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monitor_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterMonitor_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitMonitor_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitMonitor_command(this);
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
			setState(155);
			match(MONITOR_COMMAND);
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(156);
					cycle_flag();
					}
					break;
				}
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(159);
					regex_flag();
					}
					break;
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(162);
					number_limit_flag();
					}
				}

				setState(165);
				class_pattern();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(166);
					method_pattern();
					}
				}

				}
				break;
			case 2:
				{
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(169);
					general_help();
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Thread_commandContext extends ParserRuleContext {
		public TerminalNode THREAD_COMMAND() { return getToken(CommandParser.THREAD_COMMAND, 0); }
		public Top_N_Busy_flagContext top_N_Busy_flag() {
			return getRuleContext(Top_N_Busy_flagContext.class,0);
		}
		public Find_most_blockingthread_flagContext find_most_blockingthread_flag() {
			return getRuleContext(Find_most_blockingthread_flagContext.class,0);
		}
		public SetSampleInterval_flagContext setSampleInterval_flag() {
			return getRuleContext(SetSampleInterval_flagContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public General_helpContext general_help() {
			return getRuleContext(General_helpContext.class,0);
		}
		public Thread_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thread_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterThread_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitThread_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitThread_command(this);
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
			setState(174);
			match(THREAD_COMMAND);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(175);
					top_N_Busy_flag();
					}
					break;
				}
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(178);
					find_most_blockingthread_flag();
					}
					break;
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(181);
					setSampleInterval_flag();
					}
				}

				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(184);
					id();
					}
				}

				}
				break;
			case 2:
				{
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(187);
					general_help();
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Classloader_commandContext extends ParserRuleContext {
		public TerminalNode CLASSLOADER_COMMAND() { return getToken(CommandParser.CLASSLOADER_COMMAND, 0); }
		public All_flagContext all_flag() {
			return getRuleContext(All_flagContext.class,0);
		}
		public Hashcode_flagContext hashcode_flag() {
			return getRuleContext(Hashcode_flagContext.class,0);
		}
		public IncludeReflectionClassLoader_flagContext includeReflectionClassLoader_flag() {
			return getRuleContext(IncludeReflectionClassLoader_flagContext.class,0);
		}
		public Resource_flagContext resource_flag() {
			return getRuleContext(Resource_flagContext.class,0);
		}
		public Tree_flagContext tree_flag() {
			return getRuleContext(Tree_flagContext.class,0);
		}
		public List_flagContext list_flag() {
			return getRuleContext(List_flagContext.class,0);
		}
		public General_helpContext general_help() {
			return getRuleContext(General_helpContext.class,0);
		}
		public Classloader_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classloader_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterClassloader_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitClassloader_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitClassloader_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Classloader_commandContext classloader_command() throws RecognitionException {
		Classloader_commandContext _localctx = new Classloader_commandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classloader_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(CLASSLOADER_COMMAND);
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(193);
					all_flag();
					}
					break;
				}
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(196);
					hashcode_flag();
					}
					break;
				}
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(199);
					includeReflectionClassLoader_flag();
					}
					break;
				}
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(202);
					resource_flag();
					}
					break;
				}
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(205);
					tree_flag();
					}
					break;
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(208);
					list_flag();
					}
				}

				}
				break;
			case 2:
				{
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(211);
					general_help();
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Keymap_commandContext extends ParserRuleContext {
		public TerminalNode KEYMAP_COMMAND() { return getToken(CommandParser.KEYMAP_COMMAND, 0); }
		public Keymap_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keymap_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterKeymap_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitKeymap_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitKeymap_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keymap_commandContext keymap_command() throws RecognitionException {
		Keymap_commandContext _localctx = new Keymap_commandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_keymap_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(KEYMAP_COMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exit_commandContext extends ParserRuleContext {
		public TerminalNode EXIT_COMMAND() { return getToken(CommandParser.EXIT_COMMAND, 0); }
		public TerminalNode LOGOUT_COMMAND() { return getToken(CommandParser.LOGOUT_COMMAND, 0); }
		public TerminalNode QUIT_COMMAND() { return getToken(CommandParser.QUIT_COMMAND, 0); }
		public Exit_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterExit_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitExit_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitExit_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_commandContext exit_command() throws RecognitionException {
		Exit_commandContext _localctx = new Exit_commandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exit_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXIT_COMMAND) | (1L << LOGOUT_COMMAND) | (1L << QUIT_COMMAND))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cls_commandContext extends ParserRuleContext {
		public TerminalNode CLS_COMMAND() { return getToken(CommandParser.CLS_COMMAND, 0); }
		public Cls_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cls_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterCls_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitCls_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitCls_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cls_commandContext cls_command() throws RecognitionException {
		Cls_commandContext _localctx = new Cls_commandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cls_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(CLS_COMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_helpContext extends ParserRuleContext {
		public TerminalNode HELP_COMMAND() { return getToken(CommandParser.HELP_COMMAND, 0); }
		public TerminalNode HELP() { return getToken(CommandParser.HELP, 0); }
		public General_helpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_help; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterGeneral_help(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitGeneral_help(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitGeneral_help(this);
			else return visitor.visitChildren(this);
		}
	}

	public final General_helpContext general_help() throws RecognitionException {
		General_helpContext _localctx = new General_helpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_general_help);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__0);
				setState(223);
				match(HELP_COMMAND);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(T__0);
				setState(225);
				match(HELP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_flagContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(CommandParser.FIELD, 0); }
		public Field_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterField_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitField_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitField_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_flagContext field_flag() throws RecognitionException {
		Field_flagContext _localctx = new Field_flagContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_field_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__0);
			setState(229);
			match(FIELD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resource_flagContext extends ParserRuleContext {
		public TerminalNode RESOURCE() { return getToken(CommandParser.RESOURCE, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Resource_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterResource_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitResource_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitResource_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resource_flagContext resource_flag() throws RecognitionException {
		Resource_flagContext _localctx = new Resource_flagContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_resource_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__0);
			setState(232);
			match(RESOURCE);
			setState(233);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tree_flagContext extends ParserRuleContext {
		public TerminalNode TREE() { return getToken(CommandParser.TREE, 0); }
		public Tree_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tree_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterTree_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitTree_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitTree_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tree_flagContext tree_flag() throws RecognitionException {
		Tree_flagContext _localctx = new Tree_flagContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tree_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__0);
			setState(236);
			match(TREE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_flagContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(CommandParser.LIST, 0); }
		public List_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterList_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitList_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitList_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_flagContext list_flag() throws RecognitionException {
		List_flagContext _localctx = new List_flagContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_list_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__0);
			setState(239);
			match(LIST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Regex_flagContext extends ParserRuleContext {
		public TerminalNode REGEX() { return getToken(CommandParser.REGEX, 0); }
		public Regex_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterRegex_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitRegex_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitRegex_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Regex_flagContext regex_flag() throws RecognitionException {
		Regex_flagContext _localctx = new Regex_flagContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_regex_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__0);
			setState(242);
			match(REGEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Find_most_blockingthread_flagContext extends ParserRuleContext {
		public TerminalNode FIND_MOST_BLOCKINGTHREAD() { return getToken(CommandParser.FIND_MOST_BLOCKINGTHREAD, 0); }
		public Find_most_blockingthread_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_find_most_blockingthread_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterFind_most_blockingthread_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitFind_most_blockingthread_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitFind_most_blockingthread_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Find_most_blockingthread_flagContext find_most_blockingthread_flag() throws RecognitionException {
		Find_most_blockingthread_flagContext _localctx = new Find_most_blockingthread_flagContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_find_most_blockingthread_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__0);
			setState(245);
			match(FIND_MOST_BLOCKINGTHREAD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extend_flagContext extends ParserRuleContext {
		public TerminalNode EXTEND() { return getToken(CommandParser.EXTEND, 0); }
		public TerminalNode EXTEND_LEVEL() { return getToken(CommandParser.EXTEND_LEVEL, 0); }
		public Extend_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extend_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterExtend_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitExtend_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitExtend_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extend_flagContext extend_flag() throws RecognitionException {
		Extend_flagContext _localctx = new Extend_flagContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_extend_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__0);
			setState(248);
			match(EXTEND);
			setState(249);
			match(EXTEND_LEVEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hashcode_flagContext extends ParserRuleContext {
		public TerminalNode HASHCODE_FLAG() { return getToken(CommandParser.HASHCODE_FLAG, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Hashcode_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashcode_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterHashcode_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitHashcode_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitHashcode_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hashcode_flagContext hashcode_flag() throws RecognitionException {
		Hashcode_flagContext _localctx = new Hashcode_flagContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_hashcode_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__0);
			setState(252);
			match(HASHCODE_FLAG);
			setState(253);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_limit_flagContext extends ParserRuleContext {
		public TerminalNode NUMBER_LIMIT() { return getToken(CommandParser.NUMBER_LIMIT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Number_limit_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_limit_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterNumber_limit_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitNumber_limit_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitNumber_limit_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_limit_flagContext number_limit_flag() throws RecognitionException {
		Number_limit_flagContext _localctx = new Number_limit_flagContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_number_limit_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__0);
			setState(256);
			match(NUMBER_LIMIT);
			setState(257);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cycle_flagContext extends ParserRuleContext {
		public TerminalNode HASHCODE_FLAG() { return getToken(CommandParser.HASHCODE_FLAG, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Cycle_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterCycle_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitCycle_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitCycle_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cycle_flagContext cycle_flag() throws RecognitionException {
		Cycle_flagContext _localctx = new Cycle_flagContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cycle_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__0);
			setState(260);
			match(HASHCODE_FLAG);
			setState(261);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Top_N_Busy_flagContext extends ParserRuleContext {
		public TerminalNode NUMBER_LIMIT() { return getToken(CommandParser.NUMBER_LIMIT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Top_N_Busy_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_N_Busy_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterTop_N_Busy_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitTop_N_Busy_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitTop_N_Busy_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_N_Busy_flagContext top_N_Busy_flag() throws RecognitionException {
		Top_N_Busy_flagContext _localctx = new Top_N_Busy_flagContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_top_N_Busy_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__0);
			setState(264);
			match(NUMBER_LIMIT);
			setState(265);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetSampleInterval_flagContext extends ParserRuleContext {
		public TerminalNode INCLUDEREFLECTIONCLASSLOADER_FLAG() { return getToken(CommandParser.INCLUDEREFLECTIONCLASSLOADER_FLAG, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public SetSampleInterval_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setSampleInterval_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterSetSampleInterval_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitSetSampleInterval_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitSetSampleInterval_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetSampleInterval_flagContext setSampleInterval_flag() throws RecognitionException {
		SetSampleInterval_flagContext _localctx = new SetSampleInterval_flagContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_setSampleInterval_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__0);
			setState(268);
			match(INCLUDEREFLECTIONCLASSLOADER_FLAG);
			setState(269);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeReflectionClassLoader_flagContext extends ParserRuleContext {
		public TerminalNode INCLUDEREFLECTIONCLASSLOADER_FLAG() { return getToken(CommandParser.INCLUDEREFLECTIONCLASSLOADER_FLAG, 0); }
		public IncludeReflectionClassLoader_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeReflectionClassLoader_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterIncludeReflectionClassLoader_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitIncludeReflectionClassLoader_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitIncludeReflectionClassLoader_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeReflectionClassLoader_flagContext includeReflectionClassLoader_flag() throws RecognitionException {
		IncludeReflectionClassLoader_flagContext _localctx = new IncludeReflectionClassLoader_flagContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_includeReflectionClassLoader_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__0);
			setState(272);
			match(INCLUDEREFLECTIONCLASSLOADER_FLAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Detail_flagContext extends ParserRuleContext {
		public TerminalNode DETAIL() { return getToken(CommandParser.DETAIL, 0); }
		public Detail_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detail_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterDetail_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitDetail_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitDetail_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detail_flagContext detail_flag() throws RecognitionException {
		Detail_flagContext _localctx = new Detail_flagContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_detail_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__0);
			setState(275);
			match(DETAIL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_flagContext extends ParserRuleContext {
		public TerminalNode ALL_INFO() { return getToken(CommandParser.ALL_INFO, 0); }
		public All_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterAll_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitAll_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitAll_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_flagContext all_flag() throws RecognitionException {
		All_flagContext _localctx = new All_flagContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_all_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__0);
			setState(278);
			match(ALL_INFO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_patternContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Class_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterClass_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitClass_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitClass_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_patternContext class_pattern() throws RecognitionException {
		Class_patternContext _localctx = new Class_patternContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_class_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_patternContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Field_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterField_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitField_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitField_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_patternContext field_pattern() throws RecognitionException {
		Field_patternContext _localctx = new Field_patternContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_field_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Express_patternContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Express_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_express_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterExpress_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitExpress_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitExpress_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Express_patternContext express_pattern() throws RecognitionException {
		Express_patternContext _localctx = new Express_patternContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_express_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_patternContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Method_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterMethod_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitMethod_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitMethod_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_patternContext method_pattern() throws RecognitionException {
		Method_patternContext _localctx = new Method_patternContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_method_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CommandParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CommandParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandListener ) ((CommandListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommandVisitor ) return ((CommandVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_any_name);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(STRING_LITERAL);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(T__1);
				setState(293);
				any_name();
				setState(294);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u012d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3V\n\3\3\4\3\4\3\5\3\5\5\5\\\n\5\3\5\5\5_\n\5\3\5\5\5b\n\5\3"+
		"\5\5\5e\n\5\3\5\3\5\5\5i\n\5\5\5k\n\5\3\6\3\6\5\6o\n\6\3\6\5\6r\n\6\3"+
		"\6\3\6\5\6v\n\6\3\6\5\6y\n\6\5\6{\n\6\3\7\3\7\5\7\177\n\7\3\7\5\7\u0082"+
		"\n\7\3\7\3\7\5\7\u0086\n\7\3\7\5\7\u0089\n\7\5\7\u008b\n\7\3\b\3\b\5\b"+
		"\u008f\n\b\3\b\5\b\u0092\n\b\3\b\3\b\3\b\5\b\u0097\n\b\3\b\5\b\u009a\n"+
		"\b\5\b\u009c\n\b\3\t\3\t\5\t\u00a0\n\t\3\t\5\t\u00a3\n\t\3\t\5\t\u00a6"+
		"\n\t\3\t\3\t\5\t\u00aa\n\t\3\t\5\t\u00ad\n\t\5\t\u00af\n\t\3\n\3\n\5\n"+
		"\u00b3\n\n\3\n\5\n\u00b6\n\n\3\n\5\n\u00b9\n\n\3\n\5\n\u00bc\n\n\3\n\5"+
		"\n\u00bf\n\n\5\n\u00c1\n\n\3\13\3\13\5\13\u00c5\n\13\3\13\5\13\u00c8\n"+
		"\13\3\13\5\13\u00cb\n\13\3\13\5\13\u00ce\n\13\3\13\5\13\u00d1\n\13\3\13"+
		"\5\13\u00d4\n\13\3\13\5\13\u00d7\n\13\5\13\u00d9\n\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00e5\n\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\5$\u012b\n$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDF\2\3\3\2\16\20\2\u013f\2H\3\2\2\2\4U\3\2"+
		"\2\2\6W\3\2\2\2\bY\3\2\2\2\nl\3\2\2\2\f|\3\2\2\2\16\u008c\3\2\2\2\20\u009d"+
		"\3\2\2\2\22\u00b0\3\2\2\2\24\u00c2\3\2\2\2\26\u00da\3\2\2\2\30\u00dc\3"+
		"\2\2\2\32\u00de\3\2\2\2\34\u00e4\3\2\2\2\36\u00e6\3\2\2\2 \u00e9\3\2\2"+
		"\2\"\u00ed\3\2\2\2$\u00f0\3\2\2\2&\u00f3\3\2\2\2(\u00f6\3\2\2\2*\u00f9"+
		"\3\2\2\2,\u00fd\3\2\2\2.\u0101\3\2\2\2\60\u0105\3\2\2\2\62\u0109\3\2\2"+
		"\2\64\u010d\3\2\2\2\66\u0111\3\2\2\28\u0114\3\2\2\2:\u0117\3\2\2\2<\u011a"+
		"\3\2\2\2>\u011c\3\2\2\2@\u011e\3\2\2\2B\u0120\3\2\2\2D\u0122\3\2\2\2F"+
		"\u012a\3\2\2\2HI\5\4\3\2I\3\3\2\2\2JV\5\6\4\2KV\5\b\5\2LV\5\n\6\2MV\5"+
		"\24\13\2NV\5\f\7\2OV\5\16\b\2PV\5\20\t\2QV\5\22\n\2RV\5\26\f\2SV\5\30"+
		"\r\2TV\5\32\16\2UJ\3\2\2\2UK\3\2\2\2UL\3\2\2\2UM\3\2\2\2UN\3\2\2\2UO\3"+
		"\2\2\2UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\5\3\2\2\2WX"+
		"\7\22\2\2X\7\3\2\2\2Yj\7\6\2\2Z\\\58\35\2[Z\3\2\2\2[\\\3\2\2\2\\^\3\2"+
		"\2\2]_\5\36\20\2^]\3\2\2\2^_\3\2\2\2_a\3\2\2\2`b\5&\24\2a`\3\2\2\2ab\3"+
		"\2\2\2bd\3\2\2\2ce\5*\26\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fk\5<\37\2gi\5"+
		"\34\17\2hg\3\2\2\2hi\3\2\2\2ik\3\2\2\2j[\3\2\2\2jh\3\2\2\2k\t\3\2\2\2"+
		"lz\7\7\2\2mo\58\35\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\5&\24\2qp\3\2\2\2"+
		"qr\3\2\2\2rs\3\2\2\2su\5<\37\2tv\5D#\2ut\3\2\2\2uv\3\2\2\2v{\3\2\2\2w"+
		"y\5\34\17\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2zn\3\2\2\2zx\3\2\2\2{\13\3\2"+
		"\2\2|\u008a\7\b\2\2}\177\5,\27\2~}\3\2\2\2~\177\3\2\2\2\177\u0081\3\2"+
		"\2\2\u0080\u0082\5&\24\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\5<\37\2\u0084\u0086\5D#\2\u0085\u0084\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\u008b\3\2\2\2\u0087\u0089\5\34\17\2\u0088"+
		"\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a~\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008b\r\3\2\2\2\u008c\u009b\7\t\2\2\u008d\u008f\5"+
		",\27\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u0092\5&\24\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\5<\37\2\u0094\u0096\5D#\2\u0095\u0097\5@!\2\u0096\u0095"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009c\3\2\2\2\u0098\u009a\5\34\17\2"+
		"\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u008e"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009c\17\3\2\2\2\u009d\u00ae\7\n\2\2\u009e"+
		"\u00a0\5\60\31\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3"+
		"\2\2\2\u00a1\u00a3\5&\24\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a6\5.\30\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\5<\37\2\u00a8\u00aa\5D#\2\u00a9\u00a8"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00af\3\2\2\2\u00ab\u00ad\5\34\17\2"+
		"\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u009f"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\21\3\2\2\2\u00b0\u00c0\7\13\2\2\u00b1"+
		"\u00b3\5\62\32\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3"+
		"\2\2\2\u00b4\u00b6\5(\25\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b9\5\64\33\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3"+
		"\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00bc\5B\"\2\u00bb\u00ba\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00c1\3\2\2\2\u00bd\u00bf\5\34\17\2\u00be\u00bd\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\23\3\2\2\2\u00c2\u00d8\7\f\2\2\u00c3\u00c5\5:\36"+
		"\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8"+
		"\5,\27\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00cb\5\66\34\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3"+
		"\2\2\2\u00cc\u00ce\5 \21\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00d1\5\"\22\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d4\5$\23\2\u00d3\u00d2\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d9\3\2\2\2\u00d5\u00d7\5\34\17\2\u00d6\u00d5\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00c4\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\25\3\2\2\2\u00da\u00db\7\r\2\2\u00db\27\3\2\2\2\u00dc"+
		"\u00dd\t\2\2\2\u00dd\31\3\2\2\2\u00de\u00df\7\21\2\2\u00df\33\3\2\2\2"+
		"\u00e0\u00e1\7\3\2\2\u00e1\u00e5\7\22\2\2\u00e2\u00e3\7\3\2\2\u00e3\u00e5"+
		"\7\23\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\35\3\2\2\2\u00e6"+
		"\u00e7\7\3\2\2\u00e7\u00e8\7\26\2\2\u00e8\37\3\2\2\2\u00e9\u00ea\7\3\2"+
		"\2\u00ea\u00eb\7\36\2\2\u00eb\u00ec\5F$\2\u00ec!\3\2\2\2\u00ed\u00ee\7"+
		"\3\2\2\u00ee\u00ef\7\37\2\2\u00ef#\3\2\2\2\u00f0\u00f1\7\3\2\2\u00f1\u00f2"+
		"\7 \2\2\u00f2%\3\2\2\2\u00f3\u00f4\7\3\2\2\u00f4\u00f5\7\27\2\2\u00f5"+
		"\'\3\2\2\2\u00f6\u00f7\7\3\2\2\u00f7\u00f8\7\30\2\2\u00f8)\3\2\2\2\u00f9"+
		"\u00fa\7\3\2\2\u00fa\u00fb\7\31\2\2\u00fb\u00fc\7\"\2\2\u00fc+\3\2\2\2"+
		"\u00fd\u00fe\7\3\2\2\u00fe\u00ff\7\32\2\2\u00ff\u0100\5F$\2\u0100-\3\2"+
		"\2\2\u0101\u0102\7\3\2\2\u0102\u0103\7\33\2\2\u0103\u0104\5F$\2\u0104"+
		"/\3\2\2\2\u0105\u0106\7\3\2\2\u0106\u0107\7\32\2\2\u0107\u0108\5F$\2\u0108"+
		"\61\3\2\2\2\u0109\u010a\7\3\2\2\u010a\u010b\7\33\2\2\u010b\u010c\5F$\2"+
		"\u010c\63\3\2\2\2\u010d\u010e\7\3\2\2\u010e\u010f\7\35\2\2\u010f\u0110"+
		"\5F$\2\u0110\65\3\2\2\2\u0111\u0112\7\3\2\2\u0112\u0113\7\35\2\2\u0113"+
		"\67\3\2\2\2\u0114\u0115\7\3\2\2\u0115\u0116\7\24\2\2\u01169\3\2\2\2\u0117"+
		"\u0118\7\3\2\2\u0118\u0119\7\25\2\2\u0119;\3\2\2\2\u011a\u011b\5F$\2\u011b"+
		"=\3\2\2\2\u011c\u011d\5F$\2\u011d?\3\2\2\2\u011e\u011f\5F$\2\u011fA\3"+
		"\2\2\2\u0120\u0121\5F$\2\u0121C\3\2\2\2\u0122\u0123\5F$\2\u0123E\3\2\2"+
		"\2\u0124\u012b\7!\2\2\u0125\u012b\7&\2\2\u0126\u0127\7\4\2\2\u0127\u0128"+
		"\5F$\2\u0128\u0129\7\5\2\2\u0129\u012b\3\2\2\2\u012a\u0124\3\2\2\2\u012a"+
		"\u0125\3\2\2\2\u012a\u0126\3\2\2\2\u012bG\3\2\2\2.U[^adhjnquxz~\u0081"+
		"\u0085\u0088\u008a\u008e\u0091\u0096\u0099\u009b\u009f\u00a2\u00a5\u00a9"+
		"\u00ac\u00ae\u00b2\u00b5\u00b8\u00bb\u00be\u00c0\u00c4\u00c7\u00ca\u00cd"+
		"\u00d0\u00d3\u00d6\u00d8\u00e4\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}