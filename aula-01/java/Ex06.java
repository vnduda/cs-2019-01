public class Ex06 {
    
    public int Fatorial(int n) {
    
        if (n < 1) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

        int f = 1;
        int i = 2;

        while (i <= n) {
            f = f * i;
        }

        return f;
    }
}