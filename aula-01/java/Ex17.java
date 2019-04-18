public class Ex17 {

    public static int MDC2(int a, int b) {

        if(a < b) {
            throw new IllegalArgumentException("Variável a deve ser maior que b");
        }

        if(b < 0) {
            throw new IllegalArgumentException("Intervalo da variável b inválido");
        }

        while(a != b) {
            if(a > b) {
                a = a - b;
            } 
            else {
                b = b - a;
            }
        }

        return a;
    }
}