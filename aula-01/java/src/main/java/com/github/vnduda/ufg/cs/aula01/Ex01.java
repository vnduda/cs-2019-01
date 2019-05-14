package com.github.vnduda.ufg.cs.aula01;

public class Ex01 {

    public static void main(String[] args) {
		System.out.println(propriedade3025(3025));
    }

    /**
     * Verifica se n satisfaz propriedade 3025.
     * @param n n variavel a ser verificada
     * @throws IllegalArgumentException caso entrada seja menor que 0 ou maior que 999
     * @return o valor verdadeiro se o argumento fornecido satisfaz a propriedade 3025 e, o valor falso, caso contrário
    */
	public static boolean propriedade3025(final int n) {

        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

		final int i = n / 100;
		final int j = n % 100;

		return (i + j) * (i + j) == n;
    }
}
