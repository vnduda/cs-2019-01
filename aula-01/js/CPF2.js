function cpfStringToArray(d) {
    let cpf = [];
    for (let i = 0; i < d.length; i++) {
        cpf[i] = parseInt(d[i]);
    }
    return cpf;
}
/**
 * Algoritmo que certifica se o CPF é válido através do Método de Horner
 * @param {Number} d CPF a ser verificado
 * @throws {RangeError} caso d tenha mais ou menos de 11 dígitos
 * @throws {TypeError} caso entrada não seja uma string
 * @returns {boolean} caso CPF seja verdadeiro retorna true, caso contrário false
 */

function CPF2(d) {
    if (typeof d != "string") {
        throw new TypeError("string é esperada");
    }
    if (d.length != 11 || d == null) {
        throw new RangeError("O CPF não pode conter mais ou menos que 11 dígitos");
    }
    const cpf = cpfStringToArray(d);
    let c = 7;
    let p = cpf[8];
    let s = cpf[8];
    while (c >= 0) {
        p = p + cpf[c];
        s = s + p;
        c = c - 1;
    }
    const j = (s % 11) % 10;
    const k = ((s - p + 9 * cpf[9]) % 11) % 10;
    return (j == cpf[9] && k == cpf[10]);
}

module.exports = CPF2;