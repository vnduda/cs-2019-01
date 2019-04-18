function MDC2(a, b) {

    if (a < b) {
        throw new RangeError("Variável b não pode ser maior que a");
    }

    if (b < 0) {
        throw new RangeError("Intervalo de b inválido");
    }

    while (a != b) {

        if (a > b) {
            a = a - b;
        } else {
            b = b - a;
        }
    }

    return a;

}