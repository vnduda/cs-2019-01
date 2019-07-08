package com.github.vnduda.cs.aula11.application.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import com.github.vnduda.cs.aula11.domain.DiferencaDeDatas;
import org.junit.jupiter.api.Test;

public class DiaDaSemanaControllerTest {
   
    @Test
    public void fromString() throws ParseException {
        final SimpleDateFormat stringParaDate = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        final String data = ("06-07-2019");
        assertEquals(stringParaDate.parse(data), DiaDaSemanaController.fromString(data));
    }

    @Test
    public void diaDaSemana() throws ParseException {
        final SimpleDateFormat stringParaDate = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        final String dataInicialStr = ("06-07-2019");
        final String dataFinalStr = ("07-07-2019");
        final Date dataInicial = stringParaDate.parse(dataInicialStr);
        final Date dataFinal = stringParaDate.parse(dataFinalStr);
        assertEquals(DiferencaDeDatas.diferencaEntreDatas(dataInicial, dataFinal), DiaDaSemanaController.diaDaSemana(dataInicialStr, dataFinalStr));
    }

    @Test
    public void coberturaCemPorCento() {
        assertNotNull(new DiaDaSemanaController());
    }

}