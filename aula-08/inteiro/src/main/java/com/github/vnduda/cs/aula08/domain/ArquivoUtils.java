package com.github.vnduda.cs.aula08.domain;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public final class ArquivoUtils {

    public static byte[] leQuatroPrimeirosBytesDoArquivo(final String nomeArquivo) {
        try (FileInputStream fis = new FileInputStream(nomeArquivo);
            DataInputStream dis = new DataInputStream(fis)) {

            byte[] bytesLidos = new byte[4];
            dis.readFully(bytesLidos);
            return bytesLidos;
        } catch (IOException exp) {
            return null;
        }
    }
}