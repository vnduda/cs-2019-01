package programa;

public class Principal {
	public static boolean Propriedade3025(int n){
		int i = n/100;
		int j = n%100;
		return (i+j)*(i+j) == n;
	}
	
	
	public static void main(String [] args){
		System.out.println(Propriedade3025(3025));
	}
}
