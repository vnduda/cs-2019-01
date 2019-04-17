function diaSemana(d, m, a){
    
    if (d < 1 || d > 31) {
        throw new RangeError("Dia invalido: " + d);
    }

    if (m < 1 || m > 12) {
        throw new RangeError("Mês invalido: " + d);
    }

    if (a < 1753) {
        throw new RangeError("Ano invalido: " + a);
    }
    let s;

    if (m == 1 || m == 2) {
        m = m + 12;
        a = a - 1;   
    }
    s = (d + (2*m) + (3*(m+1)/5) + a + (a/4) - (a/100) + (a/400));
    return (s % 7);
}

    