public class Ex19 {

    public static int Fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Intervalo da variável n inválido");
        }

        int a = 0;
        int c = 1;

        // TODO não é aconselhado declarar duas variáveis em uma mesma linha.
        // TODO novamente, int i = 2, uma única linha
        // TODO t pode ser declarada na linha 23, por que tão antes?
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