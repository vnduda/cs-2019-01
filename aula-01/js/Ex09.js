function pi(n) {

    if (n < 1) {
        throw new RangeError("Intervalo de n inválido");
    }

    let i = 1;
    let s = -1;
    let impar = -1;
    let p = 0;
    while (i <= n) {
        impar = impar + 2;
        s = (-1) * s;
        p = p + 4 * s / impar;
        i = i + 1;
    }

    return p;
}