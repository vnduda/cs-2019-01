public class Ex03 {

    public static void main(String[] args) {
        System.out.println(DiaSemana(11, 4, 2019));
    }

    public static int DiaSemana(int d, int m, int a) {

        if (diaInvalido(d)) {
            throw new IllegalArgumentException("Dia inválido");
        }

        if (m < 1 || m > 12) {
            throw new IllegalArgumentException("Mês inválido");
        }

        if (a < 1753) {
            throw new IllegalArgumentException("Ano inválido");
        }

        if (m == 1 || m == 2) {
            m += 12;
            a -= 1;
        }

        int s = (d + (2 * m) + (3 * (m + 1) / 5) + a + (a / 4) - (a / 100) + (a / 400));

        return s % 7;
    }

    private static boolean diaInvalido(int d) {
        return d < 1 || d > 31;
    }
}