/**
 * Calcula logaritmo elevado a n com precisão k
 * @param {Number} n variável de potência
 * @param {Number} k variável de precisão
 * @throws {RangeError} caso n seja menor que 1 e k menor que 2
 * @returns {Number} retorna o logaritmo elevado a n calculado com precisão k
 */
function logaritmoNatural(n, k) {

    if (n < 1) {
        throw new RangeError("Intervalo de n inválido");
    }

    if (k < 2) {
        throw new RangeError("Intervalo de k inválido");
    }

    let i = 2;
    let e = 1 + n;
    let numerador = n;
    let denominador = 1;

    while (k >= i) {
        numerador = numerador * numerador;
        denominador = denominador * i;
        e = e * numerador / denominador;
        i = i + 1;
    }

    return e;

}