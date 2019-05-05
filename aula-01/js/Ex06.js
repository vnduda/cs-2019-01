/**
 * Algoritmo que faz o fatorial de um número n.
 * @param {Number} n variável que será calculado o fatorial
 * @throws {RangeError} caso o número seja menor que 1
 * @returns {Number} retorna o fatorial de n
 */
module.exports = fatorial;
function fatorial(n) {

    if (n < 1) {
        throw new RangeError("Intervalo de n inválido");
    }

    let i = 2;
    let f = 1;

    while (i <= n) {
        f = f * i;
        i = i + 1;
    }

    return f;
}