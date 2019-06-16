package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosLogaritmoNaturalTest {
      @Test
      void logaritmoNaturalCasoClassico() {
          assertEquals(8.5, Algoritmos.logaritmoNatural(3, 2));
      }

      @Test
      void logaritmoNaturalPotenciaPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmoNatural(0, 3));
      }

      @Test
      void logaritmoNaturalPrecisaoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmoNatural(2, 1));
      }
    }