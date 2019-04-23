public class Ex20 {

    public static boolean CPF(String d) {

        if (d.length() > 11 || d.length() < 11) {
            throw new IllegalArgumentException("O CPF deve conter 11 dígitos");
        }

        int j = Character.getNumericValue(d.charAt(0)) + 2 * Character.getNumericValue(d.charAt(1))
                + 3 * Character.getNumericValue(d.charAt(2)) + 4 * Character.getNumericValue(d.charAt(3))
                + 5 * Character.getNumericValue(d.charAt(4)) + 6 * Character.getNumericValue(d.charAt(5))
                + 7 * Character.getNumericValue(d.charAt(6)) + 8 * Character.getNumericValue(d.charAt(7))
                + 9 * Character.getNumericValue(d.charAt(8));

        // TODO remova a interacao com o usuario
        System.out.println(j);
        int k = Character.getNumericValue(d.charAt(1)) + 2 * Character.getNumericValue(d.charAt(2))
                + 3 * Character.getNumericValue(d.charAt(3)) + 4 * Character.getNumericValue(d.charAt(4))
                + 5 * Character.getNumericValue(d.charAt(5)) + 6 * Character.getNumericValue(d.charAt(6))
                + 7 * Character.getNumericValue(d.charAt(7)) + 8 * Character.getNumericValue(d.charAt(8))
                + 9 * Character.getNumericValue(d.charAt(9));

        // TODO remova a itneracao com o usuario
        System.out.println(k);

        int dj = (j % 11) % 10;
        int dk = (k % 11) % 10;

        return dj == Character.getNumericValue(d.charAt(9)) && dk == Character.getNumericValue(d.charAt(10));

    }
}