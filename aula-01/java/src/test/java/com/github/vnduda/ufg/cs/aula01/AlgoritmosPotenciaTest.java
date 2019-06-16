package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosPotenciaTest {
      
      @Test
      void potenciaCasoClassico() {
          assertEquals(4, Algoritmos.potencia(2, 2));
      }

      @Test
      void potenciaBasePequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.potencia(-1, 2));
      }

      @Test
      void potenciaExpoentePequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.potencia(2, -1));
      }
    }