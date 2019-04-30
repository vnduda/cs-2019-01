function razaoAurea(x, y, k) {

    if (x < 0) {
        throw new RangeError("Intervalo de x inválido");
    }
    if (x > y) {
        throw new RangeError("Variável x não pode ser maior que y");
    }
    if (k < 0) {
        throw new RangeError("Intervalo de k inválido");
    }

    let c = y;
    let a = x;
    let i = 1;

    while (i <= k) {
        let t = c;
        c = c + a;
        a = t;
        i = i + 1;
    }

    return c / a;

}