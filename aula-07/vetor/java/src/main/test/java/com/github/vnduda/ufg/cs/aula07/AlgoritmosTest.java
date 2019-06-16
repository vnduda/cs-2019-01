package com.github.vnduda.ufg.cs.aula07;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.github.vnduda.ufg.cs.aula07.AlgoritmosUtils;

import org.junit.jupiter.api.Test;

class AlgoritmosTest {
    @Test
    void menorTemperaturaClassico() {
        double[] vetor = {1, 2, 3, 4, 5, 6};
        assertEquals(1, AlgoritmosUtils.menorTemperatura(vetor));
    }

    @Test
    void numerosImparesClassico() {
        int[] vetor = {1};
        int[] vetor2 = {2, 8, 10, 6, 8, 22};
        assertEquals(1, AlgoritmosUtils.numerosImpares(vetor));
        assertEquals(0, AlgoritmosUtils.numerosImpares(vetor2));
    }

    @Test
    void quantidadeElementosIguaisClassico() {
        double[] vetor = {1, 0, 15.5};
        assertEquals(0, AlgoritmosUtils.quantidadeElementosIguais(vetor, 5));
    }

    @Test
    void caractereMaisFrequenteClassico() {
        String string = "Ola mundo!";
        assertEquals(8, AlgoritmosUtils.caractereMaisFrequente(string));
    }

}
