package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosPiTest {
      
      @Test
      public void piCasoClassico() {
          assertEquals(3.3396825396825403, Algoritmos.algoritmoPi(5));
      }

      @Test
      public void piForadaFaixa() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.algoritmoPi(0));
      }
}