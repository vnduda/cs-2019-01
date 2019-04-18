public class Ex02 {
    
    public static void main(String [] args) {
		System.out.println(Propriedade153(153));
    }
    
    public static boolean Propriedade153(int n) {
        
        if(n < 100 || n > 999) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

        int c = n / 100; 
		int du = n % 100; 
		int d = du / 10;
		int u = du % 10;
		 
		return (c * c * c) + (d * d * d) + (u * u * u) == n;
		
    }
    
}