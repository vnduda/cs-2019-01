package com.github.vnduda.ufg.cs.aula01;

public class Algoritmos {

    /**
     * Verifica se n satisfaz propriedade 3025.
     * @param n n variavel a ser verificada
     * @throws IllegalArgumentException caso entrada seja menor que 0 ou maior que 999
     * @return o valor verdadeiro se o argumento fornecido satisfaz a propriedade 3025 e, o valor falso, caso contrário
    */
	public static boolean propriedade3025(final int n) {

        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

		final int i = n / 100;
		final int j = n % 100;

		return (i + j) * (i + j) == n;
    }

    /**
     * Verifica se n satisfaz a propriedade 153.
     * @param n n variavel a ser verificada
     * @throws IllegalArgumentException caso entrada seja menor que 100 ou maior que 999
     * @return o valor verdadeiro se o argumento fornecido satisfaz a propriedade 153 e, o valor falso, caso contrário 
    */
    public static boolean propriedade153(int n) {

        if (n < 100 || n > 999) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

        final int c = n / 100;
        final int du = n % 100;
        final int d = du / 10;
        final int u = du % 10;

        return (c * c * c) + (d * d * d) + (u * u * u) == n;
    }

    /**
     * Determina o dia da semana a partir de uma dada data
     * @param d o dia
     * @param m o mês
     * @param a o ano
     * @throws IllegalArgumentException caso a data não seja válida
     * @return retorna o numero equivalente ao dia da semana que foi calculado
    */
    public static int diaSemana(final int d, final int m, final int a) {

        if (d < 1 || d > 31) {
            throw new IllegalArgumentException("Dia inválido");
        }

        if (m < 1 || m > 12) {
            throw new IllegalArgumentException("Mês inválido");
        }

        if (a < 1753) {
            throw new IllegalArgumentException("Ano inválido");
        }

        try {
            LocalDate.of(a, m, d);
        } catch (DateTimeException exp) {
            final String data = String.format("%d/%d/%d", d, m, a);
            throw new IllegalArgumentException("data invalida: " + data, exp);
        }

        int dia = d;
        int mes = m;
        int ano = a;

        if (mes == 1 || mes == 2) {
            mes += 12;
            ano -= 1;   
        }

        int s = (dia + (2 * mes) + (3 * (mes + 1) / 5) + ano + (ano / 4) - (ano / 100) + (ano / 400));

        return s % 7;
    }

    /**
     * Gera o resto da divisão inteira de x por y
     * @param x dividendo
     * @param y divisor
     * @throw IllegalArgumentException caso entrada esteja fora da faixa
     * @return o resultado da divisão inteira de x por y
    */
    public static int restoDivisao(int x, int y) {

        if (y < 0) {
            throw new IllegalArgumentException("Valor de y inválido");
        }

        if (x <= 0) {
            throw new IllegalArgumentException("Valor de x inválido");
        }
        
        int s = x;
        while (s >= y) {
            s = s - y;
        }

        return s;
    }

     public static int somaNaturais(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

        int s = 1;
        for (int i = 2; i <= n; i++) {
            s = s + i;
        }

        return s;
    }

    public int fatorial(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

        int f = 1;
        int i = 2;

        while (i <= n) {
            f = f * i;
            i = i + 1;
        }

        return f;
    }

    public int produto(int a, int b) {

        if (a < 0) {
            throw new IllegalArgumentException("Intervalo de a inválido");
        }

        if (b < 0) {
            throw new IllegalArgumentException("Intervalo de b inválido");
        }

        int totalParcelas = a;
        int parcela = b;

        if (a > b) {
            totalParcelas = b;
            parcela = a;
        }

        int s = 0;
        int i = 1;

        while (i <= totalParcelas) {
            s = s + parcela;
        }

        return s;
    }

    public int produto(int x, int y) {

        if (x < 0) {
            throw new IllegalArgumentException("Intervalo de x inválido");
        }

        if (y < 0) {
            throw new IllegalArgumentException("Intervalo de y inválido");
        }

        int i = 1;
        int potencia = 1;

        while (i <= y) {
            potencia = produto(potencia, x);
            i = i + 1;
        }

        return potencia;

    }

    public double pi(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Intervalo inválido de n");
        }

        double p = 0;
        double s = -1;
        double d = -1;
        int i = 1;

        while (i <= n) {
            d = d + 2;
            s = -s;
            p = p + 4 * s / d;
            i = i + 1;
        }

