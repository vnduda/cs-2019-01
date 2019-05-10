/**
 * Verifica valor de Pi para um total de n termos
 * @param {Number} n quantidade de termos
 * @throws {RangeError} caso n seja menor que 1
 * @returns {Number} retorna o valor calculado de pi
 */
function pi(n) {

    if (n < 1) {
        throw new RangeError("Intervalo de n inválido");
    }
    if (n == null || n == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }
    if (typeof n !== 'number') {
        throw new TypeError("n precisa ser um número");
    }

    let i = 1;
    let s = -1;
    let impar = -1;
    let p = 0;
    while (i <= n) {
        impar = impar + 2;
        s = (-1) * s;
        p = p + 4 * s / impar;
        i = i + 1;
    }

    return p;
}

module.exports = pi;