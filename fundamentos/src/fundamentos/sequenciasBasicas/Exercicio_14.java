package br.com.savio.fundamentos.sequenciasBasicas;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a quantidade de quilometros percorridos pelo carro?");
        double quantidadeKm = valorQuilometros(sc.nextDouble());
        System.out.println("Qual é quantidade de dias em uso?");
        int quantidadeDias = valorDias(sc.nextInt());

        System.out.printf("""
                O valor a ser pago é R$%.2f
                --------------------------
                Valor pelos quilometros: R$%.2f
                Valor pelos dias: R$%d
                """, (quantidadeDias + quantidadeKm), quantidadeKm, quantidadeDias);
    }
    public static double valorQuilometros (double km){
        return km*0.2;
    }

    public static int valorDias (int dia){
        return dia*90;
    }
}
