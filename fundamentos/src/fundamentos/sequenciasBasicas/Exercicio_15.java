package br.com.savio.fundamentos.sequenciasBasicas;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de dias trabalhados: ");
        int dias = sc.nextInt();
        System.out.println("Houve horas extras? ");
        String perguntaHorasExtras = sc.next();
        double horasExtras = 0;
        if (perguntaHorasExtras.equalsIgnoreCase("sim")) {
            System.out.println("Qual foi a quantidade de horas extras? ");
            horasExtras = sc.nextDouble();
        }

        double salario = valorSalario(dias, horasExtras);
        System.out.printf("Valor do salário: R$ %.2f%n", salario);

    }
    public static double valorSalario (int dias, double horasExtras) {
        double horasTrabalhadas = dias*8 + horasExtras;
        return  horasTrabalhadas*25;
    }
}
