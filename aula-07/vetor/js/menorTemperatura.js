/**
 * Função para encontrar a menor temperatura em um vetor.
 * @param {array} vetor de valores recebidos
 * @returns menor elemento do vetor
 */
function menorTemperatura (array) {
    if (!Array.isArray(array)) {
        throw new TypeError("A entrada não é um vetor");
    }

    let menorElemento = Math.min(array);

    return menorElemento;
}