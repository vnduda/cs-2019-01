public class Ex21 {

    public static boolean CPF2(String d) {

        if (d.length() < 11 || d.length() > 11) {
            throw new IllegalArgumentException("O CPF deve conter 11 dígitos");
        }

        int c = 7;
        int p = Character.getNumericValue(d.charAt(8));

        // FIXME por que chamar novamente estes métodos???
        int s = Character.getNumericValue(d.charAt(8));

        // TODO Character.getNumericValue espalhado no código. Reúna em método.

        while (c >= 0) {
            p = p + Character.getNumericValue(d.charAt(c));
            s = s + p;
            c = c - 1;
        }

        int j = (s % 11) % 10;
        int k = ((s - p + 9 * Character.getNumericValue(d.charAt(9))) % 11) % 10;

        return (j == Character.getNumericValue(d.charAt(9)) && k == Character.getNumericValue(d.charAt(10)));

    }

}
