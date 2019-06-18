package com.github.vnduda.cs.aula08.application.console;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public final class InterfaceUtils {

    public static String converteParaHexadecimal(byte[] bytes) {

        StringBuilder sb = new StringBuilder();
        for (byte umByte : bytes) {
            sb.append(String.format("%02X", umByte));
        }

        return sb.toString();        
    }
}