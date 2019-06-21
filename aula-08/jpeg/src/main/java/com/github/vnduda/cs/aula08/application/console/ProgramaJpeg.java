package com.github.vnduda.cs.aula08.application.console;
import java.io.IOException;
import java.util.logging.Logger;
import com.github.vnduda.cs.aula08.domain.JpegUtils;

/**
 * Programa principal.
 */
public final class ProgramaJpeg {

    /**
     * Substituto do system.out para mensagens para o usuário.
     */
    private static final Logger LOGGER =
            Logger.getLogger(ProgramaJpeg.class.getName());

    /**
    * Construtor para evitar instanciação.
    */
    private ProgramaJpeg() {
    }

    /**
     * Programa para execução e filtragem de entradas inválidas.
     * @param args caminho do arquivo
     * @throws IOException caso entrada seja inválida
     */
    public static void main(final String[] args) throws IOException {

        if (args.length == 0) {
            throw new IllegalArgumentException("Entrada não fornecida");
        }

        LOGGER.info("verificando se arquivo é Jpeg");
        System.out.println(JpegUtils.verificaJpeg(args[0]));
    }
}
