package com.github.vnduda.ufg.cs.aula07;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AlgoritmosTest {
    @Test
    public void menorTemperaturaClassico() {
        double[] vetor = {1, 2, 3, 4, 5, 6};
        double[] vetor1 = {15.8};
        assertEquals(1, AlgoritmosUtils.menorTemperatura(vetor));
        assertEquals(15.8, AlgoritmosUtils.menorTemperatura(vetor1));
    }

    @Test
    public void numerosImparesClassico() {
        int[] vetor = {1};
        int[] vetor2 = {2, 8, 10, 6, 8, 22};
        assertEquals(1, AlgoritmosUtils.numerosImpares(vetor));
        assertEquals(0, AlgoritmosUtils.numerosImpares(vetor2));
    }

    @Test
    public void quantidadeElementosIguaisClassico() {
        double[] vetor = {1, 0, 15.5};
        assertEquals(0, AlgoritmosUtils.quantidadeElementosIguais(vetor, 5));
    }

    @Test
    public void caractereMaisFrequenteClassico() {
        String string = "Ola mundo!";
        assertEquals(8, AlgoritmosUtils.caractereMaisFrequente(string));
    }

}
