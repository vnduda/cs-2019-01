/**
 * Aproxima raizes de uma equação polinomial
 * @param {Number} x variável para obter uma aproximação 
 * @param {Number} g tamanho do polinômio
 * @param {Number} a coeficientes do polinômio
 * @throws {RangeError} caso g seja menor que 1
 * @throws {Error} caso g seja null ou undefined
 * @throws {TypeError} caso entrada não seja um numero
 * @returns {Number} retorna o valor calculado
 */

function horner(x, g, a) {

    if (g < 1) {
        throw new RangeError("Intervalo de g inválido");
    }
    if (g == null || g == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }
    if (typeof g !== "number") {
        throw new TypeError("g precisa ser um número");
    }
    

    let p = a[g];
    let i = g - 1;

    while (0 <= i) {
        p = p * x + a[i];
        i = i - 1;
    }

}

module.exports = horner;