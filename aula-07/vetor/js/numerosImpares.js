/**
 * Função que retorna soma de números impares em um vetor.
 * @param {array} array vetor contendo os números a serem calculados
 * @returns soma dos números impares do vetor
 */
function numerosImpares(array) {
    for (let i = 0; i < array.length; i++) {
       if (!Number.isInteger(array[i])) {
           throw new TypeError("Argumento deve ser inteiro");
       }
    }

    let somaImpares = 0;

    for(let aux = 0; aux < array.length; aux++) {
        if(array[aux] % 2) {
            somaImpares += array[aux];
        }
    }
    return somaImpares;
}
module.exports = numerosImpares;