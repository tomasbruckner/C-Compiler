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
		RULE_any_value = 0, RULE_data_type = 1, RULE_type = 2, RULE_parse = 3, 
		RULE_start = 4, RULE_function_declaration = 5, RULE_param_type_list = 6, 
		RULE_function_definition = 7, RULE_param_list = 8, RULE_statement = 9, 
		RULE_variable_definition_statement = 10, RULE_assignment_statement = 11, 
		RULE_conditional_statement = 12, RULE_while_statement = 13, RULE_function_call_statement = 14, 
		RULE_return_statement = 15, RULE_block_statements = 16, RULE_function_call = 17, 
		RULE_condition_expression = 18, RULE_expression = 19;
	public static final String[] ruleNames = {
		"any_value", "data_type", "type", "parse", "start", "function_declaration", 
		"param_type_list", "function_definition", "param_list", "statement", "variable_definition_statement", 
		"assignment_statement", "conditional_statement", "while_statement", "function_call_statement", 
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
		public Any_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_value; }
	 
		public Any_valueContext() { }
		public void copyFrom(Any_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharLiteralLabelContext extends Any_valueContext {
		public TerminalNode CharLiteral() { return getToken(VYPeParserParser.CharLiteral, 0); }
		public CharLiteralLabelContext(Any_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterCharLiteralLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitCharLiteralLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitCharLiteralLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralLabelContext extends Any_valueContext {
		public TerminalNode IntLiteral() { return getToken(VYPeParserParser.IntLiteral, 0); }
		public IntLiteralLabelContext(Any_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterIntLiteralLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitIntLiteralLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitIntLiteralLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierLabelContext extends Any_valueContext {
		public TerminalNode Identifier() { return getToken(VYPeParserParser.Identifier, 0); }
		public IdentifierLabelContext(Any_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterIdentifierLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitIdentifierLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitIdentifierLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralLabelContext extends Any_valueContext {
		public TerminalNode StringLiteral() { return getToken(VYPeParserParser.StringLiteral, 0); }
		public StringLiteralLabelContext(Any_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterStringLiteralLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitStringLiteralLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitStringLiteralLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_valueContext any_value() throws RecognitionException {
		Any_valueContext _localctx = new Any_valueContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_any_value);
		try {
			setState(44);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new IdentifierLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(Identifier);
				}
				break;
			case IntLiteral:
				_localctx = new IntLiteralLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(IntLiteral);
				}
				break;
			case CharLiteral:
				_localctx = new CharLiteralLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(CharLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringLiteralLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				match(StringLiteral);
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
		enterRule(_localctx, 2, RULE_data_type);
		try {
			setState(49);
			switch (_input.LA(1)) {
			case Int:
				_localctx = new IntLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(Int);
				}
				break;
			case Char:
				_localctx = new CharLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(Char);
				}
				break;
			case String:
				_localctx = new StringLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
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
	public static class DataTypeLabelContext extends TypeContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public DataTypeLabelContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterDataTypeLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitDataTypeLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitDataTypeLabel(this);
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
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(53);
			switch (_input.LA(1)) {
			case Char:
			case Int:
			case String:
				_localctx = new DataTypeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				data_type();
				}
				break;
			case Void:
				_localctx = new VoidLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
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
		enterRule(_localctx, 6, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
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
		enterRule(_localctx, 8, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(57);
					function_declaration();
					}
					break;
				case 2:
					{
					setState(58);
					function_definition();
					}
					break;
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Int) | (1L << String) | (1L << Void))) != 0) );
			setState(63);
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
		enterRule(_localctx, 10, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			type();
			setState(66);
			match(Identifier);
			setState(67);
			match(LeftParenthesis);
			setState(68);
			param_type_list();
			setState(69);
			match(RightParenthesis);
			setState(70);
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
		enterRule(_localctx, 12, RULE_param_type_list);
		int _la;
		try {
			setState(81);
			switch (_input.LA(1)) {
			case Char:
			case Int:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				data_type();
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(73);
					match(Colon);
					setState(74);
					data_type();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
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
		enterRule(_localctx, 14, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			type();
			setState(84);
			match(Identifier);
			setState(85);
			match(LeftParenthesis);
			setState(86);
			param_list();
			setState(87);
			match(RightParenthesis);
			setState(88);
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
		enterRule(_localctx, 16, RULE_param_list);
		int _la;
		try {
			setState(102);
			switch (_input.LA(1)) {
			case Char:
			case Int:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				data_type();
				setState(91);
				match(Identifier);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(92);
					match(Colon);
					setState(93);
					data_type();
					setState(94);
					match(Identifier);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
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
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				variable_definition_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				conditional_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				while_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				function_call_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
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
		enterRule(_localctx, 20, RULE_variable_definition_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			data_type();
			setState(113);
			match(Identifier);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(114);
				match(Colon);
				setState(115);
				match(Identifier);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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
		enterRule(_localctx, 22, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(Identifier);
			setState(124);
			match(AssignSign);
			setState(125);
			expression(0);
			setState(126);
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
		enterRule(_localctx, 24, RULE_conditional_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(If);
			setState(129);
			condition_expression();
			setState(130);
			block_statements();
			setState(131);
			match(Else);
			setState(132);
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
		enterRule(_localctx, 26, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(While);
			setState(135);
			condition_expression();
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
		enterRule(_localctx, 28, RULE_function_call_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			function_call();
			setState(139);
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
		enterRule(_localctx, 30, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(Return);
			setState(143);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << LeftParenthesis) | (1L << ExclamationMark) | (1L << IntLiteral) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(142);
				expression(0);
				}
			}

			setState(145);
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
		enterRule(_localctx, 32, RULE_block_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(LeftCurlyParenthesis);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << If) | (1L << Int) | (1L << Return) | (1L << String) | (1L << While) | (1L << Identifier))) != 0)) {
				{
				{
				setState(148);
				statement();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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
		public TerminalNode Identifier() { return getToken(VYPeParserParser.Identifier, 0); }
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
		enterRule(_localctx, 34, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(Identifier);
			setState(157);
			match(LeftParenthesis);
			setState(166);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << LeftParenthesis) | (1L << ExclamationMark) | (1L << IntLiteral) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(158);
				expression(0);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(159);
					match(Colon);
					setState(160);
					expression(0);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(168);
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
		enterRule(_localctx, 36, RULE_condition_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(LeftParenthesis);
			setState(171);
			expression(0);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(175);
				any_value();
				}
				break;
			case 2:
				{
				setState(176);
				match(LeftParenthesis);
				setState(177);
				expression(0);
				setState(178);
				match(RightParenthesis);
				}
				break;
			case 3:
				{
				setState(180);
				match(LeftParenthesis);
				setState(181);
				data_type();
				setState(182);
				match(RightParenthesis);
				setState(183);
				expression(9);
				}
				break;
			case 4:
				{
				setState(185);
				function_call();
				}
				break;
			case 5:
				{
				setState(186);
				match(ExclamationMark);
				setState(187);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(191);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiplicationSign) | (1L << DivisionSign) | (1L << ModuloSign))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(192);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(194);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PlusSign || _la==MinusSign) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(195);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(197);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LowerSign) | (1L << GreaterSign) | (1L << LowerEqualSign) | (1L << GreaterEqualSign))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(198);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(200);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EqualSign || _la==NotEqualSign) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(201);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(203);
						match(LogicalAndSign);
						setState(204);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(206);
						match(LogicalOrSign);
						setState(207);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		case 19:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\5\2/\n\2\3\3\3\3\3\3\5"+
		"\3\64\n\3\3\4\3\4\5\48\n\4\3\5\3\5\3\6\3\6\6\6>\n\6\r\6\16\6?\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bN\n\b\f\b\16\bQ\13\b\3\b\5"+
		"\bT\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nc\n\n\f"+
		"\n\16\nf\13\n\3\n\5\ni\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13q\n\13\3"+
		"\f\3\f\3\f\3\f\7\fw\n\f\f\f\16\fz\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\5\21\u0092\n\21\3\21\3\21\3\22\3\22\7\22\u0098\n\22\f\22\16\22\u009b"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00a4\n\23\f\23\16\23\u00a7"+
		"\13\23\5\23\u00a9\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00bf\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u00d3\n\25\f\25\16\25\u00d6\13\25\3\25\2\3("+
		"\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2\26\30\3\2\31"+
		"\32\3\2\33\36\3\2\37 \u00e3\2.\3\2\2\2\4\63\3\2\2\2\6\67\3\2\2\2\b9\3"+
		"\2\2\2\n=\3\2\2\2\fC\3\2\2\2\16S\3\2\2\2\20U\3\2\2\2\22h\3\2\2\2\24p\3"+
		"\2\2\2\26r\3\2\2\2\30}\3\2\2\2\32\u0082\3\2\2\2\34\u0088\3\2\2\2\36\u008c"+
		"\3\2\2\2 \u008f\3\2\2\2\"\u0095\3\2\2\2$\u009e\3\2\2\2&\u00ac\3\2\2\2"+
		"(\u00be\3\2\2\2*/\7\20\2\2+/\7#\2\2,/\7$\2\2-/\7%\2\2.*\3\2\2\2.+\3\2"+
		"\2\2.,\3\2\2\2.-\3\2\2\2/\3\3\2\2\2\60\64\7\6\2\2\61\64\7\3\2\2\62\64"+
		"\7\b\2\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\658\5"+
		"\4\3\2\668\7\t\2\2\67\65\3\2\2\2\67\66\3\2\2\28\7\3\2\2\29:\5\n\6\2:\t"+
		"\3\2\2\2;>\5\f\7\2<>\5\20\t\2=;\3\2\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2"+
		"?@\3\2\2\2@A\3\2\2\2AB\7\2\2\3B\13\3\2\2\2CD\5\6\4\2DE\7\20\2\2EF\7\21"+
		"\2\2FG\5\16\b\2GH\7\22\2\2HI\7(\2\2I\r\3\2\2\2JO\5\4\3\2KL\7\'\2\2LN\5"+
		"\4\3\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PT\3\2\2\2QO\3\2\2\2RT\7"+
		"\t\2\2SJ\3\2\2\2SR\3\2\2\2T\17\3\2\2\2UV\5\6\4\2VW\7\20\2\2WX\7\21\2\2"+
		"XY\5\22\n\2YZ\7\22\2\2Z[\5\"\22\2[\21\3\2\2\2\\]\5\4\3\2]d\7\20\2\2^_"+
		"\7\'\2\2_`\5\4\3\2`a\7\20\2\2ac\3\2\2\2b^\3\2\2\2cf\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2ei\3\2\2\2fd\3\2\2\2gi\7\t\2\2h\\\3\2\2\2hg\3\2\2\2i\23\3\2"+
		"\2\2jq\5\26\f\2kq\5\30\r\2lq\5\32\16\2mq\5\34\17\2nq\5\36\20\2oq\5 \21"+
		"\2pj\3\2\2\2pk\3\2\2\2pl\3\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\25\3\2"+
		"\2\2rs\5\4\3\2sx\7\20\2\2tu\7\'\2\2uw\7\20\2\2vt\3\2\2\2wz\3\2\2\2xv\3"+
		"\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7(\2\2|\27\3\2\2\2}~\7\20\2\2~"+
		"\177\7&\2\2\177\u0080\5(\25\2\u0080\u0081\7(\2\2\u0081\31\3\2\2\2\u0082"+
		"\u0083\7\5\2\2\u0083\u0084\5&\24\2\u0084\u0085\5\"\22\2\u0085\u0086\7"+
		"\4\2\2\u0086\u0087\5\"\22\2\u0087\33\3\2\2\2\u0088\u0089\7\n\2\2\u0089"+
		"\u008a\5&\24\2\u008a\u008b\5\"\22\2\u008b\35\3\2\2\2\u008c\u008d\5$\23"+
		"\2\u008d\u008e\7(\2\2\u008e\37\3\2\2\2\u008f\u0091\7\7\2\2\u0090\u0092"+
		"\5(\25\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\7(\2\2\u0094!\3\2\2\2\u0095\u0099\7\23\2\2\u0096\u0098\5\24\13"+
		"\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\24\2\2"+
		"\u009d#\3\2\2\2\u009e\u009f\7\20\2\2\u009f\u00a8\7\21\2\2\u00a0\u00a5"+
		"\5(\25\2\u00a1\u00a2\7\'\2\2\u00a2\u00a4\5(\25\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\7\22\2\2\u00ab%\3\2\2\2\u00ac\u00ad\7\21\2"+
		"\2\u00ad\u00ae\5(\25\2\u00ae\u00af\7\22\2\2\u00af\'\3\2\2\2\u00b0\u00b1"+
		"\b\25\1\2\u00b1\u00bf\5\2\2\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\5(\25\2"+
		"\u00b4\u00b5\7\22\2\2\u00b5\u00bf\3\2\2\2\u00b6\u00b7\7\21\2\2\u00b7\u00b8"+
		"\5\4\3\2\u00b8\u00b9\7\22\2\2\u00b9\u00ba\5(\25\13\u00ba\u00bf\3\2\2\2"+
		"\u00bb\u00bf\5$\23\2\u00bc\u00bd\7\25\2\2\u00bd\u00bf\5(\25\t\u00be\u00b0"+
		"\3\2\2\2\u00be\u00b2\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00bb\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00d4\3\2\2\2\u00c0\u00c1\f\b\2\2\u00c1\u00c2\t\2"+
		"\2\2\u00c2\u00d3\5(\25\t\u00c3\u00c4\f\7\2\2\u00c4\u00c5\t\3\2\2\u00c5"+
		"\u00d3\5(\25\b\u00c6\u00c7\f\6\2\2\u00c7\u00c8\t\4\2\2\u00c8\u00d3\5("+
		"\25\7\u00c9\u00ca\f\5\2\2\u00ca\u00cb\t\5\2\2\u00cb\u00d3\5(\25\6\u00cc"+
		"\u00cd\f\4\2\2\u00cd\u00ce\7!\2\2\u00ce\u00d3\5(\25\5\u00cf\u00d0\f\3"+
		"\2\2\u00d0\u00d1\7\"\2\2\u00d1\u00d3\5(\25\4\u00d2\u00c0\3\2\2\2\u00d2"+
		"\u00c3\3\2\2\2\u00d2\u00c6\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00cc\3\2"+
		"\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5)\3\2\2\2\u00d6\u00d4\3\2\2\2\24.\63\67=?OSdhpx\u0091"+
		"\u0099\u00a5\u00a8\u00be\u00d2\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}