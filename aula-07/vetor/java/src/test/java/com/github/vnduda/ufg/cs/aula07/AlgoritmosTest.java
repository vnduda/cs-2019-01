package com.github.vnduda.ufg.cs.aula07;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AlgoritmosTest {
    @Test
    public void menorTemperaturaClassico() {
        double[] vetor = {1, 2, 3, 4, 5, 6};
        double[] vetor1 = {6, 5, 4, 3, 2, 1};
        assertEquals(1, AlgoritmosUtils.menorTemperatura(vetor));
        assertEquals(1, AlgoritmosUtils.menorTemperatura(vetor1));
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
        double[] vetor1 = {1, 2, 3, 4, 5};
        assertEquals(0, AlgoritmosUtils.quantidadeElementosIguais(vetor, 5));
        assertEquals(1, AlgoritmosUtils.quantidadeElementosIguais(vetor1, 5));
    }

    @Test
    public void caractereMaisFrequenteClassico() {
        String string = "Ola mundo!";
        assertEquals(8, AlgoritmosUtils.caractereMaisFrequente(string));
    }

}
