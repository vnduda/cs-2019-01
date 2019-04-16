function RazaoAurea(x, y, k){
    if(x >= 0 && x < y && k > 0){
         let c = y;
        let a = x;
        let i = 1;
        while( i <= k){
            let t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
    return c/a;
    }
}