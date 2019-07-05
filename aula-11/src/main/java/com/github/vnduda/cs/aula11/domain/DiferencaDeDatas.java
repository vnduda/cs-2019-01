package com.github.vnduda.cs.aula11.domain;

import java.util.Date;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public final class DiferencaDeDatas {

    /**
     * Método que calcula a diferença entre duas datas.
     * @param dataInicial data inicial
     * @param dataFinal data final
     * @return quantidade de dias de diferença entre datas
     * @throws ParseException
     */
    public static int diferencaEntreDatas(final Date dataInicial, final Date dataFinal) throws ParseException {
        long diffInMillies = Math.abs(dataFinal.getTime() - dataInicial.getTime());
        return (int) TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }   
}