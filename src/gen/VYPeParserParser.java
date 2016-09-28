// Generated from C:/Users/Tom/IdeaProjects/vype/src/grammer\VYPeParser.g4 by ANTLR 4.5.3
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
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
		RULE_data_type = 0, RULE_type = 1, RULE_function_identifier = 2, RULE_start = 3, 
		RULE_function_declaration = 4, RULE_param_type_list = 5, RULE_function_definition = 6, 
		RULE_param_list = 7, RULE_statement = 8, RULE_variable_definition_statement = 9, 
		RULE_assignment_statement = 10, RULE_conditional_statement = 11, RULE_while_statement = 12, 
		RULE_function_call_statement = 13, RULE_return_statement = 14, RULE_block_statements = 15, 
		RULE_condition_expression = 16, RULE_expression = 17, RULE_binary_operand = 18;
	public static final String[] ruleNames = {
		"data_type", "type", "function_identifier", "start", "function_declaration", 
		"param_type_list", "function_definition", "param_list", "statement", "variable_definition_statement", 
		"assignment_statement", "conditional_statement", "while_statement", "function_call_statement", 
		"return_statement", "block_statements", "condition_expression", "expression", 
		"binary_operand"
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
		enterRule(_localctx, 0, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
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
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(42);
			switch (_input.LA(1)) {
			case Char:
			case Int:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				data_type();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
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
		enterRule(_localctx, 4, RULE_function_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
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

	public static class StartContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(VYPeParserParser.EOF, 0); }
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
		enterRule(_localctx, 6, RULE_start);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				function_declaration();
				setState(47);
				start();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				function_definition();
				setState(50);
				start();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(EOF);
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
		enterRule(_localctx, 8, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			type();
			setState(56);
			match(Identifier);
			setState(57);
			match(LeftParenthesis);
			setState(58);
			param_type_list();
			setState(59);
			match(RightParenthesis);
			setState(60);
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
		enterRule(_localctx, 10, RULE_param_type_list);
		int _la;
		try {
			setState(71);
			switch (_input.LA(1)) {
			case Char:
			case Int:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				data_type();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(63);
					match(Colon);
					setState(64);
					data_type();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
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
		enterRule(_localctx, 12, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			type();
			setState(74);
			match(Identifier);
			setState(75);
			match(LeftParenthesis);
			setState(76);
			param_list();
			setState(77);
			match(RightParenthesis);
			setState(78);
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
		enterRule(_localctx, 14, RULE_param_list);
		int _la;
		try {
			setState(92);
			switch (_input.LA(1)) {
			case Char:
			case Int:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				data_type();
				setState(81);
				match(Identifier);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(82);
					match(Colon);
					setState(83);
					data_type();
					setState(84);
					match(Identifier);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
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
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				variable_definition_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				conditional_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				while_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				function_call_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
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
		enterRule(_localctx, 18, RULE_variable_definition_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			data_type();
			setState(103);
			match(Identifier);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(104);
				match(Colon);
				setState(105);
				match(Identifier);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
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
		enterRule(_localctx, 20, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(Identifier);
			setState(114);
			match(AssignSign);
			setState(115);
			expression();
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
		enterRule(_localctx, 22, RULE_conditional_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(If);
			setState(118);
			condition_expression();
			setState(119);
			block_statements();
			setState(120);
			match(Else);
			setState(121);
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
		enterRule(_localctx, 24, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(While);
			setState(124);
			condition_expression();
			setState(125);
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
		public Function_identifierContext function_identifier() {
			return getRuleContext(Function_identifierContext.class,0);
		}
		public TerminalNode LeftParenthesis() { return getToken(VYPeParserParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(VYPeParserParser.RightParenthesis, 0); }
		public TerminalNode Semicolon() { return getToken(VYPeParserParser.Semicolon, 0); }
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
		enterRule(_localctx, 26, RULE_function_call_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			function_identifier();
			setState(128);
			match(LeftParenthesis);
			setState(137);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << LeftParenthesis) | (1L << ExclamationMark))) != 0)) {
				{
				setState(129);
				expression();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(130);
					match(Colon);
					setState(131);
					expression();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(139);
			match(RightParenthesis);
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
		enterRule(_localctx, 28, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(Return);
			setState(144);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << LeftParenthesis) | (1L << ExclamationMark))) != 0)) {
				{
				setState(143);
				expression();
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
		enterRule(_localctx, 30, RULE_block_statements);
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
		enterRule(_localctx, 32, RULE_condition_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(LeftParenthesis);
			setState(158);
			expression();
			setState(159);
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
		public TerminalNode Identifier() { return getToken(VYPeParserParser.Identifier, 0); }
		public TerminalNode ExclamationMark() { return getToken(VYPeParserParser.ExclamationMark, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LeftParenthesis() { return getToken(VYPeParserParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(VYPeParserParser.RightParenthesis, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Binary_operandContext binary_operand() {
			return getRuleContext(Binary_operandContext.class,0);
		}
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(ExclamationMark);
				setState(163);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(LeftParenthesis);
				setState(165);
				expression();
				setState(166);
				match(RightParenthesis);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(LeftParenthesis);
				setState(169);
				data_type();
				setState(170);
				match(RightParenthesis);
				setState(171);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(Identifier);
				setState(174);
				binary_operand();
				setState(175);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				match(ExclamationMark);
				setState(178);
				expression();
				setState(179);
				binary_operand();
				setState(180);
				expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				match(LeftParenthesis);
				setState(183);
				expression();
				setState(184);
				match(RightParenthesis);
				setState(185);
				binary_operand();
				setState(186);
				expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(188);
				match(LeftParenthesis);
				setState(189);
				data_type();
				setState(190);
				match(RightParenthesis);
				setState(191);
				binary_operand();
				setState(192);
				expression();
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

	public static class Binary_operandContext extends ParserRuleContext {
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
		public Binary_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).enterBinary_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VYPeParserListener ) ((VYPeParserListener)listener).exitBinary_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPeParserVisitor ) return ((VYPeParserVisitor<? extends T>)visitor).visitBinary_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operandContext binary_operand() throws RecognitionException {
		Binary_operandContext _localctx = new Binary_operandContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_binary_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiplicationSign) | (1L << DivisionSign) | (1L << ModuloSign) | (1L << PlusSign) | (1L << MinusSign) | (1L << LowerSign) | (1L << GreaterSign) | (1L << LowerEqualSign) | (1L << GreaterEqualSign) | (1L << EqualSign) | (1L << NotEqualSign) | (1L << LogicalAndSign) | (1L << LogicalOrSign))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\5\3-\n\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\58\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7D\n\7"+
		"\f\7\16\7G\13\7\3\7\5\7J\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\tY\n\t\f\t\16\t\\\13\t\3\t\5\t_\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\ng\n\n\3\13\3\13\3\13\3\13\7\13m\n\13\f\13\16\13p\13\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u0087\n\17\f\17\16\17\u008a\13\17\5\17\u008c\n\17"+
		"\3\17\3\17\3\17\3\20\3\20\5\20\u0093\n\20\3\20\3\20\3\21\3\21\7\21\u0099"+
		"\n\21\f\21\16\21\u009c\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u00c5\n\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&\2\4\5\2\3\3\6\6\b\b\3\2\26\"\u00cd\2(\3\2\2"+
		"\2\4,\3\2\2\2\6.\3\2\2\2\b\67\3\2\2\2\n9\3\2\2\2\fI\3\2\2\2\16K\3\2\2"+
		"\2\20^\3\2\2\2\22f\3\2\2\2\24h\3\2\2\2\26s\3\2\2\2\30w\3\2\2\2\32}\3\2"+
		"\2\2\34\u0081\3\2\2\2\36\u0090\3\2\2\2 \u0096\3\2\2\2\"\u009f\3\2\2\2"+
		"$\u00c4\3\2\2\2&\u00c6\3\2\2\2()\t\2\2\2)\3\3\2\2\2*-\5\2\2\2+-\7\t\2"+
		"\2,*\3\2\2\2,+\3\2\2\2-\5\3\2\2\2./\7\20\2\2/\7\3\2\2\2\60\61\5\n\6\2"+
		"\61\62\5\b\5\2\628\3\2\2\2\63\64\5\16\b\2\64\65\5\b\5\2\658\3\2\2\2\66"+
		"8\7\2\2\3\67\60\3\2\2\2\67\63\3\2\2\2\67\66\3\2\2\28\t\3\2\2\29:\5\4\3"+
		"\2:;\7\20\2\2;<\7\21\2\2<=\5\f\7\2=>\7\22\2\2>?\7(\2\2?\13\3\2\2\2@E\5"+
		"\2\2\2AB\7\'\2\2BD\5\2\2\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FJ\3"+
		"\2\2\2GE\3\2\2\2HJ\7\t\2\2I@\3\2\2\2IH\3\2\2\2J\r\3\2\2\2KL\5\4\3\2LM"+
		"\7\20\2\2MN\7\21\2\2NO\5\20\t\2OP\7\22\2\2PQ\5 \21\2Q\17\3\2\2\2RS\5\2"+
		"\2\2SZ\7\20\2\2TU\7\'\2\2UV\5\2\2\2VW\7\20\2\2WY\3\2\2\2XT\3\2\2\2Y\\"+
		"\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[_\3\2\2\2\\Z\3\2\2\2]_\7\t\2\2^R\3\2\2\2"+
		"^]\3\2\2\2_\21\3\2\2\2`g\5\24\13\2ag\5\26\f\2bg\5\30\r\2cg\5\32\16\2d"+
		"g\5\34\17\2eg\5\36\20\2f`\3\2\2\2fa\3\2\2\2fb\3\2\2\2fc\3\2\2\2fd\3\2"+
		"\2\2fe\3\2\2\2g\23\3\2\2\2hi\5\2\2\2in\7\20\2\2jk\7\'\2\2km\7\20\2\2l"+
		"j\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7(\2\2r"+
		"\25\3\2\2\2st\7\20\2\2tu\7&\2\2uv\5$\23\2v\27\3\2\2\2wx\7\5\2\2xy\5\""+
		"\22\2yz\5 \21\2z{\7\4\2\2{|\5 \21\2|\31\3\2\2\2}~\7\n\2\2~\177\5\"\22"+
		"\2\177\u0080\5 \21\2\u0080\33\3\2\2\2\u0081\u0082\5\6\4\2\u0082\u008b"+
		"\7\21\2\2\u0083\u0088\5$\23\2\u0084\u0085\7\'\2\2\u0085\u0087\5$\23\2"+
		"\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0083\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\22\2\2\u008e\u008f\7"+
		"(\2\2\u008f\35\3\2\2\2\u0090\u0092\7\7\2\2\u0091\u0093\5$\23\2\u0092\u0091"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7(\2\2\u0095"+
		"\37\3\2\2\2\u0096\u009a\7\23\2\2\u0097\u0099\5\22\n\2\u0098\u0097\3\2"+
		"\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\24\2\2\u009e!\3\2\2\2"+
		"\u009f\u00a0\7\21\2\2\u00a0\u00a1\5$\23\2\u00a1\u00a2\7\22\2\2\u00a2#"+
		"\3\2\2\2\u00a3\u00c5\7\20\2\2\u00a4\u00a5\7\25\2\2\u00a5\u00c5\5$\23\2"+
		"\u00a6\u00a7\7\21\2\2\u00a7\u00a8\5$\23\2\u00a8\u00a9\7\22\2\2\u00a9\u00c5"+
		"\3\2\2\2\u00aa\u00ab\7\21\2\2\u00ab\u00ac\5\2\2\2\u00ac\u00ad\7\22\2\2"+
		"\u00ad\u00ae\5$\23\2\u00ae\u00c5\3\2\2\2\u00af\u00b0\7\20\2\2\u00b0\u00b1"+
		"\5&\24\2\u00b1\u00b2\5$\23\2\u00b2\u00c5\3\2\2\2\u00b3\u00b4\7\25\2\2"+
		"\u00b4\u00b5\5$\23\2\u00b5\u00b6\5&\24\2\u00b6\u00b7\5$\23\2\u00b7\u00c5"+
		"\3\2\2\2\u00b8\u00b9\7\21\2\2\u00b9\u00ba\5$\23\2\u00ba\u00bb\7\22\2\2"+
		"\u00bb\u00bc\5&\24\2\u00bc\u00bd\5$\23\2\u00bd\u00c5\3\2\2\2\u00be\u00bf"+
		"\7\21\2\2\u00bf\u00c0\5\2\2\2\u00c0\u00c1\7\22\2\2\u00c1\u00c2\5&\24\2"+
		"\u00c2\u00c3\5$\23\2\u00c3\u00c5\3\2\2\2\u00c4\u00a3\3\2\2\2\u00c4\u00a4"+
		"\3\2\2\2\u00c4\u00a6\3\2\2\2\u00c4\u00aa\3\2\2\2\u00c4\u00af\3\2\2\2\u00c4"+
		"\u00b3\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00be\3\2\2\2\u00c5%\3\2\2\2"+
		"\u00c6\u00c7\t\3\2\2\u00c7\'\3\2\2\2\17,\67EIZ^fn\u0088\u008b\u0092\u009a"+
		"\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}