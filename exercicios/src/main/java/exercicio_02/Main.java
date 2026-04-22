package exercicio_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double primeiroValor = sc.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double segundoValor = sc.nextDouble();

        double resultadoSoma = primeiroValor + segundoValor;
        double resultadoSubtracao = primeiroValor - segundoValor;
        double resultadoMultiplicacao = primeiroValor * segundoValor;

        double resultadoDivisao;
        if (segundoValor != 0) {
            resultadoDivisao = primeiroValor / segundoValor;
        } else {
            System.out.println("Não é possivel realizar a divisão por zero.");
            resultadoDivisao = 0;
        }

        double resultadoMedia = resultadoSoma / 2;

        System.out.println("Resultados");
        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);
        System.out.println("Média: " + resultadoMedia);

        sc.close();
    }
}
