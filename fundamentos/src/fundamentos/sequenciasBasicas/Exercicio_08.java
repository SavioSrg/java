package br.com.savio.fundamentos.sequenciasBasicas;

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma distancia em metros: ");
        double valor = sc.nextDouble();

        PrintStream printf = System.out.printf("""
                Tabela de conversão:
                Quilômetro (km): %.3f km
                Hectômetro (hm): %.3f hm
                Decâmetro (dam): %.3f dam
                Metro (m): %.3f [Unidade base]
                Decímetro (dm): %.3f dm
                Centímetro (cm): %.3f cm
                Milímetro (mm): %.3f mm
                """, valor / 1000, valor / 100, valor / 10, valor, valor * 10, valor * 100, valor * 1000);

    }
}
