package com.github.vnduda.cs.aula12.domain;

/**
 * Classe que transforma um número int em extenso.
 */
public class TransformaExtenso {

	/** String que representa a unidade em extenso de um número. */
	private String unidadeStr;
	/** String que representa a dezena em extenso de um número. */
	private String dezenaStr;
	/** String que representa a centena em extenso de um número. */
	private String centenaStr;
	/** String que representa um número unico em extenso de um dado número. */
	private String numeroUnico;
	/** String que representa o milhar em extenso de um número. */
	private String milharStr;

	/**
	 * Método que possui strings contendo o extenso do número (unidade) de
	 * entrada.
	 * 
	 * @param unidade
	 *            número int que representa a unidade, que será passado para
	 *            extenso
	 */
	public void escreveUnidade(final int unidadeStr) {
		switch (unidadeStr) {
		case 0:
			this.unidadeStr = " zero";
			break;
		case 1:
			this.unidadeStr = " um";
			break;
		case 2:
			this.unidadeStr = " dois";
			break;
		case 3:
			this.unidadeStr = " três";
			break;
		case 4:
			this.unidadeStr = " quatro";
			break;
		case 5:
			this.unidadeStr = " cinco";
			break;
		case 6:
			this.unidadeStr = " seis";
			break;
		case 7:
			this.unidadeStr = " sete";
			break;
		case 8:
			this.unidadeStr = " oito";
			break;
		case 9:
			this.unidadeStr = " nove";
			break;
		default:
			break;
		}
	}

	/**
	 * Método que possui strings contendo o extenso do número (milhar) de
	 * entrada.
	 * 
	 * @param milharStr
	 *            número int que representa o milhar, que será passado para
	 *            extenso
	 */
	public void escreveMilhar(final int milharStr) {
		switch (milharStr) {
		case 0:
			this.milharStr = " ";
			break;
		case 1:
			this.milharStr = " mil";
			break;
		case 2:
			this.milharStr = " dois mil";
			break;
		case 3:
			this.milharStr = " três mil";
			break;
		case 4:
			this.milharStr = " quatro mil";
			break;
		case 5:
			this.milharStr = " cinco mil";
			break;
		case 6:
			this.milharStr = " seis mil";
			break;
		case 7:
			this.milharStr = " sete mil";
			break;
		case 8:
			this.milharStr = " oito mil";
			break;
		case 9:
			this.milharStr = " nove mil";
			break;
		default:
			break;
		}
	}

	/**
	 * Método que possui strings contendo o extenso do número (numeroUnico) de
	 * entrada. Números únicos são aqueles que não são padrão quando escritos
	 * por extenso
	 * 
	 * @param numeroUnico
	 *            número int que representa a unidade, que será passado para
	 *            extenso
	 */
	public void escreveNumeroUnico(final int numeroUnico) {
		switch (numeroUnico) {
		case 0:
			this.numeroUnico = " dez";
			break;
		case 1:
			this.numeroUnico = " onze";
			break;
		case 2:
			this.numeroUnico = " doze";
			break;
		case 3:
			this.numeroUnico = " treze";
			break;
		case 4:
			this.numeroUnico = " quatorze";
			break;
		case 5:
			this.numeroUnico = " quinze";
			break;
		case 6:
			this.numeroUnico = " dezesseis";
			break;
		case 7:
			this.numeroUnico = " dezessete";
			break;
		case 8:
			this.numeroUnico = " dezoito";
			break;
		case 9:
			this.numeroUnico = " dezenove";
			break;
		default:
			break;
		}
	}

	/**
	 * Método que possui strings contendo o extenso do número (dezenaStr) de
	 * entrada.
	 * 
	 * @param dezenaStr
	 *            número int que representa a dezena, que será passado para
	 *            extenso
	 */
	public void escreveDezena(final int dezenaStr) {
		switch (dezenaStr) {
		case 2:
			this.dezenaStr = " vinte";
			break;
		case 3:
			this.dezenaStr = " trinta";
			break;
		case 4:
			this.dezenaStr = " quarenta";
			break;
		case 5:
			this.dezenaStr = " cinquenta";
			break;
		case 6:
			this.dezenaStr = " sessenta";
			break;
		case 7:
			this.dezenaStr = " setenta";
			break;
		case 8:
			this.dezenaStr = " oitenta";
			break;
		case 9:
			this.dezenaStr = " noventa";
			break;
		default:
			break;
		}
	}

	/**
	 * Método que possui strings contendo o extenso do número (centenaStr) de
	 * entrada.
	 * 
	 * @param centenaStr
	 *            número int que representa a centena, que será passado para
	 *            extenso
	 */
	public void escreveCentena(final int centenaStr) {
		switch (centenaStr) {
		case 1:
			this.centenaStr = " cento";
			break;
		case 2:
			this.centenaStr = " duzentos";
			break;
		case 3:
			this.centenaStr = " trezentos";
			break;
		case 4:
			this.centenaStr = " quatrocentos";
			break;
		case 5:
			this.centenaStr = " quinhentos";
			break;
		case 6:
			this.centenaStr = " seissentos";
			break;
		case 7:
			this.centenaStr = " setecentos";
			break;
		case 8:
			this.centenaStr = " oitocentos";
			break;
		case 9:
			this.centenaStr = " novecentos";
			break;
		default:
			break;
		}
	}

