function Propriedade153(n) {

    if (n < 100 || n > 999) {
        throw new RangeError("Intervalo de n inválido");
    }

    const c = parseInt(n / 100);
    const du = parseInt(n % 100);
    const d = parseInt(du / 10);
    const u = parseInt(du % 10);

    return (c**3 + d**3 + u**3) == n;
}