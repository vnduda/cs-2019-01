package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosPropriedade153Test {
    @Test 
    public void propriedade153isTrue() {
        assertEquals(true, Algoritmos.propriedade153(153));
    }

     @Test 
    public void propriedade153isfalse() {
        assertEquals(false, Algoritmos.propriedade153(152));
    }

     @Test
    public void propriedade153Pequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade153(-1));
    }

     @Test
    public void propriedade153Grande() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade153(1000));
    }
}