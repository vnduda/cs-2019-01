public int Produto(int a, int b) {
    if(a < 0 && b < 0){
        throw new IllegalArgumentException();
    }
    int totalParcelas = a;
    int parcela = b;
    if(a > b){
        totalParcelas = b;
        parcela = a;
    }
    int s = 0;
    int i = 1;
    while(i <= totalParcelas){
        s = s + parcela;
    }
    return s;
}