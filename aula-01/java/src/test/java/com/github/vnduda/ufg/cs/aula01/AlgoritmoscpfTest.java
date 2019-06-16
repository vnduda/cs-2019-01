package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmoscpfTest {
    @Test
    void cpfCasoClassico() {
        assertEquals(true, AlgoritmosUtils.cpf("70039371158"));
    }

    @Test
    void cpfisFalse() {
        assertEquals(false, AlgoritmosUtils.cpf("85813526010"));
        assertEquals(false, AlgoritmosUtils.cpf("85813526006"));
    }

    @Test
    void cpfisPequeno() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.cpf("123456789101"));
    }

    @Test
    void cpfisGrande() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.cpf("8581352601"));
    }
}