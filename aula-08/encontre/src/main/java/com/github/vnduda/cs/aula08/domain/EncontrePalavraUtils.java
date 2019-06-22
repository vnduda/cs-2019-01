package com.github.vnduda.cs.aula08.domain;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.regex.Matcher;

public final class EncontrePalavraUtils {
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
                sb.append(String.format("L%d C%d: %s\n", numLinha, numColuna, conteudoLinha));
            }
            numLinha++;
            ocorrencia = ocorrencia + conteOcorrencias(palavraBuscada, conteudoLinha);
        }
        br.close();

        return String.format("Encontradas: %d\n%s", ocorrencia, sb.toString());
    }


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