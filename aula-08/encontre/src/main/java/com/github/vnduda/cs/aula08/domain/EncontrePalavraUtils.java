package com.github.vnduda.cs.aula08.domain;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.io.IOException;
import java.io.File;
import java.nio.file.Paths;
import java.util.regex.Pattern;

/**
 * Classe para encontrar palavras em um arquivo.
 */
public final class EncontrePalavraUtils {

     /**
     * Construtor para evitar instanciação.
     */
    private EncontrePalavraUtils() {
    }
    /**
     *  Gera o número de ocorrencias de linhas e colunas de uma palavra em um dado arquivo.
     * @param enderecoArquivo endereço do Arquivo
     * @param palavraBuscada palavra a ser buscada no arquivo
     * @return número de ocorrências total da palabra e a linha e coluna que ocorre
     * @throws IOException se o arquivo não puder ser lido corretamente
     */
    public static String encontrePalavra(final String enderecoArquivo,
        final String palavraBuscada) throws IOException {

        final File teste = new File(enderecoArquivo);
        if (teste.length() == 0) {
            throw new IllegalArgumentException("Arquivo vazio");
        }

        final Charset padrao = Charset.forName("UTF-8");
        final BufferedReader br = Files.newBufferedReader(Paths.get(enderecoArquivo), padrao);

        final StringBuilder sb = new StringBuilder();
        String conteudoLinha;
        int numLinha = 1;
        int ocorrencia = 0;

        while ((conteudoLinha = br.readLine()) != null) {
            int numColuna = conteudoLinha.indexOf(palavraBuscada);
            if (numColuna != -1) {
                sb.append(String.format("L%d C%d: %s%n", numLinha, numColuna, conteudoLinha));
            }
            numLinha++;
            ocorrencia = ocorrencia + conteOcorrencias(palavraBuscada, conteudoLinha);
        }
        br.close();

        return String.format("Encontradas: %d%n%s", ocorrencia, sb.toString());
    }

    /**
     * Gera número de ocorrências de uma palavra em uma String.
     * @param palavraBuscada palavra a ser buscada
     * @param texto texto em que a palavra será buscada
     * @return número de vezes que a palavra aparece no texto
     */
    public static int conteOcorrencias(final String palavraBuscada, final String texto) {
        final Pattern p = Pattern.compile(palavraBuscada);
        final Matcher m = p.matcher(texto);

        int ocorrencias = 0;
        while (m.find()) {
            ocorrencias++;
        }

        return ocorrencias;
    }
}
