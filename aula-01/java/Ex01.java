public class Ex01 {

    public static void main(String[] args) {
		System.out.println(propriedade3025(3025));
    }
    
	public static boolean propriedade3025(final int n) {
        
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

		final int i = n / 100;
		final int j = n % 100;

		return (i + j) * (i + j) == n;
    }
}
