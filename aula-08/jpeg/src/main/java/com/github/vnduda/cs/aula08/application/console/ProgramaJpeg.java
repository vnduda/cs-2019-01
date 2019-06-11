package main.java.com.github.vnduda.cs.aula08.application.console;
import java.io.IOException;
import main.java.com.github.vnduda.cs.aula08.domain.FormatoJpeg;

public class ProgramaJpeg {
    public static void main(String[] args) {
        System.out.println(
            Jpeg.seJpeg(FormatoJpeg.verificaByte(args[0])));
    }
}