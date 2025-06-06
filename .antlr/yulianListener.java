// Generated from c:/Users/Julian/Desktop/Parcial2/yulian.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link yulianParser}.
 */
public interface yulianListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link yulianParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(yulianParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link yulianParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(yulianParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link yulianParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(yulianParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link yulianParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(yulianParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link yulianParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(yulianParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link yulianParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(yulianParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link yulianParser#decision}.
	 * @param ctx the parse tree
	 */
	void enterDecision(yulianParser.DecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link yulianParser#decision}.
	 * @param ctx the parse tree
	 */
	void exitDecision(yulianParser.DecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link yulianParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(yulianParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link yulianParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(yulianParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link yulianParser#salida}.
	 * @param ctx the parse tree
	 */
	void enterSalida(yulianParser.SalidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link yulianParser#salida}.
	 * @param ctx the parse tree
	 */
	void exitSalida(yulianParser.SalidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link yulianParser#terminar}.
	 * @param ctx the parse tree
	 */
	void enterTerminar(yulianParser.TerminarContext ctx);
	/**
	 * Exit a parse tree produced by {@link yulianParser#terminar}.
	 * @param ctx the parse tree
	 */
	void exitTerminar(yulianParser.TerminarContext ctx);
	/**
	 * Enter a parse tree produced by {@link yulianParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(yulianParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link yulianParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(yulianParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link yulianParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(yulianParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link yulianParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(yulianParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link yulianParser#caracteres}.
	 * @param ctx the parse tree
	 */
	void enterCaracteres(yulianParser.CaracteresContext ctx);
	/**
	 * Exit a parse tree produced by {@link yulianParser#caracteres}.
	 * @param ctx the parse tree
	 */
	void exitCaracteres(yulianParser.CaracteresContext ctx);
	/**
	 * Enter a parse tree produced by {@link yulianParser#caracter}.
	 * @param ctx the parse tree
	 */
	void enterCaracter(yulianParser.CaracterContext ctx);
	/**
	 * Exit a parse tree produced by {@link yulianParser#caracter}.
	 * @param ctx the parse tree
	 */
	void exitCaracter(yulianParser.CaracterContext ctx);
}