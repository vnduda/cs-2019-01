package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosProdutoTest {
    @Test
    public void produtoCasoClassico() {
        assertEquals(4, Algoritmos.produto(2, 2));
    }

    @Test
    public void produtoCasoClassico2() {
        assertEquals(6, Algoritmos.produto(3, 2));
    }

    @Test
    public void produtoCasoClassico3() {
        assertEquals(2, Algoritmos.produto(1, 2));
    }

    @Test
    public void produtoMultiplicandoPequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.produto(-1, 2));
    }

    @Test
    public void produtoMultiplicadorPequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.produto(2, -1));
    }
}