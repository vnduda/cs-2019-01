package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosFibonacciTest {
    @Test
    void fibonacciCasoClassico() {
        assertEquals(55, AlgoritmosUtils.fibonacci(10));
    }

    @Test
    void fibonacciNIgualAZero() {
        assertEquals(0, AlgoritmosUtils.fibonacci(0));
    }

    @Test
    void fibonacciNIgualAUm() {
        assertEquals(1, AlgoritmosUtils.fibonacci(1));
    }

    @Test
    void fibonacciGrande() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.fibonacci(-1));
    }
}