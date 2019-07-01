package com.github.vnduda.cs.aula10.domain;

/**
 * Classe que encontra o dia da semana de uma data desejada, usando como parâmetros
 * data desejada, data de origem e ano.
 */
public final class EncontraDiaSemanaUtils {

    /**
     * Total de dias que o mês de fevereiro tem, em anos que não são bissextos.
     */
    private static final int DIA_VINTEEOITO = 28;
    /**
     * Total de dias que o mês de fevereiro tem, em anos que são bissextos.
     */
    private static final int DIA_VINTEENOVE = 29;
    /**
     * Meses com 30 dias.
     */
    private static final int DIA_TRINTA = 30;
    /**
     * Meses com 31 dias.
     */
    private static final int DIA_TRINTAEUM = 31;

    /**
     * Construtor para evitar instanciação da classe.
     */
    private EncontraDiaSemanaUtils() {
    }

    /**
     * Converte uma data (aaaammdd) para formato int.
     * @param data String com data
     * @return inteiro correspondente
     */
    public static int extraiDia(final String data) {
        final int diaInicio = 6;
        final int diaFinal = 8;
        return Integer.parseInt(data.substring(diaInicio, diaFinal));
    }

    /**
     * Converte uma data (aaaammdd) para formato int.
     * @param data String com data
     * @return inteiro correspondente
     */
    public static int extraiMes(final String data) {
        final int mesInicio = 4;
        final int mesFinal = 6;
        return Integer.parseInt(data.substring(mesInicio, mesFinal));
    }

    /**
     * Converte uma data (aaaammdd) para formato int.
     * @param data String com data
     * @return inteiro correspondente
     */
    public static int extraiAno(final String data) {
        final int anoInicio = 0;
        final int anoFinal = 4;
        return Integer.parseInt(data.substring(anoInicio, anoFinal));
    }

    /**
     * Algoritmo para saber se o ano é ou não Bissexto.
     * @param ano ano a ser verificado
     * @param anoBissexto ano de referência
     * @return verdadeiro se for bissexto e falso caso contrário
     */
    public static boolean bissexto(final int ano, final int anoBissexto) {
        final int quatro = 4;
        final int cem = 100;
        final int quatrocentos = 400;

        if (ano == anoBissexto) {
            return true;
        } else if ((ano - anoBissexto) % quatro == 0
            && (ano % cem != 0 || ano % quatrocentos == 0)) {
            return true;
        }

        return false;
    }

    /**
     * Algoritmo que identifica o último dia do mês.
     * @param mes mês do qual queremos saber o último dia
     * @param ano ano para saber se é Bissexto
     * @param anoBissexto ano bissexto usado para referência
     * @return o último dia do mês em inteiro
     */
    public static int ultimoDiaDoMes(final int mes, final int ano, final int anoBissexto) {
        final boolean bissexto = bissexto(ano, anoBissexto);

        final int janeiro = 1;
        final int fevereiro = 2;
        final int marco = 3;
        final int abril = 4;
        final int maio = 5;
        final int junho = 6;
        final int julho = 7;
        final int agosto = 8;
        final int setembro = 9;
        final int outubro = 10;
        final int novembro = 11;
        final int dezembro = 12;

        switch (mes) {
            case janeiro:
            case marco:
            case maio:
            case julho:
            case agosto:
            case outubro:
            case dezembro:
                return DIA_TRINTAEUM;
            case abril:
            case junho:
            case setembro:
            case novembro:
                return DIA_TRINTA;
            case fevereiro:
                if (bissexto) {
                    return DIA_VINTEENOVE;
                } else {
                    return DIA_VINTEEOITO;
                }
            default:
                return 0;
        }
    }

    /**
     * Compara duas datas.
     * @param diaUm dia da primeira data
     * @param mesUm mês da primeira data
     * @param anoUm ano da primeira data
     * @param diaDois dia da segunda data
     * @param mesDois mês da segunda data
     * @param anoDois ano da segunda data
     * @return verdadeiro se as datas forem equivalentes
     */
    public static boolean comparaDatas(final int diaUm, final int mesUm,
        final int anoUm, final int diaDois, final int mesDois, final int anoDois) {
            return anoUm == anoDois && mesUm == mesDois && diaUm == diaDois;
        }

