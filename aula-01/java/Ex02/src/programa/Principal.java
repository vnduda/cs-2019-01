package programa;

public class Principal {
	public static boolean Propriedade153(int n){
		 int c = n/100; 
		 int du = n%100; 
		 int d = du/10;
		 int u = du%10;
		 
		 return (c*c*c)+(d*d*d)+(u*u*u) == n;
		
	}
	
	public static void main(String [] args){
		System.out.println(Propriedade153(153));
	}

}
