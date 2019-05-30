package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Algoritmosmdc2Test {
      @Test
      public void mdc2CasoClassico() {
          assertEquals(2, Algoritmos.mdc2(4, 2));
      }

      @Test
      public void mdc2LacoIfCobertura() {
          assertEquals(2, Algoritmos.mdc2(54, 10));
      }

      @Test
      public void mdc2Pequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.mdc2(2, -1));
      }

      @Test
      public void mdc2NumeroMenorQueOutro() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.mdc2(3, 6));
      }
    }