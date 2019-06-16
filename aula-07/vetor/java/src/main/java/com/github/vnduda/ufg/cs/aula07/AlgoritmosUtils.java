package com.github.vnduda.ufg.cs.aula07;

/**
 * Implementação de algoritmos usando vetores.
 */
public final class AlgoritmosUtils {
    /**
     * Para cobertura.
     */
    private AlgoritmosUtils() {

    }

    /**
     * Função para encontrar a menor temperatura em um vetor.
     * @param temperatura vetor com as temperaturas
     * @return a menor temperatura
     */
    public static double menorTemperatura(final double[] temperatura) {
        double menorTemperatura = temperatura[0];

        for (int contador = 1; contador < temperatura.length; contador++) {
            if (menorTemperatura > temperatura[contador]) {
                menorTemperatura = temperatura[contador];
            }
        }
        return menorTemperatura;
    }

    /**
     * Função que retorna soma de números impares em um vetor.
     * @param numeros vetor contendo valores inteiros
     * @return a soma dos números impares do vetor
     */
    public static int numerosImpares(final int[] numeros) {
        int soma = 0;
        final int aux = 1;
        for (int contador = 0; contador < numeros.length; contador++) {
            if (numeros[contador] % 2 == aux) {
                soma += numeros[contador];
            }
        }
        return soma;
    }

    /**
     * Função para encontrar elementos iguais em um vetor.
     * @param numeros vetor com números que serão comparados
     * @param comparador valor de comparação com vetor
     * @return A quantidade de elementos iguais
     */
    public static int quantidadeElementosIguais(final double[] numeros, final double comparador) {
        int elementosIguais = 0;
        for (int contador = 0; contador < numeros.length; contador++) {
            if (numeros[contador] == comparador) {
                elementosIguais++;
            }
        }
        return elementosIguais;
    }

    /**
     * Algoritmo que calcula a quantidade em que cada elemento
     * aparece em um vetor.
     * @param caracteres string que contém sequência de caracteres
     * @return a quantidade de caracteres
     */
    public static int caractereMaisFrequente(final String caracteres) {
        int maisFrequente = 0;
        for (int contador = 0; contador < caracteres.length(); contador++) {
            if (Character.isLetter(caracteres.charAt(contador))) {
                maisFrequente++;
            }
        }
        return maisFrequente;
    }
}
