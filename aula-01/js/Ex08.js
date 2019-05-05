/**
 * Verifica potencia de x elevado a y utilizando somas
 * @param {Number} x base da potência
 * @param {Number} y expoente da potência
 * @throws {RangeError} caso x e y sejam menores que 0
 * @returns {Number} retorna o valor da potência de x por y
 */
module.exports = potencia;
function potencia(x, y) {

    if (x < 0) {
        throw new RangeError("Intervalo de x inválido");
    }

    if (y < 0) {
        throw new RangeError("Intervalo de y inválido");
    }

    let potencia = 1;
    let i = 1;
    let Produto;
    while (i <= y) {
        potencia = Produto(potencia, x);
        i = i + 1;
    }

    return potencia;
}