package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Algoritmoscpf2Test {
    @Test
    public void cpfCasoClassico() {
        assertEquals(true, Algoritmos.cpf2("70039371158"));
    }

    @Test
    public void cpfisFalse() {
        assertEquals(false, Algoritmos.cpf2("85813526010"));
        assertEquals(false, Algoritmos.cpf2("85813526006"));
    }

    @Test
    public void cpfisPequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.cpf2("123456789101"));
    }

    @Test
    public void cpfisGrande() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.cpf2("1234567891"));
    }
}