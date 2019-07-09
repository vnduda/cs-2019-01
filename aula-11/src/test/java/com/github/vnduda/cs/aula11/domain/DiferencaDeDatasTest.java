package com.github.vnduda.cs.aula11.domain;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class DiferencaDeDatasTest {
    @Test
    public void CasoClassicoDeDiferença() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Date dataInicial = format.parse("05-07-2019");
        Date dataFinal = format.parse("06-07-2019");    
        assertEquals(1, DiferencaDeDatas.diferencaEntreDatas(dataInicial, dataFinal));
    }

}