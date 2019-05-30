package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmoscpfTest {
    @Test
    public void cpfCasoClassico() {
        assertEquals(true, Algoritmos.cpf("70039371158"));
    }

    @Test
    public void cpfisFalse() {
        assertEquals(false, Algoritmos.cpf("85813526010"));
        assertEquals(false, Algoritmos.cpf("85813526006"));
    }

    @Test
    public void cpfisPequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.cpf("123456789101"));
    }

    @Test
    public void cpfisGrande() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.cpf("1234567891"));
    }
}