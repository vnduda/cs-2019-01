package com.github.vnduda.cs.aula08.domain;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.File;

import com.github.vnduda.cs.aula08.domain.JpegUtils;

public final class JpegTest {
    private String getFileName(String string) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(string).getFile());

        String absolutePath = file.getAbsolutePath();

        return absolutePath;
    }

    @Test
    public void CasoClassico() throws IOException {
        assertTrue(JpegUtils.verificaJpeg(getFileName("cat.jpeg")));
    }

    @Test
    public void naoEjpeg() throws IOException {
        assertFalse(JpegUtils.verificaJpeg(getFileName("arquivo.txt")));
    }

    @Test
    public void naoEjpegPorArquivoVazio() throws IOException {
        assertThrows(IllegalArgumentException.class,
            () -> JpegUtils.verificaJpeg(getFileName("arquivo-vazio.txt")));
    }
}