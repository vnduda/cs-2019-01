public class Ex12 {
    
    public static boolean QuadradoPerfeito(int n) {
    
        if (n < 1) {
            throw new IllegalArgumentException("Intervalo da variável n inválido");
        }

        int i = 1;
        int s = 1;

        while (n > s) {
            i = i + 2;
            s = s + i;
        }

        return s == n;
    }
}