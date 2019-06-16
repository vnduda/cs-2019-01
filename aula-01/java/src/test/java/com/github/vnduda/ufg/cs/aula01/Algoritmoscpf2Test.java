package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class Algoritmoscpf2Test {
    @Test
    void cpfCasoClassico() {
        assertEquals(true, AlgoritmosUtils.cpf2("70039371158"));
    }

    @Test
    void cpfisFalse() {
        assertEquals(false, AlgoritmosUtils.cpf2("85813526010"));
        assertEquals(false, AlgoritmosUtils.cpf2("85813526006"));
    }

    @Test
    void cpfisPequeno() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.cpf2("123456789101"));
    }

    @Test
    void cpfisGrande() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.cpf2("1234567891"));
    }
}