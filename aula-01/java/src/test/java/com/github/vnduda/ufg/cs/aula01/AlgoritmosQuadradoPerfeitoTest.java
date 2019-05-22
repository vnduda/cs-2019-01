package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosQuadradoPerfeitoTest {
      @Test
      public void quadradoPerfeitoCasoClassico() {
          assertEquals(true, Algoritmos.quadradoPerfeito(4));
      }

      @Test
      public void quadradoPerfeitoisFalse() {
          assertEquals(false, Algoritmos.quadradoPerfeito(5));
      }

      @Test
      public void quadradoPerfeitoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.quadradoPerfeito(0));
      }
    }