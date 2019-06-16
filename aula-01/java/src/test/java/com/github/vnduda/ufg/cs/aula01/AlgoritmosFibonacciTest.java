package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosFibonacciTest {
    @Test
    void fibonacciCasoClassico() {
        assertEquals(55, Algoritmos.fibonacci(10));
    }

    @Test
    void fibonacciNIgualAZero() {
        assertEquals(0, Algoritmos.fibonacci(0));
    }

    @Test
    void fibonacciNIgualAUm() {
        assertEquals(1, Algoritmos.fibonacci(1));
    }

    @Test
    void fibonacciGrande() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.fibonacci(-1));
    }
}