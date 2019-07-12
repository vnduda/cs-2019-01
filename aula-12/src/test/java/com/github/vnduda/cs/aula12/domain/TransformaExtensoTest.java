package com.github.vnduda.cs.aula12.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TransformaExtensoTest {

	@Test
	public void CasosClassicos() {
		final int teste0 = 1111;
		final int teste1 = 2222;
		final int teste2 = 3333;
		final int teste3 = 4444;
		final int teste4 = 5555;
		final int teste5 = 6666;
		final int teste6 = 7777;
		final int teste7 = 8888;
		final int teste8 = 9999;

		TransformaExtenso var = new TransformaExtenso();
		assertEquals(" mil cento e onze", var.recuperaString(teste0));
		assertEquals(" dois mil duzentos e vinte e dois",
				var.recuperaString(teste1));
		assertEquals(" três mil trezentos e trinta e três",
				var.recuperaString(teste2));
		assertEquals(" quatro mil quatrocentos e quarenta e quatro",
				var.recuperaString(teste3));
		assertEquals(" cinco mil quinhentos e cinquenta e cinco",
				var.recuperaString(teste4));
		assertEquals(" seis mil seissentos e sessenta e seis",
				var.recuperaString(teste5));
		assertEquals(" sete mil setecentos e setenta e sete",
				var.recuperaString(teste6));
		assertEquals(" oito mil oitocentos e oitenta e oito",
				var.recuperaString(teste7));
		assertEquals(" nove mil novecentos e noventa e nove",
				var.recuperaString(teste8));
	}

	@Test
	public void milhar() {
		final int teste0 = 1000;
		final int teste1 = 1001;
		final int teste2 = 1012;
		final int teste3 = 1030;
		final int teste4 = 1200;
		final int teste5 = 1035;
		final int teste6 = 1307;
		final int teste7 = 1220;
		TransformaExtenso var = new TransformaExtenso();
		assertEquals(" mil", var.recuperaString(teste0));
		assertEquals(" mil e um", var.recuperaString(teste1));
		assertEquals(" mil e doze", var.recuperaString(teste2));
		assertEquals(" mil e trinta", var.recuperaString(teste3));
		assertEquals(" mil e duzentos", var.recuperaString(teste4));
		assertEquals(" mil e trinta e cinco", var.recuperaString(teste5));
		assertEquals(" mil trezentos e sete", var.recuperaString(teste6));
		assertEquals(" mil duzentos e vinte", var.recuperaString(teste7));
	}

	@Test
	public void centena() {
		final int teste0 = 100;
		final int teste1 = 101;
		final int teste2 = 113;
		final int teste3 = 130;
		final int teste4 = 133;

		TransformaExtenso var = new TransformaExtenso();
		assertEquals(" cem", var.recuperaString(teste0));
		assertEquals(" cento e um", var.recuperaString(teste1));
		assertEquals(" cento e treze", var.recuperaString(teste2));
		assertEquals(" cento e trinta", var.recuperaString(teste3));
		assertEquals(" cento e trinta e três", var.recuperaString(teste4));
	}

	@Test
	public void dezena() {
		final int teste0 = 14;
		final int teste1 = 20;
		final int teste2 = 31;

		TransformaExtenso var = new TransformaExtenso();
		assertEquals(" quatorze", var.recuperaString(teste0));
		assertEquals(" vinte", var.recuperaString(teste1));
		assertEquals(" trinta e um", var.recuperaString(teste2));
	}

	@Test
	public void casosParticulares() {
		final int teste0 = 0;
		final int teste1 = 10;
		final int teste2 = 15;
		final int teste3 = 16;
		final int teste4 = 17;
		final int teste5 = 18;
		final int teste6 = 19;

		TransformaExtenso var = new TransformaExtenso();
		assertEquals(" zero", var.recuperaString(teste0));
		assertEquals(" dez", var.recuperaString(teste1));
		assertEquals(" quinze", var.recuperaString(teste2));
		assertEquals(" dezesseis", var.recuperaString(teste3));
		assertEquals(" dezessete", var.recuperaString(teste4));
		assertEquals(" dezoito", var.recuperaString(teste5));
		assertEquals(" dezenove", var.recuperaString(teste6));
	}

}