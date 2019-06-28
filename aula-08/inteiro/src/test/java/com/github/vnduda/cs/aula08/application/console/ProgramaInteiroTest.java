package com.github.vnduda.cs.aula08.application.console;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class ArquivoUtilsTest {

    @Test 
    void casoClassico() {
        final String[] args = {"UmaClasse.class"};
        assertNotNull(ProgramaInteiro.main(args));
    }

    @Test
    void testeMaisDeUmParametro() {
        final String[] args = {"UmaClasse.class", ""};
        assertNotNull(ProgramaInteiro.main(args));
    }

    @Test
    void testeArquivoVazio() {
        final String[] args = {""};
        assertNotNull(ProgramaInteiro.main(args));
    }
}
