package com.github.vnduda.ufg.cs.aula01;
import java.time.DateTimeException;
import java.time.LocalDate;

/**
 * Implementação de funções matemáticas.
 */
public final class AlgoritmosUtils {

    /**
     * Para cobertura.
     */
    private AlgoritmosUtils() {
    }

    /**
     * Verifica se numero satisfaz propriedade 3025.
     * @param numero variavel a ser verificada
     * @throws IllegalArgumentException caso entrada seja menor que 0
     * ou maior que 999
     * @return o valor verdadeiro se o argumento fornecido
     * satisfaz a propriedade 3025 e, o valor falso, caso contrário
    */
    public static boolean propriedade3025(final int numero) {
        final int limiteMaximo = 9999;
        if (numero < 0 || numero > limiteMaximo) {
            throw new IllegalArgumentException("Intervalo numerico inválido");
        }
        final int auxiliar1 = 100;
        final int primDezena = numero / auxiliar1;
        final int segDezena = numero % auxiliar1;
        final int resultado = (primDezena + segDezena)
                            * (primDezena + segDezena);

        return resultado == numero;
    }

    /**
     * Verifica se numero satisfaz a propriedade 153.
     * @param numero variavel a ser verificada
     * @throws IllegalArgumentException caso entrada seja menor que 100
     * ou maior que 999
     * @return o valor verdadeiro se o argumento fornecido satisfaz
     * a propriedade 153 e, o valor falso, caso contrário
    */
    public static boolean propriedade153(final int numero) {
        final int limiteMinimo = 100;
        final int limiteMaximo = 999;
        if (numero < limiteMinimo || numero > limiteMaximo) {
            throw new IllegalArgumentException("Intervalo inválido");
        }

        final int auxiliar1 = 100;
        final int auxiliar2 = 10;
        final int centena = numero / auxiliar1;
        final int dezenaAux = numero % auxiliar1;
        final int dezena = dezenaAux / auxiliar2;
        final int unidade = dezenaAux % auxiliar2;

        return (centena * centena * centena)
               + (dezena * dezena * dezena)
               + (unidade * unidade * unidade) == numero;
    }

    /**
     * Determina o dia da semana a partir de uma dada data.
     * @param dia o dia
     * @param mes o mês
     * @param ano o ano
     * @throws IllegalArgumentException caso a data não seja válida
     * @return retorna o numero equivalente ao dia da semana que foi calculado
    */

    public static int diaSemana(final int dia, final int mes, final int ano) {
        validaDia(dia);
        validaMes(mes);
        validaAno(ano);
        validaExcecao(dia, mes, ano);

        final int diaAux = dia;
        final int totalMesesDeAno = 12;
        final int mesAux = mes == 1 || mes == 2
                ? mes + totalMesesDeAno
                : mes;
        final int anoAux = mes == 1 || mes == 2
                ? ano - 1
                : ano;

        final int digito3 = 3;
        final int digito4 = 4;
        final int digito5 = 5;
        final int digito100 = 100;
        final int digito400 = 400;
        final int resultado = diaAux + (2 * mesAux) + (digito3 * (mesAux + 1) / digito5)
                       + anoAux + (anoAux / digito4) - (anoAux / digito100)
                       + (anoAux / digito400);

        final int auxResultado = 7;
        return resultado % auxResultado;
    }

    /**
     * Método para validar dia.
     * @param dia Dia
     */
    public static void validaDia(final int dia) {
        final int diaMaximo = 31;
        if (dia < 1 || dia > diaMaximo) {
            throw new IllegalArgumentException("Dia inválido");
        }
    }

    /**
     * Método para validar mês.
     * @param mes Mes
     */
    public static void validaMes(final int mes) {
        final int mesMaximo = 12;
        if (mes < 1 || mes > mesMaximo) {
            throw new IllegalArgumentException("Mês inválido");
        }
    }

    /**
     * Método para validar ano.
     * @param ano Ano
     */
    public static void validaAno(final int ano) {
        final int anoMinimo = 1753;
        if (ano < anoMinimo) {
            throw new IllegalArgumentException("Ano inválido");
        }
    }

    /**
     * Método para validar data.
     * @param dia Dia
     * @param mes Mes
     * @param ano Ano
     */
    public static void validaExcecao(final int dia, final int mes, final int ano) {
        try {
            LocalDate.of(ano, mes, dia);
        } catch (DateTimeException exp) {
            final String data = String.format("%d/%d/%d", dia, mes, ano);
            throw new IllegalArgumentException("data invalida: " + data, exp);
        }
    }

