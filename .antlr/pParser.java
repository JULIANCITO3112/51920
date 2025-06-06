// Generated from c:/Users/renzo/Desktop/52004/Parcial2/p.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class pParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LETRA=4, DIGITO=5, SIMBOLO=6, LPAREN=7, RPAREN=8, 
		LLLAVE=9, RLLAVE=10, WS=11, SEMICOLON=12, PRINTF=13, IF=14, ELSE=15, RETURN=16, 
		NEWLINE=17;
	public static final int
		RULE_prog = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_decision = 3, 
		RULE_sentencia = 4, RULE_salida = 5, RULE_terminar = 6, RULE_condicion = 7, 
		RULE_cadena = 8, RULE_caracteres = 9, RULE_caracter = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "instrucciones", "instruccion", "decision", "sentencia", "salida", 
			"terminar", "condicion", "cadena", "caracteres", "caracter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'1'", "'\"'", null, null, null, "'('", "')'", "'{'", "'}'", 
			null, "';'", "'printf'", "'if'", "'else'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "LETRA", "DIGITO", "SIMBOLO", "LPAREN", "RPAREN", 
			"LLLAVE", "RLLAVE", "WS", "SEMICOLON", "PRINTF", "IF", "ELSE", "RETURN", 
			"NEWLINE"
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
	public String getGrammarFileName() { return "p.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			instrucciones(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		return instrucciones(0);
	}

	private InstruccionesContext instrucciones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, _parentState);
		InstruccionesContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_instrucciones, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(25);
			instruccion();
			}
			_ctx.stop = _input.LT(-1);
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstruccionesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instrucciones);
					setState(27);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(28);
					instruccion();
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public DecisionContext decision() {
			return getRuleContext(DecisionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			decision();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecisionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(pParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(pParser.LPAREN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pParser.RPAREN, 0); }
		public List<TerminalNode> LLLAVE() { return getTokens(pParser.LLLAVE); }
		public TerminalNode LLLAVE(int i) {
			return getToken(pParser.LLLAVE, i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> RLLAVE() { return getTokens(pParser.RLLAVE); }
		public TerminalNode RLLAVE(int i) {
			return getToken(pParser.RLLAVE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(pParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pParser.NEWLINE, i);
		}
		public TerminalNode ELSE() { return getToken(pParser.ELSE, 0); }
		public DecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decision; }
	}

	public final DecisionContext decision() throws RecognitionException {
		DecisionContext _localctx = new DecisionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(IF);
			setState(37);
			match(LPAREN);
			setState(38);
			condicion();
			setState(39);
			match(RPAREN);
			setState(40);
			match(LLLAVE);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(41);
				match(NEWLINE);
				}
			}

			setState(44);
			sentencia();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(45);
				match(NEWLINE);
				}
			}

			setState(48);
			match(RLLAVE);
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(49);
				match(ELSE);
				setState(50);
				match(LLLAVE);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(51);
					match(NEWLINE);
					}
				}

				setState(54);
				sentencia();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(55);
					match(NEWLINE);
					}
				}

				setState(58);
				match(RLLAVE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public SalidaContext salida() {
			return getRuleContext(SalidaContext.class,0);
		}
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminarContext terminar() {
			return getRuleContext(TerminarContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				salida();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				salida();
				setState(64);
				sentencia();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				terminar();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SalidaContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(pParser.PRINTF, 0); }
		public TerminalNode LPAREN() { return getToken(pParser.LPAREN, 0); }
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(pParser.SEMICOLON, 0); }
		public SalidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salida; }
	}

	public final SalidaContext salida() throws RecognitionException {
		SalidaContext _localctx = new SalidaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_salida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(PRINTF);
			setState(70);
			match(LPAREN);
			setState(71);
			cadena();
			setState(72);
			match(RPAREN);
			setState(73);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminarContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(pParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(pParser.SEMICOLON, 0); }
		public TerminarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminar; }
	}

	public final TerminarContext terminar() throws RecognitionException {
		TerminarContext _localctx = new TerminarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_terminar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(RETURN);
			setState(76);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CadenaContext extends ParserRuleContext {
		public CaracteresContext caracteres() {
			return getRuleContext(CaracteresContext.class,0);
		}
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__2);
			setState(81);
			caracteres(0);
			setState(82);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaracteresContext extends ParserRuleContext {
		public CaracterContext caracter() {
			return getRuleContext(CaracterContext.class,0);
		}
		public CaracteresContext caracteres() {
			return getRuleContext(CaracteresContext.class,0);
		}
		public CaracteresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracteres; }
	}

	public final CaracteresContext caracteres() throws RecognitionException {
		return caracteres(0);
	}

	private CaracteresContext caracteres(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CaracteresContext _localctx = new CaracteresContext(_ctx, _parentState);
		CaracteresContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_caracteres, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(85);
			caracter();
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CaracteresContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_caracteres);
					setState(87);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(88);
					caracter();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaracterContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(pParser.LETRA, 0); }
		public TerminalNode DIGITO() { return getToken(pParser.DIGITO, 0); }
		public TerminalNode SIMBOLO() { return getToken(pParser.SIMBOLO, 0); }
		public CaracterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracter; }
	}

	public final CaracterContext caracter() throws RecognitionException {
		CaracterContext _localctx = new CaracterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_caracter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return instrucciones_sempred((InstruccionesContext)_localctx, predIndex);
		case 9:
			return caracteres_sempred((CaracteresContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean instrucciones_sempred(InstruccionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean caracteres_sempred(CaracteresContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0011a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001e"+
		"\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"+\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003/\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u00035\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u00039\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"D\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\tZ\b\t\n\t\f\t]\t\t\u0001\n\u0001\n\u0001\n\u0000\u0002\u0002"+
		"\u0012\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000"+
		"\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0004\u0006^\u0000\u0016\u0001"+
		"\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000"+
		"\u0000\u0000\u0006$\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000"+
		"\nE\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000\u000eN\u0001\u0000"+
		"\u0000\u0000\u0010P\u0001\u0000\u0000\u0000\u0012T\u0001\u0000\u0000\u0000"+
		"\u0014^\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017"+
		"\u0001\u0001\u0000\u0000\u0000\u0018\u0019\u0006\u0001\uffff\uffff\u0000"+
		"\u0019\u001a\u0003\u0004\u0002\u0000\u001a\u001f\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\n\u0001\u0000\u0000\u001c\u001e\u0003\u0004\u0002\u0000\u001d"+
		"\u001b\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0003\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0003\u0006\u0003\u0000"+
		"#\u0005\u0001\u0000\u0000\u0000$%\u0005\u000e\u0000\u0000%&\u0005\u0007"+
		"\u0000\u0000&\'\u0003\u000e\u0007\u0000\'(\u0005\b\u0000\u0000(*\u0005"+
		"\t\u0000\u0000)+\u0005\u0011\u0000\u0000*)\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0003\b\u0004\u0000-/\u0005"+
		"\u0011\u0000\u0000.-\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u00000<\u0005\n\u0000\u000012\u0005\u000f\u0000\u0000"+
		"24\u0005\t\u0000\u000035\u0005\u0011\u0000\u000043\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0003\b\u0004\u0000"+
		"79\u0005\u0011\u0000\u000087\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:;\u0005\n\u0000\u0000;=\u0001\u0000\u0000"+
		"\u0000<1\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\u0007\u0001"+
		"\u0000\u0000\u0000>D\u0003\n\u0005\u0000?@\u0003\n\u0005\u0000@A\u0003"+
		"\b\u0004\u0000AD\u0001\u0000\u0000\u0000BD\u0003\f\u0006\u0000C>\u0001"+
		"\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"D\t\u0001\u0000\u0000\u0000EF\u0005\r\u0000\u0000FG\u0005\u0007\u0000"+
		"\u0000GH\u0003\u0010\b\u0000HI\u0005\b\u0000\u0000IJ\u0005\f\u0000\u0000"+
		"J\u000b\u0001\u0000\u0000\u0000KL\u0005\u0010\u0000\u0000LM\u0005\f\u0000"+
		"\u0000M\r\u0001\u0000\u0000\u0000NO\u0007\u0000\u0000\u0000O\u000f\u0001"+
		"\u0000\u0000\u0000PQ\u0005\u0003\u0000\u0000QR\u0003\u0012\t\u0000RS\u0005"+
		"\u0003\u0000\u0000S\u0011\u0001\u0000\u0000\u0000TU\u0006\t\uffff\uffff"+
		"\u0000UV\u0003\u0014\n\u0000V[\u0001\u0000\u0000\u0000WX\n\u0001\u0000"+
		"\u0000XZ\u0003\u0014\n\u0000YW\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0013\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0007\u0001\u0000\u0000"+
		"_\u0015\u0001\u0000\u0000\u0000\b\u001f*.48<C[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}