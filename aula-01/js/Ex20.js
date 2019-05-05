/**
 * Algoritmo que certifica se o CPF é válido
 * @param {Number} d CPF a ser verificado
 * @throws {RangeError} caso d tenha mais ou menos de 11 dígitos
 * @returns {boolean} true caso seja verdadeiro, false caso contrário
 */
module.exports = CPF;
function CPF(d) {
    if (d.length != 11) {
        throw new RangeError("O CPF não pode conter mais ou menos que 11 dígitos");
    }
    let j = d[0] + d[1] + d[2] + d[3] + d[4] + d[5] + d[6] + d[7] + d[8];
    let k = d[1] + d[2] + d[3] + d[4] + d[5] + d[6] + d[7] + d[8] + d[9];
    let dj = (j % 11) % 10;
    let dk = (k % 11) % 10;
    return (dj == d[9] && dk == d[10]);
}