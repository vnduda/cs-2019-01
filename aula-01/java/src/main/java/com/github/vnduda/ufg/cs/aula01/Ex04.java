package com.github.vnduda.ufg.cs.aula01;

public class Ex04 {

    public static void main(String[] args) {
        System.out.println(restoDivisao(3, 8));
    }
    
    /**
     * Gera o resto da divisão inteira de x por y
     * @param x dividendo
     * @param y divisor
     * @throw IllegalArgumentException caso entrada esteja fora da faixa
     * @return o resultado da divisão inteira de x por y
    */
    public static int restoDivisao(int x, int y) {

        if (y < 0) {
            throw new IllegalArgumentException("Valor de y inválido");
        }

        if (x <= 0) {
            throw new IllegalArgumentException("Valor de x inválido");
        }
        
        int s = x;
        while (s >= y) {
            s = s - y;
        }

        return s;
    }
}
