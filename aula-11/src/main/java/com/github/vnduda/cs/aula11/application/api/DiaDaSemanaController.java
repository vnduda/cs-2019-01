package com.github.vnduda.cs.aula11.application.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.github.vnduda.cs.aula11.domain.DiferencaDeDatas;

/**
 * Classe que possui métodos para converter uma string para date
 * e calcular diferença entre duas datas.
 */
@RestController
public final class DiaDaSemanaController {

    /**
     * Construtor para evitar instanciação.
     */
    private DiaDaSemanaController() {
    }

    /**
     * Método principal, que atribui uma data em formato String para Date,
     * onde será retornado a diferença em dias.
     * @param dataInicialStr data inicial em string
     * @param dataFinalStr data final em string
     * @return a diferença entre datas em dias em formato date
     * @throws ParseException exceção que sinaliza que um
     * erro aconteceu durante a análise
     */
    @CrossOrigin
    @RequestMapping("ds")
    public static int diaDaSemana(
        @RequestParam(value = "inicio", defaultValue = "não fornecida") final String dataInicialStr,
        @RequestParam(value = "final", defaultValue = "não fornecida") final String dataFinalStr)
                    throws ParseException {
            final Date dataInicial = fromString(dataInicialStr);
            final Date dataFinal = fromString(dataFinalStr);
            return DiferencaDeDatas.diferencaEntreDatas(dataInicial, dataFinal);
    }

    /**
     * Método que converte uma data passada como String para Data.
     * @param data data a ser convertida de String para Date
     * @return data em formato de Date após a conversão
     * @throws ParseException exceção que sinaliza que um erro
     * aconteceu durante a análise
     */
    public static Date fromString(final String data) throws ParseException {
        final SimpleDateFormat stringParaDate =
            new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        return stringParaDate.parse(data);
    }
}
