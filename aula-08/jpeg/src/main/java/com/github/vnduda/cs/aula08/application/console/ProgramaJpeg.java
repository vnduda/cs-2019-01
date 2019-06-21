package com.github.vnduda.cs.aula08.application.console;
import java.io.IOException;
import java.util.logging.Logger;
import com.github.vnduda.cs.aula08.domain.jpegUtils;

public class ProgramaJpeg {

    private static final Logger LOG =
            Logger.getLogger(ProgramaJpeg.class.getName());
    public static void main(final String[] args) throws IOException {

        if(args.length == 0) {
            throw new IllegalArgumentException("Entrada não fornecida");
        }

        LOG.info("verificando se arquivo é Jpeg");
        System.out.println(jpegUtils.isJpeg(args[0]));
    }
}