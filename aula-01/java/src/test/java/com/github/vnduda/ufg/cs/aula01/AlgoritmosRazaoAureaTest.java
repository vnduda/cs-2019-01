package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosRazaoAureaTest {
      @Test
      public void razaoAureaCasoClassico() {
          assertEquals(1.5, Algoritmos.razaoAurea(2, 2, 2));
      }

      @Test
      public void razaoAureaPrimeiroTermoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(-1, 2, 2));
      }

      @Test
      public void razaoAureaSegundoTermoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(2, 0, 2));
      }

      @Test
      public void razaoAureaPrecisaoPequena() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(2, 2, -1));
      }
    }