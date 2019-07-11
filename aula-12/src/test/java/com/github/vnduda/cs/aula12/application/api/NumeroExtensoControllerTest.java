package com.github.vnduda.cs.aula12.application.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.github.vnduda.cs.aula12.domain.TransformaExtenso;
import org.junit.jupiter.api.Test;

public class NumeroExtensoControllerTest {

    @Test
    public void diaDaSemana() {
        final int numeroExtenso = 1;
        TransformaExtenso var = new TransformaExtenso();
        assertEquals(" um", var.recuperaString(numeroExtenso));
    }
}
