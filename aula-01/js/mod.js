/**
 * Gera o resto da divisão inteira de x por y
 * @param {Number} x dividendo
 * @param {Number} y divisor
 * @throws {RangeError} caso x ou y forem menores que 0
 * @throws {Error} caso entrada seja null ou undefined
 * @throws {TypeError} caso entrada não seja um numero
 * @returns {Number} o resto da divisão de x por y
 */

function mod(x, y) {
    if (y < 0) {
        throw new RangeError("Intervalo de y inválido");
    }
    if (x <= 0) {
        throw new RangeError("Intervalo de x inválido");
    }
    if (x == null || x == undefined || y == null || y == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }
    if (typeof x !== "number" || typeof y !== "number") {
        throw new TypeError("Entrada precisa ser um número");
    }

    let s = x;
    while (s >= y) {
        s = s - y;
    }

    return s;
}

module.exports = mod;
