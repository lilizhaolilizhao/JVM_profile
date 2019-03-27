package com.github.jvm.agent.antlr;// Generated from /Users/oneapm/git/JVM_profile/agent/src/main/antlr/Command.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SC_COMMAND=4, KEYMAP_COMMAND=5, EXIT_COMMAND=6, 
		LOGOUT_COMMAND=7, QUIT_COMMAND=8, CLS_COMMAND=9, HELP_COMMAND=10, HELP=11, 
		DETAIL=12, FIELD=13, REGEX=14, IDENTIFIER=15, NUMERIC_LITERAL=16, BIND_PARAMETER=17, 
		STRING_LITERAL=18, BLOB_LITERAL=19, SINGLE_LINE_COMMENT=20, MULTILINE_COMMENT=21, 
		SPACES=22, UNEXPECTED_CHAR=23;
	public static final int
		RULE_parse = 0, RULE_command_list = 1, RULE_help_command = 2, RULE_sc_command = 3, 
		RULE_keymap_command = 4, RULE_exit_command = 5, RULE_cls_command = 6, 
		RULE_general_help = 7, RULE_field_flag = 8, RULE_regex_flag = 9, RULE_detail_flag = 10, 
		RULE_class_pattern = 11, RULE_any_name = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "command_list", "help_command", "sc_command", "keymap_command", 
			"exit_command", "cls_command", "general_help", "field_flag", "regex_flag", 
			"detail_flag", "class_pattern", "any_name"
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
			null, null, null, null, "SC_COMMAND", "KEYMAP_COMMAND", "EXIT_COMMAND", 
			"LOGOUT_COMMAND", "QUIT_COMMAND", "CLS_COMMAND", "HELP_COMMAND", "HELP", 
			"DETAIL", "FIELD", "REGEX", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", 
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
			setState(26);
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
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HELP_COMMAND:
				{
				setState(28);
				help_command();
				}
				break;
			case SC_COMMAND:
				{
				setState(29);
				sc_command();
				}
				break;
			case KEYMAP_COMMAND:
				{
				setState(30);
				keymap_command();
				}
				break;
			case EXIT_COMMAND:
			case LOGOUT_COMMAND:
			case QUIT_COMMAND:
				{
				setState(31);
				exit_command();
				}
				break;
			case CLS_COMMAND:
				{
				setState(32);
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
			setState(35);
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
			setState(37);
			match(SC_COMMAND);
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(38);
					detail_flag();
					}
					break;
				}
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(41);
					field_flag();
					}
					break;
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(44);
					regex_flag();
					}
				}

				setState(47);
				class_pattern();
				}
				break;
			case 2:
				{
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(48);
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
		enterRule(_localctx, 8, RULE_keymap_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
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
		enterRule(_localctx, 10, RULE_exit_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
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
		enterRule(_localctx, 12, RULE_cls_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
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
		enterRule(_localctx, 14, RULE_general_help);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(T__0);
				setState(60);
				match(HELP_COMMAND);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(T__0);
				setState(62);
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
		enterRule(_localctx, 16, RULE_field_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__0);
			setState(66);
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
		enterRule(_localctx, 18, RULE_regex_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
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
		enterRule(_localctx, 20, RULE_detail_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(72);
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
		enterRule(_localctx, 22, RULE_class_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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
		enterRule(_localctx, 24, RULE_any_name);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(STRING_LITERAL);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(T__1);
				setState(79);
				any_name();
				setState(80);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31W\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\4\3\4"+
		"\3\5\3\5\5\5*\n\5\3\5\5\5-\n\5\3\5\5\5\60\n\5\3\5\3\5\5\5\64\n\5\5\5\66"+
		"\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\5\tB\n\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16U\n\16"+
		"\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\b\n\2U\2\34\3\2"+
		"\2\2\4#\3\2\2\2\6%\3\2\2\2\b\'\3\2\2\2\n\67\3\2\2\2\f9\3\2\2\2\16;\3\2"+
		"\2\2\20A\3\2\2\2\22C\3\2\2\2\24F\3\2\2\2\26I\3\2\2\2\30L\3\2\2\2\32T\3"+
		"\2\2\2\34\35\5\4\3\2\35\3\3\2\2\2\36$\5\6\4\2\37$\5\b\5\2 $\5\n\6\2!$"+
		"\5\f\7\2\"$\5\16\b\2#\36\3\2\2\2#\37\3\2\2\2# \3\2\2\2#!\3\2\2\2#\"\3"+
		"\2\2\2$\5\3\2\2\2%&\7\f\2\2&\7\3\2\2\2\'\65\7\6\2\2(*\5\26\f\2)(\3\2\2"+
		"\2)*\3\2\2\2*,\3\2\2\2+-\5\22\n\2,+\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\60\5"+
		"\24\13\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\66\5\30\r\2\62\64\5\20"+
		"\t\2\63\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65)\3\2\2\2\65\63\3\2\2"+
		"\2\66\t\3\2\2\2\678\7\7\2\28\13\3\2\2\29:\t\2\2\2:\r\3\2\2\2;<\7\13\2"+
		"\2<\17\3\2\2\2=>\7\3\2\2>B\7\f\2\2?@\7\3\2\2@B\7\r\2\2A=\3\2\2\2A?\3\2"+
		"\2\2B\21\3\2\2\2CD\7\3\2\2DE\7\17\2\2E\23\3\2\2\2FG\7\3\2\2GH\7\20\2\2"+
		"H\25\3\2\2\2IJ\7\3\2\2JK\7\16\2\2K\27\3\2\2\2LM\5\32\16\2M\31\3\2\2\2"+
		"NU\7\21\2\2OU\7\24\2\2PQ\7\4\2\2QR\5\32\16\2RS\7\5\2\2SU\3\2\2\2TN\3\2"+
		"\2\2TO\3\2\2\2TP\3\2\2\2U\33\3\2\2\2\n#),/\63\65AT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}