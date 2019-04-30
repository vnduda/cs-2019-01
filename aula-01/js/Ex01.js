function propriedade3025(n) {

    if (n < 0 || n > 9999) {
        throw new RangeError("Intervalo de n inválido");
    }

    const i = Math.floor(n / 100);
    const j = Math.floor(n % 100);

    return (i + j) * (i + j) == n;
}