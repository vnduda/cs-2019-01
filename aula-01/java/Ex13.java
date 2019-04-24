public class Ex13 {

    public static float raiz(float n, float i) {

        if (n < 0) {
            throw new IllegalArgumentException("Intervalo da variável n inválido");
        }

        float r = 1;

        while (i >= 0) {
            r = (r + n / r) / 2;
            i = i - 1;
        }

        return r;
    }
}