package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosPiTest {
      
      @Test
      void piCasoClassico() {
          assertEquals(3.3396825396825403, AlgoritmosUtils.algoritmoPi(5));
      }

      @Test
      void piForadaFaixa() {
          assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.algoritmoPi(0));
      }
}