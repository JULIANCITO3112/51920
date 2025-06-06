import antlr4 from 'antlr4';
import YulianLexer from './generated/YulianLexer.js';
import YulianParser from './generated/YulianParser.js';
import CustomListener from './CustomListener.js';
import CustomVisitor from './CustomVisitor.js';
import fs from 'fs';
import readline from 'readline';

// Colores para consola
const colors = {
    error: '\x1b[31m', warning: '\x1b[33m',
    info: '\x1b[36m', success: '\x1b[32m', reset: '\x1b[0m'
};

// Captura errores personalizados
class CustomErrorListener extends antlr4.error.ErrorListener {
    constructor() {
        super();
        this.errors = [];
    }
    syntaxError(recognizer, offendingSymbol, line, column, msg) {
        this.errors.push({ line, column, msg, text: offendingSymbol?.text || '' });
    }
}

// Mostrar tabla de tokens
function mostrarTablaTokens(lexer) {
    const symbolicNames = lexer.constructor.symbolicNames || [];
    const literalNames = lexer.constructor.literalNames || [];

    const input = lexer._input.toString();
    const tempLexer = new YulianLexer(new antlr4.InputStream(input));
    const tokens = tempLexer.getAllTokens();

    if (!tokens.length) {
        console.log(colors.warning + '⚠ No se reconocieron tokens válidos en la entrada' + colors.reset);
        return;
    }

    console.log('\n📋 Tabla de Tokens:');
    console.log('─────────────────────────────────────');
    console.log('│ Lexema        │ Token             │');
    console.log('├────────────────┼──────────────────┤');

    tokens.forEach(token => {
        const tokenName = symbolicNames[token.type] || literalNames[token.type] || `Token(${token.type})`;
        const lexema = token.text;
        if (lexema.trim() === '') return;
        console.log(`│ ${lexema.padEnd(14)}│ ${tokenName.padEnd(18)}│`);
    });

    console.log('─────────────────────────────────────\n');
}

// Leer entrada desde consola
function leerEntrada() {
    return new Promise(resolve => {
        const rl = readline.createInterface({ input: process.stdin, output: process.stdout });
        let input = '';
        console.log('(Escriba su código y presione Ctrl+D cuando termine)');
        rl.on('line', line => input += line + '\n');
        rl.on('close', () => resolve(input));
    });
}

// Main
async function main() {
    try {
        let input;
        try {
            input = fs.readFileSync('input.txt', 'utf-8');
            console.log(colors.info + '\n🔍 Analizando archivo input.txt...' + colors.reset);
        } catch {
            console.log(colors.info + '\n🔍 Ingrese el código a analizar (Ctrl+D para finalizar):' + colors.reset);
            input = await leerEntrada();
        }

        if (!input || input.trim() === '') {
            console.log(colors.warning + '⚠ No se proporcionó entrada para analizar' + colors.reset);
            return;
        }

        const chars = new antlr4.InputStream(input);
        const lexer = new YulianLexer(chars);

        const errorListenerLexer = new CustomErrorListener();
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListenerLexer);

        mostrarTablaTokens(lexer);

        const tokens = new antlr4.CommonTokenStream(lexer);
        tokens.fill();

        const parser = new YulianParser(tokens);
        const errorListenerParser = new CustomErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(errorListenerParser);

        const tree = parser.programa(); // <--- Cambiar si el nombre raíz cambia

        if (errorListenerLexer.errors.length > 0) {
            console.log(colors.error + '\n❌ ERRORES LÉXICOS ENCONTRADOS:' + colors.reset);
            errorListenerLexer.errors.forEach(e =>
                console.log(`- Línea ${e.line}:${e.column} - ${e.msg} (${e.text})`));
        }

        if (errorListenerParser.errors.length > 0) {
            console.log(colors.error + '\n❌ ERRORES SINTÁCTICOS ENCONTRADOS:' + colors.reset);
            errorListenerParser.errors.forEach(e =>
                console.log(`- Línea ${e.line}:${e.column} - ${e.msg}`));
        }

        if (errorListenerLexer.errors.length || errorListenerParser.errors.length) {
            console.log(colors.error + '\n✖ Análisis completado con errores' + colors.reset);
            return;
        }

        console.log(colors.success + '\n✓ Análisis completado sin errores' + colors.reset);
        console.log('\n🌳 ÁRBOL SINTÁCTICO:');
        console.log(tree.toStringTree(parser.ruleNames));

        console.log('\n🔍 RECORRIDO CON LISTENER:');
        const listener = new CustomListener();
        antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

        console.log('\n🔄 TRADUCCIÓN A JAVASCRIPT:');
        const visitor = new CustomVisitor();
        const jsCode = visitor.visit(tree);
        console.log(jsCode);

        fs.writeFileSync('output.js', jsCode);
        console.log(colors.success + '\n💾 Código guardado en output.js' + colors.reset);
        console.log(colors.info + '\n▶ Ejecutando como intérprete:\n' + colors.reset);

        try {
            const { execSync } = await import('child_process');
            const result = execSync('node output.js', { encoding: 'utf-8' });
            console.log(colors.success + result + colors.reset);
        } catch (e) {
            console.error(colors.error + '❌ Error al ejecutar output.js:\n' + e.message + colors.reset);
        }

    } catch (err) {
        console.error(colors.error + '\n⚠ Error inesperado:', err.message + colors.reset);
        if (err.stack) console.error(colors.error + 'Stack trace:', err.stack + colors.reset);
    }
}

main();
