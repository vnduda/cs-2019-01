function Produto(a, b) {

    if (a < 0) {
        throw new RangeError("Intervalo de a inválido");
    }

    if (b < 0) {
        throw new RangeError("Intervalo de b inválido");
    }

    // TODO uma linha em branco é suficiente para separar seções de código
    totalParcelas = a;
    parcela = b;

    if (b < a) {
        totalParcelas = b;
        parcela = a;
    }

    let i = 1;
    let s = 0;

    while (i <= totalParcelas) {
        s = s + parcela;
        i = i + 1;
    }
    return s;

}