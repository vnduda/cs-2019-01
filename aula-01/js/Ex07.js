/**
 * Verifica o produto de dois inteiros a e b utilizando soma
 * @param {Number} a variável multiplicando
 * @param {Number} b variável multiplicador
 * @throws {RangeError} caso a e b sejam menores que 0
 * @returns {Number} retorna o produto de dois inteiros
 */
module.exports = produto;
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

    let totalParcelas = a;
    let parcela = b;
    if (b < a) {
        totalParcelas = b;
        parcela = a;
    }

    let i = 1;
    let s = 0;
    while (i <= totalParcelas) {
        s = s + parcela;
        i = i + 1;
    }

    return s;
}