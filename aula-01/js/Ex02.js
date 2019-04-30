function Propriedade153(n) {

    // TODO verificar se null
    // TODO verificar se numero
    // TODO verificar se inteiro

    if (n < 100 || n > 999) {
        throw new RangeError("Intervalo de n inválido");
    }

    const c = Math.floor(n / 100);
    const du = n % 100;
    const d = Math.floor(du / 10);
    const u = du % 10;

    return (c**3 + d**3 + u**3) == n;
}