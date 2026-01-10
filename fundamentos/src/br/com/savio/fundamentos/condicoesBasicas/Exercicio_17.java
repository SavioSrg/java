package br.com.savio.fundamentos.condicoesBasicas;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a velocidade do carro na via? (km/h)");
        double velocidade = sc.nextDouble();
        double valorMulta;

        if (velocidade > 80) {
            System.out.println("Veiculo multado");
            valorMulta = (velocidade - 80) * 5;
            System.out.printf("Valor da multa: R$ %.2f%n", valorMulta);
        } else {
            System.out.println("Boa viagem!");
        }
        sc.close();
    }
}
