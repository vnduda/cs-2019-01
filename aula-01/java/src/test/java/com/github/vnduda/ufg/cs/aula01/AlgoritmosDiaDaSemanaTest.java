package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosDiaDaSemanaTest {
    @Test
    void diaSemanaCasoClassico() {
        assertEquals(3, AlgoritmosUtils.diaSemana(16, 5, 2019));
        assertEquals(2, AlgoritmosUtils.diaSemana(16, 1, 2019));
        assertEquals(5, AlgoritmosUtils.diaSemana(16, 2, 2019));
    }

    @Test
    void diaSemanaDiaPequeno() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.diaSemana(0, 5, 2019));
    }

    @Test
    void diaSemanaDiaGrande() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.diaSemana(32, 5, 2019));
    }

    @Test
    void diaSemanaMesPequeno() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.diaSemana(16, 0, 2019));
    }

    @Test
    void diaSemanaMesGrande() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.diaSemana(16, 13, 2019));
    }

    @Test
    void diaSemanaAnoPequeno() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.diaSemana(16, 5, 1752));
    }

    @Test
    void diaSemanaForadaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.diaSemana(32, 2, 2019));
    }

    @Test
    void diaSemanaFevereiroFalso() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.diaSemana(32, 2, 2019));
    }

    @Test
    void diaSemanaAbrilFalso() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.diaSemana(31, 4, 2019));
    }
}