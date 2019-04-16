public int SomaNaturais(int n){
    if(n < 1){
        throw new IllegalArgumentException();
    }
    int s = 1;
    int i;
    for(i = 2; n >= i; i++){
        s = s + i;
    }
    return s;
}
