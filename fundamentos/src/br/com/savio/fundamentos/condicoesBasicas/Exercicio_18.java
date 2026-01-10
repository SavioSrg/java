package br.com.savio.fundamentos.condicoesBasicas;

import java.time.Year;
import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        String nome =  sc.nextLine();
        System.out.println(nome + ", qual é o seu ano de nascimento?");
        int dataNascimento = sc.nextInt();

        int anoAtual = Year.now().getValue();
        int idade = anoAtual - dataNascimento;

        if (idade >= 16 && idade < 18 || idade >= 70 ) {
            System.out.println(nome + ", o seu voto é facultativo.");
        } else  if (idade < 16) {
            System.out.println(nome + ", não é possivel votar.");
        } else {
            System.out.println(nome + " com " + idade + "de idade o voto é obrigatório");
        }
    }
}
