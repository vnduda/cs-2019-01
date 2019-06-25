package com.github.vnduda.cs.aula8.domain;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EncontreTest {

    private String getFilename(String string) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(string).getFile());

        String absolutePath = file.getAbsolutePath();

        return absolutePath;
    }

    @Test
    public void ConteOcorrencias() {
        assertEquals(3, EncontrePalavraUtils.conteOcorrencias("alo",
                "alo, tudo bom alo alo"));
    }

    @Test
    public void ExcecaoPorArquivoVazio() {
        assertThrows(IllegalArgumentException.class, () -> 
            EncontrePalavraUtils.encontrePalavra(getFilename("arquivoVazio.txt"), "alo"));
    }

    @Test
    public void EncontrePalavraTest() throws IOException {
        String teste = "Encontradas: 3\n" +
                "L1 C10: tudo bem ola\n" +
                "L3 C1:  ola ola\n";

        assertEquals(teste, EncontrePalavraUtils.encontrePalavra(
                getFilename("frase.txt"), "ola"));

        String teste2 = "Encontradas: 0\n";
        assertEquals(teste2, EncontrePalavraUtils.encontrePalavra(
                getFilename("frase.txt"), "oi"));
    }

}