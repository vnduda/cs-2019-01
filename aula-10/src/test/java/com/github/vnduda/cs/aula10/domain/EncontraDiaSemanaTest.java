package com.github.vnduda.cs.aula10.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.github.vnduda.cs.aula10.application.console.ProgramaDiaDaSemana;

public class EncontraDiaSemanaTest {

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
    String[] teste15 = {"20000101", "2000", "19900101", "1"};
    String[] teste16 = {"19900101", "2000", "20000101", "1"};
    String[] teste17 = {"20000101", "2000", "20000101", "5"};
    String[] teste18 = {"2018", "20160331", "3"};
    String[] teste19 = {"a", "2018", "20160331", "3"};
    String[] teste20 = {"20160331", "2018", "20160331", "-3"};
    String[] teste21 = {"20160331", "2018", "20160331", "7"};
    String[] teste22 = {"20160331", "0", "20160331", "3"};
    String[] teste23 = {"20160331", "2018", "20160332", "3"};

    @Test
    void casosClassicos() {
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste1));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste2));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste3));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste4));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste5));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste6));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste7));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste8));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste9));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste10));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste11));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste12));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste13));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste14));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste15));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste16));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste17));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste18));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste19));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste20));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste21));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste22));
        assertEquals(-1, EncontraDiaSemanaUtils.encontraDia(teste23));
    }

    @Test
    void verificaDia() {
        assertEquals(1, EncontraDiaSemanaUtils.extraiDia("20000101"));
    }

    @Test
    void verificaMes() {
        assertEquals(1, EncontraDiaSemanaUtils.extraiMes("20000101"));
    }

    @Test
    void verificaAno() {
        assertEquals(2000, EncontraDiaSemanaUtils.extraiAno("20000101"));
    }

    @Test
    void VerificaSeEBissexto() {
        assertTrue(EncontraDiaSemanaUtils.bissexto(2000, 2000));
        assertTrue(EncontraDiaSemanaUtils.bissexto(2004, 2000));
        assertTrue(EncontraDiaSemanaUtils.bissexto(2015,2015));
        assertTrue(EncontraDiaSemanaUtils.bissexto(2000, 2004));
        assertFalse(EncontraDiaSemanaUtils.bissexto(2001, 2000));
        assertTrue(EncontraDiaSemanaUtils.bissexto(2000,1996));
        assertFalse(EncontraDiaSemanaUtils.bissexto(1900, 2000));
    }

    @Test
    void verificaUltimoDiaDoMes() {
        assertEquals(31, EncontraDiaSemanaUtils.ultimoDiaDoMes(1, 2000, 2000));
        assertEquals(29, EncontraDiaSemanaUtils.ultimoDiaDoMes(2, 2000, 2000));
        assertEquals(28, EncontraDiaSemanaUtils.ultimoDiaDoMes(2, 2001, 2000));
        assertEquals(31, EncontraDiaSemanaUtils.ultimoDiaDoMes(3, 2000, 2000));
        assertEquals(30, EncontraDiaSemanaUtils.ultimoDiaDoMes(4, 2000, 2000));
        assertEquals(31, EncontraDiaSemanaUtils.ultimoDiaDoMes(5, 2000, 2000));
        assertEquals(30, EncontraDiaSemanaUtils.ultimoDiaDoMes(6, 2000, 2000));
        assertEquals(31, EncontraDiaSemanaUtils.ultimoDiaDoMes(7, 2000, 2000));
        assertEquals(31, EncontraDiaSemanaUtils.ultimoDiaDoMes(8, 2000, 2000));
        assertEquals(30, EncontraDiaSemanaUtils.ultimoDiaDoMes(9, 2000, 2000));
        assertEquals(31, EncontraDiaSemanaUtils.ultimoDiaDoMes(10, 2000, 2000));
        assertEquals(30, EncontraDiaSemanaUtils.ultimoDiaDoMes(11, 2000, 2000));
        assertEquals(31, EncontraDiaSemanaUtils.ultimoDiaDoMes(12, 2000, 2000));
        assertEquals(0, EncontraDiaSemanaUtils.ultimoDiaDoMes(0, 2000, 2000));
        
    }

    @Test
    void comparaDatas() {
        assertTrue(EncontraDiaSemanaUtils.comparaDatas(01, 01, 2000, 01, 01, 2000));
        assertFalse(EncontraDiaSemanaUtils.comparaDatas(02, 01, 2000, 01, 01, 2000));
        assertFalse(EncontraDiaSemanaUtils.comparaDatas(01, 02, 2000, 01, 01, 2000));
        assertFalse(EncontraDiaSemanaUtils.comparaDatas(01, 01, 2001, 01, 01, 2000));
    }

    @Test
    void avancaData() {
        assertEquals(0, EncontraDiaSemanaUtils.avancaData("20000101", "20000101", 2000));
    }

    @Test
    void recuaData() {
        assertEquals(0, EncontraDiaSemanaUtils.recuaData("20000101", "20000101", 2000));
        assertEquals(0, EncontraDiaSemanaUtils.recuaData("20190101", "20190101", 2018));
    }

    @Test
    void dataMaior() {
        assertEquals(-1, EncontraDiaSemanaUtils.dataMaior("20000102", "20000101"));
        assertEquals(0, EncontraDiaSemanaUtils.dataMaior("20000101", "20000101"));
        assertEquals(1, EncontraDiaSemanaUtils.dataMaior("20000101", "20000102"));
        assertEquals(-1, EncontraDiaSemanaUtils.dataMaior("20000201", "20000101"));
        assertEquals(1, EncontraDiaSemanaUtils.dataMaior("20000101", "20000201"));
        assertEquals(-1, EncontraDiaSemanaUtils.dataMaior("20010101", "20000101"));
        assertEquals(1, EncontraDiaSemanaUtils.dataMaior("20000101", "20010101"));
    }

    @Test
    void subtraiDia() {
        assertEquals(2 , EncontraDiaSemanaUtils.subtraiDia(3, 2, 2018, 2018));
        assertEquals(31 , EncontraDiaSemanaUtils.subtraiDia(1, 2, 2018, 2018));
    }

    @Test
    void subtraiMes() {
        assertEquals(12, EncontraDiaSemanaUtils.subtraiMes(1));
        assertEquals(1, EncontraDiaSemanaUtils.subtraiMes(2));
    }

    @Test
    void avancaDiaSemana() {
        assertEquals(2, EncontraDiaSemanaUtils.avancaDiaSemana(0, 2));
        assertEquals(0 , EncontraDiaSemanaUtils.avancaDiaSemana(7, 0));
    }

    @Test
    void recuaDiaSemana() {
        assertEquals(6, EncontraDiaSemanaUtils.recuaDiaSemana(7, 6));
    }

    
}