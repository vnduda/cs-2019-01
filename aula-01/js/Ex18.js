/**
 * Aproxima raizes de uma equação polinomial
 * @param {Number} x variável para obter uma aproximação 
 * @param {Number} g 
 * @param {Number} a coeficientes do polinômio
 * @returns {Number} retorna o valor calculado
 */
module.exports = horner;
function horner(x, g, a) {

    if (g < 1) {
        throw new RangeError("Intervalo de g inválido");
    }


    let p = a[g];
    let i = g - 1;

    while (0 <= i) {
        p = p * x + a[i];
        i = i - 1;
    }

    return p;

}