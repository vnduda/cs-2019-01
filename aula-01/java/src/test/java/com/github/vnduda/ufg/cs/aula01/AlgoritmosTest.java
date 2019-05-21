package com.github.vnduda.ufg.cs.aula01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosTest {

    /**
     * Teste para propriedade3025
     */

    @Test
    public void testPropriedade3025() {
        assertEquals(true, Algoritmos.propriedade3025(3025));
        assertEquals(false, Algoritmos.propriedade3025(3024));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade3025(-1));
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade3025(10000));
    }

    /**
     * Teste para propriedade153
     */

     @Test 
     public void testPropriedade153() {
         assertEquals(true, Algoritmos.propriedade153(153));
         assertEquals(false, Algoritmos.propriedade153(152));
         assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade153(-1));
         assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade153(1000));
     }

     /**
      * Teste para dia da semana
      */

      @Test
      public void testDiaSemana() {
          assertEquals(3, Algoritmos.diaSemana(16, 5, 2019));
          assertEquals(2, Algoritmos.diaSemana(16, 1, 2019));
          assertEquals(5, Algoritmos.diaSemana(16, 2, 2019));
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
      public void testRestoDivisao() {
          assertEquals(0, Algoritmos.restoDivisao(6, 3));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.restoDivisao(6, -1));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.restoDivisao(0, 3));
      }

      /**
      * Teste para Soma de Naturais
      */

      @Test
      public void testSomaNaturais() {
          assertEquals(6, Algoritmos.somaNaturais(3));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.somaNaturais(0));
      }

      /**
      * Teste para Fatorial
      */

      @Test
      public void testFatorial() {
          assertEquals(6, Algoritmos.fatorial(3));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.fatorial(0));
      }

      /**
      * Teste para Produto
      */

      @Test
      public void testProduto() {
          assertEquals(4, Algoritmos.produto(2, 2));
          assertEquals(6, Algoritmos.produto(3, 2));
          assertEquals(2, Algoritmos.produto(1, 2));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.produto(-1, 2));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.produto(2, -1));
      }

      /**
      * Teste para Potencia
      */

      @Test
      public void testPotencia() {
          assertEquals(4, Algoritmos.potencia(2, 2));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.potencia(-1, 2));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.potencia(2, -1));
      }

      /**
      * Teste para Pi
      */

      @Test
      public void testPi() {
          assertEquals(3.3396825396825403, Algoritmos.pi(5));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.pi(0));
      }

      /**
      * Teste para Logaritmo Natural
      */

      @Test
      public void testLogaritmoNatural() {
          assertEquals(8.5, Algoritmos.logaritmoNatural(3, 2));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmoNatural(0, 3));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmoNatural(2, 1));
      }

      /**
      * Teste para Razão Áurea
      */

      @Test
      public void testRazaoAurea() {
          assertEquals(1.5, Algoritmos.razaoAurea(2, 2, 2));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(-1, 2, 2));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(2, 0, 2));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(3, 2, -1));
      }

      /**
      * Teste para Quadrado Perfeito
      */

      @Test
      public void testQuadradoPerfeito() {
          assertEquals(true, Algoritmos.quadradoPerfeito(4));
          assertEquals(false, Algoritmos.quadradoPerfeito(5));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.quadradoPerfeito(0));
      }

      /**
      * Teste para Raiz
      */

      @Test
      public void testRaiz() {
          assertEquals(2, Algoritmos.raiz(4, 25));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.raiz(-1, 2));
      }
      
      /**
      * Teste para Número Primo
      */

      @Test
      public void testPrimo() {
          assertEquals(true, Algoritmos.primo(3));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.primo(0));
      }

      //TODO fazer teste para crivo

      /**
      * Teste para MDC
      */

      @Test
      public void testMdc() {
          assertEquals(2, Algoritmos.MDC(4, 2));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.MDC(2, -1));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.MDC(3, 6));
      }

      /**
      * Teste para MDC2
      */

      @Test
      public void testMdc2() {
          assertEquals(2, Algoritmos.MDC2(4, 2));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.MDC2(2, -1));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.MDC2(3, 6));
      }

      /**
      * Teste para Algoritmo de Horner
      */

      @Test
      public void testHorner() {
          int vetor[] = {0, 1, 2};
          assertEquals(3, Algoritmos.horner(1, 2, vetor));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.horner(1, 0, vetor));
          int vetor2[] = {};
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.horner(1, 0, vetor));
      }

      /**
      * Teste para Fibonacci
      */

      @Test
      public void testFibonacci() {
          assertEquals(55, Algoritmos.fibonacci(10));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.fibonacci(-1));
      }

      /**
      * Teste para CPF
      */

      @Test
      public void testCpf() {
          assertEquals(true, Algoritmos.CPF("70039371158"));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.CPF("123456789101"));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.CPF("1234567891"));
      }

      /**
      * Teste para CPF2
      */

      @Test
      public void testCpf2() {
          assertEquals(true, Algoritmos.CPF2("70039371158"));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.CPF2("123456789101"));
          assertThrows(IllegalArgumentException.class, () -> Algoritmos.CPF2("1234567891"));
      }

}