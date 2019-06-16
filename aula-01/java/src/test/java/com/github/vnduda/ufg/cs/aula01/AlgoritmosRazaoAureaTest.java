package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AlgoritmosRazaoAureaTest {
      @Test
      void razaoAureaCasoClassico() {
          assertEquals(1.5, AlgoritmosUtils.razaoAurea(2, 2, 2));
      }

      @Test
      void razaoAureaPrimeiroTermoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.razaoAurea(-1, 2, 2));
      }

      @Test
      void razaoAureaSegundoTermoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.razaoAurea(2, 0, 2));
      }

      @Test
      void razaoAureaPrecisaoPequena() {
          assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.razaoAurea(2, 2, -1));
      }
    }