    /**
     * Algoritmo que avança até a data desejada.
     * @param dataOrigem data origem
     * @param dataDesejada data de destino
     * @param bissextoRef ano bissexto de referência
     * @return número de dias de diferença ente as datas
     */
    public static int avancaData(final String dataOrigem, final String dataDesejada, final int bissextoRef) {
        int diaOrigem = extraiDia(dataOrigem);
        int mesOrigem = extraiMes(dataOrigem);
        int anoOrigem = extraiAno(dataOrigem);
        final int diaDesejado = extraiDia(dataDesejada);
        final int mesDesejado = extraiMes(dataDesejada);
        final int anoDesejado = extraiAno(dataDesejada);
        int contadorDias = 0;
        final int dezembro = 12;

        while (!comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                diaDesejado, mesDesejado, anoDesejado)) {
            for (int j = mesOrigem; j <= dezembro; j++) {
                for (int i = diaOrigem; i <= ultimoDiaDoMes(mesOrigem,
                        anoOrigem, bissextoRef); i++) {
                    if (comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                            diaDesejado, mesDesejado, anoDesejado)) {
                        break;
                    }
                    diaOrigem++;
                    contadorDias++;
                }
                if (comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                        diaDesejado, mesDesejado, anoDesejado)) {
                    break;
                }
                diaOrigem = 1;
                mesOrigem++;
            }
            if (comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                    diaDesejado, mesDesejado, anoDesejado)) {
                break;
            }
            mesOrigem = 1;
            anoOrigem++;
        }

        return contadorDias;
    }

    /**
     * Algoritmo que recua até a data desejada.
     * @param dataOrigem data origem
     * @param dataDesejada data de destino
     * @param bissextoRef ano bissexto de referência
     * @return data desejada
     */
    public static int recuaData(final String dataOrigem, final String dataDesejada, final int bissextoRef) {
        int diaOrigem = extraiDia(dataOrigem);
        int mesOrigem = extraiMes(dataOrigem);
        int anoOrigem = extraiAno(dataOrigem);
        final int diaDesejado = extraiDia(dataDesejada);
        final int mesDesejado = extraiMes(dataDesejada);
        final int anoDesejado = extraiAno(dataDesejada);
        int contadorDias = 0;

        while (!comparaDatas(diaOrigem, mesOrigem, anoOrigem, diaDesejado, mesDesejado, anoDesejado)) {
        for (int j = mesOrigem; j > 0; j--) {
            for (int i = diaOrigem; i > 0; i--) {
                if (comparaDatas(diaOrigem, mesOrigem, anoOrigem, diaDesejado, mesDesejado, anoDesejado)) {
                    break;
                }
                diaOrigem = subtraiDia(bissextoRef, diaOrigem, mesOrigem, anoOrigem);
                contadorDias++;
            }

            if (comparaDatas(diaOrigem, mesOrigem, anoOrigem, diaDesejado, mesDesejado, anoDesejado)) {
                break;
            }
            mesOrigem = subtraiMes(mesOrigem);
            diaOrigem = ultimoDiaDoMes(mesOrigem, anoOrigem, bissextoRef);
        }

        if (comparaDatas(diaOrigem, mesOrigem, anoOrigem, diaDesejado, mesDesejado, anoDesejado)) {
            break;
        }

        anoOrigem--;
        }

        return contadorDias;
        }

    /**
     * Avança os dias ao longo da semana de acordo com o parâmetro.
     * @param dias quantidade de dias a avançar
     * @param diaDaSemanaRef dia da semana referência (inicial)
     * @return dia da semana
     */
    public static int avancaDiaSemana(final int dias, final int diaDaSemanaRef) {
        int diaDaSemana = diaDaSemanaRef;
        final int diaInvalido = 7;

        for (int contaDias = 0; contaDias < dias; contaDias++) {
            diaDaSemana++;
            if (diaDaSemana == diaInvalido) {
                diaDaSemana = 0;
            }
        }

        return diaDaSemana;
    }

    /**
     * Recua os dias ao longo da semana de acordo com o parâmetro.
     * @param dias quantidade de dias a recuar
     * @param diaDaSemanaRef dia da semana referência (inicial)
     * @return dia da semana
     */
    public static int recuaDiaSemana(final int dias, final int diaDaSemanaRef) {
        int diaDaSemana = diaDaSemanaRef;
        final int diaValido = 6;

        for (int contaDias = 0; contaDias < dias; contaDias++) {
            diaDaSemana--;
            if (diaDaSemana == -1) {
                diaDaSemana = diaValido;
            }
        }

        return diaDaSemana;
    }

    /**
     * Subtrai o dia conferindo o último dia do mês.
     * @param dia dia para a subtração
     * @param mes mês que contém o dia a ser subtraído
     * @param ano ano que contém o dia a ser subtraído
     * @param anoBissexto ano bissexto que verifica fevereiro
     * @return o dia
     */
    public static int subtraiDia(final int dia, final int mes, final int ano, final int anoBissexto) {
        int diaAux = dia;
        final int um = 1;
        if (dia == um) {
            diaAux = ultimoDiaDoMes(mes - 1, ano, anoBissexto);
        } else {
            diaAux--;
        }
        return diaAux;
    }

    /**
     * Subtrai o mês.
     * @param mes mês a ser subtraido
     * @return mês subtraído
     */
    public static int subtraiMes(final int mes) {
        int mesAux = mes;
        final int ultimoMes = 12;
        final int um = 1;
        if (mes == um) {
            mesAux = ultimoMes;
        } else {
            mesAux--;
        }
        return mesAux;
    }

    /**
     * Compara duas datas em formato string e verifica se a primeira é maior,
     * menor ou igual a segunda.
     * @param dataOrigem data de origem
     * @param dataDesejada data de destino
     * @return 1 se for maior, 0 se for igual e -1 se for menor
     */
    public static int dataMaior(final String dataOrigem,
        final String dataDesejada) {
        final int diaOrigem = extraiDia(dataOrigem);
        final int mesOrigem = extraiMes(dataOrigem);
        final int anoOrigem = extraiAno(dataOrigem);
        final int diaDesejado = extraiDia(dataDesejada);
        final int mesDesejado = extraiMes(dataDesejada);
        final int anoDesejado = extraiAno(dataDesejada);

        if (anoDesejado == anoOrigem) {
            if (mesDesejado == mesOrigem) {
                if (diaOrigem > diaDesejado) {
                    return -1;
                } else if (diaOrigem == diaDesejado) {
                    return 0;
                } else {
                    return 1;
                }
            } else if (mesDesejado > mesOrigem) {
                return 1;
            } else {
                return -1;
            }
        } else if (anoDesejado > anoOrigem) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * Recebe uma entrada em forma de String, verifica as exceções, e caso esteja
     * de acordo, executa.
     * @param args vetor de String
     * @return -1 para inválido ou um número int de 0 a 6 que representa os dias da semana
     */
    public static int encontraDia(final String[] args) {
        final int um = 1;
        if (EntradaUtils.executaEntrada(args) != um) {
            return -1;
        }

        int resultado = -1;
        final int dois = 2;
        final int tres = 3;
        if (dataMaior(args[0], args[dois]) == 0) {
            resultado = Integer.parseInt(args[tres]);
        }

        if (dataMaior(args[0], args[dois]) == um) {
            resultado = avancaDiaSemana(avancaData(args[0], args[dois],
                                        Integer.parseInt(args[1])), Integer.parseInt(args[tres]));
        }

        if (dataMaior(args[0], args[dois]) == -1) {
            resultado = recuaDiaSemana(recuaData(args[0], args[dois],
                                       Integer.parseInt(args[1])), Integer.parseInt(args[tres]));
        }

        return resultado;
    }
}
