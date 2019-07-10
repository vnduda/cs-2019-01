package com.github.vnduda.cs.aula12.application.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe para execução da aplicação.
 */
@SpringBootApplication
public class Application {

    /**
     * Método que executa o programa de retornar número por extenso.
     * @param args argumento passado
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
