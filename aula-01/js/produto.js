/**
 * Verifica o produto de dois inteiros a e b utilizando soma
 * @param {Number} a variável multiplicando
 * @param {Number} b variável multiplicador
 * @throws {RangeError} caso entrada seja menor que 0
 * @throws {Error} caso entrada seja null ou undefined 
 * @throws {TypeError} caso entrada não seja um número
 * @returns {Number} retorna o produto de dois inteiros
 */

function produto(a, b) {

    if (a < 0) {
        throw new RangeError("Intervalo de a inválido");
    }

    if (b < 0) {
        throw new RangeError("Intervalo de b inválido");
    }

    if (a == null || a == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }

    if (typeof a !== "number" || typeof b !== "number") {
        throw new TypeError("n precisa ser um número");
    }

    const totalParcelas = a;
    const parcela = b;
    if (b < a) {
        totalParcelas = b;
        parcela = a;
    }

    const i = 1;
    const s = 0;
    while (i <= totalParcelas) {
        s = s + parcela;
        i = i + 1;
    }

    return s;
}

module.exports = produto;