/**
 * Função para encontrar a menor temperatura em um vetor.
 * @param {array} vetor de valores recebidos
 * @returns menor elemento do vetor
 */
function menorTemperatura (array) {
    for (let i = 0; i < array.length; i++) {
        if (isNaN(array[i])) {
            throw new TypeError("Argumento deve ser número");
        }
    }

    let menorElemento = array[0];
    for(let i = 1; i < array.length; i++) {
        if (menorElemento > array[i]) {
            menorElemento = array[i];
        }
    }

    return menorElemento;
}

module.exports = menorTemperatura;