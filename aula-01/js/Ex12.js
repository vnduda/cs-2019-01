function QuadradoPerfeito(n) {
    
    if(n >= 1) {
        let i = 1;
        let s = 1;
        
        while(s < n) {
            i = i + 2;
            s = s + i;
        }
    return s == n;
    }
}