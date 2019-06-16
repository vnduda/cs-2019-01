package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosPrimoTest {
      @Test
      void primoCasoClassico() {
          assertEquals(true, Algoritmos.primo(3));
      }

      @Test
      void primoisFalse() {
          assertEquals(false, Algoritmos.primo(4));
      }

      @Test 
      void primoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.primo(0));
      }
    }