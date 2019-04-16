function MDC(a, b){
    if(b <= a && 0 < b){
        while(b != 0){
           let m = a % b;
           a = b;
           b = m;
        }
    return a;
    }
}