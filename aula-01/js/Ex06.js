function Fatorial(n) {

    if (n < 1) {
        throw new RangeError("Intervalo de n inválido");
    }

    let i = 2;
    let f = 1;

    while (i <= n) {
        f = f * i;
        i = i + 1;
    }

    return f;
}