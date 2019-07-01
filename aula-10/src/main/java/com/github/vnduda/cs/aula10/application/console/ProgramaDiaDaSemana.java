package com.github.vnduda.cs.aula10.application.console;
import com.github.vnduda.cs.aula10.domain.EncontraDiaSemanaUtils;

/**
 * Classe que executa o programa que encontra o dia da semana,
 * dado um ano bissexto de referência e uma data.
 */
public final class ProgramaDiaDaSemana {

    /**
     * Construtor para evitar instanciação.
     */
    private ProgramaDiaDaSemana() {
    }

    /**
     * Método que executa o programa de encontrar o dia da semana.
     * @param args argumento passado para obter a data desejada.
     */
    public static void main(final String[] args) {
        System.exit(EncontraDiaSemanaUtils.encontraDia(args));
    }
}
