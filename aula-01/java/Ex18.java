public class Ex18 {

    public static int Horner(int x, int g, int a[]) {

        // TODO verificar se a é null
        // TODO verificar se a possui g elementos.
        // TODO analise se é necessário a variável g.

        if (g < 1) {
            throw new IllegalArgumentException("Intervalo da variável g inválido");
        }

        int p = a[g];
        int i = g - 1;

        while (i >= 0) {
            p = p * x + a[i];
            i = i - 1;
        }

        return p;
    }
}