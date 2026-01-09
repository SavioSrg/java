package br.com.savio.fundamentos.sequenciasBasicas;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();

        System.out.printf("O dobro do %.3f é %.3f e o sua terça parte é %.3f",  valor, valor*2, valor/3);
    }
}
