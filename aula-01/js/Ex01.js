function Propriedade3025(n) {

    if (n < 0 || n > 9999) {
        throw new RangeError("Intervalo de n inválido");
    }

    let i = Math.floor(n / 100);
    let j = Math.floor(n % 100);

    return (i + j) * (i + j) == n;

}