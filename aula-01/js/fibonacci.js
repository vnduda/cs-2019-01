/**
 * Algoritmo que calcula o n-esimo número de Fibonacci
 * @param {Number} n variável a ser calculada
 * @throws {RangeError} caso entrada seja menor que zero
 * @throws {Error} caso entrada seja null ou undefined
 * @throws {TypeError} caso entrada não seja um número
 * @throws {RangeError} caso entrada não seja um número inteiro
 * @returns {Number} retorna o n-esimo número de Fibonacci
 */

function fibonacci(n) {

    if (n < 0) {
        throw new RangeError("Intervalo de n inválido");
    }
    if (n == null || n == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }
    if (typeof n !== "number") {
        throw new TypeError("n precisa ser um número");
    }
    if(Math.trunc(n) != n){
        throw new RangeError("N precisa ser um inteiro");
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

module.exports = fibonacci;