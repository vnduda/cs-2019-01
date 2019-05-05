/**
 * Algoritmo que certifica se o CPF é válido através do Método de Horner
 * @param {Number} d CPF a ser verificado
 * @throws {RangeError} caso d tenha mais ou menos de 11 dígitos
 * @returns {boolean} true caso seja verdadeiro, false caso contrário
 */
module.exports = CPF2;
function CPF2(d) {
    if (d.length != 11) {
        throw new RangeError("O CPF não pode conter mais ou menos que 11 dígitos");
    }
    let c = 8;
    let p = d[9];
    let s = d[9];
    while (c >= 1) {
        p = p + d[c];
        s = s + p;
        c = c - 1;
    }
    let j = (s % 11) % 10;
    let k = ((s - p + d[10]) % 11) % 10;
    return (j == d[10] && k == d[11]);
}