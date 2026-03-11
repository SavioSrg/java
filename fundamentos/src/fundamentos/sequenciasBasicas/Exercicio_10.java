package br.com.savio.fundamentos.sequenciasBasicas;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite a largura: ");
        double largura = sc.nextDouble();
        double resultado = calcularTinta(altura, largura);
        System.out.println("Gastará: " + resultado + "L");
    }
    public static double calcularTinta(double altura, double largura) {
        double area = altura * largura;
        return area /= 2 ;
    }
}
