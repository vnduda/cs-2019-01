public class Ex01 {

    // TODO ok por enquanto, mas saiba que não é assim que se testa!!!!
    public static void main(String[] args) {
        System.out.println(Propriedade3025(3025));
    }

    public static boolean Propriedade3025(int n) {

        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

        int i = n / 100;
        int j = n % 100;
        return (i + j) * (i + j) == n;

    }

}