	/**
	 * Método que recebe um número inteiro é dividido para obter milharStr,
	 * centenaStr, dezenaStr e unidade e passa pelas exceções dos ifs e elses
	 * para retornar o número por extenso.
	 * 
	 * @param a
	 *            número inteiro a ser passado para extenso
	 * @return uma string contendo o número por extenso
	 */
	public String recuperaString(int numero) {

		int unidade = numero % 10;
		int dezena = (numero / 10) % 10;
		int centena = (numero / 100) % 10;
		int milhar = (numero / 1000) % 10;

		escreveUnidade(unidade);

		if (dezena == 1) {
			escreveNumeroUnico(unidade);
		} else {
			escreveDezena(dezena);
		}

		if (centena == 1 && dezena == 0 && unidade == 0) {
			this.centenaStr = " cem";
		} else {
			escreveCentena(centena);
		}

		escreveMilhar(milhar);

		String numeroStr = "";
		if (numero >= 1000) {
			numeroStr = obterMilhar(unidade, dezena, centena);
		} else if (numero < 1000 && numero > 99) {
			numeroStr = obterCentena(unidade, dezena);
		} else if (numero < 100 && numero > 9) {
			numeroStr = obterDezena(unidade);
		} else if (numero < 10) {
			numeroStr = this.unidadeStr;
		} else {
			numeroStr = " zero";
		}

		return numeroStr;
	}

	/**
	 * Método que recebe um número e retorna a dezena correspondente.
	 * 
	 * @param unidade
	 *            unidade a ser recebida para retornar a dezena correspondente
	 * @return a dezena por extenso correspondente
	 */
	private String obterDezena(int unidade) {
		String numeroStr;
		if (dezenaStr == null) {
			numeroStr = this.numeroUnico;
		} else if (unidade == 0) {
			numeroStr = this.dezenaStr;
		} else {
			numeroStr = this.dezenaStr + " e" + this.unidadeStr;
		}
		return numeroStr;
	}

	/**
	 * Método que recebe uma unidade e dezena de um número e retorna a centena
	 * correspondente.
	 * 
	 * @param unidade
	 *            unidade correspondente do número
	 * @param dezena
	 *            dezena correspondente do número
	 * @return a centena por extenso correspondente
	 */
	private String obterCentena(int unidade, int dezena) {
		String numeroStr;
		if (dezena == 0 && unidade == 0) {
			numeroStr = this.centenaStr;
		} else if (dezena == 0) {
			numeroStr = this.centenaStr + " e" + this.unidadeStr;
		} else if (dezenaStr == null) {
			numeroStr = this.centenaStr + " e" + this.numeroUnico;
		} else if (unidade == 0) {
			numeroStr = this.centenaStr + " e" + this.dezenaStr;
		} else {
			numeroStr = this.centenaStr + " e" + this.dezenaStr + " e"
					+ this.unidadeStr;
		}
		return numeroStr;
	}

	/**
	 * Método que recebe um número contendo unidade dezena e centena e retorna o
	 * milhar por extenso.
	 * 
	 * @param unidade
	 *            unidade correspondente do número
	 * @param dezena
	 *            dezena correspondente do número
	 * @param centena
	 *            centena correspondente do número
	 * @return retorna o milhar do número escrito por extenso
	 */
	private String obterMilhar(int unidade, int dezena, int centena) {
		String numeroStr;
		if (centena == 0 && dezena == 0 && unidade == 0) {
			numeroStr = this.milharStr;
		} else if (centena == 0 && dezena == 0) {
			numeroStr = this.milharStr + " e" + this.unidadeStr;
		} else if (centena == 0 && dezenaStr == null) {
			numeroStr = this.milharStr + " e" + this.numeroUnico;
		} else if (centena == 0 && unidade == 0) {
			numeroStr = this.milharStr + " e" + this.dezenaStr;
		} else if (dezena == 0 && unidade == 0) {
			numeroStr = this.milharStr + " e" + this.centenaStr;
		} else if (centena == 0) {
			numeroStr = this.milharStr + " e" + this.dezenaStr + " e"
					+ this.unidadeStr;
		} else if (dezena == 0) {
			numeroStr = this.milharStr + this.centenaStr + " e"
					+ this.unidadeStr;
		} else if (unidade == 0 && dezenaStr != null) {
			numeroStr = this.milharStr + this.centenaStr + " e"
					+ this.dezenaStr;
		} else if (dezenaStr == null) {
			numeroStr = this.milharStr + this.centenaStr + " e"
					+ this.numeroUnico;
		} else {
			numeroStr = this.milharStr + this.centenaStr + " e" + this.dezenaStr
					+ " e" + this.unidadeStr;
		}
		return numeroStr;
	}
}
