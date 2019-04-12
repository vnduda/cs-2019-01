public class Principal {
    public static void main(String[] args) {
        System.out.println(RestoDivisao(3, 8));
    }

    public static int RestoDivisao(int x, int y) {
        int s;
        if ( y<0 || x<=0){
            throw new IllegalArgumentException();
        }

        
        s = x;
        while (y <= s) {
            s = s - y;
        }
        return s;
        
        }
    }

