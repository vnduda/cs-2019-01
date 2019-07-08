package main.java.com.github.vnduda.cs.aula12.application.console;

import com.github.vnduda.cs.aula11.domain.Calendario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Programa que exibe o dia da semana para o dia em que é executado.
 *
 */
public final class ProgramaExtenso {

    /**
     * Classe pra executar o log.
     */
    private static final Logger logger =
            LogManager.getLogger(ProgramaCalendario.class);

    /**
     * Restringe criação de instância.
     */
    private ProgramaExtenso() {
        // Apenas evita criação de instância.
    }

    /**
     * Ponto de entrada da aplicação. Apenas para ilustra chamada de método.
     *
     * @param args Ignorados.
     */
    public static void main(final String[] args) {

        logger.info("iniciado");
        System.out.println(Numero.extenso());
    }

}
