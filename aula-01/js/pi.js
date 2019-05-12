/**
 * Verifica valor de Pi para um total de n termos
 * @param {Number} n quantidade de termos
 * @throws {RangeError} caso entrada seja menor que 1
 * @throws {Error} caso entrada seja null ou undefined
 * @throws {TypeError} caso entrada não seja um número
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

    const i = 1;
    const s = -1;
    const impar = -1;
    const p = 0;
    while (i <= n) {
        impar = impar + 2;
        s = (-1) * s;
        p = p + 4 * s / impar;
        i = i + 1;
    }

    return p;
}

module.exports = pi;