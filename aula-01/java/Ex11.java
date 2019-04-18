public class Ex11 {
    
    public static float RazaoAurea(float x, float y, float k) {
        
        if (x < 0) {
            throw new IllegalArgumentException("Intervalo de x inválido");
        }

        if (y < x) {
            throw new IllegalArgumentException("Variável y tem que ser maior que x");
        }

        if (k < 0) {
            throw new IllegalArgumentException("Intervalo de k inválido");
        }

        float c = y;
        float a = x;
        float i = 1;
        float t;

        while (k >= i) {
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c / a;
    }
}