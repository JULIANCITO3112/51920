import antlr4 from 'antlr4';
import yulianVisitor from './generated/yulianVisitor.js';

class CustomVisitor extends yulianVisitor {
    visitPrograma(ctx) {
        let output = '';
        for (let declaracion of ctx.declaracion()) {
            output += this.visit(declaracion) + '\n';
        }
        return output;
    }

    visitDeclaracion(ctx) {
        const tipo = ctx.getChild(0).getText(); // 'variable'
        const nombre = this.visit(ctx.nombre());
        const valor = this.visit(ctx.valor());
        return `let ${nombre} = ${valor};`;
    }

    visitNombre(ctx) {
        return ctx.getText(); // e.g. 'Juan'
    }

    visitValor(ctx) {
        return this.visit(ctx.numero());
    }

    visitNumero(ctx) {
        return ctx.getText(); // e.g. '23'
    }
}

export default CustomVisitor;
