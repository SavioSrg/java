package br.com.savio.fundamentos.sequenciasBasicas;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular a redução do tempo de vida de um fumante");

        System.out.print("Digite a média de cigarros fumados por dia: ");
        double mediaCigarroDia = sc.nextDouble();

        System.out.print("Quantos anos você fumou? ");
        int anosFumando = sc.nextInt();

        double resultado = Math.round(consumoDeCigarro(mediaCigarroDia, anosFumando));

        System.out.printf("O tempo perdido de dias é: %.0f ", resultado);
        sc.close();
    }

    public static double consumoDeCigarro(double mediaCigarroDia, int anosFumando) {
        double quantidadeDeCigarros =  mediaCigarroDia * (anosFumando *365);
        double minutosPerdidos = quantidadeDeCigarros * 10;
        return minutosPerdidos / 1440;
    };
}
