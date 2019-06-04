/**
 * Algoritmo que calcula a quantidade em que cada elemento
 * aparece em um vetor.
 * 
 * @param {Array} array O vetor
 * @returns {Array} Um vetor com a quantidade de recorrencias
 */
function caractereMaisFrequente(array) {
    if (!Array.isArray(array)) {
        throw new TypeError("A entrada não é um vetor");
    }

    let arrayResultado = [];
    array.forEach(function (numero1, indice) {
        let recorrencias = 0;
        array.forEach(numero2 => {
            if (numero1 == numero2) {
                recorrencias++;
            }
        });
        arrayResultado[indice] = recorrencias;
    });

    return arrayResultado;
}
module.exports = caractereMaisFrequente;