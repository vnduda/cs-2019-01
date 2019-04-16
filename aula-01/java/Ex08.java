public int Produto(int x, int y) {
    if(x < 0 && y < 0){
        throw new IllegalArgumentException();
    }
    int i = 1;
    int potencia = 1;
    while(i <= y){
        potencia = Produto(potencia, x);
        i = i + 1;
    }
    return potencia;

}