    /**
     * Gera o resto da divisão inteira.
     * @param dividendo dividendo
     * @param divisor divisor
     * @throws IllegalArgumentException caso entrada esteja fora da faixa
     * @return o resultado da divisão inteira
    */
    public static int restoDivisao(final int dividendo, final int divisor) {

        if (divisor < 0) {
            throw new IllegalArgumentException(
                "Valor do divisor inválido");
        }

        if (dividendo <= 0) {
            throw new IllegalArgumentException(
                "Valor do dividendo inválido");
        }

        int resto = dividendo;
        while (resto >= divisor) {
            resto = resto - divisor;
        }

        return resto;
    }

    /**
     * Faz a soma dos primeiros naturais, de 1 até n.
     * @param numero número máximo a ser calculado
     * @throws IllegalArgumentException caso entrada seja menor que 1
     * @return retorna a soma dos primeiros números até n
     */
     public static int somaNaturais(final int numero) {
        final int numMin = 1;
        if (numero < numMin) {
            throw new IllegalArgumentException(
                "Intervalo numérico inválido");
        }

        int soma = 1;
        for (int contador = 2; contador <= numero; contador++) {
            soma += contador;
        }

        return soma;
    }

    /**
     * Algoritmo que faz o fatorial de um número n.
     * @param numero variável que será calculado o fatorial
     * @throws IllegalArgumentException caso entrada seja menor que 1
     * @return retorna o fatorial calculado
     */
    public static int fatorial(final int numero) {
        final int numMin = 1;
        if (numero < numMin) {
            throw new IllegalArgumentException(
                "Intervalo da variável inválido");
        }

        int fatorial = 1;
        int aux = 2;

        while (aux <= numero) {
            fatorial *= aux;
            aux = aux + 1;
        }

        return fatorial;
    }

    /**
     * Verifica o produto de dois inteiros utilizando soma.
     * @param multiplicando variável multiplicando
     * @param multiplicador variável multiplicador
     * @throws IllegalArgumentException caso entradas sejam menores que zero
     * @return o produto de dois inteiros
     */
    public static int produto(final int multiplicando,
                              final int multiplicador) {

        if (multiplicando < 0) {
            throw new IllegalArgumentException(
                "Intervalo do multiplicando inválido");
        }

        if (multiplicador < 0) {
            throw new IllegalArgumentException(
                "Intervalo do multiplicador inválido");
        }

        final int totalParcelas = multiplicando > multiplicador
                                ? multiplicador
                                : multiplicando;
        final int parcela = multiplicador < multiplicando
                            ? multiplicando
                            : multiplicador;

        int produto = 0;
        int aux = 1;

        while (aux <= totalParcelas) {
            produto += parcela;
            aux += 1;
        }

        return produto;
    }

    /**
     * Verifica potencia utilizando somas.
     * @param base base da potência
     * @param expoente expoente da potência
     * @throws IllegalArgumentException caso entradas sejam menores que 0
     * @return retorna o valor da potência
     */
    public static int potencia(final int base, final int expoente) {

        if (base < 0) {
            throw new IllegalArgumentException(
                "Intervalo da base inválido");
        }

        if (expoente < 0) {
            throw new IllegalArgumentException(
                "Intervalo do expoente inválido");
        }

        int aux = 1;
        int potencia = 1;

        while (aux <= expoente) {
            potencia = produto(potencia, base);
            aux += 1;
        }

        return potencia;

    }

    /**
     * Verifica valor de Pi para um total de n termos.
     * @param numero quantidade de termos
     * @throws IllegalArgumentException caso entrada seja menor que 1
     * @return retorna o valor calculado de pi
     */
    public static double algoritmoPi(final int numero) {
        final int numMin = 1;
        if (numero < numMin) {
            throw new IllegalArgumentException(
                "Intervalo da entrada inválido");
        }

        double valorPi = 0;
        double sinal = -1;
        double divisor = -1;
        int contador = 1;

        while (contador <= numero) {
            final int aux = 4;
            divisor += 2;
            sinal = -sinal;
            valorPi += aux * sinal / divisor;
            contador += 1;
        }

        return valorPi;
    }

