package com.github.vnduda.ufg.cs.aula01;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosCrivoEratostenesTest {
    @Test
    void crivoEratostenesCasoClassico() {
        int vetorCorreto[] = { 0, 0, 0, 0, 1, 0, 1 };
        int vetor[] = { 0, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(vetorCorreto, AlgoritmosUtils.crivoEratostenes(vetor));
    }

    @Test
    void crivoTamanhoInvalido() {
        int vetor[] = {};
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.crivoEratostenes(vetor));
    }

    @Test
    void crivoEratostenesArrayNull() {
        int vetor[] = null;
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.crivoEratostenes(vetor));
    }
}