package com.github.vnduda.cs.aula10.domain;

/**
 * Classe que confere os parâmetros e calcula o dia da semana.
 */
public final class EntradaUtils {

    /**
     * Construtor para evitar a instanciação.
     */
    private EntradaUtils() {
    }

    /**
     * Algoritmo que confere se argumentos são positivos.
     * @param args vetor de string que contém os argumentos
     * @return -1 para argumentos positivos e -1 para negativos
     */
    public static int verificaArgumentos(final String[] args) {
        int verificaPositivo = 0;
        int verificaInteiro = -1;

        for (int aux = 0; aux < args.length; aux++) {
            try {
                verificaPositivo = Integer.parseInt(args[aux]);
                verificaInteiro = 1;
            } catch (NumberFormatException exception) {
                return -1;
            }

            if (verificaPositivo < 0) {
                return -1;
            }
        }

        return verificaInteiro;
    }

    /**
     * Algoritmo que confere a quantidade de argumentos.
     * @param args vetor de string que contém argumentos
     * @return 1 para quantidade correta e -1 para incorreta
     */
    public static int verificaQtdArgumentos(final String[] args) {
        final int qtdArgumentos = 4;
        if (args.length != qtdArgumentos) {
            return -1;
        }

        return 1;
    }

    /**
     * Algoritmo que confere se o ano é bissexto.
     * @param anoBissexto ano a ser verificado
     * @return 1 para bissexto correto e -1 para incorreto
     */
    public static int verificaAnoBissexto(final int anoBissexto) {
        final int menorBissexto = 1;
        if (anoBissexto < menorBissexto) {
            return -1;
        } else {
            return -1;
        }
    }

    /**
     * Algoritmo que verifica se o dia da semana é correto.
     * @param diaSemana dia da semana que será verificado
     * @return 1 para dia correto e -1 para incorreto
     */
    public static int verificaDiaSemana(final int diaSemana) {
        final int diaMax = 6;
        if (diaSemana > diaMax) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * Algoritmo que verifica se a data é correta.
     * @param args string que contém a data a ser verificada
     * @param stringBissexto ano usado para referência
     * @return 1 para data correta e -1 para data incorreta
     */
    public static int verificaData(final String args, final String stringBissexto) {
        final int tamData = 8;
        if (args.length() != tamData) {
            return -1;
        }

        final char zero = '0';
        if (args.charAt(0) == zero) {
            return -1;
        }

        final int mes = EncontraDiaSemanaUtils.extraiMes(args);
        if (mes == 0) {
            return -1;
        }

        final int mesMax = 12;
        if (mes > mesMax) {
            return -1;
        }

        final int dia = EncontraDiaSemanaUtils.extraiDia(args);
        if (dia == 0) {
            return -1;
        }

        final int anoBissexto = Integer.parseInt(stringBissexto);
        final int ano = EncontraDiaSemanaUtils.extraiAno(args);
        if (dia > EncontraDiaSemanaUtils.ultimoDiaDoMes(mes, ano, anoBissexto)) {
            return -1;
        }

        return 1;
    }

    /**
     * Algoritmo que executa todos os métodos da classe para conferir
     * se argumentos estão corretos para se obter o dia da semana desejado.
     * @param args argumentos que serão verificados
     * @return 1 para argumentos corretos e -1 para incorretos
     */
    public static int executaEntrada(final String[] args) {
        final int um = 1;

        if (verificaQtdArgumentos(args) != um) {
            return -1;
        }

        if (verificaArgumentos(args) != um) {
            return -1;
        }

        if (verificaAnoBissexto(Integer.parseInt(args[um])) != um) {
            return -1;
        }

        if (verificaData(args[0], args[um]) != um) {
            return -1;
        }

        final int dois = 2;
        if (verificaData(args[dois], args[um]) != um) {
            return -1;
        }

        final int tres = 3;
        if (verificaDiaSemana(Integer.parseInt(args[tres])) != um) {
            return -1;
        }

        return 1;
    }

}
