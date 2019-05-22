package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosPrimoTest {
      @Test
      public void primoCasoClassico() {
          assertEquals(true, Algoritmos.primo(3));
      }

      @Test
      public void primoisFalse() {
          assertEquals(false, Algoritmos.primo(4));
      }

      @Test 
      public void primoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.primo(0));
      }
    }