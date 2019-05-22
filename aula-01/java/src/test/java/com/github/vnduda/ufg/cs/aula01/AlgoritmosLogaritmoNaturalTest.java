package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosLogaritmoNaturalTest {
      @Test
      public void logaritmoNaturalCasoClassico() {
          assertEquals(8.5, Algoritmos.logaritmoNatural(3, 2));
      }

      @Test
      public void logaritmoNaturalPotenciaPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmoNatural(0, 3));
      }

      @Test
      public void logaritmoNaturalPrecisaoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmoNatural(2, 1));
      }
    }