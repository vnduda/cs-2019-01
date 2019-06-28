package com.github.vnduda.cs.aula08.application.console;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class InterfaceUtilsTest {
    String getFileNameFromResourcesDir(String filename) {
        File file = new File(getClass().getResource("/" + filename).getFile());
        return file.getAbsolutePath();
    }

    @Test
    void casoClassico() {
        byte[] bytes = {(byte)0xCA, (byte)0xFE, (byte)0xBA, (byte)0xBE};
        assertEquals("CAFEBABE", InterfaceUtils.converteParaHexadecimal(bytes));
    }
}