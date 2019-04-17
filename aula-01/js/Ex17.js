function MDC2(a, b) {
    
    if (b <= a && 0 < b) {
        
        while (a != b) {
            
            if(a > b) {
                a = a - b;
            }
            else{
                b = b - a;
            }   
        }
    return a;
    }
}