package com.github.vnduda.ufg.cs.aula01;

public class Ex14 {

    public static boolean primo(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Intervalo da variável n inválido");
        }

        int i = 2;

        while (n > i) {
            if (n % i == 0) {
                return false;
            }
            i = i + 1;
        }

        return true;
    }
}