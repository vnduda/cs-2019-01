function Propriedade3025(n) {

    if (n < 0 || n > 9999) {
        throw new RangeError("argumento invalido");
    }

    // FIXME Nao seria melhor Math.trunc???
    const i = parseInt(n / 100);
    const j = parseInt(n % 100);
    return (i + j) * (i + j) == n;
}