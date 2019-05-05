/**
 * Calcula se um dado n é primo
 * @param {Number} n número a ser calculado
 * @throws {RangeError} caso n seja menor que 1
 * @returns {boolean} retorna true caso verdadeiro, caso contrário false
 */
module.exports = primo;
function primo(n) {

    if (n < 1) {
        throw new RangeError("Intervalo de n inválido");
    }

    let i = 2;

    while (i < n) {
        if ((n % i) == 0) {
            return false;
        }
        i = i + 1;
    }

    return true;

}