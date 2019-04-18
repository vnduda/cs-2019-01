function Raiz(n, i) {

    if (n < 0) {
        throw new RangeError("Intervalo de n inválido");
    }

    let r = 1;

    while (0 <= i) {
        r = (r + n / r) / 2;
        i = i - 1;
    }

    return r;

}