// Generated from c:/Users/Julian/Desktop/Parcial2/yulian.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class yulianParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		CADENA=18, NUM=19, NOMBRE=20, WS=21;
	public static final int
		RULE_programa = 0, RULE_declaracion = 1, RULE_funcion = 2, RULE_argumentos = 3, 
		RULE_instrucciones = 4, RULE_ejecucion = 5, RULE_operacion_texto = 6, 
		RULE_transformacion = 7, RULE_concatenar = 8, RULE_impresion = 9, RULE_retorno = 10, 
		RULE_valor = 11, RULE_numero = 12, RULE_cadena = 13, RULE_texto = 14, 
		RULE_variable = 15, RULE_nombre = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracion", "funcion", "argumentos", "instrucciones", 
			"ejecucion", "operacion_texto", "transformacion", "concatenar", "impresion", 
			"retorno", "valor", "numero", "cadena", "texto", "variable", "nombre"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'variable'", "'='", "';'", "'funcion'", "'('", "')'", "'{'", "'}'", 
			"','", "'mayusculas'", "'minusculas'", "'longitud'", "'invertir'", "'reemplazar'", 
			"'+'", "'imprimir'", "'devolver'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "CADENA", "NUM", "NOMBRE", "WS"
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
	public String getGrammarFileName() { return "yulian.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public yulianParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public List<EjecucionContext> ejecucion() {
			return getRuleContexts(EjecucionContext.class);
		}
		public EjecucionContext ejecucion(int i) {
			return getRuleContext(EjecucionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(34);
					declaracion();
					}
					break;
				case T__3:
					{
					setState(35);
					funcion();
					}
					break;
				case T__15:
				case T__16:
				case NOMBRE:
					{
					setState(36);
					ejecucion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1245202L) != 0) );
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
	public static class DeclaracionContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			setState(42);
			nombre();
			setState(43);
			match(T__1);
			setState(44);
			valor();
			setState(45);
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
	public static class FuncionContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__3);
			setState(48);
			nombre();
			setState(49);
			match(T__4);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOMBRE) {
				{
				setState(50);
				argumentos();
				}
			}

			setState(53);
			match(T__5);
			setState(54);
			match(T__6);
			setState(55);
			instrucciones();
			setState(56);
			match(T__7);
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
	public static class ArgumentosContext extends ParserRuleContext {
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			nombre();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(59);
				match(T__8);
				setState(60);
				nombre();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class InstruccionesContext extends ParserRuleContext {
		public List<Operacion_textoContext> operacion_texto() {
			return getRuleContexts(Operacion_textoContext.class);
		}
		public Operacion_textoContext operacion_texto(int i) {
			return getRuleContext(Operacion_textoContext.class,i);
		}
		public List<ImpresionContext> impresion() {
			return getRuleContexts(ImpresionContext.class);
		}
		public ImpresionContext impresion(int i) {
			return getRuleContext(ImpresionContext.class,i);
		}
		public List<RetornoContext> retorno() {
			return getRuleContexts(RetornoContext.class);
		}
		public RetornoContext retorno(int i) {
			return getRuleContext(RetornoContext.class,i);
		}
		public List<ConcatenarContext> concatenar() {
			return getRuleContexts(ConcatenarContext.class);
		}
		public ConcatenarContext concatenar(int i) {
			return getRuleContext(ConcatenarContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(66);
					operacion_texto();
					}
					break;
				case 2:
					{
					setState(67);
					impresion();
					}
					break;
				case 3:
					{
					setState(68);
					retorno();
					}
					break;
				case 4:
					{
					setState(69);
					concatenar();
					}
					break;
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1245184L) != 0) );
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
	public static class EjecucionContext extends ParserRuleContext {
		public Operacion_textoContext operacion_texto() {
			return getRuleContext(Operacion_textoContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ConcatenarContext concatenar() {
			return getRuleContext(ConcatenarContext.class,0);
		}
		public EjecucionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ejecucion; }
	}

	public final EjecucionContext ejecucion() throws RecognitionException {
		EjecucionContext _localctx = new EjecucionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ejecucion);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				operacion_texto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				impresion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				retorno();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				concatenar();
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
	public static class Operacion_textoContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TransformacionContext transformacion() {
			return getRuleContext(TransformacionContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Operacion_textoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion_texto; }
	}

	public final Operacion_textoContext operacion_texto() throws RecognitionException {
		Operacion_textoContext _localctx = new Operacion_textoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operacion_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			variable();
			setState(81);
			match(T__1);
			setState(82);
			transformacion();
			setState(83);
			match(T__4);
			setState(84);
			cadena();
			setState(85);
			match(T__5);
			setState(86);
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
	public static class TransformacionContext extends ParserRuleContext {
		public TransformacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformacion; }
	}

	public final TransformacionContext transformacion() throws RecognitionException {
		TransformacionContext _localctx = new TransformacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_transformacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) ) {
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
	public static class ConcatenarContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<CadenaContext> cadena() {
			return getRuleContexts(CadenaContext.class);
		}
		public CadenaContext cadena(int i) {
			return getRuleContext(CadenaContext.class,i);
		}
		public ConcatenarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenar; }
	}

	public final ConcatenarContext concatenar() throws RecognitionException {
		ConcatenarContext _localctx = new ConcatenarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_concatenar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			variable();
			setState(91);
			match(T__1);
			setState(92);
			cadena();
			setState(93);
			match(T__14);
			setState(94);
			cadena();
			setState(95);
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
	public static class ImpresionContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__15);
			setState(98);
			match(T__4);
			setState(99);
			valor();
			setState(100);
			match(T__5);
			setState(101);
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
	public static class RetornoContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__16);
			setState(104);
			valor();
			setState(105);
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
	public static class ValorContext extends ParserRuleContext {
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valor);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				texto();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				numero();
				}
				break;
			case NOMBRE:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				variable();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(yulianParser.NUM, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(NUM);
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
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cadena);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				texto();
				}
				break;
			case NOMBRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				variable();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextoContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(yulianParser.CADENA, 0); }
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(CADENA);
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
	public static class VariableContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			nombre();
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
	public static class NombreContext extends ParserRuleContext {
		public TerminalNode NOMBRE() { return getToken(yulianParser.NOMBRE, 0); }
		public NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre; }
	}

	public final NombreContext nombre() throws RecognitionException {
		NombreContext _localctx = new NombreContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(NOMBRE);
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
		"\u0004\u0001\u0015}\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000"+
		"&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00024\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003>\b"+
		"\u0003\n\u0003\f\u0003A\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0004\u0004G\b\u0004\u000b\u0004\f\u0004H\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005O\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bo\b"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0003\ru\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000"+
		"\u0000\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \u0000\u0001\u0001\u0000\n\u000ez\u0000%\u0001"+
		"\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000"+
		"\u0000\u0006:\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\nN\u0001"+
		"\u0000\u0000\u0000\fP\u0001\u0000\u0000\u0000\u000eX\u0001\u0000\u0000"+
		"\u0000\u0010Z\u0001\u0000\u0000\u0000\u0012a\u0001\u0000\u0000\u0000\u0014"+
		"g\u0001\u0000\u0000\u0000\u0016n\u0001\u0000\u0000\u0000\u0018p\u0001"+
		"\u0000\u0000\u0000\u001at\u0001\u0000\u0000\u0000\u001cv\u0001\u0000\u0000"+
		"\u0000\u001ex\u0001\u0000\u0000\u0000 z\u0001\u0000\u0000\u0000\"&\u0003"+
		"\u0002\u0001\u0000#&\u0003\u0004\u0002\u0000$&\u0003\n\u0005\u0000%\""+
		"\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(\u0001\u0001\u0000\u0000\u0000)*\u0005\u0001\u0000"+
		"\u0000*+\u0003 \u0010\u0000+,\u0005\u0002\u0000\u0000,-\u0003\u0016\u000b"+
		"\u0000-.\u0005\u0003\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/0\u0005"+
		"\u0004\u0000\u000001\u0003 \u0010\u000013\u0005\u0005\u0000\u000024\u0003"+
		"\u0006\u0003\u000032\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000056\u0005\u0006\u0000\u000067\u0005\u0007\u0000"+
		"\u000078\u0003\b\u0004\u000089\u0005\b\u0000\u00009\u0005\u0001\u0000"+
		"\u0000\u0000:?\u0003 \u0010\u0000;<\u0005\t\u0000\u0000<>\u0003 \u0010"+
		"\u0000=;\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0007\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000BG\u0003\f\u0006\u0000CG\u0003\u0012\t\u0000"+
		"DG\u0003\u0014\n\u0000EG\u0003\u0010\b\u0000FB\u0001\u0000\u0000\u0000"+
		"FC\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000I\t\u0001\u0000\u0000\u0000JO\u0003\f\u0006\u0000KO\u0003"+
		"\u0012\t\u0000LO\u0003\u0014\n\u0000MO\u0003\u0010\b\u0000NJ\u0001\u0000"+
		"\u0000\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NM\u0001"+
		"\u0000\u0000\u0000O\u000b\u0001\u0000\u0000\u0000PQ\u0003\u001e\u000f"+
		"\u0000QR\u0005\u0002\u0000\u0000RS\u0003\u000e\u0007\u0000ST\u0005\u0005"+
		"\u0000\u0000TU\u0003\u001a\r\u0000UV\u0005\u0006\u0000\u0000VW\u0005\u0003"+
		"\u0000\u0000W\r\u0001\u0000\u0000\u0000XY\u0007\u0000\u0000\u0000Y\u000f"+
		"\u0001\u0000\u0000\u0000Z[\u0003\u001e\u000f\u0000[\\\u0005\u0002\u0000"+
		"\u0000\\]\u0003\u001a\r\u0000]^\u0005\u000f\u0000\u0000^_\u0003\u001a"+
		"\r\u0000_`\u0005\u0003\u0000\u0000`\u0011\u0001\u0000\u0000\u0000ab\u0005"+
		"\u0010\u0000\u0000bc\u0005\u0005\u0000\u0000cd\u0003\u0016\u000b\u0000"+
		"de\u0005\u0006\u0000\u0000ef\u0005\u0003\u0000\u0000f\u0013\u0001\u0000"+
		"\u0000\u0000gh\u0005\u0011\u0000\u0000hi\u0003\u0016\u000b\u0000ij\u0005"+
		"\u0003\u0000\u0000j\u0015\u0001\u0000\u0000\u0000ko\u0003\u001c\u000e"+
		"\u0000lo\u0003\u0018\f\u0000mo\u0003\u001e\u000f\u0000nk\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0017\u0001"+
		"\u0000\u0000\u0000pq\u0005\u0013\u0000\u0000q\u0019\u0001\u0000\u0000"+
		"\u0000ru\u0003\u001c\u000e\u0000su\u0003\u001e\u000f\u0000tr\u0001\u0000"+
		"\u0000\u0000ts\u0001\u0000\u0000\u0000u\u001b\u0001\u0000\u0000\u0000"+
		"vw\u0005\u0012\u0000\u0000w\u001d\u0001\u0000\u0000\u0000xy\u0003 \u0010"+
		"\u0000y\u001f\u0001\u0000\u0000\u0000z{\u0005\u0014\u0000\u0000{!\u0001"+
		"\u0000\u0000\u0000\t%\'3?FHNnt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}