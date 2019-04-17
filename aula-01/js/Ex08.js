function Potencia(x, y) {
    
    if (x >= 0 && y >= 0) {
        let potencia = 1;
        let i = 1;

        while (i <= y) {
            potencia = Produto(potencia, x);
            i = i + 1;
        }
        
        return potencia;
    }
    return false;
}