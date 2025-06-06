grammar yulian;
//GRAMATICA,SINTAXIS
programa
    : (declaracion | funcion | ejecucion)+
    ;

declaracion
    : 'variable' nombre '=' valor ';'
    ;

funcion
    : 'funcion' nombre '(' argumentos? ')' '{' instrucciones '}'
    ;

argumentos
    : nombre (',' nombre)*
    ;

instrucciones
    : (operacion_texto | impresion | retorno | concatenar)+
    ;

ejecucion
    : operacion_texto
    | impresion
    | retorno
    | concatenar
    ;

operacion_texto
    : variable '=' transformacion '(' cadena ')' ';'
    ;

transformacion
    : 'mayusculas'
    | 'minusculas'
    | 'longitud'
    | 'invertir'
    | 'reemplazar'
    ;

concatenar
    : variable '=' cadena '+' cadena ';'
    ;

impresion
    : 'imprimir' '(' valor ')' ';'
    ;

retorno
    : 'devolver' valor ';'
    ;

valor
    : texto
    | numero
    | variable
    ;

numero
    : NUM
    ;

cadena
    : texto
    | variable
    ;

texto
    : CADENA
    ;

variable
    : nombre
    ;

nombre
    : NOMBRE
    ;

// === Reglas léxicas ===

CADENA
    : '"' ( ~["\\] | '\\' . )* '"'
    ;

NUM
    : [0-9]+
    ;

NOMBRE
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

