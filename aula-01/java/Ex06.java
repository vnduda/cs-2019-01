public int Fatorial(int n){
    if(n < 1){
        throw new IllegalArgumentException();
    }
    int f = 1;
    int i = 2;
    while(i <= n){
        f = f * i;
    }
    return f;
}