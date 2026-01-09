package br.com.savio.fundamentos.sequenciasBasicas;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor = sc.nextInt();
        int antecessor = valor - 1;
        int sucessor = valor + 1;
        System.out.println("O antecessor do número " + valor + " é "
                +  antecessor + " e o seu sucessor é " + sucessor);
    }
}
