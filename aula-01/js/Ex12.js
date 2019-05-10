/**
 * Calcula um quadrado perfeito dado um n
 * @param {Number} n número a ser calculado o quadrado perfeito
 * @throws {RangeError} caso n seja menor que 1
 * @returns {Number} retorna o quadrado perfeito
 */
function quadradoPerfeito(n) {

    if (n < 1) {
        throw new RangeError("Intervalo de n inválido");
    }
    if (n == null || n == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }
    if (typeof n !== "number") {
        throw new TypeError("n precisa ser um número");
    }

    let i = 1;
    let s = 1;

    while (s < n) {
        i = i + 2;
        s = s + i;
    }

    return s == n;

}

module.exports = quadradoPerfeito;