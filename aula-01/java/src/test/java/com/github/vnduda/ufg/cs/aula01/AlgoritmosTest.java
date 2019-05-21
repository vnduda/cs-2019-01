package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosTest {

    /**
     * Teste para propriedade3025
     */

    @Test
    public void testpropriedade3025() {
        assertEquals(true, Algoritmos.propriedade3025(3025));
        assertEquals(false, Algoritmos.propriedade3025(3024));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade3025(-1));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade3025(10000));
    }

    /**
     * Teste para propriedade153
     */

     @Test 
     public void propriedade153isTrue() {
         assertEquals(true, Algoritmos.propriedade153(153));
         assertEquals(false, Algoritmos.propriedade153(152));
         assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade153(-1));
         assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade153(1000));
     }

     /**
      * Teste para dia da semana
      */

      @Test
      public void diaSemanaCasoClassico() {
          assertEquals(3, Algoritmos.diaSemana(16, 5, 2019));
          assertEquals(2, Algoritmos.diaSemana(16, 1, 2019));
          assertEquals(2, Algoritmos.diaSemana(16, 2, 2019));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(0, 5, 2019));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(32, 5, 2019));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(16, 0, 2019));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(16, 13, 2019));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaSemana(16, 5, 1752));
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

      public void produtoCasoClassicoMaior() {
          assertEquals(6, Algoritmos.produto(3, 2));
      }

      public void produtoCasoClassicoMenor() {
          assertEquals(2, Algoritmos.produto(1, 2));
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
          assertEquals(8.5, Algoritmos.logaritmoNatural(3, 2));
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
      public void razaoAureaKPequeno() {
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
      
      /**
      * Teste para Número Primo
      */

      @Test
      public void primoCasoClassico() {
          assertEquals(true, Algoritmos.primo(3));
      }

      @Test 
      public void primoPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.primo(0));
      }

      //TODO fazer teste para crivo

      /**
      * Teste para MDC
      */

      @Test
      public void mdcCasoClassico() {
          assertEquals(2, Algoritmos.MDC(4, 2));
      }

      @Test
      public void mdcPequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.MDC(2, -1));
      }

      @Test
      public void mdcNumeroMenorQueOutro() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.MDC(3, 6));
      }

      /**
      * Teste para MDC2
      */

      @Test
      public void mdc2CasoClassico() {
          assertEquals(2, Algoritmos.MDC2(4, 2));
      }

      @Test
      public void mdc2Pequeno() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.MDC2(2, -1));
      }

      @Test
      public void mdc2NumeroMenorQueOutro() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.MDC2(3, 6));
      }

      /**
      * Teste para Algoritmo de Horner
      */

      @Test
      public void hornerCasoClassico() {
          int vetor[] = {0, 1, 2};
          assertEquals(3, Algoritmos.horner(1, 2, vetor));
      }

      @Test
      public void hornerMenos() {
          int vetor[] = {0, 1, 2};
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.horner(1, 0, vetor));
      }

      @Test
      public void hornerArrayisNull() {
          int vetor[] = {};
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.horner(1, 0, vetor));
      }

      /**
      * Teste para Fibonacci
      */

      @Test
      public void fibonacciCasoClassico() {
          assertEquals(55, Algoritmos.fibonacci(10));
      }

      @Test
      public void fibonacciGrande() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.fibonacci(-1));
      }

      /**
      * Teste para CPF
      */

      @Test
      public void cpfCasoClassico() {
          assertEquals(true, Algoritmos.CPF("70039371158"));
      }

      @Test
      public void cpfGrande() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.CPF("123456789101"));
      }

      @Test
      public void cpfPequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.CPF("1234567891"));
      }

      /**
      * Teste para CPF2
      */

      @Test
      public void cpf2CasoClassico() {
          assertEquals(true, Algoritmos.CPF2("70039371158"));
      }

      @Test
      public void cpf2Grande() {
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.CPF2("123456789101"));
      }

      @Test
      public void cpf2Pequeno() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.CPF2("1234567891"));
      }
}