package com.github.vnduda.ufg.cs.aula01;
import java.time.DateTimeException;
import java.time.LocalDate;

/**
 * Implementação de funções matemáticas.
 */
public class Algoritmos {
    /**
     * Para cobertura.
     */
    protected Algoritmos() {

    }

    /**
     * Verifica se n satisfaz propriedade 3025.
     * @param n n variavel a ser verificada
     * @throws IllegalArgumentException caso entrada seja menor que 0
     * ou maior que 999
     * @return o valor verdadeiro se o argumento fornecido
     * satisfaz a propriedade 3025 e, o valor falso, caso contrário
    */
    public static boolean propriedade3025(final int n) {
        final int limiteMaximo = 9999;
        if (n < 0 || n > limiteMaximo) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }
        final int auxiliar1 = 100;
        final int i = n / auxiliar1;
        final int j = n % auxiliar1;

        return (i + j) * (i + j) == n;
    }

    /**
     * Verifica se n satisfaz a propriedade 153.
     * @param n n variavel a ser verificada
     * @throws IllegalArgumentException caso entrada seja menor que 100
     * ou maior que 999
     * @return o valor verdadeiro se o argumento fornecido satisfaz
     * a propriedade 153 e, o valor falso, caso contrário
    */
    public static boolean propriedade153(final int n) {
        final int limiteMinimo = 100;
        final int limiteMaximo = 999;
        if (n < limiteMinimo || n > limiteMaximo) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

        final int auxiliar1 = 100;
        final int auxiliar2 = 10;
        final int c = n / auxiliar1;
        final int du = n % auxiliar1;
        final int d = du / auxiliar2;
        final int u = du % auxiliar2;

        return (c * c * c) + (d * d * d) + (u * u * u) == n;
    }

    /**
     * Determina o dia da semana a partir de uma dada data.
     * @param d o dia
     * @param m o mês
     * @param a o ano
     * @throws IllegalArgumentException caso a data não seja válida
     * @return retorna o numero equivalente ao dia da semana que foi calculado
    */

    public static int diaSemana(final int d, final int m, final int a) {
        final int diaMaximo = 31;
        final int mesMaximo = 12;
        final int anoMinimo = 1753;
        if (d < 1 || d > diaMaximo) {
            throw new IllegalArgumentException("Dia inválido");
        }

        if (m < 1 || m > mesMaximo) {
            throw new IllegalArgumentException("Mês inválido");
        }

        if (a < anoMinimo) {
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
        final int mesMais = 12;
        final int anoMenos = 1;
        if (mes == 1 || mes == 2) {
            mes += mesMais;
            ano -= anoMenos;
        }

        final int s = (dia + (2 * mes) + (3 * (mes + 1) / 5)
                       + ano + (ano / 4) - (ano / 100) + (ano / 400));

        final int auxResultado = 7;
        return s % auxResultado;
    }

    /**
     * Gera o resto da divisão inteira de x por y.
     * @param x dividendo
     * @param y divisor
     * @throws IllegalArgumentException caso entrada esteja fora da faixa
     * @return o resultado da divisão inteira de x por y
    */
    public static int restoDivisao(final int x, final int y) {

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

    /**
     * Faz a soma dos primeiros naturais, de 1 até n.
     * @param n número máximo a ser calculado
     * @throws IllegalArgumentException caso entrada seja menor que 1
     * @return retorna a soma dos primeiros números até n
     */
     public static int somaNaturais(final int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Intervalo de n inválido");
        }

        int s = 1;
        for (int i = 2; i <= n; i++) {
            s = s + i;
        }

        return s;
    }

    /**
     * Algoritmo que faz o fatorial de um número n.
     * @param n variável que será calculado o fatorial
     * @throws IllegalArgumentException caso entrada seja menor que 1
     * @return retorna o fatorial de n calculado
     */
    public static int fatorial(final int n) {

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

    /**
     * Verifica o produto de dois inteiros a e b utilizando soma.
     * @param a variável multiplicando
     * @param b variável multiplicador
     * @throws IllegalArgumentException caso entradas sejam menores que zero
     * @return o produto de dois inteiros
     */
    public static int produto(final int a, final int b) {

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
            i = i + 1;
        }

        return s;
    }

    /**
     * Verifica potencia de x elevado a y utilizando somas.
     * @param x base da potência
     * @param y expoente da potência
     * @throws IllegalArgumentException caso entradas sejam menores que 0
     * @return retorna o valor da potência de x por y
     */
    public static int potencia(final int x, final int y) {

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

    /**
     * Verifica valor de Pi para um total de n termos.
     * @param n quantidade de termos
     * @throws IllegalArgumentException caso entrada seja menor que 1
     * @return retorna o valor calculado de pi
     */
    public static double pi(final int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Intervalo inválido de n");
        }

        double p = 0;
        double s = -1;
        double d = -1;
        int i = 1;
        final int aux = 4;
        while (i <= n) {
            d = d + 2;
            s = -s;
            p = p + aux * s / d;
            i = i + 1;
        }

        return p;
    }

    /**
     * Calcula logaritmo elevado a n com precisão k.
     * @param n variável de potência
     * @param k variável de precisão
     * @throws IllegalArgumentException caso n seja menor que 1 e k menor que 2
     * @return o logaritmo elevado a n calculado com precisão k
     */
    public static float logaritmoNatural(final float n, final float k) {

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
        while (k >= i) {
            numerador = numerador * numerador;
            denominador = denominador * i;
            e = e + numerador / denominador;
            i = i + 1;
        }

        return e;
    }

    /**
     * Calcula a razão áurea usando uma sequência.
     * @param x o primeiro termo da sequência
     * @param y o segundo termo
     * @param k a precisão
     * @throws IllegalArgumentException caso x seja menor que 0,
     * ou y menor que x, ou k menor que 0
     * @return o valor da razao aurea calculado
     */
    public static float razaoAurea(final float x,
                                   final float y, final float k) {

        if (x < 0) {
            throw new IllegalArgumentException("Intervalo de x inválido");
        }

        if (y < x) {
            throw new IllegalArgumentException(
                "Variável y tem que ser maior que x");
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

    /**
     * Calcula um quadrado perfeito dado um n.
     * @param n número a ser calculado o quadrado perfeito
     * @throws IllegalArgumentException caso entrada seja menor que 1
     * @return o quadrado perfeito
     */
    public static boolean quadradoPerfeito(final int n) {

        if (n < 1) {
            throw new IllegalArgumentException(
                "Intervalo da variável n inválido");
        }

        int i = 1;
        int s = 1;
        while (s < n) {
            i = i + 2;
            s = s + i;
        }

        return s == n;
    }

    /**
     * Calcula raiz quadrada dada a base e o indice.
     * @param n base da raiz quadrada
     * @param i indice da raiz quadrada
     * @throws IllegalArgumentException caso entrada seja menor que 0
     * @return a raiz quadrada calculada
     */
    public static float raiz(final float n, final int i) {

        if (n < 0) {
            throw new IllegalArgumentException(
                "Intervalo da variável n inválido");
        }

        float r = 1;
        int indice = i;
        while (indice >= 0) {
            r = (r + n / r) / 2;
            indice = indice - 1;
        }

        return r;
    }

    /**
     * Calcula se um dado n é primo.
     * @param n número a ser calculado
     * @throws IllegalArgumentException caso entrada seja menor que 1
     * @return true caso entrada seja um número primo
     */
    public static boolean primo(final int n) {

        if (n < 1) {
            throw new IllegalArgumentException(
                "Intervalo da variável n inválido");
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

    /**
     * Algoritmo que encontra números primos.
     * @param a vetor de zeros com o tamanho do número a ser checado
     * @throws IllegalArgumentException caso o tamanho do vetor for
     * menor ou igual a 1 ou vetor não estiver zerado
     * @return vetor com resultado calculado
     */
    public static int[] crivoEratostenes(final int[] a) {

        if (a == null) {
            throw new IllegalArgumentException("array is null");
        }

        if (a.length < 1) {
            throw new IllegalArgumentException("Tamanho do array inválido");
        }

        for (int valor : a) {
            if (valor != 0) {
                throw new IllegalArgumentException(
                    "O array precisa estar zerado");
            }
        }

        int i = 2;
        int limite = (int) Math.floor(Math.sqrt(a.length));

        while (i <= limite) {

            int multiplo = i + i;

                while (multiplo <= a.length) {
                    a[multiplo] = 1;
                    multiplo = multiplo + i;
                }

            i = i + 1;
        }

        return a;
    }

    /**
     * Calcula o maior divisor comum entre a e b.
     * @param a número inteiro que será utilizado para o mdc
     * @param b número inteiro que será utilizado para o mdc
     * @throws IllegalArgumentException caso b seja maior que a,
     * ou b menor que 0
     * @return o valor do mdc entre a e b
     */
    public static int mdc(final int a, final int b) {

        if (a < b) {
            throw new IllegalArgumentException(
                "Variável a deve ser maior que b");
        }

        if (b < 0) {
            throw new IllegalArgumentException(
                "Intervalo da variável b inválido");
        }

        int auxiliarA = a;
        int auxiliarB = b;

        while (auxiliarB != 0) {
            int m = auxiliarA % auxiliarB;
            auxiliarA = auxiliarB;
            auxiliarB = m;
        }

        return auxiliarA;
    }

    /**
     * Calcula outra forma de achar o maior divisor comum entre a e b.
     * @param a número inteiro que será utilizado para o mdc
     * @param b número inteiro que será utilizado para o mdc
     * @throws IllegalArgumentException caso b seja maior que a,
     * ou b menor que 0
     * @return o valor do mdc entre a e b
     */
    public static int mdc2(final int a, final int b) {

        if (a < b) {
            throw new IllegalArgumentException(
                "Variável a deve ser maior que b");
        }

        if (b < 0) {
            throw new IllegalArgumentException(
                "Intervalo da variável b inválido");
        }

        int auxiliarA = a;
        int auxiliarB = b;
        while (auxiliarA != auxiliarB) {
            if (auxiliarA > auxiliarB) {
                auxiliarA = auxiliarA - auxiliarB;
            } else {
                auxiliarB = auxiliarB - auxiliarA;
            }
        }

        return auxiliarA;
    }

    /**
     * Regra de Horner para avaliação polinomial.
     * @param x variável para obter uma aproximação
     * @param g tamanho do polinômio
     * @param a coeficientes do polinômio
     * @throws IllegalArgumentException caso g seja menor que 1
     * @return o valor calculado pelo método de horner
     */
    public static int horner(final int x, final int g, final int[] a) {

        if (g < 1) {
            throw new IllegalArgumentException(
                "Intervalo da variável g inválido");
        }
        if (a == null) {
            throw new IllegalArgumentException("array is null");
        }

        int p = a[g];
        int i = g - 1;

        while (i >= 0) {
            p = p * x + a[i];
            i = i - 1;
        }

        return p;
    }

    /**
     * Algoritmo que calcula o n-esimo número de Fibonacci.
     * @param n variável a ser calculada
     * @throws IllegalArgumentException caso entrada seja menor que 0
     * @return o n-esimo número de Fibonacci
     */
    public static int fibonacci(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Intervalo da variável n inválido");
        }

        int a = 0;
        int c = 1;
        int i = 2;

        if (n == 0 || n == 1) {
            return n;
        }

        while (i <= n) {
            final int t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c;
    }

    /**
     * Função que transforma cpf de String para Vetor.
     * @param d cpf como string
     * @return cpf como vetor
     */
    public static int[] cpfStringToArray(final String d) {
        final int aux11 = 11;
        int[] cpf = new int[aux11];
        for (int i = 0; i < d.length(); i++) {
            cpf[i] = Character.getNumericValue(d.charAt(i));
        }
        return cpf;
    }

    /**
     * Algoritmo que certifica se o CPF é válido.
     * @param cpf CPF a ser verificado
     * @throws IllegalArgumentException caso entrada tenha
     * mais ou menos que 11 dígitos
     * @return caso CPF seja verdadeiro retorna true
     */
    public static boolean cpf(final String cpf) {
        final int aux11 = 11;
        if (cpf.length() > aux11 || cpf.length() < aux11) {
            throw new IllegalArgumentException("O CPF deve conter 11 dígitos");
        }

        final int[] d = cpfStringToArray(cpf);
        final int digito3 = 3;
        final int digito4 = 4;
        final int digito5 = 5;
        final int digito6 = 6;
        final int digito7 = 7;
        final int digito8 = 8;
        final int digito9 = 9;
        final int digito10 = 10;

        final int j =  d[0] + 2 * d[1] + digito3 * d[2] + digito4 * d[digito3]
                    + digito5 * d[digito4] + digito6 * d[digito5] + digito7
                    * d[digito6] + digito8 * d[digito7] + digito9 * d[digito8];

        final int k = d[1] + 2 * d[2] + digito3 * d[digito3] + digito4
                    * d[digito4] + digito5 * d[digito5] + digito6
                    * d[digito6] + digito7 * d[digito7] + digito8
                    * d[digito8] + digito9 * d[digito9];

        final int dj = (j % aux11) % digito10;
        final int dk = (k % aux11) % digito10;

        return (dj == d[digito9] && dk == d[digito10]);
    }

    /**
     * Algoritmo que certifica se o CPF é válido.
     * @param cpf CPF a ser verificado
     * @throws IllegalArgumentException caso entrada tenha
     * mais ou menos que 11 dígitos
     * @return caso CPF seja verdadeiro retorna true
     */
    public static boolean cpf2(final String cpf) {
        final int aux11 = 11;
        if (cpf.length() < aux11 || cpf.length() > aux11) {
            throw new IllegalArgumentException("O CPF deve conter 11 dígitos");
        }

        final int[] d = cpfStringToArray(cpf);
        final int digito7 = 7;
        final int digito8 = 8;
        final int digito9 = 9;
        final int digito10 = 10;

        int c = digito7;
        int p = d[digito8];
        int s = d[digito8];

        while (c >= 0) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }

        final int j = (s % aux11) % digito10;
        final int k = ((s - p + digito9 * d[digito9]) % aux11) % digito10;

        return (j == d[digito9] && k == d[digito10]);
    }
}
