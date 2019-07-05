package com.github.vnduda.cs.aula11.domain;

import java.util.Date;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public final class DiferencaDeDatas {
    public static int diferencaEntreDatas(final Date dataInicial, final Date dataFinal) throws ParseException {
        long diffInMillies = Math.abs(dataFinal.getTime() - dataInicial.getTime());
        return (int) TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }   
}