    /**
     * Calcula logaritmo elevado a n com precisão k.
     * @param potencia variável de potência
     * @param precisao variável de precisão
     * @throws IllegalArgumentException caso n seja menor que 1 e k menor que 2
     * @return o logaritmo elevado a n calculado com precisão k
     */
    public static float logaritmoNatural(final float potencia,
                                         final float precisao) {
        final int numMin = 1;
        if (potencia < numMin) {
            throw new IllegalArgumentException(
                "Intervalo da potencia inválido");
        }
        final int num2Min = 2;
        if (precisao < num2Min) {
            throw new IllegalArgumentException("Intervalo da precisão inválido");
        }

        float euler = 1 + potencia;
        float numerador = potencia;
        float denominador = 1;

        for (int i = 2; i <= potencia; i++) {
            numerador *= numerador;
            denominador += i;
            euler += numerador / denominador;
        }

        return euler;
    }

    /**
     * Calcula a razão áurea usando uma sequência.
     * @param numeroA o primeiro termo da sequência
     * @param numeroB o segundo termo
     * @param precisao a precisão
     * @throws IllegalArgumentException caso x seja menor que 0,
     * ou y menor que x, ou k menor que 0
     * @return o valor da razao aurea calculado
     */
    public static float razaoAurea(final float numeroA,
                                   final float numeroB, final float precisao) {

        if (numeroA < 0) {
            throw new IllegalArgumentException(
                "Intervalo do primeiro número inválido");
        }

        if (numeroB < numeroA) {
            throw new IllegalArgumentException(
                "NúmeroB tem que ser maior que numeroA");
        }

        if (precisao < 0) {
            throw new IllegalArgumentException(
                "Intervalo da precisão inválido");
        }

        float numerador = numeroB;
        float denominador = numeroA;
        float contador = 1;
        while (precisao >= contador) {
            final float aux = numerador;
            numerador += denominador;
            denominador = aux;
            contador += 1;
        }

        return numerador / denominador;
    }

    /**
     * Calcula um quadrado perfeito dado um n.
     * @param numero número a ser calculado o quadrado perfeito
     * @throws IllegalArgumentException caso entrada seja menor que 1
     * @return o quadrado perfeito
     */
    public static boolean quadradoPerfeito(final int numero) {
        final int numMin = 1;
        if (numero < numMin) {
            throw new IllegalArgumentException(
                "Intervalo da variável inválido");
        }

        int contador = 1;
        int soma = 1;
        while (soma < numero) {
            contador += 2;
            soma += contador;
        }

        return soma == numero;
    }

    /**
     * Calcula raiz quadrada dada a base e o indice.
     * @param base base da raiz quadrada
     * @param precisao precisao da raiz quadrada
     * @throws IllegalArgumentException caso entrada seja menor que 0
     * @return a raiz quadrada calculada
     */
    public static float raiz(final float base, final int precisao) {

        if (base < 0) {
            throw new IllegalArgumentException(
                "Intervalo da variável n inválido");
        }

        float raiz = 1;
        int indice = precisao;
        for (; indice >= 0; indice--) {
            raiz = (raiz + base / raiz) / 2;
        }

        return raiz;
    }

    /**
     * Calcula se um dado n é primo.
     * @param numero número a ser calculado
     * @throws IllegalArgumentException caso entrada seja menor que 1
     * @return true caso entrada seja um número primo
     */
    public static boolean primo(final int numero) {
        final int numMin = 1;
        if (numero < numMin) {
            throw new IllegalArgumentException(
                "Intervalo de número inválido");
        }

        int aux = 2;

        while (numero > aux) {
            if (numero % aux == 0) {
                return false;
            }
            aux += 1;
        }

        return true;
    }

    /**
     * Algoritmo que encontra números primos.
     * @param array vetor de zeros com o tamanho do número a ser checado
     * @throws IllegalArgumentException caso o tamanho do vetor for
     * menor ou igual a 1 ou vetor não estiver zerado
     * @return vetor com resultado calculado
     */
    public static int[] crivoEratostenes(final int[] array) {
        arrayNull(array);
        arrayTamanho(array);

        int contador = 2;
        final int limite = (int) Math.floor(Math.sqrt(array.length));

        while (contador <= limite) {

            int multiplo = contador + contador;

                while (multiplo <= array.length) {
                    array[multiplo] = 1;
                    multiplo += contador;
                }

            contador += 1;
        }

        return array;
    }

