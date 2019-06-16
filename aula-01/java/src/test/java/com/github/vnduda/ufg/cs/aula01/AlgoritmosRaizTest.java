package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosRaizTest {
     
      @Test
      void raizCasoClassico() {
          assertEquals(2, Algoritmos.raiz(4, 25));
      }

      @Test
      void raizBasePequena() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.raiz(-1, 2));
      }
    }