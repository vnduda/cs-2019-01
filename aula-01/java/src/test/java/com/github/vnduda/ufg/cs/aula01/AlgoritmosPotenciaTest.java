package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosPotenciaTest {
      
      @Test
      public void potenciaCasoClassico() {
          assertEquals(4, Algoritmos.potencia(2, 2));
      }

      @Test
      public void potenciaBasePequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.potencia(-1, 2));
      }

      @Test
      public void potenciaExpoentePequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.potencia(2, -1));
      }
    }