    /**
     * Método para exceção caso array seja null.
     * @param array Vetor
     */
    public static void arrayNull(final int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("array is null");
        }
    }

    /**
     * Método para exceção caso array tenha tamanho inválido.
     * @param array Vetor
     */
    public static void arrayTamanho(final int[] array) {
        final int arrayTamMin = 1;
        if (array.length < arrayTamMin) {
            throw new IllegalArgumentException("Tamanho do array inválido");
        }
    }

    /**
     * Calcula o maior divisor comum entre a e b.
     * @param numeroA número inteiro que será utilizado para o mdc
     * @param numeroB número inteiro que será utilizado para o mdc
     * @throws IllegalArgumentException caso b seja maior que a,
     * ou b menor que 0
     * @return o valor do mdc entre a e b
     */
    public static int mdc(final int numeroA, final int numeroB) {

        if (numeroA < numeroB) {
            throw new IllegalArgumentException(
                "NumeroA deve ser maior que numeroB");
        }

        if (numeroB < 0) {
            throw new IllegalArgumentException(
                "Intervalo da variável b inválido");
        }

        int auxiliarA = numeroA;
        int auxiliarB = numeroB;

        while (auxiliarB != 0) {
            final int temporario = auxiliarA % auxiliarB;
            auxiliarA = auxiliarB;
            auxiliarB = temporario;
        }

        return auxiliarA;
    }

    /**
     * Calcula outra forma de achar o maior divisor comum entre a e b.
     * @param numeroA número inteiro que será utilizado para o mdc
     * @param numeroB número inteiro que será utilizado para o mdc
     * @throws IllegalArgumentException caso b seja maior que a,
     * ou b menor que 0
     * @return o valor do mdc
     */
    public static int mdc2(final int numeroA, final int numeroB) {

        if (numeroA < numeroB) {
            throw new IllegalArgumentException(
                "Variável numeroA deve ser maior que numeroB");
        }

        if (numeroB < 0) {
            throw new IllegalArgumentException(
                "Intervalo de numeroB inválido");
        }

        int auxiliarA = numeroA;
        int auxiliarB = numeroB;
        while (auxiliarA != auxiliarB) {
            if (auxiliarA > auxiliarB) {
                auxiliarA -= auxiliarB;
            } else {
                auxiliarB -= auxiliarA;
            }
        }

        return auxiliarA;
    }

    /**
     * Regra de Horner para avaliação polinomial.
     * @param numero variável para obter uma aproximação
     * @param tam tamanho do polinômio
     * @param array coeficientes do polinômio
     * @throws IllegalArgumentException caso g seja menor que 1
     * @return o valor calculado pelo método de horner
     */
    public static int horner(final int numero,
                             final int tam, final int[] array) {
        final int tamMinimo = 1;
        if (tam < tamMinimo) {
            throw new IllegalArgumentException(
                "Tamanho inválido");
        }
        if (array == null) {
            throw new IllegalArgumentException("array is null");
        }

        int polinomio = array[tam];
        int contador = tam - 1;

        while (contador >= 0) {
            polinomio = polinomio * numero + array[contador];
            contador -= 1;
        }

        return polinomio;
    }

    /**
     * Algoritmo que calcula o n-esimo número de Fibonacci.
     * @param enesimoTermo variável a ser calculada
     * @throws IllegalArgumentException caso entrada seja menor que 0
     * @return o n-esimo número de Fibonacci
     */
    public static int fibonacci(final int enesimoTermo) {
        if (enesimoTermo < 0) {
            throw new IllegalArgumentException(
                "Intervalo do enesimo termo inválido");
        }

        if (enesimoTermo == 0 || enesimoTermo == 1) {
            return enesimoTermo;
        }

        int proxTermo = 0;
        int atualTermo = 1;
        int contador = 2;
        while (contador <= enesimoTermo) {
            final int t = atualTermo;
            atualTermo = atualTermo + proxTermo;
            proxTermo = t;
            contador += 1;
        }

        return atualTermo;
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

        return dj == d[digito9] && dk == d[digito10];
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

        int aux7 = digito7;
        int auxiliar1 = d[digito8];
        int auxiliar2 = d[digito8];

        while (aux7 >= 0) {
            auxiliar1 += d[aux7];
            auxiliar2 += auxiliar1;
            aux7 -= 1;
        }

        final int j = (auxiliar2 % aux11) % digito10;
        final int k = ((auxiliar2 - auxiliar1 + digito9
                      * d[digito9]) % aux11) % digito10;

        return j == d[digito9] && k == d[digito10];
    }
}
