package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosHornerTest {
      @Test
      public void hornerCasoClassico() {
          int vetor[] = {0, 1, 2};
          assertEquals(3, Algoritmos.horner(1, 2, vetor));
      }

      @Test
      public void hornerArrayisNull() {
          int vetor[] = null;
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.horner(1, 2, vetor));
      }

      @Test
      public void hornerMenos() {
          int vetor[] = {0, 1, 2};
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.horner(1, 0, vetor));
      }
    }