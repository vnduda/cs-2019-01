function Produto(a, b){
    if(a>=0 && b>=0){
        totalParcelas = a;
        parcela = b;
        if(b < a){
            totalParcelas = b;
            parcela = a;
        }
        i = 1;
        s = 0;
        while(i <= totalParcelas){
            s = s + parcela;
            i = i + 1;
        }
        return s;
    }
    return false;
}