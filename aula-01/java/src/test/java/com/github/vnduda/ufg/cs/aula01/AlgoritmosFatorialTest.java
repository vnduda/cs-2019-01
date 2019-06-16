package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosFatorialTest {
      
      @Test
      void fatorialCasoClassico() {
          assertEquals(6, AlgoritmosUtils.fatorial(3));
      }

       @Test
      void fatorialPequeno() {
          assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.fatorial(0));
      }
}