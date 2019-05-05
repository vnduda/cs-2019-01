/**
 * Algoritmo que calcula o n-esimo número de Fibonacci
 * @param {Number} n variável a ser calculada
 * @throws {RangeError} caso n seja menor que zero
 * @returns {Number} retorna o n-esimo número de Fibonacci
 */
module.exports = fibonacci;
function fibonacci(n) {

    if (n < 0) {
        throw new RangeError("Intervalo de n inválido");
    }

    let a = 0;
    let c = 1;

    if (n == 0 || n == 1) {
        return n;
    }
    let i = 2;

    while (i <= n) {
        let t = c;
        c = c + a;
        a = t;
        i = i + 1;
    }

    return c;

}