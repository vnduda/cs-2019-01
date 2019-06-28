package com.github.vnduda.cs.aula08.domain;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Classe que verifica se arquivo é um Jpeg.
 */
public final class JpegUtils {

    /**
     * Primeiro byte em hexadecimal de um jpeg.
     */
    public static final String PRIMEIRO_BYTE = "ff";

    /**
     * Segundo byte em hexadecimal de um jpeg.
     */
    public static final String SEGUNDO_BYTE = "d8";

    /**
     * Terceiro byte em hexadecimal de um jpeg.
     */
    public static final String TERCEIRO_BYTE = "ff";

    /**
     * Quarto byte em hexadecimal de um jpeg.
     */
    public static final String QUARTO_BYTE = "d9";

    /**
     * Construtor para evitar instanciação.
     */
    private JpegUtils() {
    }

    /**
     * Verifica se arquivo é Jpeg.
     * @param enderecoArquivo arquivo que será verificado
     * @return true se for Jpeg e falso caso contrário
     * @throws IOException se entrada for inválida
     */
    public static boolean verificaJpeg(final String enderecoArquivo) throws IOException {

        final File checkFile = new File(enderecoArquivo);
        if (checkFile.length() == 0) {
            throw new IllegalArgumentException("Entrada inválida");
        }

        final InputStream is = Files.newInputStream(Paths.get(enderecoArquivo));
        final String primeiroByteHex = String.format("%02x", is.read());
        final String segundoByteHex = String.format("%02x", is.read());

        if (primeiroByteHex.equals(PRIMEIRO_BYTE) && segundoByteHex.equals(SEGUNDO_BYTE)) {
            String terceiroByteHex = "";
            String quartoByteHex = "";
            int aux = 0;

            while ((aux = is.read()) != -1) {
                terceiroByteHex = quartoByteHex;
                quartoByteHex = String.format("%02x", aux);
            }

            if (terceiroByteHex.equals(TERCEIRO_BYTE) & quartoByteHex.equals(QUARTO_BYTE)) {
                is.close();
                return true;
            }
        }

        is.close();
        return false;
    }
}
