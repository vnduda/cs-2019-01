package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosSomaNaturaisTest {
     @Test
      public void somaNaturaisCasoClassico() {
          assertEquals(6, Algoritmos.somaNaturais(3));
      }

      @Test
      public void somaNaturaisPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.somaNaturais(0));
      }
}