public class Ex01 {

    public static void main(String[] args) {
		System.out.println(propriedade3025(3025));
    }
    
	public static boolean propriedade3025(int n) {
        
        if (n < 0) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

        if (n > 9999) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }
        
		int i = n / 100;
		int j = n % 100;
		return (i + j) * (i + j) == n;
		
    }
			
}
