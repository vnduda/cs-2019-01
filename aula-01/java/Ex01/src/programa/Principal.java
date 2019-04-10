package programa;

public class Principal {
	public static void main(String [] args){
		System.out.println(Propriedade3025(3025));
	}
	public static boolean Propriedade3025(int n){
		if(n>=0 || n<=9999){
			int i = n/100;
			int j = n%100;
			return (i+j)*(i+j) == n;
		}
	
		else 
			return false;
	}
	
}
