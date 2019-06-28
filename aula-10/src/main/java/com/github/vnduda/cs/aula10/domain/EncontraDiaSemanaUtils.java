package com.github.vnduda.cs.aula10.domain;

import com.sun.javafx.scene.control.IntegerField;

public class EncontraDiaSemanaUtils {

    private static final int DIA_VINTEEOITO = 28;
    private static final int DIA_VINTEENOVE = 29;
    private static final int DIA_TRINTA = 30;
    private static final int DIA_TRINTAEUM = 31;

    public static int extraiDia(final String data) {
        final int diaInicio = 6;
        final int diaFinal = 8;
        return Integer.parseInt(data.substring(diaInicio, diaFinal));
    }

    public static int extraiMes(final String data) {
        final int mesInicio = 4;
        final int mesFinal = 6;
        return Integer.parseInt(data.substring(mesInicio, mesFinal));
    }

    public static int extraiAno(final String data) {
        final int anoInicio = 0;
        final int anoFinal = 4;
        return Integer.parseInt(data.substring(anoInicio, anoFinal));
    }

    public static boolean Bissexto(final int ano, final int anoBissexto){
        final int quatro = 4;
        final int cem = 100;
        final int quatrocentos = 400;

        if (ano == anoBissexto) {
            return true;
        } else if ((ano - anoBissexto) % quatro == 0 
            && (ano % cem != 0 || ano % quatrocentos == 0)) {
            return true;
        }

        return false;
    }

    public static int ultimoDiaDoMes(final int mes, final int ano, final int bissextoRef) {
        final boolean Bissexto = Bissexto(ano, anoBissexto);

        final int janeiro = 1;
        final int fevereiro = 2;
        final int marco = 3;
        final int abril = 4;
        final int maio = 5;
        final int junho = 6;
        final int julho = 7;
        final int agosto = 8;
        final int setembro = 9;
        final int outubro = 10;
        final int novembro = 11;
        final int dezembro = 12;

        switch (mes) {
            case janeiro:
            case marco:
            case maio:
            case julho:
            case agosto:
            case outubro:
            case dezembro:
                return DIA_TRINTAEUM;
            case abril:
            case junho:
            case setembro:
            case novembro:
                return DIA_TRINTA;
            case fevereiro:
                if(Bissexto) {
                    return DIA_VINTEENOVE;
                } else {
                    return DIA_VINTEEOITO;
                }
            default: 
                return 0;
        }
    }

    private static boolean comparaDatas(final int diaUm, final int mesUm,
        final int anoUm, final int diaDois, final int mesDois, final int anoDois) {
            return anoUm == anoDois && mesUm == mesDois && diaUm == diaDois;
        }

