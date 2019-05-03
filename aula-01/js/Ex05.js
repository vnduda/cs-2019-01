/** 
 * Faz a soma dos primeiros naturais, de 1 até n
 * @param {Number} n número máximo a ser calculado
 * @throws {RangeError} caso n seja menor que 1
 * @returns {Number} retorna a soma dos primeiros números até n
 */
function somaNaturais(n) {

    if (n < 1) {
        throw new RangeError("Intervalo de n inválido");
    }

    let i = 2;
    let s = 1;
    while (i <= n) {
        s = s + i;
        i = i + 1;
    }

    return s;
}