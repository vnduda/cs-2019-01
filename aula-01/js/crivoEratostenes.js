/**
 * Algoritmo que encontra números primos
 * @param {Number} s coleção de números 
 * @param {Number} n maior número a ser checado
 * @throws {Error} caso array tenha tamanho inválido
 * @throws {RangeError} caso array não esteja zerado
 * @returns {boolean} retorna o resultado calculado
 */
function crivoEratostenes(s, n) {

    if (n < 1) {
        throw new RangeError("O tamanho do Vetor deve ser maior que 1.");
    }
    if (isNaN(n)) {
        throw new TypeError("Entrada não é um número");
    }
    if (!Array.isArray(s)) {
        throw new TypeError("O argumento não é um vetor");
    }
    for (let i = 0; i < n; i++) {
        if (s[i] != 0) {
            throw new RangeError("O vetor deve estar zerado.");
        }
    }

    if (n > 1) {

        let a = s;
        let i = 2;
        let limite = Math.floor(Math.sqrt(n));
        let multiplo;

        while (i <= limite) {
            if (a[i] == 0) {
                multiplo = i + i;
                while (multiplo <= n) {
                    a[multiplo] = 1;
                    multiplo = multiplo + i;
                }
            }
            i = i + 1;
        }

        return a;

    }

}
module.exports = crivoEratostenes;