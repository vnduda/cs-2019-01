function Mod(x, y){
    let s;
    if (y>=0 || x>0){
        s = x;
        while (y <= s) {
            s = s - y;
        }
        return s;
    }
    return false;
}