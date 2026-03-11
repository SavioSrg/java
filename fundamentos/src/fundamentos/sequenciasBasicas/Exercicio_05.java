package br.com.savio.fundamentos.sequenciasBasicas;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema de médias");
        double primeiroValor = lerValorPositivo(sc, "Digite o primeiro valor:  ");
        double segundoValor = lerValorPositivo(sc, "Digite o segundo valor:  ");
        double resultado = (primeiroValor + segundoValor)/2;
        System.out.println("Resultado: " +  resultado);
    }
    public static double lerValorPositivo(Scanner sc, String mensagem){
        double valor;

        do {
            System.out.println(mensagem);
            valor = sc.nextDouble();

            if (valor <= 0){
                System.out.println("Valor inválido! Digite um número maior que zero.");
            }
        } while (valor <= 0);
        return valor;
    }

}

