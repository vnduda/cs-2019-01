function cpfStringToArray(d) {
    let cpf = [];
    for (let i = 0; i < d.length; i++) {
        cpf[i] = parseInt(d[i]);
    }
    return cpf;
}
/**
 * Algoritmo que certifica se o CPF é válido
 * @param {Number} d CPF a ser verificado
 * @throws {RangeError} caso d tenha mais ou menos de 11 dígitos
 * @returns {boolean} true caso seja verdadeiro, false caso contrário
 */
module.exports = CPF;
function CPF(d) {
    if (typeof d != "string") {
        throw new TypeError("Uma string é esperada");
    }
    if (d.length != 11 || d == null) {
        throw new RangeError("O CPF não pode conter mais ou menos que 11 dígitos");
    }
    const cpf = cpfStringToArray(d);

    let j = cpf[0] + 2 * cpf[1] + 3 * cpf[2] + 4 * cpf[3] + 5 * cpf[4] + 6 * cpf[5] + 7 * cpf[6] + 8 * cpf[7] + 9 * cpf[8];
    let k = cpf[1] + 2 * cpf[2] + 3 * cpf[3] + 4 * cpf[4] + 5 * cpf[5] + 6 * cpf[6] + 7 * cpf[7] + 8 * cpf[8] + 9 * cpf[9];

    let dj = (j % 11) % 10;
    let dk = (k % 11) % 10;

    return (dj == cpf[9] && dk == cpf[10]);
}