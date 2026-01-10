package br.com.savio.fundamentos.sequenciasBasicas;

import java.util.Scanner;

public class Exercicio_13 {
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salário: ");
        double salario = sc.nextDouble();
        System.out.printf("Novo salário: %.2f%n", salario + (salario*0.15));
    }
}
