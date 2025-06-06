import antlr4 from 'antlr4';
import yulianListener from './generated/yulianListener.js';

class CustomListener extends yulianListener {
    enterProg(ctx) {
        console.log("▶ Entrando a 'prog'");
    }

    exitProg(ctx) {
        console.log("◀ Saliendo de 'prog'");
    }

    enterPrint(ctx) {
        console.log("🖨 Encontrado 'print':", ctx.getText());
    }

    exitPrint(ctx) {}
}

export default CustomListener;