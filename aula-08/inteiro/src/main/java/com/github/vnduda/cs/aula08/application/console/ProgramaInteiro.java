package main.java.com.github.vnduda.cs.aula08.application.console;
import main.java.com.github.vnduda.cs.aula08.domain.SaidaArquivo;
import java.io.IOException;

public class ProgramaInteiro {
    public static void main(String[] args) {
        try {
            SaidaArquivo.imprimeHexadecimal(args[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}