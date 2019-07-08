package com.github.vnduda.cs.aula12.domain;

public final class Numero {

    public static String extenso(String entrada) {
        TransformaExtenso numeroExtenso = new TransformaExtenso();
        numeroExtenso.recuperaString(Integer.parse(entrada));
        return entrada;
    }
}
