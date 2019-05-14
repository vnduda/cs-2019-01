/**
 * Verifica se n satisfaz a propriedade 153.
 * @param n n variavel a ser verificada
 * @throws IllegalArgumentException caso entrada seja menor que 100 ou maior que 999
 * @return o valor verdadeiro se o argumento fornecido satisfaz a propriedade 153 e, o valor falso, caso contrário 
 */

package com.github.vnduda.ufg.cs.aula01;

public class Ex02 {

    public static void main(String[] args) {
        System.out.println(propriedade153(153));
    }

    public static boolean propriedade153(int n) {

        if (n < 100 || n > 999) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

        final int c = n / 100;
        final int du = n % 100;
        final int d = du / 10;
        final int u = du % 10;

        return (c * c * c) + (d * d * d) + (u * u * u) == n;
    }

}