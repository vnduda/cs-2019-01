function propriedade3025(n) {

    if (n == null || n == undefined) {
        throw new Error("Entrada não pode ser null ou undefined");
    }
    if (typeof n !== 'number') {
        throw new TypeError("n precisa ser um número");
    }
    if (n < 0 || n > 9999) {
        throw new RangeError("Intervalo de n inválido");
    }

    const i = Math.floor(n / 100);
    const j = Math.floor(n % 100);

    return (i + j) * (i + j) == n;
}