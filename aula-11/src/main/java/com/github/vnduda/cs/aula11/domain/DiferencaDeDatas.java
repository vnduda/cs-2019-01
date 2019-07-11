package com.github.vnduda.cs.aula11.domain;

import java.util.Date;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

/**
 * Classe que possui método que calcula diferença entre datas.
 */
public final class DiferencaDeDatas {

    /**
     * Construtor para evitar instanciação.
     */
    private DiferencaDeDatas() {
    }

    /**
     * Método que calcula a diferença entre duas datas.
     * @param dataInicial data inicial a ser calculada
     * @param dataFinal data final a ser calculada
     * @return quantidade de dias de diferença entre datas inseridas
     * @throws ParseException exceção que sinaliza que um erro aconteceu
     *  durante a análise
     */
    public static int diferencaEntreDatas(final Date dataInicial,
        final Date dataFinal) throws ParseException {
        final long diffInMillies = Math.abs(dataFinal.getTime()
        - dataInicial.getTime());
        return (int) TimeUnit.DAYS.convert(
            diffInMillies, TimeUnit.MILLISECONDS);
    }
}
