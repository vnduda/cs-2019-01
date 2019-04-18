function MDC(a, b) {
    
    if (b < 0) {
        throw new RangeError("Intervalo de b inválido");
    }

    if (a < b) {
        throw new RangeError("Variável a não pode ser maior que b");
    }

    
    while (b != 0) {
        let m = a % b;
        a = b;
        b = m;
    }

    return a;
   
}