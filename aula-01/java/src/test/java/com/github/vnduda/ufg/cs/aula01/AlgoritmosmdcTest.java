package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosmdcTest {
    @Test
    void mdcCasoClassico() {
        assertEquals(2, AlgoritmosUtils.mdc(4, 2));
    }

    @Test
    void mdcPequeno() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.mdc(2, -1));
    }

    @Test
    void mdcNumeroMenorQueOutro() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.mdc(3, 6));
    }
}