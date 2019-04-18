public class Ex09 {

    public double pi(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Intervalo inválido de n");
        }

        double p = 0;
        double s = -1;
        double d = -1;
        int i = 1;

        while (i <= n) {
            d = d + 2;
            s = -1 * s;
            p = p + 4 * s / d;
        }

        return p;
    }
}