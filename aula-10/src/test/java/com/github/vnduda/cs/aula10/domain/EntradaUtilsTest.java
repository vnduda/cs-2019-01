package com.github.vnduda.cs.aula10.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public final class EntradaUtilsTest {

    String[] teste1 = {"2010101", "1", "23450101", "1"};
    String[] teste2 = {"100000101", "", "23450101", "1"};
    String[] teste3 = {"20161301", "", "23450101", "1"};
    String[] teste4 = {"20160001", "", "23450101", "1"};
    String[] teste5 = {"20160931", "", "23450101", "1"};
    String[] teste6 = {"20160900", "", "23450101", "1"};
    String[] teste7 = {"", "0", "23450101", "1"};
    String[] teste8 = {"", "-1", "23450101", "1"};
    String[] teste9 = {"", "", "23450000", "1"};
    String[] teste10 = {"", "", "23450101", "-1"};
    String[] teste11 = {"", "", "23450101", "7"};
    String[] teste12 = {"20160928", "2016", "20160928", "2"};
    String[] teste13 = {"20160301", "2016", "20160228", "6"};
    String[] teste14 = {"20000101", "2000", "20000101", "1"};
    String[] teste15 = {"20000101", "2000", "20000101"};
    String[] teste16 = {"20000101", "2000", "20000101", "-1"};
    String[] teste17 = {"20000101", "0", "20000101", "1"};
    String[] teste18 = {"20000101", "2000", "200001010", "1"};
    String[] teste19 = {"20000101", "2000", "20000101", "7"};
    String[] teste20 = {"20000101", "2000", "20160332", "3"};
    String[] teste21 = {"20190229", "2018", "20190301", "3"};

    @Test
    void casosClassicos() {
        assertEquals(-1, EntradaUtils.executaEntrada(teste1));
        assertEquals(-1, EntradaUtils.executaEntrada(teste2));
        assertEquals(-1, EntradaUtils.executaEntrada(teste3));
        assertEquals(-1, EntradaUtils.executaEntrada(teste4));
        assertEquals(-1, EntradaUtils.executaEntrada(teste5));
        assertEquals(-1, EntradaUtils.executaEntrada(teste6));
        assertEquals(-1, EntradaUtils.executaEntrada(teste7));
        assertEquals(-1, EntradaUtils.executaEntrada(teste8));
        assertEquals(-1, EntradaUtils.executaEntrada(teste9));
        assertEquals(-1, EntradaUtils.executaEntrada(teste10));
        assertEquals(-1, EntradaUtils.executaEntrada(teste11));
        assertEquals(-1, EntradaUtils.executaEntrada(teste12));
        assertEquals(-1, EntradaUtils.executaEntrada(teste13));
        assertEquals(-1, EntradaUtils.executaEntrada(teste14));
    }

    @Test
    void verificaQtdArgumentos() {
        assertEquals(1, EntradaUtils.verificaQtdArgumentos(teste1));
        assertEquals(-1, EntradaUtils.verificaQtdArgumentos(teste15));
    }

    @Test
    void verificaArgumentos() {
        assertEquals(1, EntradaUtils.verificaArgumentos(teste1));
        assertEquals(-1, EntradaUtils.verificaArgumentos(teste16));
    }

    @Test
    void verificaDiaSemana() {
        assertEquals(1, EntradaUtils.verificaDiaSemana(1));
        assertEquals(-1, EntradaUtils.verificaDiaSemana(7));
    }

    @Test
    void verificaAnoBissexto() {
        assertEquals(-1, EntradaUtils.verificaAnoBissexto(1));
        assertEquals(-1, EntradaUtils.verificaAnoBissexto(0));
    }

    @Test
    void verificaData() {
        assertEquals(1, EntradaUtils.verificaData("20000101", "2000"));
        assertEquals(-1, EntradaUtils.verificaData("00000101", "2000"));
        assertEquals(-1, EntradaUtils.verificaData("20000001", "2000"));
        assertEquals(-1, EntradaUtils.verificaData("20001301", "2000"));
        assertEquals(-1, EntradaUtils.verificaData("20000100", "2000"));
        assertEquals(-1, EntradaUtils.verificaData("20000132", "2000"));
        assertEquals(-1, EntradaUtils.verificaData("201900156", "2018"));
    }

    @Test
    void executaEntrada() {
        assertEquals(-1, EntradaUtils.executaEntrada(teste14));
        assertEquals(-1, EntradaUtils.executaEntrada(teste15));
        assertEquals(-1, EntradaUtils.executaEntrada(teste16));
        assertEquals(-1, EntradaUtils.executaEntrada(teste17));
        assertEquals(-1, EntradaUtils.executaEntrada(teste1));
        assertEquals(-1, EntradaUtils.executaEntrada(teste18));
        assertEquals(-1, EntradaUtils.executaEntrada(teste19));
    }
}