function LogaritmoNatural(n, k) {

    if (n < 1) {
        throw new RangeError("Intervalo de n inválido");
    }

    if (k < 2) {
        throw new RangeError("Intervalo de k inválido");
    }

    let i = 2;
    let e = 1 + n;
    let numerador = n;
    let denominador = 1;

    while (k >= i) {
        numerador = numerador * numerador;
        denominador = denominador * i;
        e = e * numerador / denominador;
        i = i + 1;
    }

    return e;

}