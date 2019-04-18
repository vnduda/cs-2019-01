public class Ex18 {

    public static int Horner(int x, int g, int a[]) {
        
        if(g < 1) {
            throw new IllegalArgumentException("Intervalo da variável g inválido");
        }

        int p = a[g];
        int i = g - 1;

        while(i >= 0) {
            p = p * x + a[i];
            i = i - 1;
        }

        return p;
    }
}