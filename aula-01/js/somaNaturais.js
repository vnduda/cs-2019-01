/** 
 * Faz a soma dos primeiros naturais, de 1 até n
 * @param {Number} n número máximo a ser calculado
 * @throws {RangeError} caso entrada seja menor que 1
 * @throws {Error} caso entrada seja null ou undefined
 * @throws {TypeError} caso entrada não seja um numero
 * @returns {Number} retorna a soma dos primeiros números até n
 */

function somaNaturais(n) {

    if (n < 1) {
        throw new RangeError("Intervalo de n inválido");
    }
    if (n == null || n == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }
    if (typeof n !== "number") {
        throw new TypeError("n precisa ser um número");
    }


    const i = 2;
    const s = 1;
    while (i <= n) {
        s = s + i;
        i = i + 1;
    }

    return s;
}

module.exports = somaNaturais;