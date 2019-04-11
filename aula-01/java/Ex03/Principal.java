
public class Principal{
    public static void main(String [] args){
        System.out.println(DiaSemana(11,4,2019));
} 
    public static int DiaSemana(int d, int m, int a){
        int s;

        try{
            if(d>=1 && d<=31 && m>=1 && m<=12 && a>1753){
                if(m==1 || m==2){
                    m+=12;
                    a-=1;   
                }
                s = (d + (2*m) + (3*(m+1)/5) + a + (a/4) - (a/100) + (a/400));
                return s%7;
            } else {
                throw new Exception("Erro");
            }

        }
        catch(Exception e){
            System.out.println("Erro");
        }
        return 0;
    }
}