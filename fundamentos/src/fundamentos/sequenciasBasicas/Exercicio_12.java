package br.com.savio.fundamentos.sequenciasBasicas;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble();

        System.out.printf("O produto %s com 15%% de desconto ficará com o valor de R$%.2f", nome, valor - (valor * 0.15));
    }
}
