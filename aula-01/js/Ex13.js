/**
 * Calcula raiz quadrada dada a base e o indice
 * @param {Number} n base da raiz quadrada
 * @param {Number} i indice da raiz quadrada
 * @throws {RangeError} caso n seja menor que n
 * @returns {Number} retorna a raiz quadrada calculada
 */
function raiz(n, i) {

    if (n < 0) {
        throw new RangeError("Intervalo de n inválido");
    }

    let r = 1;

    while (0 <= i) {
        r = (r + n / r) / 2;
        i = i - 1;
    }

    return r;

}