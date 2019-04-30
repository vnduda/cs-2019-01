package com.github.vnduda.ufg.cs.aula01;

public class Ex15 {

    public static int[] crivoEratostenes(int a[]) {

        if (a == null) {
            throw new IllegalArgumentException("array is null");
        }

        if (a.length < 1) {
            throw new IllegalArgumentException("Tamanho do array inválido");
        }

        for (int valor : a) {
            if (valor != 0) {
                throw new IllegalArgumentException("O array precisa estar zerado");
            }
        }

        int i = 2;
        int limite = (int) Math.floor(Math.sqrt(a.length));

        while (i <= limite) {

            if (a[i] == 0) {
                int multiplo = i + i;

                while (multiplo <= a.length) {
                    a[multiplo] = 1;
                    multiplo = multiplo + i;
                }
            }
            i = i + 1;
        }

        return a;
    }
}