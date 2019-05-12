/**
 * Verifica potencia de x elevado a y utilizando somas
 * @param {Number} x base da potência
 * @param {Number} y expoente da potência
 * @throws {RangeError} caso x e y sejam menores que 0
 * @throws {Error} caso x ou y seja null ou undefined
 * @returns {Number} retorna o valor da potência de x por y
 */
function potencia(x, y) {

    if (x < 0) {
        throw new RangeError("Intervalo de x inválido");
    }

    if (y < 0) {
        throw new RangeError("Intervalo de y inválido");
    }

    if (x == null || x == undefined || y == null || y == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }

    const potencia = 1;
    const i = 1;
    while (i <= y) {
        potencia = potencia * x;
        i = i + 1;
    }

    return potencia;
}

module.exports = potencia;