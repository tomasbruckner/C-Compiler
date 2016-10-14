// Generated from C:/Users/Tom/IdeaProjects/vype/src/grammar\VYPeParser.g4 by ANTLR 4.5.3
package grammar.gen;
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
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
	 
		public Data_typeContext() { }
		public void copyFrom(Data_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntLabelContext extends Data_typeContext {
		public TerminalNode Int() { return getToken(VYPeParserParser.Int, 0); }
		public IntLabelContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterIntLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitIntLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitIntLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharLabelContext extends Data_typeContext {
		public TerminalNode Char() { return getToken(VYPeParserParser.Char, 0); }
		public CharLabelContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterCharLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitCharLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitCharLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLabelContext extends Data_typeContext {
		public TerminalNode String() { return getToken(VYPeParserParser.String, 0); }
		public StringLabelContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterStringLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitStringLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitStringLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data_type);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case Int:
				_localctx = new IntLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(Int);
				}
				break;
			case Char:
				_localctx = new CharLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(Char);
				}
				break;
			case String:
				_localctx = new StringLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(String);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DateTypeLabelContext extends TypeContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public DateTypeLabelContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterDateTypeLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitDateTypeLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitDateTypeLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidLabelContext extends TypeContext {
		public TerminalNode Void() { return getToken(VYPeParserParser.Void, 0); }
		public VoidLabelContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterVoidLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitVoidLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitVoidLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(55);
			switch (_input.LA(1)) {
			case Char:
			case Int:
			case String:
				_localctx = new DateTypeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				data_type();
				}
				break;
			case Void:
				_localctx = new VoidLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
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
			setState(57);
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
			setState(59);
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
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(61);
					function_declaration();
					}
					break;
				case 2:
					{
					setState(62);
					function_definition();
					}
					break;
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Int) | (1L << String) | (1L << Void))) != 0) );
			setState(67);
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
			setState(69);
			type();
			setState(70);
			match(Identifier);
			setState(71);
			match(LeftParenthesis);
			setState(72);
			param_type_list();
			setState(73);
			match(RightParenthesis);
			setState(74);
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
			setState(85);
			switch (_input.LA(1)) {
			case Char:
			case Int:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				data_type();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(77);
					match(Colon);
					setState(78);
					data_type();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
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
			setState(87);
			type();
			setState(88);
			match(Identifier);
			setState(89);
			match(LeftParenthesis);
			setState(90);
			param_list();
			setState(91);
			match(RightParenthesis);
			setState(92);
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
			setState(106);
			switch (_input.LA(1)) {
			case Char:
			case Int:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				data_type();
				setState(95);
				match(Identifier);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(96);
					match(Colon);
					setState(97);
					data_type();
					setState(98);
					match(Identifier);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				variable_definition_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				conditional_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				while_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				function_call_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
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
			setState(116);
			data_type();
			setState(117);
			match(Identifier);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(118);
				match(Colon);
				setState(119);
				match(Identifier);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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
			setState(127);
			match(Identifier);
			setState(128);
			match(AssignSign);
			setState(129);
			expression(0);
			setState(130);
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
			setState(132);
			match(If);
			setState(133);
			condition_expression();
			setState(134);
			block_statements();
			setState(135);
			match(Else);
			setState(136);
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
			setState(138);
			match(While);
			setState(139);
			condition_expression();
			setState(140);
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
			setState(142);
			function_call();
			setState(143);
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
			setState(145);
			match(Return);
			setState(147);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << LeftParenthesis) | (1L << ExclamationMark) | (1L << IntLiteral) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(146);
				expression(0);
				}
			}

			setState(149);
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
			setState(151);
			match(LeftCurlyParenthesis);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << If) | (1L << Int) | (1L << Return) | (1L << String) | (1L << While) | (1L << Identifier))) != 0)) {
				{
				{
				setState(152);
				statement();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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
			setState(160);
			function_identifier();
			setState(161);
			match(LeftParenthesis);
			setState(170);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << LeftParenthesis) | (1L << ExclamationMark) | (1L << IntLiteral) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(162);
				expression(0);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(163);
					match(Colon);
					setState(164);
					expression(0);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(172);
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
			setState(174);
			match(LeftParenthesis);
			setState(175);
			expression(0);
			setState(176);
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
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(179);
				any_value();
				}
				break;
			case 2:
				{
				setState(180);
				match(LeftParenthesis);
				setState(181);
				expression(0);
				setState(182);
				match(RightParenthesis);
				}
				break;
			case 3:
				{
				setState(184);
				match(LeftParenthesis);
				setState(185);
				data_type();
				setState(186);
				match(RightParenthesis);
				setState(187);
				expression(9);
				}
				break;
			case 4:
				{
				setState(189);
				function_call();
				}
				break;
			case 5:
				{
				setState(190);
				match(ExclamationMark);
				setState(191);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(195);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiplicationSign) | (1L << DivisionSign) | (1L << ModuloSign))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(196);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(198);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PlusSign || _la==MinusSign) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(199);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(201);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LowerSign) | (1L << GreaterSign) | (1L << LowerEqualSign) | (1L << GreaterEqualSign))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(202);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EqualSign || _la==NotEqualSign) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(205);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(207);
						match(LogicalAndSign);
						setState(208);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(210);
						match(LogicalOrSign);
						setState(211);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\5\4\66\n\4\3\5\3\5\5\5:\n\5\3\6\3\6\3\7\3\7\3\b\3\b\6\bB\n\b"+
		"\r\b\16\bC\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\nR\n\n\f"+
		"\n\16\nU\13\n\3\n\5\nX\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\fg\n\f\f\f\16\fj\13\f\3\f\5\fm\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\ru\n\r\3\16\3\16\3\16\3\16\7\16{\n\16\f\16\16\16~\13\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\5\23\u0096\n\23\3\23\3\23\3\24\3\24"+
		"\7\24\u009c\n\24\f\24\16\24\u009f\13\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u00a8\n\25\f\25\16\25\u00ab\13\25\5\25\u00ad\n\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u00c3\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00d7\n\27"+
		"\f\27\16\27\u00da\13\27\3\27\2\3,\30\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,\2\b\4\2\20\20#%\4\2\20\20##\3\2\26\30\3\2\31\32\3\2\33"+
		"\36\3\2\37 \u00e2\2.\3\2\2\2\4\60\3\2\2\2\6\65\3\2\2\2\b9\3\2\2\2\n;\3"+
		"\2\2\2\f=\3\2\2\2\16A\3\2\2\2\20G\3\2\2\2\22W\3\2\2\2\24Y\3\2\2\2\26l"+
		"\3\2\2\2\30t\3\2\2\2\32v\3\2\2\2\34\u0081\3\2\2\2\36\u0086\3\2\2\2 \u008c"+
		"\3\2\2\2\"\u0090\3\2\2\2$\u0093\3\2\2\2&\u0099\3\2\2\2(\u00a2\3\2\2\2"+
		"*\u00b0\3\2\2\2,\u00c2\3\2\2\2./\t\2\2\2/\3\3\2\2\2\60\61\t\3\2\2\61\5"+
		"\3\2\2\2\62\66\7\6\2\2\63\66\7\3\2\2\64\66\7\b\2\2\65\62\3\2\2\2\65\63"+
		"\3\2\2\2\65\64\3\2\2\2\66\7\3\2\2\2\67:\5\6\4\28:\7\t\2\29\67\3\2\2\2"+
		"98\3\2\2\2:\t\3\2\2\2;<\7\20\2\2<\13\3\2\2\2=>\5\16\b\2>\r\3\2\2\2?B\5"+
		"\20\t\2@B\5\24\13\2A?\3\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2"+
		"DE\3\2\2\2EF\7\2\2\3F\17\3\2\2\2GH\5\b\5\2HI\7\20\2\2IJ\7\21\2\2JK\5\22"+
		"\n\2KL\7\22\2\2LM\7(\2\2M\21\3\2\2\2NS\5\6\4\2OP\7\'\2\2PR\5\6\4\2QO\3"+
		"\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TX\3\2\2\2US\3\2\2\2VX\7\t\2\2WN\3"+
		"\2\2\2WV\3\2\2\2X\23\3\2\2\2YZ\5\b\5\2Z[\7\20\2\2[\\\7\21\2\2\\]\5\26"+
		"\f\2]^\7\22\2\2^_\5&\24\2_\25\3\2\2\2`a\5\6\4\2ah\7\20\2\2bc\7\'\2\2c"+
		"d\5\6\4\2de\7\20\2\2eg\3\2\2\2fb\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2"+
		"im\3\2\2\2jh\3\2\2\2km\7\t\2\2l`\3\2\2\2lk\3\2\2\2m\27\3\2\2\2nu\5\32"+
		"\16\2ou\5\34\17\2pu\5\36\20\2qu\5 \21\2ru\5\"\22\2su\5$\23\2tn\3\2\2\2"+
		"to\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\31\3\2\2\2vw\5\6\4"+
		"\2w|\7\20\2\2xy\7\'\2\2y{\7\20\2\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7(\2\2\u0080\33\3\2\2\2\u0081\u0082"+
		"\7\20\2\2\u0082\u0083\7&\2\2\u0083\u0084\5,\27\2\u0084\u0085\7(\2\2\u0085"+
		"\35\3\2\2\2\u0086\u0087\7\5\2\2\u0087\u0088\5*\26\2\u0088\u0089\5&\24"+
		"\2\u0089\u008a\7\4\2\2\u008a\u008b\5&\24\2\u008b\37\3\2\2\2\u008c\u008d"+
		"\7\n\2\2\u008d\u008e\5*\26\2\u008e\u008f\5&\24\2\u008f!\3\2\2\2\u0090"+
		"\u0091\5(\25\2\u0091\u0092\7(\2\2\u0092#\3\2\2\2\u0093\u0095\7\7\2\2\u0094"+
		"\u0096\5,\27\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\7(\2\2\u0098%\3\2\2\2\u0099\u009d\7\23\2\2\u009a\u009c"+
		"\5\30\r\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1"+
		"\7\24\2\2\u00a1\'\3\2\2\2\u00a2\u00a3\5\n\6\2\u00a3\u00ac\7\21\2\2\u00a4"+
		"\u00a9\5,\27\2\u00a5\u00a6\7\'\2\2\u00a6\u00a8\5,\27\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\22\2\2\u00af)\3\2\2\2\u00b0\u00b1"+
		"\7\21\2\2\u00b1\u00b2\5,\27\2\u00b2\u00b3\7\22\2\2\u00b3+\3\2\2\2\u00b4"+
		"\u00b5\b\27\1\2\u00b5\u00c3\5\2\2\2\u00b6\u00b7\7\21\2\2\u00b7\u00b8\5"+
		",\27\2\u00b8\u00b9\7\22\2\2\u00b9\u00c3\3\2\2\2\u00ba\u00bb\7\21\2\2\u00bb"+
		"\u00bc\5\6\4\2\u00bc\u00bd\7\22\2\2\u00bd\u00be\5,\27\13\u00be\u00c3\3"+
		"\2\2\2\u00bf\u00c3\5(\25\2\u00c0\u00c1\7\25\2\2\u00c1\u00c3\5,\27\t\u00c2"+
		"\u00b4\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bf\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00d8\3\2\2\2\u00c4\u00c5\f\b\2\2\u00c5"+
		"\u00c6\t\4\2\2\u00c6\u00d7\5,\27\t\u00c7\u00c8\f\7\2\2\u00c8\u00c9\t\5"+
		"\2\2\u00c9\u00d7\5,\27\b\u00ca\u00cb\f\6\2\2\u00cb\u00cc\t\6\2\2\u00cc"+
		"\u00d7\5,\27\7\u00cd\u00ce\f\5\2\2\u00ce\u00cf\t\7\2\2\u00cf\u00d7\5,"+
		"\27\6\u00d0\u00d1\f\4\2\2\u00d1\u00d2\7!\2\2\u00d2\u00d7\5,\27\5\u00d3"+
		"\u00d4\f\3\2\2\u00d4\u00d5\7\"\2\2\u00d5\u00d7\5,\27\4\u00d6\u00c4\3\2"+
		"\2\2\u00d6\u00c7\3\2\2\2\u00d6\u00ca\3\2\2\2\u00d6\u00cd\3\2\2\2\u00d6"+
		"\u00d0\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9-\3\2\2\2\u00da\u00d8\3\2\2\2\23\659ACS"+
		"Whlt|\u0095\u009d\u00a9\u00ac\u00c2\u00d6\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}