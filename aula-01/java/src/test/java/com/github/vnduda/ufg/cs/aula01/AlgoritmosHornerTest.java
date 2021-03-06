package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosHornerTest {
      @Test
      void hornerCasoClassico() {
          int vetor[] = {0, 1, 2};
          assertEquals(3, AlgoritmosUtils.horner(1, 2, vetor));
      }

      @Test
      void hornerArrayisNull() {
          int vetor[] = null;
          assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.horner(1, 2, vetor));
      }

      @Test
      void hornerMenos() {
          int vetor[] = {0, 1, 2};
          assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.horner(1, 0, vetor));
      }
    }