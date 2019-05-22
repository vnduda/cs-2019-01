package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosFatorialTest {
      
      @Test
      public void fatorialCasoClassico() {
          assertEquals(6, Algoritmos.fatorial(3));
      }

       @Test
      public void fatorialPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.fatorial(0));
      }
}