public class Ex05 {
    
    public static int SomaNaturais(int n) {
        
        if(n < 1) {
         throw new IllegalArgumentException("Intervalo de n inválido");
        }

        int s = 1;
        int i;
        
        for(i = 2; n >= i; i++) {
            s = s + i;
        }
        
        return s;
    }
}