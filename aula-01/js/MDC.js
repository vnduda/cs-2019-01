/**
 * Calcula o maior divisor comum entre a e b
 * @param {Number} a número inteiro que será utilizado para o mdc
 * @param {Number} b número inteiro que será utilizado para o mdc
 * @throws {RangeError} caso b seja menor que 0 ou b seja maior que a
 * @throws {Error} caso entrada seja null ou undefined
 * @throws {TypeError} caso entrada não seja um número
 * @returns {Number} retorna o valor do mdc entre a e b
 */
function MDC(a, b) {

    if (b < 0) {
        throw new RangeError("Intervalo de b inválido");
    }
    if (a < b) {
        throw new RangeError("Variável b não pode ser maior que a");
    }
    if (a == null || a == undefined || b == null || b == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }
    if (typeof a !== "number" || typeof b !== "number") {
        throw new TypeError("Entrada precisa ser um número");
    }


    while (b != 0) {
        let m = a % b;
        a = b;
        b = m;
    }

    return a;

}

module.exports = MDC;