package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosRestoDivisaoTest {
      @Test
      void restoDivisaoCasoClassico() {
          assertEquals(0, Algoritmos.restoDivisao(6, 3));
      }

      @Test
      void restoDivisaoDivisorPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.restoDivisao(6, -1));
      }

      @Test
      void restoDivisaoDividendoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.restoDivisao(0, 3));
      }
    }