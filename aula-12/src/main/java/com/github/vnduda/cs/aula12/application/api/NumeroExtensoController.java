package com.github.vnduda.cs.aula12.application.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	/**
	 * Método que obtém o objeto que retorna o número por extenso.
	 * @param numeroExtensoStr número dado pelo usuário na interface
	 * @return o número escrito em extenso que é obtido pelo método recupera
	 * String
	 */
	public static String diaDaSemana(
			@RequestParam(value = "numero", defaultValue = "não fornecida") final String numeroExtensoStr) {
		final int numeroExtenso = Integer.parseInt(numeroExtensoStr);
		TransformaExtenso var = new TransformaExtenso();
		return var.recuperaString(numeroExtenso);
	}
}