        return p;
    }

    public static float logaritmoNatural(float n, float k) {

        if (n < 1) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

        if (k < 2) {
            throw new IllegalArgumentException("Intervalo de k inválido");
        }

        float i = 2;
        float e = 1 + n;
        float numerador = n;
        float denominador = 1;
        while (k >= 1) {
            numerador = numerador * numerador;
            denominador = denominador * i;
            e = e + numerador / denominador;
            i = i + 1;
        }

        return e;
    }

    public static float razaoAurea(float x, float y, float k) {

        if (x < 0) {
            throw new IllegalArgumentException("Intervalo de x inválido");
        }

        if (y < x) {
            throw new IllegalArgumentException("Variável y tem que ser maior que x");
        }

        if (k < 0) {
            throw new IllegalArgumentException("Intervalo de k inválido");
        }

        float c = y;
        float a = x;
        float i = 1;
        float t;
        while (k >= i) {
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c / a;
    }

    public static boolean quadradoPerfeito(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Intervalo da variável n inválido");
        }

        int i = 1;
        int s = 1;
        while (s < n) {
            i = i + 2;
            s = s + i;
        }

        return s == n;
    }

    public static float raiz(float n, int i) {

        if (n < 0) {
            throw new IllegalArgumentException("Intervalo da variável n inválido");
        }

        float r = 1;

        while (i >= 0) {
            r = (r + n / r) / 2;
            i = i - 1;
        }

        return r;
    }

    public static boolean primo(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Intervalo da variável n inválido");
        }

        int i = 2;

        while (n > i) {
            if (n % i == 0) {
                return false;
            }
            i = i + 1;
        }

        return true;
    }

    public static int[] crivoEratostenes(int a[]) {

        if (a == null) {
            throw new IllegalArgumentException("array is null");
        }

        if (a.length < 1) {
            throw new IllegalArgumentException("Tamanho do array inválido");
        }

        for (int valor : a) {
            if (valor != 0) {
                throw new IllegalArgumentException("O array precisa estar zerado");
            }
        }

        int i = 2;
        int limite = (int) Math.floor(Math.sqrt(a.length));

        while (i <= limite) {

            if (a[i] == 0) {
                int multiplo = i + i;

                while (multiplo <= a.length) {
                    a[multiplo] = 1;
                    multiplo = multiplo + i;
                }
            }
            i = i + 1;
        }

        return a;
    }

    public static int MDC(int a, int b) {

        if (a < b) {
            throw new IllegalArgumentException("Variável a deve ser maior que b");
        }

        if (b < 0) {
            throw new IllegalArgumentException("Intervalo da variável b inválido");
        }

        while (b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }

        return a;
    }

    public static int MDC2(int a, int b) {

        if (a < b) {
            throw new IllegalArgumentException("Variável a deve ser maior que b");
        }

        if (b < 0) {
            throw new IllegalArgumentException("Intervalo da variável b inválido");
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

    public static int horner(int x, int g, int a[]) {

        if (g < 1) {
            throw new IllegalArgumentException("Intervalo da variável g inválido");
        }
        
        // TODO teste a == null
        // TODO verifique se a contem exatamente g elementos

        int p = a[g];
        int i = g - 1;

        while (i >= 0) {
            p = p * x + a[i];
            i = i - 1;
        }

        return p;
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Intervalo da variável n inválido");
        }

        int a = 0;
        int c = 1;
        int i = 2;

        if (n == 0 || n == 1) {
            return n;
        }

        while (i <= n) {
            int t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c;
    }

    public static boolean CPF(String d) {

        if (d.length() > 11 || d.length() < 11) {
            throw new IllegalArgumentException("O CPF deve conter 11 dígitos");
        }

        int j = Character.getNumericValue(d.charAt(0)) + 2 * Character.getNumericValue(d.charAt(1))
                + 3 * Character.getNumericValue(d.charAt(2)) + 4 * Character.getNumericValue(d.charAt(3))
                + 5 * Character.getNumericValue(d.charAt(4)) + 6 * Character.getNumericValue(d.charAt(5))
                + 7 * Character.getNumericValue(d.charAt(6)) + 8 * Character.getNumericValue(d.charAt(7))
                + 9 * Character.getNumericValue(d.charAt(8));

        int k = Character.getNumericValue(d.charAt(1)) + 2 * Character.getNumericValue(d.charAt(2))
                + 3 * Character.getNumericValue(d.charAt(3)) + 4 * Character.getNumericValue(d.charAt(4))
                + 5 * Character.getNumericValue(d.charAt(5)) + 6 * Character.getNumericValue(d.charAt(6))
                + 7 * Character.getNumericValue(d.charAt(7)) + 8 * Character.getNumericValue(d.charAt(8))
                + 9 * Character.getNumericValue(d.charAt(9));

        int dj = (j % 11) % 10;
        int dk = (k % 11) % 10;

        return dj == Character.getNumericValue(d.charAt(9)) && dk == Character.getNumericValue(d.charAt(10));
    }

    public static boolean CPF2(String d) {

        if (d.length() < 11 || d.length() > 11) {
            throw new IllegalArgumentException("O CPF deve conter 11 dígitos");
        }

        int c = 7;
        int p = Character.getNumericValue(d.charAt(8));
        int s = Character.getNumericValue(d.charAt(8));

        while (c >= 0) {
            p = p + Character.getNumericValue(d.charAt(c));
            s = s + p;
            c = c - 1;
        }

        int j = (s % 11) % 10;
        int k = ((s - p + 9 * Character.getNumericValue(d.charAt(9))) % 11) % 10;

        return (j == Character.getNumericValue(d.charAt(9)) && k == Character.getNumericValue(d.charAt(10)));
    }
}