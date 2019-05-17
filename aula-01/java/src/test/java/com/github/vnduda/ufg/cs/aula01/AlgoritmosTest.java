package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosTest {

    /**
     * Teste para propriedade3025
     */
    @Test
    public void propriedade3025isTrue() {
        assertEquals(true, Algoritmos.propriedade3025(3025));
    }

    @Test
    public void propriedade3025isfalse() {
        assertEquals(false, Algoritmos.propriedade3025(3024));
    }

    @Test
    public void propriedade3025Pequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade3025(-1));
    }

    @Test
    public void propriedade3025Grande() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade3025(10000));
    }

    /**
     * Teste para propriedade153
     */
     @Test 
     public void propriedade153isTrue() {
         assertEquals(true, Algoritmos.propriedade153(153));
     }

     @Test 
     public void propriedade153isfalse() {
         assertEquals(false, Algoritmos.propriedade153(152));
     }

     @Test
     public void propriedade153Pequeno() {
         assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade153(-1));
     }

     @Test
     public void propriedade153Grande() {
         assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade153(1000));
     }

     /**
      * Teste para dia da semana
      */
      @Test
      public void diaSemanaCasoClassico() {
          assertEquals(4, Algoritmos.diaSemana(16, 5, 2019));
      }

      @Test
      public void diaSemanaDiaPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(0, 5, 2019));
      }

      @Test
      public void diaSemanaDiaGrande() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(32, 5, 2019));
      }

      @Test
      public void diaSemanaMesPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(16, 0, 2019));
      }

      @Test
      public void diaSemanaMesGrande() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(16, 13, 2019));
      }

      @Test
      public void diaSemanaAnoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(16, 5, 1752));
      }

      @Test
      public void diaSemanaForadaFaixa() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(32, 2, 2019));
      }

      /**
      * Teste para Resto da divisão
      */

      @Test
      public void restoDivisaoCasoClassico() {
          assertEquals(0, Algoritmos.restoDivisao(6, 3));
      }

      @Test
      public void restoDivisaoDivisorPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.restoDivisao(6, -1));
      }

      @Test
      public void restoDivisaoDividendoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.restoDivisao(0, 3));
      }

      /**
      * Teste para Soma de Naturais
      */

      @Test
      public void somaNaturaisCasoClassico() {
          assertEquals(6, Algoritmos.somaNaturais(3));
      }

      @Test
      public void somaNaturaisPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.somaNaturais(0));
      }

      /**
      * Teste para Fatorial
      */

      @Test
      public void fatorialCasoClassico() {
          assertEquals(6, Algoritmos.fatorial(3));
      }

      @Test
      public void fatorialPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.fatorial(0));
      }

      /**
      * Teste para Produto
      */

      @Test
      public void produtoCasoClassico() {
          assertEquals(4, Algoritmos.produto(2, 2));
      }

      @Test
      public void produtoMultiplicandoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.produto(-1, 2));
      }

      @Test
      public void produtoMultiplicadorPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.produto(2, -1));
      }

      /**
      * Teste para Potencia
      */

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

      /**
      * Teste para Pi
      */

      @Test
      public void piCasoClassico() {
          assertEquals(3.3396825396825403, Algoritmos.pi(5));
      }

      @Test
      public void piForadaFaixa() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.pi(0));
      }

      /**
      * Teste para Logaritmo Natural
      */

      @Test
      public void logaritmoNaturalCasoClassico() {
          assertEquals(243, Algoritmos.logaritmoNatural(3, 3));
      }

      @Test
      public void logaritmoNaturalPotenciaPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmoNatural(0, 3));
      }

      @Test
      public void logaritmoNaturalPrecisaoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmoNatural(2, 1));
      }

      /**
      * Teste para Razão Áurea
      */

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
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(3, 2, -1));
      }

      /**
      * Teste para Quadrado Perfeito
      */

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

      /**
      * Teste para Raiz
      */

      @Test
      public void raizCasoClassico() {
          assertEquals(2, Algoritmos.raiz(4, 25));
      }

      @Test
      public void raizBasePequena() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.raiz(-1, 2));
      }
}