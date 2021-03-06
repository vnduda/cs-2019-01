package com.github.vnduda.cs.aula08.application.console;

import com.github.vnduda.cs.aula08.domain.ArquivoUtils;

/**
 * Programa principal.
 */
public final class ProgramaInteiro {

    /**
     * Construtor para evitar instanciação.
     */
    private ProgramaInteiro() {
    }

    /**
     * Programa para execução e filtragem de entradas inválidas.
     * @param args caminho do arquivo
     */
    public static void main(final String[] args) {
        final int aux = 1;
        if (args.length != aux) {
            System.out.println("USAGE: mostrar como usar corretamente a aplicacao.");
            System.exit(1);
        }

        final byte[] quatroPrimeiros =
            ArquivoUtils.leQuatroPrimeirosBytesDoArquivo(args[0]);

        if (quatroPrimeiros == null) {
            System.out.println("Nao foi possivel ler bytes do arquivo.");
            System.exit(2);
        }

        final String hexa = InterfaceUtils.converteParaHexadecimal(quatroPrimeiros);
        System.out.println(hexa);
    }
}
