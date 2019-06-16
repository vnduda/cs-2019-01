package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosQuadradoPerfeitoTest {
      @Test
      void quadradoPerfeitoCasoClassico() {
          assertEquals(true, AlgoritmosUtils.quadradoPerfeito(4));
      }

      @Test
      void quadradoPerfeitoisFalse() {
          assertEquals(false, AlgoritmosUtils.quadradoPerfeito(5));
      }

      @Test
      void quadradoPerfeitoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.quadradoPerfeito(0));
      }
    }