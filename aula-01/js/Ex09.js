function Pi(n) {
    if(n >= 1) {
        let i = 1;
        let s = -1;
        let d = -1;
        let p = 0;
        while(i <= n) {
            d = d + 2;
            s = (-1) * s;
            p = p + 4 * s / d;
            i = i + 1;
        }
        return p;
    }
    return false
}