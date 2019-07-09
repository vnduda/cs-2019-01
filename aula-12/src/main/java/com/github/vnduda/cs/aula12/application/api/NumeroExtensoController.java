package com.github.vnduda.cs.aula12.application.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.github.vnduda.cs.aula12.domain.TransformaExtenso;

/**
 * Classe que possui método que retorna um número por extenso.
 */
@RestController
public final class NumeroExtensoController {

    /**
     * Construtor para evitar instanciação.
     */
    private NumeroExtensoController() {
    }
    
    @CrossOrigin
    @RequestMapping("ds")
    public static int diaDaSemana(
        @RequestParam(value = "numero", defaultValue = "não fornecida") final String numeroExtensoStr) {
            final int numeroExtenso = Integer.parseInt(numeroExtensoStr);
            //JOptionPane.showMessageDialog(TransformaExtenso.recuperaString(numeroExtenso));
            return TransformaExtenso.recuperaString(numeroExtenso);
    }
}