package com.github.vnduda.ufg.cs.aula01;

public class Ex12 {

    public static boolean quadradoPerfeito(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Intervalo da variável n inválido");
        }

        int i = 1;
        int s = 1;

        while (s < n) {
            i = i + 2;
            s = s + i;
        }

        return s == n;
    }
}