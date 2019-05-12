/**
 * Calcula se um dado n é primo
 * @param {Number} n número a ser calculado
 * @throws {RangeError} caso entrada seja menor que 1
 * @throws {Error} caso entrada seja null ou undefined
 * @throws {TypeError} caso entrada não seja um número
 * @returns {boolean} retorna true caso número seja primo, caso contrário false
 */
function primo(n) {

    if (n < 1) {
        throw new RangeError("Intervalo de n inválido");
    }
    if (n == null || n == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }
    if (typeof n !== "number") {
        throw new TypeError("n precisa ser um número");
    }

    const i = 2;

    while (i < n) {
        if ((n % i) == 0) {
            return false;
        }
        i = i + 1;
    }

    return true;

}

module.exports = primo;