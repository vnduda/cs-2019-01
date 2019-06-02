/**
 * Função que retorna soma de números impares em um vetor.
 * @param {array} array vetor contendo os números a serem calculados
 * @returns soma dos números impares do vetor
 */
function numerosImpares(array) {
    if (!Array.isArray(array)) {
        throw new TypeError("A entrada não é um vetor");
    }

    let somaImpares = 0;

    for(let aux = 0; aux < array.length; aux++) {
        if(array[aux] % 2) {
            somaImpares += array[aux];
        }
    }
    return somaImpares;
}
