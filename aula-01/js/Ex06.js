/**
 * Algoritmo que faz o fatorial de um número n.
 * @param {Number} n variável que será calculado o fatorial
 * @throws {RangeError} caso o número seja menor que 1
 * @throws {Error} caso entrada seja null ou undefined
 * @throws {TypeError} caso entrada não seja um número
 * @returns {Number} retorna o fatorial de n
 */

function fatorial(n) {

    if (n < 1) {
        throw new RangeError("Intervalo de n inválido");
    }

    if (n == null || n == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }

    if (typeof n !== "number") {
        throw new TypeError("n precisa ser um número");
    }

    let i = 2;
    let f = 1;

    while (i <= n) {
        f = f * i;
        i = i + 1;
    }

    return f;
}

module.exports = fatorial;