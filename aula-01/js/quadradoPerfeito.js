/**
 * Calcula um quadrado perfeito dado um n
 * @param {Number} n número a ser calculado o quadrado perfeito
 * @throws {RangeError} caso entrada seja menor que 1
 * @throws {Error} caso entrada seja null ou undefined
 * @throws {TypeError} caso entrada não seja um número
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

    const i = 1;
    const s = 1;

    while (s < n) {
        i = i + 2;
        s = s + i;
    }

    return s == n;

}

module.exports = quadradoPerfeito;