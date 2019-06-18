
package com.github.vnduda.cs.aula08.domain;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class ArquivoUtilsTest {

    @Test
    void impossibilidadeDeLerBytesResultaEmNull() {
        assertNull(ArquivoUtils.leQuatroPrimeirosBytesDoArquivo(null));
        assertNull(ArquivoUtils.leQuatroPrimeirosBytesDoArquivo(""));
    }

    @Test
    void bytecodesIniciamComCafeBabe() {
        final String arquivo = getFileNameFromResourcesDir("UmaClasse.class");
        byte[] bytes = ArquivoUtils.leQuatroPrimeirosBytesDoArquivo(arquivo);
        assertEquals((byte)0xCA, bytes[0]);
        assertEquals((byte)0xFE, bytes[1]);
        assertEquals((byte)0xBA, bytes[2]);
        assertEquals((byte)0xBE, bytes[3]);
    }

    String getFileNameFromResourcesDir(String filename) {
        File file = new File(getClass().getResource("/" + filename).getFile());
        return file.getAbsolutePath();
    }
}