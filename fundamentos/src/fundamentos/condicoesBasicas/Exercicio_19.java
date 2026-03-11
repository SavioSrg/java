package br.com.savio.fundamentos.condicoesBasicas;

import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println(nome + ", digite sua primeira nota: ");
        double primeiraNota = sc.nextDouble();
        System.out.println(nome + ", digite sua segunda nota: ");
        double segundaNota = sc.nextDouble();

        double media = (primeiraNota+segundaNota)/2;

        if(media>7){
            System.out.println("Teve um ótimo aproveitamento, sua média foi " + media);
        } else {
            System.out.println("Não houve um bom aproveitamento, sua média foi " + media);
        }
    }
}
