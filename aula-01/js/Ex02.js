/**
 * Verifica se n satisfaz a propriedade 153.
 * @param {Number} n variavel a ser verificada
 * @throws {Error} caso entrada seja null ou undefined
 * @throws {TypeError} caso entrada não seja um número
 * @throws {RangeError} caso número seja menor que 100 ou maior que 999
 * @returns {boolean} caso verdadeiro, retorna true, caso contrário false
 */
function propriedade153(n) {

    if (n == null || n == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }
    if (typeof n !== 'number') {
        throw new TypeError("n precisa ser um número");
    }
    if (n < 100 || n > 999) {
        throw new RangeError("Intervalo de n inválido");
    }

    const c = Math.floor(n / 100);
    const du = n % 100;
    const d = Math.floor(du / 10);
    const u = du % 10;

    return (c**3 + d**3 + u**3) == n;
}

module.exports = propriedade153;