package com.github.vnduda.cs.aula11.application.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.ParseException;
import com.github.vnduda.cs.aula11.domain.DiferencaDTO;

@RestController
public class DiaDaSemanaController {
    @CrossOrigin
    @RequestMapping("ds")
    public int diaDaSemana(
        @RequestParam(value="inicio", defaultValue = "não fornecida") String dataInicialStr,
        @RequestParam(value="final", defaultValue = "não fornecida") String dataFinalStr) throws ParseException {
            final Date dataInicial = fromString(dataInicialStr);
            final Date dataFinal = fromString(dataFinalStr);
            return DiferencaDTO.diferencaEntreDatas(dataInicial, dataFinal);
    }

    public static Date fromString(final String data) {
        final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        return sdf.parse(data);
    }
}