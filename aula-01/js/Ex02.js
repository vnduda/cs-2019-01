function Propriedade153(n){
    let c = parseInt (n/100);
    let du = parseInt (n%100);
    let d = parseInt (du/10);
    let u = parseInt (du%10);

    return (c*c*c)+(d*d*d)+(u*u*u) == n;
}