package br.com.savio.fundamentos.sequenciasBasicas;

import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float dolar = 5.37f;
        System.out.println("Valor do Dólar: " + dolar);
        System.out.println("Digite o saldo: ");
        double valor = sc.nextDouble();
        System.out.printf("O valor %.2f convertido em dolares é igual a %.2f", valor, valor * dolar);
    }
}
