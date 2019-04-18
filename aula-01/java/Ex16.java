public class Ex16 {

    public static int MDC(int a, int b) {

        if(a < b) {
            throw new IllegalArgumentException("Variável a deve ser maior que b");
        }

        if(b < 0) {
            throw new IllegalArgumentException("Intervalo da variável b inválido");
        }

        int m;

        while(b != 0) {
            m = a % b;
            a = b;
            b = m;
        }

        return a;
    }
}