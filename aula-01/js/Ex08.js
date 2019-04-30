function Potencia(x, y) {

    if (x < 0) {
        throw new RangeError("Intervalo de x inválido");
    }

    if (y < 0) {
        throw new RangeError("Intervalo de y inválido");
    }

    let potencia = 1;
    let i = 1;

    while (i <= y) {
        potencia = Produto(potencia, x);
        i = i + 1;
    }

    return potencia;
}