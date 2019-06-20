package com.github.vnduda.cs.aula08.application.console;

/**
 * Classe com método para converter para hexadecimal.
 */
public final class InterfaceUtils {

    /**
     * Construtor para evitar instanciação.
     */
    private InterfaceUtils() {
    }

    /**
     * Método que faz conversão para hexadecimal.
     * @param bytes bytes a ser convertido
     * @return uma string de hexadecimal
     */
    public static String converteParaHexadecimal(byte[] bytes) {

        StringBuilder sb = new StringBuilder();
        for (byte umByte : bytes) {
            sb.append(String.format("%02X", umByte));
        }

        return sb.toString();        
    }
}