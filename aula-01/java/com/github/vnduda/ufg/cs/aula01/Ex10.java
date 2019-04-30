package com.github.vnduda.ufg.cs.aula01;

public class Ex10 {

    public static float logaritmoNatural(float n, float k) {

        if (n < 1) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

        if (k < 2) {
            throw new IllegalArgumentException("Intervalo de k inválido");
        }

        float i = 2;
        float e = 1 + n;
        float numerador = n;
        float denominador = 1;
        while (k >= 1) {
            numerador = numerador * numerador;
            denominador = denominador * i;
            e = e + numerador / denominador;
            i = i + 1;
        }

        return e;
    }
}