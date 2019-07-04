package com.github.vnduda.cs.aula11.domain;

import java.time.LocalDate;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class DiferencaDTO {
    public static int diferencaEntreDatas(final String dataInicial, final String dataFinal) throws ParseException {
        final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        final Date firstDate = sdf.parse(dataInicial);
        final Date secondDate = sdf.parse(dataFinal);
        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());

        return (int) TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }   
}