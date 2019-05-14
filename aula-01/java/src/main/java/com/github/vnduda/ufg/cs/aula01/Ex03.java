package com.github.vnduda.ufg.cs.aula01;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Ex03 {

    public static void main(String[] args) {
        System.out.println(diaSemana(11, 4, 2019));
    }

    public static int diaSemana(final int d, final int m, final int a) {

        if (d < 1 || d > 31) {
            throw new IllegalArgumentException("Dia inválido");
        }

        if (m < 1 || m > 12) {
            throw new IllegalArgumentException("Mês inválido");
        }

        if (a < 1753) {
            throw new IllegalArgumentException("Ano inválido");
        }

        try {
            LocalDate.of(a, m, d);
        } catch (DateTimeException exp) {
            final String data = String.format("%d/%d/%d", d, m, a);
            throw new IllegalArgumentException("data invalida: " + data, exp);
        }

        int dia = d;
        int mes = m;
        int ano = a;

        if (mes == 1 || mes == 2) {
            mes += 12;
            ano -= 1;   
        }

        int s = (dia + (2 * mes) + (3 * (mes + 1) / 5) + ano + (ano / 4) - (ano / 100) + (ano / 400));

        return s % 7;
    }
}