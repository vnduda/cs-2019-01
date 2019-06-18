package com.github.vnduda.cs.aula08.application.console;

import com.github.vnduda.cs.aula08.application.console.InterfaceUtils;
import com.github.vnduda.cs.aula08.domain.ArquivoUtils;

import java.io.IOException;

public class ProgramaInteiro {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("USAGE: mostrar como usar corretamente a aplicacao.");
            System.exit(1);
        }

        byte[] quatroPrimeiros = 
            ArquivoUtils.leQuatroPrimeirosBytesDoArquivo(args[0]);
        
        if (quatroPrimeiros == null) {
            System.out.println("Nao foi possivel ler bytes do arquivo.");
            System.exit(2);
        }

        String hexa = SaidaArquivo.converteParaHexadecimal(quatroPrimeiros);
        System.out.println(hexa);
    }
}
