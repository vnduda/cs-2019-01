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
        @RequestParam(value="inicio", defaultValue = "não fornecida") String dataInicial,
        @RequestParam(value="final", defaultValue = "não fornecida") String dataFinal) throws ParseException {
            return DiferencaDTO.diferencaEntreDatas(dataInicial, dataFinal);
    }
}