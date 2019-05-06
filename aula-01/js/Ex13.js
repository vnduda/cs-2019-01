/**
 * Calcula raiz quadrada dada a base e o indice
 * @param {Number} n base da raiz quadrada
 * @param {Number} i indice da raiz quadrada
 * @throws {RangeError} caso n seja menor que n
 * @returns {Number} retorna a raiz quadrada calculada
 */
module.exports = raiz;
function raiz(n, i) {

    if (n < 0) {
        throw new RangeError("Intervalo de n inválido");
    }
    if (n == null || n == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }
    if (typeof n !== "number") {
        throw new TypeError("n precisa ser um número");
    }
    let r = 1;

    while (0 <= i) {
        r = (r + n / r) / 2;
        i = i - 1;
    }

    return r;

}