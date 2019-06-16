package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosProdutoTest {
    @Test
    void produtoCasoClassico() {
        assertEquals(4, AlgoritmosUtils.produto(2, 2));
    }

    @Test
    void produtoCasoClassico2() {
        assertEquals(6, AlgoritmosUtils.produto(3, 2));
    }

    @Test
    void produtoCasoClassico3() {
        assertEquals(2, AlgoritmosUtils.produto(1, 2));
    }

    @Test
    void produtoMultiplicandoPequeno() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.produto(-1, 2));
    }

    @Test
    void produtoMultiplicadorPequeno() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.produto(2, -1));
    }
}