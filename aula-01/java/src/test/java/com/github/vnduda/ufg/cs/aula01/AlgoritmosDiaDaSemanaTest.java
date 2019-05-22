package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosDiaDaSemanaTest {
    @Test
    public void diaSemanaCasoClassico() {
        assertEquals(4, Algoritmos.diaSemana(16, 5, 2019));
        assertEquals(2, Algoritmos.diaSemana(16, 1, 2019));
        assertEquals(5, Algoritmos.diaSemana(16, 2, 2019));
    }

    @Test
    public void diaSemanaDiaPequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(0, 5, 2019));
    }

    @Test
    public void diaSemanaDiaGrande() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(32, 5, 2019));
    }

    @Test
    public void diaSemanaMesPequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(16, 0, 2019));
    }

    @Test
    public void diaSemanaMesGrande() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(16, 13, 2019));
    }

    @Test
    public void diaSemanaAnoPequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(16, 5, 1752));
    }

    @Test
    public void diaSemanaForadaFaixa() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(32, 2, 2019));
    }

    @Test
    public void diaSemanaFevereiroFalso() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(32, 2, 2019));
    }
}