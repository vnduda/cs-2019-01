package main.java.com.github.vnduda.cs.aula08.domain;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class FormatoJpeg {

    public static final int PRIMEIRO_BYTE = 0xffd8ffe0;

    public static final int ULTIMO_BYTE = 0xffffffd9;

    public static final int TAM_LINHA = 1024;

    public static boolean verificaByte(final String enderecoArquivo) throws IOException {
        File test = new File(enderecoArquivo);

        FileInputStream fis = new FileInputStream(enderecoArquivo);
        DataInputStream dis = new DataInputStream(fis);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        int valorJpeg = dis.readInt();

        if (valorJpeg != PRIMEIRO_BYTE) {
            br.close();
            return false;
        }

        int lerBytes;
        int byteFinal = 0;
        byte[] data = new byte[TAM_LINHA];
        while ((lerBytes = fis.read(data)) != -1) {
            byteFinal = lerBytes -1;
        }

        if (data[byteFinal] == ULTIMO_BYTE) {
            br.close();
            return true;
        }
        else {
            br.close();
            return false;
        }
    }

    public static String seForJpeg(final boolean checkJpeg) {
        if (checkJpeg) {
            return "O arquivo é Jpeg";
        } else {
            return "O arquivo não é Jpeg";
        }
    }
}