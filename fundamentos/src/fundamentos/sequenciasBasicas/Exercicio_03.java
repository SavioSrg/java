package br.com.savio.fundamentos.sequenciasBasicas;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o salário: ");
        double salario = sc.nextDouble();

        System.out.printf("Funcionário(a) %s recebe o valor %.2f na empresa",  nome, salario);
    }
}
