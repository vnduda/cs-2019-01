package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosMDCTest {
    @Test
    public void mdcCasoClassico() {
        assertEquals(2, Algoritmos.MDC(4, 2));
    }

    @Test
    public void mdcPequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.MDC(2, -1));
    }

    @Test
    public void mdcNumeroMenorQueOutro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.MDC(3, 6));
    }
}