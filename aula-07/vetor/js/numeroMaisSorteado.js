/**
 * Sorteia números inteiros e retorna em um vetor os mais frequentes.
 * @param {Number} maximo Número máximo que pode ser sorteado
 * @param {Number} quantidade Quantidade de números sorteados
 * @returns Vetor com os números sorteados mais frequentes
 */
function frequenciaSorteio(maximo, quantidade) {

    let array = [];
    let contagem = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0];

    for (let contador = 0; contador < quantidade; contador++) {
        let numero = Math.floor(Math.random() * Math.floor(maximo));
        vetor.push(numero);
        contagem[numero]++;
    }

    let maisFrequente = 0;
    let indiceFrequente;

    contagem.forEach(function (elemento, indice) {
        if (elemento > maisFrequente) {
            maisFrequente = elemento;
            indiceFrequente = indice;
        }
    });

    return indiceFrequente;
}