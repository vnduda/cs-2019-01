/**
 * Algoritmo que calcula a quantidade em que cada elemento
 * aparece em um vetor de palavras.
 * 
 * @param {Array} array A string de palavras a ser comparado
 * @param {string} palavra A palavra que será contada
 * @returns {number} quantidade de recorrencias
 */
function caractereMaisFrequente(palavra ,array) {
     if (typeof palavra !== "string") {
        throw new TypeError("Argumento deve ser String");
    }
    for (let i = 0; i < array.length; i++) {
        if (typeof array[i] !== "string") {
            throw new TypeError("Argumento deve ser uma string");
        }
    }

    let arrayResultado = 0;
    for (let i = 0; i < array.length; i++) {
        if (palavra === array[i]) {
            arrayResultado++;
        }
    }

    return arrayResultado;
}
module.exports = caractereMaisFrequente;