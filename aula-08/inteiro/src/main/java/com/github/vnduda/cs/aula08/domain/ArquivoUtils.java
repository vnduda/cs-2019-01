package com.github.vnduda.cs.aula08.domain;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Classe para ler os quatro primeiros bytes do arquivo.
 */
public final class ArquivoUtils {

    /**
     * Construtor para evitar instanciação.
     */
    private ArquivoUtils() {
    }

    /**
     * Método para ler os quatro primeiros bytes do arquivo.
     * @param nomeArquivo arquivo a ser lido
     * @return bytes lidos
     */
    public static byte[] leQuatroPrimeirosBytesDoArquivo(final String nomeArquivo) {
        if (nomeArquivo == null) {
            return null;            
        }
        
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