/**
 * Verifica se n satisfaz a propriedade 3025.
 * @param {Number} n variavel a ser verificada
 * @throws {Error} caso entrada seja null ou undefined
 * @throws {TypeError} caso entrada não seja um número
 * @throws {RangeError} caso entrada seja menor que 0 ou maior que 999
 * @throws {RangeError} caso entrada não seja um número inteiro
 * @returns {boolean} o valor verdadeiro se o argumento fornecido satisfaz a propriedade 3025 e, o valor falso, caso contrário
 */
function propriedade3025(n) {

    if (n == null || n == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }
    if (typeof n !== "number") {
        throw new TypeError("n precisa ser um número");
    }
    if (n < 0 || n > 9999) {
        throw new RangeError("Intervalo de n inválido");
    }
    if(Math.trunc(n) != n){
        throw new RangeError("N precisa ser um inteiro");
    }

    const i = Math.floor(n / 100);
    const j = Math.floor(n % 100);

    return (i + j) * (i + j) == n;
}

module.exports = propriedade3025;