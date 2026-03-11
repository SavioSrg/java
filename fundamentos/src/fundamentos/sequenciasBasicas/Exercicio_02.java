package br.com.savio.fundamentos.sequenciasBasicas;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é  seu nome? ");
        String nome = sc.nextLine();

        System.out.printf("Olá %s, seja bem vindo ao exercício 02!", nome);
    }
}
