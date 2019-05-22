package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosMDC2Test {
      @Test
      public void mdc2CasoClassico() {
          assertEquals(2, Algoritmos.MDC2(4, 2));
      }

      @Test
      public void mdc2LacoIfCobertura() {
          assertEquals(2, Algoritmos.MDC2(54, 10));
      }

      @Test
      public void mdc2Pequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.MDC2(2, -1));
      }

      @Test
      public void mdc2NumeroMenorQueOutro() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.MDC2(3, 6));
      }
    }