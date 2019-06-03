/**
 * Função para encontrar quantos elementos iguais há entre dois vetores.
 * @param {Array} array1 O primeiro vetor
 * @param {Array} array2 O segundo vetor
 * @returns A quantidade de elementos iguais.
 */
function quantidadeElementosIguais(array1, array2) {
    if (!Array.isArray(array1) || !Array.isArray(array2)) {
        throw new TypeError("A entrada não é um vetor");
    }

    let quantidadeValoresIguais = 0;

    array1.forEach(valor1 => {
        array2.forEach(valor2 => {
            if (valor1 == valor2) {
                quantidadeValoresIguais++;
            }
        });
    });

    return quantidadeValoresIguais;
}