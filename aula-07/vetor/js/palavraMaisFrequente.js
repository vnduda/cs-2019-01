/**
 * Algoritmo que encontra a palavra mais frequente em uma string.
 * @param {String} string A string
 * @returns a palavra mais frequente na string
 */
function palavraMaisFrequente(string) {
    
    let palavras = string.split(" ");
    let maiorfrequencia = 0;
    let maisFrequente;

    palavras.forEach(function (palavra) {
        let frequencia = 0;
        palavras.forEach(palavra2 => {
            if (palavra == palavra2) {
                frequencia++;
                if (frequencia > maiorfrequencia) {
                    maiorfrequencia = frequencia;
                    maisFrequente = palavra;
                }
            }
        })
    });

    return maisFrequente;
}
module.exports = palavraMaisFrequente;