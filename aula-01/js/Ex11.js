/**
 * Calcula a razão aurea usando dois números inteiros e o número seguinte é
 * a soma dos dois anteriores. E assim sucessivamente
 * @param {Number} x número inteiro
 * @param {Number} y número inteiro
 * @param {Number} k soma de x + y
 * @throws {RangeError} caso x seja menor que 0, x maior que y ou k menor que 0
 * @returns {Number} retorna o valor da razao aurea calculado
 */
function razaoAurea(x, y, k) {

    if (x < 0) {
        throw new RangeError("Intervalo de x inválido");
    }
    if (x > y) {
        throw new RangeError("Variável x não pode ser maior que y");
    }
    if (k < 0) {
        throw new RangeError("Intervalo de k inválido");
    }

    let c = y;
    let a = x;
    let i = 1;

    while (i <= k) {
        let t = c;
        c = c + a;
        a = t;
        i = i + 1;
    }

    return c / a;

}