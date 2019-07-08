package com.github.vnduda.cs.aula11.application.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.github.vnduda.cs.aula11.domain.DiferencaDeDatas;;

@RestController
public class DiaDaSemanaController {

    /**
     * Método principal, que atribui uma data em formato String para Date,
     * onde será retornado a diferença em dias.
     * @param dataInicialStr
     * @param dataFinalStr
     * @return a diferença entre datas em dias (date)
     * @throws ParseException
     */
    @CrossOrigin
    @RequestMapping("ds")
    public static int diaDaSemana(
        @RequestParam(value="inicio", defaultValue = "não fornecida") String dataInicialStr,
        @RequestParam(value="final", defaultValue = "não fornecida") String dataFinalStr) throws ParseException {
            final Date dataInicial = fromString(dataInicialStr);
            final Date dataFinal = fromString(dataFinalStr);
            return DiferencaDeDatas.diferencaEntreDatas(dataInicial, dataFinal);
    }

    /**
     * Método que converte String para Data.
     * @param data data a ser convertida
     * @return data em formato de date
     * @throws ParseException
     */
    public static Date fromString(final String data) throws ParseException {
        final SimpleDateFormat stringParaDate = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        return stringParaDate.parse(data);
    }
}