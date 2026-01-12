package br.com.savio.fundamentos.condicoesBasicas;

import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é Par");
        } else {
            System.out.println("O número " + numero + " é Impar");
        }
    }
}
