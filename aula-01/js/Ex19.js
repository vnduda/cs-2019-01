function Fibonacci(n){
    if( n >= 0){
        let a = 0;
        let c = 1;
        if(n == 0 || n == 1){
            return n;
        }
        i = 2;
        while(i <= n){
            let t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
    return c;
    }
}