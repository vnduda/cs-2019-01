function Primo(n){
    if(n > 1){
        let i = 2;
        while(i < n){
            if((n % i) == 0){
                return false;
            }
        i = i + 1;
        }
    return true;
    }
}