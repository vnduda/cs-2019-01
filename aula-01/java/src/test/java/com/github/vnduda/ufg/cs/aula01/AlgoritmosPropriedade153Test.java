package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosPropriedade153Test {
    @Test 
    void propriedade153isTrue() {
        assertEquals(true, AlgoritmosUtils.propriedade153(153));
    }

     @Test 
    void propriedade153isfalse() {
        assertEquals(false, AlgoritmosUtils.propriedade153(152));
    }

     @Test
    void propriedade153Pequeno() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.propriedade153(-1));
    }

     @Test
    void propriedade153Grande() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.propriedade153(1000));
    }
}