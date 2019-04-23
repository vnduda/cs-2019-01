import java.text.DateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.zip.DataFormatException;

public class Ex03 {

    public static void main(String[] args) {
        System.out.println(DiaSemana(11, 4, 2019));
    } 

    public static int DiaSemana(int d, int m, int a) {
        
        int s;
        
        if (d < 1 || d > 31) {
            throw new IllegalArgumentException("Dia inválido");
        } 

        if (m < 1 || m > 12) {
            throw new IllegalArgumentException("Mês inválido");
        } 

        if (a < 1753) {
            throw new IllegalArgumentException("Ano inválido");
        }

        try {
            LocalDate.of(a, m, d);
        } catch (DateTimeException excecao) {
            final String data = String.format("%d/%d/%d", d, m, a);
            throw new IllegalArgumentException("data invalida: " + data);
        }
        
        if (m == 1 || m == 2) {
            m += 12;
            a -= 1;   
        }
        
        s = (d + (2 * m) + (3 * (m + 1) / 5) + a + (a / 4) - (a / 100) + (a / 400));
        
        return s % 7;
    }
}