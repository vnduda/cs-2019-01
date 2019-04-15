function Fatorial(n){
    if(n>=1){
        let i = 2;
        let f = 1;
        while(i<=n){
            f = f * i;
            i = i + 1;
        }
        return f;
    }
    return false;
}