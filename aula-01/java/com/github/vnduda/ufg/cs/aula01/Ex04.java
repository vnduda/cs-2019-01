package com.github.vnduda.ufg.cs.aula01;

public class Ex04 {

    public static void main(String[] args) {
        System.out.println(restoDivisao(3, 8));
    }

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