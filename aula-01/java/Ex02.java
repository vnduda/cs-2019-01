public class Ex02 {

    public static void main(String[] args) {
        System.out.println(propriedade153(153));
    }

    public static boolean propriedade153(int n) {

        if (n < 100 || n > 999) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

        final int c = n / 100;
        final int du = n % 100;
        final int d = du / 10;
        final int u = du % 10;

        return (c * c * c) + (d * d * d) + (u * u * u) == n;

    }

}