    public static int avancaData(final String dataOrigem, final String dataDesejada, final int bissextoRef) {
        int diaOrigem = extraiDia(dataOrigem);
        int mesOrigem = extraiMes(dataOrigem);
        int anoOrigem = extraiAno(dataOrigem);
        int diaDesejado = extraiDia(dataDesejada);
        int mesDesejado = extraiMes(dataDesejada);
        int anoDesejado = extraiAno(dataDesejada);
        int contadorDias = 0;
        final int dezembro = 12;

        while (!comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                diaDesejado, mesDesejado, anoDesejado)) {
            for (int j = mesOrigem; j <= dezembro; j++) {
                for (int i = diaOrigem; i <= ultimoDiaDoMes(mesOrigem,
                        anoOrigem, bissextoRef); i++) {
                    if (comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                            diaDesejado, mesDesejado, anoDesejado)) {
                        break;
                    }
                    diaOrigem++;
                    contadorDias++;
                }
                if (comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                        diaDesejado, mesDesejado, anoDesejado)) {
                    break;
                }
                diaOrigem = 1;
                mesOrigem++;
            }
            if (comparaDatas(diaOrigem, mesOrigem, anoOrigem,
                    diaDesejado, mesDesejado, anoDesejado)) {
                break;
            }
            mesOrigem = 1;
            anoOrigem++;
        }

        return contadorDias;
}
    
    public static int recuaData(final String dataOrigem, final String dataDesejada, final int bissextoRef) {
        int diaOrigem = extraiDia(dataOrigem);
        int mesOrigem = extraiMes(dataOrigem);
        int anoOrigem = extraiAno(dataOrigem);
        int diaDesejado = extraiDia(dataDesejada);
        int mesDesejado = extraiMes(dataDesejada);
        int anoDesejado = extraiAno(dataDesejada);
        int contadorDias = 0;

        while (!comparaDatas(diaOrigem, mesOrigem, anoOrigem, diaDesejado, mesDesejado, anoDesejado)) {
        for (int j = mesOrigem; j > 0; j--) {
            for (int i = diaOrigem; i > 0; i--) {
                if (comparaDatas(diaOrigem, mesOrigem, anoOrigem, diaDesejado, mesDesejado, anoDesejado)) {
                    break;
                }
                diaOrigem = recuaDia(bissextoRef, diaOrigem, mesOrigem, anoOrigem);
                contadorDias++;
            }
            
            if (comparaDatas(diaOrigem, mesOrigem, anoOrigem, diaDesejado, mesDesejado, anoDesejado)) {
                break;
            }
            mesOrigem = recuaMes(mesOrigem);
            diaOrigem = ultimoDiaDoMes(mesOrigem, anoOrigem, bissextoRef);
        }

        if (comparaDatas(diaOrigem, mesOrigem, anoOrigem, diaDesejado, mesDesejado, anoDesejado)) {
            break;
        }

        anoOrigem--;
        }

        return contadorDias;
        }


    public static int avancaDiaSemana(final int dias, final int diaDaSemanaRef) {
        int diaDaSemana = diaDaSemanaRef;
        final int diaInvalido = 7;

        for (int contaDias = 0; contaDias < dias; contaDias++) {
            diaDaSemana++;
            if (diaDaSemana == diaInvalido) {
                diaDaSemana = 0;
            }
        }

        return diaDaSemana;
    }

    public static int recuaDiaSemana(final int dias, final int diaDaSemanaRef) {
        int diaDaSemana = diaDaSemanaRef;
        final int diaValido = 6;

        for (int contaDias = 0; contaDias < dias; contaDias++) {
            diaDaSemana--;
            if (diaDaSemana == -1) {
                diaDaSemana = diaValido;
            }
        }

        return diaDaSemana;
    }

    public static int subtraiDia(final int dia, final int mes, final int ano, final int anoBissexto) {
        int diaAux = dia;
        final int um = 1;
        if (dia == um) {
            diaAux = UltimoDiaMes(mes - 1, ano, anoBissexto);
        } else {
            diaAux--;
        }
        return diaAux;
    }


    public static int subtraiMes(final int mes) {
        int mesAux = mes;
        final int ultimoMes = 12;
        final int um = 1;
        if (mes == um) {
            mesAux = ultimoMes;
        } else {
            mesAux--;
        }
        return mesAux;
    }


    public static int dataMaior(final String dataOrigem,
        final String dataDesejada) {
        int diaOrigem = extraiDia(dataOrigem);
        int mesOrigem = extraiMes(dataOrigem);
        int anoOrigem = extraiAno(dataOrigem);
        int diaDesejado = extraiDia(dataDesejada);
        int mesDesejado = extraiMes(dataDesejada);
        int anoDesejado = extraiAno(dataDesejada);

        if (anoDestino == anoOrigem) {
            if (mesDestino == mesOrigem) {
                if (diaOrigem > diaDesejado) {
                    return -1;
                } else if (diaOrigem == diaDesejado) {
                    return 0;
                } else {
                    return 1;
                }
            } else if (mesDesejado > mesOrigem) {
                return 1;
            } else {
                return -1;
            }
        } else if (anoDesejado > anoOrigem) {
            return 1;
        } else {
            return -1;
        }
    }

    public static int encontraDia(final String[] args) {
        
    }
}