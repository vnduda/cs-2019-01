function mod(x, y) {
    if (y < 0){
        throw new RangeError("Intervalo de y inválido");
    }
    
    if (x <= 0){
        throw new RangeError("Intervalo de x inválido");
    }

    let s = x;
    while (y <= s) {
        s = s - y;
    }
    return s;
}
    