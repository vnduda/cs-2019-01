package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosmdcTest {
    @Test
    public void mdcCasoClassico() {
        assertEquals(2, Algoritmos.mdc(4, 2));
    }

    @Test
    public void mdcPequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.mdc(2, -1));
    }

    @Test
    public void mdcNumeroMenorQueOutro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.mdc(3, 6));
    }
}