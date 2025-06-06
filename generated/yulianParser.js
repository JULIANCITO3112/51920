// Generated from yulian.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import yulianListener from './yulianListener.js';
import yulianVisitor from './yulianVisitor.js';

const serializedATN = [4,1,21,125,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,
2,13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,1,0,1,0,1,0,4,0,38,8,0,11,0,12,0,
39,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,3,2,52,8,2,1,2,1,2,1,2,1,2,1,
2,1,3,1,3,1,3,5,3,62,8,3,10,3,12,3,65,9,3,1,4,1,4,1,4,1,4,4,4,71,8,4,11,
4,12,4,72,1,5,1,5,1,5,1,5,3,5,79,8,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,7,
1,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,10,1,
10,1,11,1,11,1,11,3,11,111,8,11,1,12,1,12,1,13,1,13,3,13,117,8,13,1,14,1,
14,1,15,1,15,1,16,1,16,1,16,0,0,17,0,2,4,6,8,10,12,14,16,18,20,22,24,26,
28,30,32,0,1,1,0,10,14,122,0,37,1,0,0,0,2,41,1,0,0,0,4,47,1,0,0,0,6,58,1,
0,0,0,8,70,1,0,0,0,10,78,1,0,0,0,12,80,1,0,0,0,14,88,1,0,0,0,16,90,1,0,0,
0,18,97,1,0,0,0,20,103,1,0,0,0,22,110,1,0,0,0,24,112,1,0,0,0,26,116,1,0,
0,0,28,118,1,0,0,0,30,120,1,0,0,0,32,122,1,0,0,0,34,38,3,2,1,0,35,38,3,4,
2,0,36,38,3,10,5,0,37,34,1,0,0,0,37,35,1,0,0,0,37,36,1,0,0,0,38,39,1,0,0,
0,39,37,1,0,0,0,39,40,1,0,0,0,40,1,1,0,0,0,41,42,5,1,0,0,42,43,3,32,16,0,
43,44,5,2,0,0,44,45,3,22,11,0,45,46,5,3,0,0,46,3,1,0,0,0,47,48,5,4,0,0,48,
49,3,32,16,0,49,51,5,5,0,0,50,52,3,6,3,0,51,50,1,0,0,0,51,52,1,0,0,0,52,
53,1,0,0,0,53,54,5,6,0,0,54,55,5,7,0,0,55,56,3,8,4,0,56,57,5,8,0,0,57,5,
1,0,0,0,58,63,3,32,16,0,59,60,5,9,0,0,60,62,3,32,16,0,61,59,1,0,0,0,62,65,
1,0,0,0,63,61,1,0,0,0,63,64,1,0,0,0,64,7,1,0,0,0,65,63,1,0,0,0,66,71,3,12,
6,0,67,71,3,18,9,0,68,71,3,20,10,0,69,71,3,16,8,0,70,66,1,0,0,0,70,67,1,
0,0,0,70,68,1,0,0,0,70,69,1,0,0,0,71,72,1,0,0,0,72,70,1,0,0,0,72,73,1,0,
0,0,73,9,1,0,0,0,74,79,3,12,6,0,75,79,3,18,9,0,76,79,3,20,10,0,77,79,3,16,
8,0,78,74,1,0,0,0,78,75,1,0,0,0,78,76,1,0,0,0,78,77,1,0,0,0,79,11,1,0,0,
0,80,81,3,30,15,0,81,82,5,2,0,0,82,83,3,14,7,0,83,84,5,5,0,0,84,85,3,26,
13,0,85,86,5,6,0,0,86,87,5,3,0,0,87,13,1,0,0,0,88,89,7,0,0,0,89,15,1,0,0,
0,90,91,3,30,15,0,91,92,5,2,0,0,92,93,3,26,13,0,93,94,5,15,0,0,94,95,3,26,
13,0,95,96,5,3,0,0,96,17,1,0,0,0,97,98,5,16,0,0,98,99,5,5,0,0,99,100,3,22,
11,0,100,101,5,6,0,0,101,102,5,3,0,0,102,19,1,0,0,0,103,104,5,17,0,0,104,
105,3,22,11,0,105,106,5,3,0,0,106,21,1,0,0,0,107,111,3,28,14,0,108,111,3,
24,12,0,109,111,3,30,15,0,110,107,1,0,0,0,110,108,1,0,0,0,110,109,1,0,0,
0,111,23,1,0,0,0,112,113,5,19,0,0,113,25,1,0,0,0,114,117,3,28,14,0,115,117,
3,30,15,0,116,114,1,0,0,0,116,115,1,0,0,0,117,27,1,0,0,0,118,119,5,18,0,
0,119,29,1,0,0,0,120,121,3,32,16,0,121,31,1,0,0,0,122,123,5,20,0,0,123,33,
1,0,0,0,9,37,39,51,63,70,72,78,110,116];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class yulianParser extends antlr4.Parser {

    static grammarFileName = "yulian.g4";
    static literalNames = [ null, "'variable'", "'='", "';'", "'funcion'", 
                            "'('", "')'", "'{'", "'}'", "','", "'mayusculas'", 
                            "'minusculas'", "'longitud'", "'invertir'", 
                            "'reemplazar'", "'+'", "'imprimir'", "'devolver'" ];
    static symbolicNames = [ null, null, null, null, null, null, null, null, 
                             null, null, null, null, null, null, null, null, 
                             null, null, "CADENA", "NUM", "NOMBRE", "WS" ];
    static ruleNames = [ "programa", "declaracion", "funcion", "argumentos", 
                         "instrucciones", "ejecucion", "operacion_texto", 
                         "transformacion", "concatenar", "impresion", "retorno", 
                         "valor", "numero", "cadena", "texto", "variable", 
                         "nombre" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = yulianParser.ruleNames;
        this.literalNames = yulianParser.literalNames;
        this.symbolicNames = yulianParser.symbolicNames;
    }



	programa() {
	    let localctx = new ProgramaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, yulianParser.RULE_programa);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 37; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 37;
	            this._errHandler.sync(this);
	            switch(this._input.LA(1)) {
	            case 1:
	                this.state = 34;
	                this.declaracion();
	                break;
	            case 4:
	                this.state = 35;
	                this.funcion();
	                break;
	            case 16:
	            case 17:
	            case 20:
	                this.state = 36;
	                this.ejecucion();
	                break;
	            default:
	                throw new antlr4.error.NoViableAltException(this);
	            }
	            this.state = 39; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) === 0 && ((1 << _la) & 1245202) !== 0));
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	declaracion() {
	    let localctx = new DeclaracionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, yulianParser.RULE_declaracion);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 41;
	        this.match(yulianParser.T__0);
	        this.state = 42;
	        this.nombre();
	        this.state = 43;
	        this.match(yulianParser.T__1);
	        this.state = 44;
	        this.valor();
	        this.state = 45;
	        this.match(yulianParser.T__2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	funcion() {
	    let localctx = new FuncionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, yulianParser.RULE_funcion);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 47;
	        this.match(yulianParser.T__3);
	        this.state = 48;
	        this.nombre();
	        this.state = 49;
	        this.match(yulianParser.T__4);
	        this.state = 51;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===20) {
	            this.state = 50;
	            this.argumentos();
	        }

	        this.state = 53;
	        this.match(yulianParser.T__5);
	        this.state = 54;
	        this.match(yulianParser.T__6);
	        this.state = 55;
	        this.instrucciones();
	        this.state = 56;
	        this.match(yulianParser.T__7);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	argumentos() {
	    let localctx = new ArgumentosContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, yulianParser.RULE_argumentos);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 58;
	        this.nombre();
	        this.state = 63;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===9) {
	            this.state = 59;
	            this.match(yulianParser.T__8);
	            this.state = 60;
	            this.nombre();
	            this.state = 65;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	instrucciones() {
	    let localctx = new InstruccionesContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, yulianParser.RULE_instrucciones);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 70; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 70;
	            this._errHandler.sync(this);
	            var la_ = this._interp.adaptivePredict(this._input,4,this._ctx);
	            switch(la_) {
	            case 1:
	                this.state = 66;
	                this.operacion_texto();
	                break;

	            case 2:
	                this.state = 67;
	                this.impresion();
	                break;

	            case 3:
	                this.state = 68;
	                this.retorno();
	                break;

	            case 4:
	                this.state = 69;
	                this.concatenar();
	                break;

	            }
	            this.state = 72; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) === 0 && ((1 << _la) & 1245184) !== 0));
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ejecucion() {
	    let localctx = new EjecucionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, yulianParser.RULE_ejecucion);
	    try {
	        this.state = 78;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,6,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 74;
	            this.operacion_texto();
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 75;
	            this.impresion();
	            break;

	        case 3:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 76;
	            this.retorno();
	            break;

	        case 4:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 77;
	            this.concatenar();
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	operacion_texto() {
	    let localctx = new Operacion_textoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, yulianParser.RULE_operacion_texto);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 80;
	        this.variable();
	        this.state = 81;
	        this.match(yulianParser.T__1);
	        this.state = 82;
	        this.transformacion();
	        this.state = 83;
	        this.match(yulianParser.T__4);
	        this.state = 84;
	        this.cadena();
	        this.state = 85;
	        this.match(yulianParser.T__5);
	        this.state = 86;
	        this.match(yulianParser.T__2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	transformacion() {
	    let localctx = new TransformacionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, yulianParser.RULE_transformacion);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 88;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 31744) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	concatenar() {
	    let localctx = new ConcatenarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, yulianParser.RULE_concatenar);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 90;
	        this.variable();
	        this.state = 91;
	        this.match(yulianParser.T__1);
	        this.state = 92;
	        this.cadena();
	        this.state = 93;
	        this.match(yulianParser.T__14);
	        this.state = 94;
	        this.cadena();
	        this.state = 95;
	        this.match(yulianParser.T__2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	impresion() {
	    let localctx = new ImpresionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, yulianParser.RULE_impresion);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 97;
	        this.match(yulianParser.T__15);
	        this.state = 98;
	        this.match(yulianParser.T__4);
	        this.state = 99;
	        this.valor();
	        this.state = 100;
	        this.match(yulianParser.T__5);
	        this.state = 101;
	        this.match(yulianParser.T__2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	retorno() {
	    let localctx = new RetornoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, yulianParser.RULE_retorno);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 103;
	        this.match(yulianParser.T__16);
	        this.state = 104;
	        this.valor();
	        this.state = 105;
	        this.match(yulianParser.T__2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	valor() {
	    let localctx = new ValorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 22, yulianParser.RULE_valor);
	    try {
	        this.state = 110;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 18:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 107;
	            this.texto();
	            break;
	        case 19:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 108;
	            this.numero();
	            break;
	        case 20:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 109;
	            this.variable();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	numero() {
	    let localctx = new NumeroContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 24, yulianParser.RULE_numero);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 112;
	        this.match(yulianParser.NUM);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	cadena() {
	    let localctx = new CadenaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 26, yulianParser.RULE_cadena);
	    try {
	        this.state = 116;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 18:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 114;
	            this.texto();
	            break;
	        case 20:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 115;
	            this.variable();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	texto() {
	    let localctx = new TextoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 28, yulianParser.RULE_texto);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 118;
	        this.match(yulianParser.CADENA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	variable() {
	    let localctx = new VariableContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 30, yulianParser.RULE_variable);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 120;
	        this.nombre();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	nombre() {
	    let localctx = new NombreContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 32, yulianParser.RULE_nombre);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 122;
	        this.match(yulianParser.NOMBRE);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

yulianParser.EOF = antlr4.Token.EOF;
yulianParser.T__0 = 1;
yulianParser.T__1 = 2;
yulianParser.T__2 = 3;
yulianParser.T__3 = 4;
yulianParser.T__4 = 5;
yulianParser.T__5 = 6;
yulianParser.T__6 = 7;
yulianParser.T__7 = 8;
yulianParser.T__8 = 9;
yulianParser.T__9 = 10;
yulianParser.T__10 = 11;
yulianParser.T__11 = 12;
yulianParser.T__12 = 13;
yulianParser.T__13 = 14;
yulianParser.T__14 = 15;
yulianParser.T__15 = 16;
yulianParser.T__16 = 17;
yulianParser.CADENA = 18;
yulianParser.NUM = 19;
yulianParser.NOMBRE = 20;
yulianParser.WS = 21;

yulianParser.RULE_programa = 0;
yulianParser.RULE_declaracion = 1;
yulianParser.RULE_funcion = 2;
yulianParser.RULE_argumentos = 3;
yulianParser.RULE_instrucciones = 4;
yulianParser.RULE_ejecucion = 5;
yulianParser.RULE_operacion_texto = 6;
yulianParser.RULE_transformacion = 7;
yulianParser.RULE_concatenar = 8;
yulianParser.RULE_impresion = 9;
yulianParser.RULE_retorno = 10;
yulianParser.RULE_valor = 11;
yulianParser.RULE_numero = 12;
yulianParser.RULE_cadena = 13;
yulianParser.RULE_texto = 14;
yulianParser.RULE_variable = 15;
yulianParser.RULE_nombre = 16;

class ProgramaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_programa;
    }

	declaracion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(DeclaracionContext);
	    } else {
	        return this.getTypedRuleContext(DeclaracionContext,i);
	    }
	};

	funcion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(FuncionContext);
	    } else {
	        return this.getTypedRuleContext(FuncionContext,i);
	    }
	};

	ejecucion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(EjecucionContext);
	    } else {
	        return this.getTypedRuleContext(EjecucionContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterPrograma(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitPrograma(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitPrograma(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DeclaracionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_declaracion;
    }

	nombre() {
	    return this.getTypedRuleContext(NombreContext,0);
	};

	valor() {
	    return this.getTypedRuleContext(ValorContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterDeclaracion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitDeclaracion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitDeclaracion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class FuncionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_funcion;
    }

	nombre() {
	    return this.getTypedRuleContext(NombreContext,0);
	};

	instrucciones() {
	    return this.getTypedRuleContext(InstruccionesContext,0);
	};

	argumentos() {
	    return this.getTypedRuleContext(ArgumentosContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterFuncion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitFuncion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitFuncion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ArgumentosContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_argumentos;
    }

	nombre = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(NombreContext);
	    } else {
	        return this.getTypedRuleContext(NombreContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterArgumentos(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitArgumentos(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitArgumentos(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InstruccionesContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_instrucciones;
    }

	operacion_texto = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(Operacion_textoContext);
	    } else {
	        return this.getTypedRuleContext(Operacion_textoContext,i);
	    }
	};

	impresion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ImpresionContext);
	    } else {
	        return this.getTypedRuleContext(ImpresionContext,i);
	    }
	};

	retorno = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(RetornoContext);
	    } else {
	        return this.getTypedRuleContext(RetornoContext,i);
	    }
	};

	concatenar = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ConcatenarContext);
	    } else {
	        return this.getTypedRuleContext(ConcatenarContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterInstrucciones(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitInstrucciones(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitInstrucciones(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class EjecucionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_ejecucion;
    }

	operacion_texto() {
	    return this.getTypedRuleContext(Operacion_textoContext,0);
	};

	impresion() {
	    return this.getTypedRuleContext(ImpresionContext,0);
	};

	retorno() {
	    return this.getTypedRuleContext(RetornoContext,0);
	};

	concatenar() {
	    return this.getTypedRuleContext(ConcatenarContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterEjecucion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitEjecucion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitEjecucion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Operacion_textoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_operacion_texto;
    }

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	transformacion() {
	    return this.getTypedRuleContext(TransformacionContext,0);
	};

	cadena() {
	    return this.getTypedRuleContext(CadenaContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterOperacion_texto(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitOperacion_texto(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitOperacion_texto(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TransformacionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_transformacion;
    }


	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterTransformacion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitTransformacion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitTransformacion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ConcatenarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_concatenar;
    }

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	cadena = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CadenaContext);
	    } else {
	        return this.getTypedRuleContext(CadenaContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterConcatenar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitConcatenar(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitConcatenar(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ImpresionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_impresion;
    }

	valor() {
	    return this.getTypedRuleContext(ValorContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterImpresion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitImpresion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitImpresion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class RetornoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_retorno;
    }

	valor() {
	    return this.getTypedRuleContext(ValorContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterRetorno(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitRetorno(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitRetorno(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ValorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_valor;
    }

	texto() {
	    return this.getTypedRuleContext(TextoContext,0);
	};

	numero() {
	    return this.getTypedRuleContext(NumeroContext,0);
	};

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterValor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitValor(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitValor(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class NumeroContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_numero;
    }

	NUM() {
	    return this.getToken(yulianParser.NUM, 0);
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterNumero(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitNumero(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitNumero(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CadenaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_cadena;
    }

	texto() {
	    return this.getTypedRuleContext(TextoContext,0);
	};

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterCadena(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitCadena(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitCadena(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TextoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_texto;
    }

	CADENA() {
	    return this.getToken(yulianParser.CADENA, 0);
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterTexto(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitTexto(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitTexto(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class VariableContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_variable;
    }

	nombre() {
	    return this.getTypedRuleContext(NombreContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterVariable(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitVariable(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitVariable(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class NombreContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = yulianParser.RULE_nombre;
    }

	NOMBRE() {
	    return this.getToken(yulianParser.NOMBRE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.enterNombre(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof yulianListener ) {
	        listener.exitNombre(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof yulianVisitor ) {
	        return visitor.visitNombre(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




yulianParser.ProgramaContext = ProgramaContext; 
yulianParser.DeclaracionContext = DeclaracionContext; 
yulianParser.FuncionContext = FuncionContext; 
yulianParser.ArgumentosContext = ArgumentosContext; 
yulianParser.InstruccionesContext = InstruccionesContext; 
yulianParser.EjecucionContext = EjecucionContext; 
yulianParser.Operacion_textoContext = Operacion_textoContext; 
yulianParser.TransformacionContext = TransformacionContext; 
yulianParser.ConcatenarContext = ConcatenarContext; 
yulianParser.ImpresionContext = ImpresionContext; 
yulianParser.RetornoContext = RetornoContext; 
yulianParser.ValorContext = ValorContext; 
yulianParser.NumeroContext = NumeroContext; 
yulianParser.CadenaContext = CadenaContext; 
yulianParser.TextoContext = TextoContext; 
yulianParser.VariableContext = VariableContext; 
yulianParser.NombreContext = NombreContext; 
