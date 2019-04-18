function Horner(x, g, a) {

    if (g < 1) {
        throw new RangeError("Intervalo de g inválido");
    }


    let p = a[g];
    let i = g - 1;
 
    while (0 <= i) {
        p = p * x + a[i];
        i = i - 1;
    }
 
    return p;

}