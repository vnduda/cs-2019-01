public class Ex19 {

    public static int Fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Intervalo da variável n inválido");
        }

        int a = 0;
        int c = 1;
        int i, t;

        if (n == 0 || n == 1) {
            return n;
        }

        i = 2;

        while (n >= i) {
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c;
    }
}