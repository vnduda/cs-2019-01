package main.java.com.github.vnduda.cs.aula08;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public final class OutputArquivo {

    public static void imprimeHexadecimal(String nomeArquivo) throws IOException {
        FileInputStream fis = new FileInputStream(nomeArquivo);
        DataInputStream dis = new DataInputStream(fis);

        int valor = dis.readInt();
        System.out.println(Integer.toHexString(valor));

    }
}