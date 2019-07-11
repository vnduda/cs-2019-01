package com.github.vnduda.cs.aula12.domain;

/**
 * Classe que transforma um número int em extenso.
 */
public class TransformaExtenso {

	private String unidade;
	private String dezena;
	private String centena;
	private String numeroUnico;
	private String milhar;

	/**
	 * Método que possui strings contendo o extenso do número (unidade) de
	 * entrada.
	 * @param unidade número int que representa a unidade, que será passado
	 * para extenso
	 */
	public void escreveUnidade(final int unidade) {
		switch (unidade) {
		case 0:
			this.unidade = " zero";
			break;
		case 1:
			this.unidade = " um";
			break;
		case 2:
			this.unidade = " dois";
			break;
		case 3:
			this.unidade = " três";
			break;
		case 4:
			this.unidade = " quatro";
			break;
		case 5:
			this.unidade = " cinco";
			break;
		case 6:
			this.unidade = " seis";
			break;
		case 7:
			this.unidade = " sete";
			break;
		case 8:
			this.unidade = " oito";
			break;
		case 9:
			this.unidade = " nove";
			break;
		default:
			break;
		}
	}

	/**
	 * Método que possui strings contendo o extenso do número (milhar) de
	 * entrada.
	 * @param milhar número int que representa o milhar, que será passado
	 * para extenso
	 */
	public void escreveMilhar(final int milhar) {
		switch (milhar) {
		case 0:
			this.milhar = " ";
			break;
		case 1:
			this.milhar = " mil";
			break;
		case 2:
			this.milhar = " dois mil";
			break;
		case 3:
			this.milhar = " três mil";
			break;
		case 4:
			this.milhar = " quatro mil";
			break;
		case 5:
			this.milhar = " cinco mil";
			break;
		case 6:
			this.milhar = " seis mil";
			break;
		case 7:
			this.milhar = " sete mil";
			break;
		case 8:
			this.milhar = " oito mil";
			break;
		case 9:
			this.milhar = " nove mil";
			break;
		default:
			break;
		}
	}

	/**
	 * Método que possui strings contendo o extenso do número (numeroUnico) de
	 * entrada.
	 * Números únicos são aqueles que não são padrão quando escritos por extenso
	 * @param numeroUnico número int que representa a unidade, que será passado
	 * para extenso
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
	 * Método que possui strings contendo o extenso do número (dezena) de
	 * entrada.
	 * @param dezena número int que representa a dezena, que será passado
	 * para extenso
	 */
	public void escreveDezena(final int dezena) {
		switch (dezena) {
		case 2:
			this.dezena = " vinte";
			break;
		case 3:
			this.dezena = " trinta";
			break;
		case 4:
			this.dezena = " quarenta";
			break;
		case 5:
			this.dezena = " cinquenta";
			break;
		case 6:
			this.dezena = " sessenta";
			break;
		case 7:
			this.dezena = " setenta";
			break;
		case 8:
			this.dezena = " oitenta";
			break;
		case 9:
			this.dezena = " noventa";
			break;
		default:
			break;
		}
	}

	/**
	 * Método que possui strings contendo o extenso do número (centena) de
	 * entrada.
	 * @param centena número int que representa a centena, que será passado
	 * para extenso
	 */
	public void escreveCentena(final int centena) {
		switch (centena) {
		case 1:
			this.centena = " cento";
			break;
		case 2:
			this.centena = " duzentos";
			break;
		case 3:
			this.centena = " trezentos";
			break;
		case 4:
			this.centena = " quatrocentos";
			break;
		case 5:
			this.centena = " quinhentos";
			break;
		case 6:
			this.centena = " seissentos";
			break;
		case 7:
			this.centena = " setecentos";
			break;
		case 8:
			this.centena = " oitocentos";
			break;
		case 9:
			this.centena = " novecentos";
			break;
		default:
			break;
		}
	}

	public String recuperaString(int a) {

		int u = a % 10;
		int d = (a / 10) % 10;
		int c = (a / 100) % 10;
		int m = (a / 1000) % 10;

		escreveUnidade(u);

		if (d == 1) {
			escreveNumeroUnico(u);
		} else {
			escreveDezena(d);
		}

		if (c == 1 && d == 0 && u == 0) {
			this.centena = " cem";
		} else {
			escreveCentena(c);
		}

		escreveMilhar(m);

        String numeroStr = "";

		if (a >= 1000) {
			if (c == 0 && d == 0 && u == 0) {
				numeroStr = this.milhar;
            } else if (c == 0 && d == 0) {
				numeroStr = this.milhar + " e" + this.unidade;
			} else if (c == 0 && dezena == null) {
				numeroStr = this.milhar + " e" + this.numeroUnico;
			} else if (c == 0 && u == 0) {
                numeroStr = this.milhar + " e" + this.dezena;
			} else if (d == 0 && u == 0) {
				numeroStr = this.milhar + " e" + this.centena;
            } else if (c == 0) {
                numeroStr = this.milhar + " e" + this.dezena + " e"
                + this.unidade;
			} else if (d == 0) {
                numeroStr = this.milhar + this.centena + " e"
                + this.unidade;
			} else if (u == 0 && dezena != null) {
                numeroStr = this.milhar + this.centena + " e"
                + this.dezena;
			} else if (dezena == null ) {
                numeroStr = this.milhar + this.centena + " e"
                        + this.numeroUnico;
            } else {
				numeroStr = this.milhar + this.centena + " e" + this.dezena
						+ " e" + this.unidade;
			}
		} else if (a < 1000 && a > 99) {
			if (d == 0 && u == 0) {
				numeroStr = this.centena;
			} else if (d == 0) {
				numeroStr = this.centena + " e" + this.unidade;
			} else if (dezena == null ) {
                numeroStr = this.centena + " e" + this.numeroUnico;
            } else if (u == 0) {
                numeroStr = this.centena + " e" + this.dezena;
            } else {
				numeroStr = this.centena + " e" + this.dezena + " e"
						+ this.unidade;
			}
			// só a partir de centena
		} else if (a < 100 && a > 9) {
			if (dezena == null) {
				numeroStr = this.numeroUnico;
			} else if (u == 0) {
				numeroStr = this.dezena;
			} else {
				numeroStr = this.dezena + " e" + this.unidade;
			}
			// só a partir de dezena
		} else if (a < 10) {
			numeroStr = this.unidade;
			// só a partir de unidade
		} else if (a == 0) {
			numeroStr = "zero";
		}

		return numeroStr;
	}
}
