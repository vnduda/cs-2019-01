package com.github.vnduda.cs.aula08.application.console;
import java.io.IOException;

import com.github.vnduda.cs.aula08.domain.EncontrePalavraUtils;

public final class ProgramaEncontre {

     /**
     * Construtor para evitar instanciação.
     */
    private ProgramaEncontre() {
    }

    public static void main(final String[] args) throws IOException {
        final int numParametros = 2;
        if (args.length < numParametros) {
            if (args.length == 0) {
                throw new IllegalArgumentException("Nenhuma entrada fornecida");
            }
            throw new IllegalArgumentException("Uma entrada não fornecida");
        }

        final String resultado = EncontrePalavraUtils.encontrePalavra(args[0], args[1]);
        System.out.println(resultado);
    }
}
