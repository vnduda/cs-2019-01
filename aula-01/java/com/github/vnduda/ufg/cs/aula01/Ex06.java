package com.github.vnduda.ufg.cs.aula01;

public class Ex06 {

    public int fatorial(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

        int f = 1;
        int i = 2;

        // FIXME provavelmente bug, i nao cresce, n nao diminui?????
        while (i <= n) {
            f = f * i;
        }

        return f;
    }
}