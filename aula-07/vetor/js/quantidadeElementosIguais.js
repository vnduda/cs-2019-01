/**
 * Função para encontrar quantos elementos iguais há entre dois vetores.
 * @param {Array} array1 O primeiro vetor
 * @param {Array} array2 O segundo vetor
 * @returns A quantidade de elementos iguais.
 */
function quantidadeElementosIguais(array, comparador) {
    for (let i = 0; i < array.length; i++) {
        if (isNaN(array[i])) {
            throw new TypeError("Argumento tem que ser um número");
        }
    }
    if (isNaN(comparador)) {
        throw new TypeError("Argumento tem que ser um número");
    }


    let quantidadeValoresIguais = 0;

    for (let i = 0; i < array.length; i++) {
       if (array[i] === comparador) {
           quantidadeValoresIguais++;
       }
    }

    return quantidadeValoresIguais;
}

module.exports = quantidadeElementosIguais;