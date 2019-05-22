package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosRestoDivisaoTest {
      @Test
      public void restoDivisaoCasoClassico() {
          assertEquals(0, Algoritmos.restoDivisao(6, 3));
      }

      @Test
      public void restoDivisaoDivisorPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.restoDivisao(6, -1));
      }

      @Test
      public void restoDivisaoDividendoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.restoDivisao(0, 3));
      }
    }