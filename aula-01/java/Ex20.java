public class Ex20 {

    public static boolean CPF(String d) {

        // TODO verifique se d é null.

        if (d.length() > 11 || d.length() < 11) {
            throw new IllegalArgumentException("O CPF deve conter 11 dígitos");
        }

        // TODO Crie o método int[] stingParaVetorDeDigitos(String d)
        // TODO use Character.isDigit para verificar cada caractere da string!!
        // TODO crie int[] cpf com o retorno do método criado
        // TODO use cpf[0] em vez de Character.getNumericValue(d.charAt(0)) e assim por diante

        int j = Character.getNumericValue(d.charAt(0)) + 2 * Character.getNumericValue(d.charAt(1))
                + 3 * Character.getNumericValue(d.charAt(2)) + 4 * Character.getNumericValue(d.charAt(3))
                + 5 * Character.getNumericValue(d.charAt(4)) + 6 * Character.getNumericValue(d.charAt(5))
                + 7 * Character.getNumericValue(d.charAt(6)) + 8 * Character.getNumericValue(d.charAt(7))
                + 9 * Character.getNumericValue(d.charAt(8));

        System.out.println(j);
        int k = Character.getNumericValue(d.charAt(1)) + 2 * Character.getNumericValue(d.charAt(2))
                + 3 * Character.getNumericValue(d.charAt(3)) + 4 * Character.getNumericValue(d.charAt(4))
                + 5 * Character.getNumericValue(d.charAt(5)) + 6 * Character.getNumericValue(d.charAt(6))
                + 7 * Character.getNumericValue(d.charAt(7)) + 8 * Character.getNumericValue(d.charAt(8))
                + 9 * Character.getNumericValue(d.charAt(9));

        // FIXME remova interacao com o usuário (nao se aplica)
        System.out.println(k);

        int dj = (j % 11) % 10;
        int dk = (k % 11) % 10;

        return dj == Character.getNumericValue(d.charAt(9)) && dk == Character.getNumericValue(d.charAt(10));

    }
}