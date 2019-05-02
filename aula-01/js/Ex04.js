/**
 * Gera o resto da divisão inteira de x por y
 * @param {Number} x dividendo
 * @param {Number} y divisor
 * @throws {RangeError} caso x ou y forem menores que 0
 */
function mod(x, y) {
    if (y < 0) {
        throw new RangeError("Intervalo de y inválido");
    }

    if (x <= 0) {
        throw new RangeError("Intervalo de x inválido");
    }

    let s = x;
    while (s >= y) {
        s = s - y;
    }

    return s;
}
    
