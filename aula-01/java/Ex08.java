public class Ex08 {

    public int Produto(int x, int y) {

        if(x < 0) {
            throw new IllegalArgumentException("Intervalo de x inválido");
        }

        if(y < 0) {
            throw new IllegalArgumentException("Intervalo de y inválido");
        }

        int i = 1;
        int potencia = 1;

        while(i <= y) {
            potencia = Produto(potencia, x);
            i = i + 1;
        }

        return potencia;

}