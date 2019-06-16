package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosPropriedade3025Test {

    @Test
    void propriedade3025isTrue() {
        assertEquals(true, Algoritmos.propriedade3025(3025));
    }

     @Test
    void propriedade3025isfalse() {
        assertEquals(false, Algoritmos.propriedade3025(3024));
    }

     @Test
    void propriedade3025Pequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade3025(-1));
    }

     @Test
    void propriedade3025Grande() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade3025(10000));
    }
}