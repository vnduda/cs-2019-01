/**
 * Calcula o maior divisor comum entre a e b usando subtrações
 * @param {Number} a número inteiro que será utilizado para o mdc
 * @param {Number} b número inteiro que será utilizado para o mdc
 * @throws {RangeError} caso b seja menor que 0 ou b seja maior que a
 * @returns {Number} retorna o valor do mdc entre a e b
 */
function MDC2(a, b) {

    if (a < b) {
        throw new RangeError("Variável b não pode ser maior que a");
    }

    if (b < 0) {
        throw new RangeError("Intervalo de b inválido");
    }

    while (a != b) {

        if (a > b) {
            a = a - b;
        } else {
            b = b - a;
        }
    }

    return a;

}