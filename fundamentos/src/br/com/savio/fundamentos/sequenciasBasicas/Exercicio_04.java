package br.com.savio.fundamentos.sequenciasBasicas;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: (valor deve ser inteiro)");
        int number1 = sc.nextInt();
        System.out.println("Digite o segundo valor: (valor deve ser inteiro)");
        int number2 = sc.nextInt();
        int resultado = number1 + number2;
        System.out.println("Valor da operação de soma é: " +  resultado);
    }
}
