function SomaNaturais(n){
    if(n>=1){
        let i = 2;
        let s = 1;
        while(i<=n){
            s = s + i;
            i = i + 1;
        }
        return s;
    }
    return false;
}