/**
 * Função que retorna soma de números impares em um vetor.
 * @param array vetor contendo os números
 * @returns soma dos números impares do vetor
 */
function numerosImpares(array) {
    let somaImpares = 0;

    for(let aux = 0; aux < array.length; aux++) {
        if(array[aux] % 2) {
            somaImpares += array[aux];
        }
    }
    return somaImpares;
}
