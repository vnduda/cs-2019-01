/**
 * Calcula raiz quadrada dada a base e o indice
 * @param {Number} n base da raiz quadrada
 * @param {Number} i indice da raiz quadrada
 * @throws {RangeError} caso n seja menor que 0
 * @throws {Error} caso entrada seja null ou undefined
 * @returns {Number} retorna a raiz quadrada calculada
 */
function raiz(n, i) {

    if (n < 0) {
        throw new RangeError("Intervalo de n inválido");
    }
    if (n == null || n == undefined || i == null || i == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }
    if (typeof n !== "number" || typeof i !== "number") {
        throw new TypeError("n precisa ser um número");
    }
    let r = 1;

    while (0 <= i) {
        r = (r + n / r) / 2;
        i = i - 1;
    }

    return r;

}

module.exports = raiz;