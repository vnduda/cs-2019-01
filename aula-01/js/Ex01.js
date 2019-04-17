function Propriedade3025(n){
    if(n < 0 || n > 9999){
        throw new RangeError();
    }
    let i = parseInt (n / 100);
    let j = parseInt (n % 100);
    return (i + j) * (i + j) == n;
    
}