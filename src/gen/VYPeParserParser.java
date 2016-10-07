// Generated from C:/Users/Tom/IdeaProjects/vype/src/grammer\VYPeParser.g4 by ANTLR 4.5.3
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VYPeParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Char=1, Else=2, If=3, Int=4, Return=5, String=6, Void=7, While=8, Break=9, 
		Continue=10, For=11, Short=12, Unsigned=13, Identifier=14, LeftParenthesis=15, 
		RightParenthesis=16, LeftCurlyParenthesis=17, RightCurlyParenthesis=18, 
		ExclamationMark=19, MultiplicationSign=20, DivisionSign=21, ModuloSign=22, 
		PlusSign=23, MinusSign=24, LowerSign=25, GreaterSign=26, LowerEqualSign=27, 
		GreaterEqualSign=28, EqualSign=29, NotEqualSign=30, LogicalAndSign=31, 
		LogicalOrSign=32, IntLiteral=33, CharLiteral=34, StringLiteral=35, AssignSign=36, 
		Colon=37, Semicolon=38, WhiteSpaces=39, LineComment=40, BlockComment=41;
	public static final int
		RULE_any_value = 0, RULE_number_value = 1, RULE_data_type = 2, RULE_type = 3, 
		RULE_function_identifier = 4, RULE_parse = 5, RULE_start = 6, RULE_function_declaration = 7, 
		RULE_param_type_list = 8, RULE_function_definition = 9, RULE_param_list = 10, 
		RULE_statement = 11, RULE_variable_definition_statement = 12, RULE_assignment_statement = 13, 
		RULE_conditional_statement = 14, RULE_while_statement = 15, RULE_function_call_statement = 16, 
		RULE_return_statement = 17, RULE_block_statements = 18, RULE_function_call = 19, 
		RULE_condition_expression = 20, RULE_expression = 21;
	public static final String[] ruleNames = {
		"any_value", "number_value", "data_type", "type", "function_identifier", 
		"parse", "start", "function_declaration", "param_type_list", "function_definition", 
		"param_list", "statement", "variable_definition_statement", "assignment_statement", 
		"conditional_statement", "while_statement", "function_call_statement", 
		"return_statement", "block_statements", "function_call", "condition_expression", 
		"expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'char'", "'else'", "'if'", "'int'", "'return'", "'string'", "'void'", 
		"'while'", "'break'", "'continue'", "'for'", "'short'", "'unsigned'", 
		null, "'('", "')'", "'{'", "'}'", "'!'", "'*'", "'/'", "'%'", "'+'", "'-'", 
		"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", null, null, 
		null, "'='", "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Char", "Else", "If", "Int", "Return", "String", "Void", "While", 
		"Break", "Continue", "For", "Short", "Unsigned", "Identifier", "LeftParenthesis", 
		"RightParenthesis", "LeftCurlyParenthesis", "RightCurlyParenthesis", "ExclamationMark", 
		"MultiplicationSign", "DivisionSign", "ModuloSign", "PlusSign", "MinusSign", 
		"LowerSign", "GreaterSign", "LowerEqualSign", "GreaterEqualSign", "EqualSign", 
		"NotEqualSign", "LogicalAndSign", "LogicalOrSign", "IntLiteral", "CharLiteral", 
		"StringLiteral", "AssignSign", "Colon", "Semicolon", "WhiteSpaces", "LineComment", 
		"BlockComment"
	};
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
	public String getGrammarFileName() { return "VYPeParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VYPeParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Any_valueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VYPeParserParser.Identifier, 0); }
		public TerminalNode IntLiteral() { return getToken(VYPeParserParser.IntLiteral, 0); }
		public TerminalNode CharLiteral() { return getToken(VYPeParserParser.CharLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(VYPeParserParser.StringLiteral, 0); }
		public Any_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterAny_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitAny_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitAny_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_valueContext any_value() throws RecognitionException {
		Any_valueContext _localctx = new Any_valueContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_any_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << IntLiteral) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Number_valueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VYPeParserParser.Identifier, 0); }
		public TerminalNode IntLiteral() { return getToken(VYPeParserParser.IntLiteral, 0); }
		public Number_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterNumber_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitNumber_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitNumber_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_valueContext number_value() throws RecognitionException {
		Number_valueContext _localctx = new Number_valueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_number_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==IntLiteral) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(VYPeParserParser.Int, 0); }
		public TerminalNode Char() { return getToken(VYPeParserParser.Char, 0); }
		public TerminalNode String() { return getToken(VYPeParserParser.String, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Int) | (1L << String))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TypeContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode Void() { return getToken(VYPeParserParser.Void, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(52);
			switch (_input.LA(1)) {
			case Char:
			case Int:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				data_type();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(Void);
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

	public static class Function_identifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VYPeParserParser.Identifier, 0); }
		public Function_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterFunction_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitFunction_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitFunction_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_identifierContext function_identifier() throws RecognitionException {
		Function_identifierContext _localctx = new Function_identifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(Identifier);
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

	public static class ParseContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			start();
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VYPeParserParser.EOF, 0); }
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(58);
					function_declaration();
					}
					break;
				case 2:
					{
					setState(59);
					function_definition();
					}
					break;
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Int) | (1L << String) | (1L << Void))) != 0) );
			setState(64);
			match(EOF);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(VYPeParserParser.Identifier, 0); }
		public TerminalNode LeftParenthesis() { return getToken(VYPeParserParser.LeftParenthesis, 0); }
		public Param_type_listContext param_type_list() {
			return getRuleContext(Param_type_listContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(VYPeParserParser.RightParenthesis, 0); }
		public TerminalNode Semicolon() { return getToken(VYPeParserParser.Semicolon, 0); }
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			type();
			setState(67);
			match(Identifier);
			setState(68);
			match(LeftParenthesis);
			setState(69);
			param_type_list();
			setState(70);
			match(RightParenthesis);
			setState(71);
			match(Semicolon);
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

	public static class Param_type_listContext extends ParserRuleContext {
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(VYPeParserParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(VYPeParserParser.Colon, i);
		}
		public TerminalNode Void() { return getToken(VYPeParserParser.Void, 0); }
		public Param_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterParam_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitParam_type_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitParam_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_type_listContext param_type_list() throws RecognitionException {
		Param_type_listContext _localctx = new Param_type_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param_type_list);
		int _la;
		try {
			setState(82);
			switch (_input.LA(1)) {
			case Char:
			case Int:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				data_type();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(74);
					match(Colon);
					setState(75);
					data_type();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(Void);
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

	public static class Function_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(VYPeParserParser.Identifier, 0); }
		public TerminalNode LeftParenthesis() { return getToken(VYPeParserParser.LeftParenthesis, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(VYPeParserParser.RightParenthesis, 0); }
		public Block_statementsContext block_statements() {
			return getRuleContext(Block_statementsContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			type();
			setState(85);
			match(Identifier);
			setState(86);
			match(LeftParenthesis);
			setState(87);
			param_list();
			setState(88);
			match(RightParenthesis);
			setState(89);
			block_statements();
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

	public static class Param_listContext extends ParserRuleContext {
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(VYPeParserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(VYPeParserParser.Identifier, i);
		}
		public List<TerminalNode> Colon() { return getTokens(VYPeParserParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(VYPeParserParser.Colon, i);
		}
		public TerminalNode Void() { return getToken(VYPeParserParser.Void, 0); }
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_param_list);
		int _la;
		try {
			setState(103);
			switch (_input.LA(1)) {
			case Char:
			case Int:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				data_type();
				setState(92);
				match(Identifier);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(93);
					match(Colon);
					setState(94);
					data_type();
					setState(95);
					match(Identifier);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(Void);
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

	public static class StatementContext extends ParserRuleContext {
		public Variable_definition_statementContext variable_definition_statement() {
			return getRuleContext(Variable_definition_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Function_call_statementContext function_call_statement() {
			return getRuleContext(Function_call_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				variable_definition_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				conditional_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				while_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				function_call_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				return_statement();
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

	public static class Variable_definition_statementContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(VYPeParserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(VYPeParserParser.Identifier, i);
		}
		public TerminalNode Semicolon() { return getToken(VYPeParserParser.Semicolon, 0); }
		public List<TerminalNode> Colon() { return getTokens(VYPeParserParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(VYPeParserParser.Colon, i);
		}
		public Variable_definition_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterVariable_definition_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitVariable_definition_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitVariable_definition_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_definition_statementContext variable_definition_statement() throws RecognitionException {
		Variable_definition_statementContext _localctx = new Variable_definition_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable_definition_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			data_type();
			setState(114);
			match(Identifier);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(115);
				match(Colon);
				setState(116);
				match(Identifier);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(Semicolon);
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VYPeParserParser.Identifier, 0); }
		public TerminalNode AssignSign() { return getToken(VYPeParserParser.AssignSign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(VYPeParserParser.Semicolon, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(Identifier);
			setState(125);
			match(AssignSign);
			setState(126);
			expression(0);
			setState(127);
			match(Semicolon);
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

	public static class Conditional_statementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(VYPeParserParser.If, 0); }
		public Condition_expressionContext condition_expression() {
			return getRuleContext(Condition_expressionContext.class,0);
		}
		public List<Block_statementsContext> block_statements() {
			return getRuleContexts(Block_statementsContext.class);
		}
		public Block_statementsContext block_statements(int i) {
			return getRuleContext(Block_statementsContext.class,i);
		}
		public TerminalNode Else() { return getToken(VYPeParserParser.Else, 0); }
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitConditional_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitConditional_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditional_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(If);
			setState(130);
			condition_expression();
			setState(131);
			block_statements();
			setState(132);
			match(Else);
			setState(133);
			block_statements();
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(VYPeParserParser.While, 0); }
		public Condition_expressionContext condition_expression() {
			return getRuleContext(Condition_expressionContext.class,0);
		}
		public Block_statementsContext block_statements() {
			return getRuleContext(Block_statementsContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(While);
			setState(136);
			condition_expression();
			setState(137);
			block_statements();
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

	public static class Function_call_statementContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(VYPeParserParser.Semicolon, 0); }
		public Function_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterFunction_call_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitFunction_call_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitFunction_call_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_statementContext function_call_statement() throws RecognitionException {
		Function_call_statementContext _localctx = new Function_call_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_call_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			function_call();
			setState(140);
			match(Semicolon);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(VYPeParserParser.Return, 0); }
		public TerminalNode Semicolon() { return getToken(VYPeParserParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(Return);
			setState(144);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << LeftParenthesis) | (1L << ExclamationMark) | (1L << IntLiteral) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(143);
				expression(0);
				}
			}

			setState(146);
			match(Semicolon);
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

	public static class Block_statementsContext extends ParserRuleContext {
		public TerminalNode LeftCurlyParenthesis() { return getToken(VYPeParserParser.LeftCurlyParenthesis, 0); }
		public TerminalNode RightCurlyParenthesis() { return getToken(VYPeParserParser.RightCurlyParenthesis, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterBlock_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitBlock_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitBlock_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementsContext block_statements() throws RecognitionException {
		Block_statementsContext _localctx = new Block_statementsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(LeftCurlyParenthesis);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << If) | (1L << Int) | (1L << Return) | (1L << String) | (1L << While) | (1L << Identifier))) != 0)) {
				{
				{
				setState(149);
				statement();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(RightCurlyParenthesis);
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_identifierContext function_identifier() {
			return getRuleContext(Function_identifierContext.class,0);
		}
		public TerminalNode LeftParenthesis() { return getToken(VYPeParserParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(VYPeParserParser.RightParenthesis, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(VYPeParserParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(VYPeParserParser.Colon, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			function_identifier();
			setState(158);
			match(LeftParenthesis);
			setState(167);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << LeftParenthesis) | (1L << ExclamationMark) | (1L << IntLiteral) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(159);
				expression(0);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(160);
					match(Colon);
					setState(161);
					expression(0);
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(169);
			match(RightParenthesis);
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

	public static class Condition_expressionContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(VYPeParserParser.LeftParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(VYPeParserParser.RightParenthesis, 0); }
		public Condition_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterCondition_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitCondition_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitCondition_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_expressionContext condition_expression() throws RecognitionException {
		Condition_expressionContext _localctx = new Condition_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condition_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(LeftParenthesis);
			setState(172);
			expression(0);
			setState(173);
			match(RightParenthesis);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public Any_valueContext any_value() {
			return getRuleContext(Any_valueContext.class,0);
		}
		public TerminalNode LeftParenthesis() { return getToken(VYPeParserParser.LeftParenthesis, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RightParenthesis() { return getToken(VYPeParserParser.RightParenthesis, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode ExclamationMark() { return getToken(VYPeParserParser.ExclamationMark, 0); }
		public TerminalNode MultiplicationSign() { return getToken(VYPeParserParser.MultiplicationSign, 0); }
		public TerminalNode DivisionSign() { return getToken(VYPeParserParser.DivisionSign, 0); }
		public TerminalNode ModuloSign() { return getToken(VYPeParserParser.ModuloSign, 0); }
		public TerminalNode PlusSign() { return getToken(VYPeParserParser.PlusSign, 0); }
		public TerminalNode MinusSign() { return getToken(VYPeParserParser.MinusSign, 0); }
		public TerminalNode LowerSign() { return getToken(VYPeParserParser.LowerSign, 0); }
		public TerminalNode GreaterSign() { return getToken(VYPeParserParser.GreaterSign, 0); }
		public TerminalNode LowerEqualSign() { return getToken(VYPeParserParser.LowerEqualSign, 0); }
		public TerminalNode GreaterEqualSign() { return getToken(VYPeParserParser.GreaterEqualSign, 0); }
		public TerminalNode EqualSign() { return getToken(VYPeParserParser.EqualSign, 0); }
		public TerminalNode NotEqualSign() { return getToken(VYPeParserParser.NotEqualSign, 0); }
		public TerminalNode LogicalAndSign() { return getToken(VYPeParserParser.LogicalAndSign, 0); }
		public TerminalNode LogicalOrSign() { return getToken(VYPeParserParser.LogicalOrSign, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(176);
				any_value();
				}
				break;
			case 2:
				{
				setState(177);
				match(LeftParenthesis);
				setState(178);
				expression(0);
				setState(179);
				match(RightParenthesis);
				}
				break;
			case 3:
				{
				setState(181);
				match(LeftParenthesis);
				setState(182);
				data_type();
				setState(183);
				match(RightParenthesis);
				setState(184);
				expression(9);
				}
				break;
			case 4:
				{
				setState(186);
				function_call();
				}
				break;
			case 5:
				{
				setState(187);
				match(ExclamationMark);
				setState(188);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(192);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiplicationSign) | (1L << DivisionSign) | (1L << ModuloSign))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(193);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(195);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PlusSign || _la==MinusSign) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(196);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(198);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LowerSign) | (1L << GreaterSign) | (1L << LowerEqualSign) | (1L << GreaterEqualSign))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(199);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(201);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EqualSign || _la==NotEqualSign) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(202);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(204);
						match(LogicalAndSign);
						setState(205);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(207);
						match(LogicalOrSign);
						setState(208);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\5\5\67\n\5\3\6\3\6\3\7\3\7\3\b\3\b\6\b?\n\b\r\b\16\b@\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\nO\n\n\f\n\16\nR\13\n\3"+
		"\n\5\nU\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\fd\n\f\f\f\16\fg\13\f\3\f\5\fj\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\rr\n\r"+
		"\3\16\3\16\3\16\3\16\7\16x\n\16\f\16\16\16{\13\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\5\23\u0093\n\23\3\23\3\23\3\24\3\24\7\24\u0099\n"+
		"\24\f\24\16\24\u009c\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u00a5"+
		"\n\25\f\25\16\25\u00a8\13\25\5\25\u00aa\n\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u00c0\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00d4\n\27\f\27\16\27\u00d7"+
		"\13\27\3\27\2\3,\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\t"+
		"\4\2\20\20#%\4\2\20\20##\5\2\3\3\6\6\b\b\3\2\26\30\3\2\31\32\3\2\33\36"+
		"\3\2\37 \u00dd\2.\3\2\2\2\4\60\3\2\2\2\6\62\3\2\2\2\b\66\3\2\2\2\n8\3"+
		"\2\2\2\f:\3\2\2\2\16>\3\2\2\2\20D\3\2\2\2\22T\3\2\2\2\24V\3\2\2\2\26i"+
		"\3\2\2\2\30q\3\2\2\2\32s\3\2\2\2\34~\3\2\2\2\36\u0083\3\2\2\2 \u0089\3"+
		"\2\2\2\"\u008d\3\2\2\2$\u0090\3\2\2\2&\u0096\3\2\2\2(\u009f\3\2\2\2*\u00ad"+
		"\3\2\2\2,\u00bf\3\2\2\2./\t\2\2\2/\3\3\2\2\2\60\61\t\3\2\2\61\5\3\2\2"+
		"\2\62\63\t\4\2\2\63\7\3\2\2\2\64\67\5\6\4\2\65\67\7\t\2\2\66\64\3\2\2"+
		"\2\66\65\3\2\2\2\67\t\3\2\2\289\7\20\2\29\13\3\2\2\2:;\5\16\b\2;\r\3\2"+
		"\2\2<?\5\20\t\2=?\5\24\13\2><\3\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A"+
		"\3\2\2\2AB\3\2\2\2BC\7\2\2\3C\17\3\2\2\2DE\5\b\5\2EF\7\20\2\2FG\7\21\2"+
		"\2GH\5\22\n\2HI\7\22\2\2IJ\7(\2\2J\21\3\2\2\2KP\5\6\4\2LM\7\'\2\2MO\5"+
		"\6\4\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QU\3\2\2\2RP\3\2\2\2SU\7"+
		"\t\2\2TK\3\2\2\2TS\3\2\2\2U\23\3\2\2\2VW\5\b\5\2WX\7\20\2\2XY\7\21\2\2"+
		"YZ\5\26\f\2Z[\7\22\2\2[\\\5&\24\2\\\25\3\2\2\2]^\5\6\4\2^e\7\20\2\2_`"+
		"\7\'\2\2`a\5\6\4\2ab\7\20\2\2bd\3\2\2\2c_\3\2\2\2dg\3\2\2\2ec\3\2\2\2"+
		"ef\3\2\2\2fj\3\2\2\2ge\3\2\2\2hj\7\t\2\2i]\3\2\2\2ih\3\2\2\2j\27\3\2\2"+
		"\2kr\5\32\16\2lr\5\34\17\2mr\5\36\20\2nr\5 \21\2or\5\"\22\2pr\5$\23\2"+
		"qk\3\2\2\2ql\3\2\2\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\31\3\2\2"+
		"\2st\5\6\4\2ty\7\20\2\2uv\7\'\2\2vx\7\20\2\2wu\3\2\2\2x{\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7(\2\2}\33\3\2\2\2~\177\7\20\2\2"+
		"\177\u0080\7&\2\2\u0080\u0081\5,\27\2\u0081\u0082\7(\2\2\u0082\35\3\2"+
		"\2\2\u0083\u0084\7\5\2\2\u0084\u0085\5*\26\2\u0085\u0086\5&\24\2\u0086"+
		"\u0087\7\4\2\2\u0087\u0088\5&\24\2\u0088\37\3\2\2\2\u0089\u008a\7\n\2"+
		"\2\u008a\u008b\5*\26\2\u008b\u008c\5&\24\2\u008c!\3\2\2\2\u008d\u008e"+
		"\5(\25\2\u008e\u008f\7(\2\2\u008f#\3\2\2\2\u0090\u0092\7\7\2\2\u0091\u0093"+
		"\5,\27\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\7(\2\2\u0095%\3\2\2\2\u0096\u009a\7\23\2\2\u0097\u0099\5\30\r\2"+
		"\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\24\2\2"+
		"\u009e\'\3\2\2\2\u009f\u00a0\5\n\6\2\u00a0\u00a9\7\21\2\2\u00a1\u00a6"+
		"\5,\27\2\u00a2\u00a3\7\'\2\2\u00a3\u00a5\5,\27\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\7\22\2\2\u00ac)\3\2\2\2\u00ad\u00ae\7\21\2"+
		"\2\u00ae\u00af\5,\27\2\u00af\u00b0\7\22\2\2\u00b0+\3\2\2\2\u00b1\u00b2"+
		"\b\27\1\2\u00b2\u00c0\5\2\2\2\u00b3\u00b4\7\21\2\2\u00b4\u00b5\5,\27\2"+
		"\u00b5\u00b6\7\22\2\2\u00b6\u00c0\3\2\2\2\u00b7\u00b8\7\21\2\2\u00b8\u00b9"+
		"\5\6\4\2\u00b9\u00ba\7\22\2\2\u00ba\u00bb\5,\27\13\u00bb\u00c0\3\2\2\2"+
		"\u00bc\u00c0\5(\25\2\u00bd\u00be\7\25\2\2\u00be\u00c0\5,\27\t\u00bf\u00b1"+
		"\3\2\2\2\u00bf\u00b3\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00d5\3\2\2\2\u00c1\u00c2\f\b\2\2\u00c2\u00c3\t\5"+
		"\2\2\u00c3\u00d4\5,\27\t\u00c4\u00c5\f\7\2\2\u00c5\u00c6\t\6\2\2\u00c6"+
		"\u00d4\5,\27\b\u00c7\u00c8\f\6\2\2\u00c8\u00c9\t\7\2\2\u00c9\u00d4\5,"+
		"\27\7\u00ca\u00cb\f\5\2\2\u00cb\u00cc\t\b\2\2\u00cc\u00d4\5,\27\6\u00cd"+
		"\u00ce\f\4\2\2\u00ce\u00cf\7!\2\2\u00cf\u00d4\5,\27\5\u00d0\u00d1\f\3"+
		"\2\2\u00d1\u00d2\7\"\2\2\u00d2\u00d4\5,\27\4\u00d3\u00c1\3\2\2\2\u00d3"+
		"\u00c4\3\2\2\2\u00d3\u00c7\3\2\2\2\u00d3\u00ca\3\2\2\2\u00d3\u00cd\3\2"+
		"\2\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6-\3\2\2\2\u00d7\u00d5\3\2\2\2\22\66>@PTeiqy\u0092"+
		"\u009a\u00a6\u00a9\u00bf\u00d3\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}