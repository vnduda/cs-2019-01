package com.github.vnduda.cs.aula08.application.console;

import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProgramaEncontreTest {

    private String getFilename(String string) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(string).getFile());

        String absolutePath = file.getAbsolutePath();

        return absolutePath;
    }

    @Test
    void casoClassico() throws IOException {
        String[] args = {getFilename("fraseParaTeste.txt"), "ola"};
        ProgramaEncontre.main(args);
    }

    @Test
    void testeParaExcecaoPorArquivoVazio() throws IOException {
        String[] teste1 = {getFilename("arquivoVazio.txt"), "oi"};
        assertThrows(IllegalArgumentException.class, () -> ProgramaEncontre.main(teste1));
    }

    @Test
    void excecaoPorFaltaDeArgumentos() throws IOException {
        String[] teste2 = {};
        assertThrows(IllegalArgumentException.class, () -> ProgramaEncontre.main(teste2));
    }

    @Test
    void excecaoPorFaltaDeUmArgumento() throws IOException {
        String[] teste3 = {getFilename("arquivoVazio.txt")};
        assertThrows(IllegalArgumentException.class, () ->
        ProgramaEncontre.main(teste3));
    }
}