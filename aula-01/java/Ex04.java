public class Ex04 {

    public static void main(String[] args) {
        System.out.println(RestoDivisao(3, 8));
    }

    public static int RestoDivisao(int x, int y) {
        
        int s;
        
        if (y < 0) {
            throw new IllegalArgumentException("Valor de y inválido");
        }

        if (x <= 0) {
            throw new IllegalArgumentException("Valor de x inválido");
        }
        
        s = x;

        while (s >= y) {
            s = s - y;
        }

        return s;
        
    }
        
}
