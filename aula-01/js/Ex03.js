function DiaSemana(d, m, a){
    let s;
    if(d>=1 && d<=31 && m>=1 && m<=12 && a>1753){
        if(m==1 || m==2){
        m+=12;
        a-=1;   
        }
        s = (d + (2*m) + (3*(m+1)/5) + a + (a/4) - (a/100) + (a/400));
        return (s%7);
    }
    return false;
}
    