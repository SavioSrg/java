package br.com.savio.fundamentos.sequenciasBasicas;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Resolução de uma equação de 2°Grau");
        double a = valorValido(sc, "Digite o valor de a (diferente de zero): ");
        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = sc.nextDouble();

        String resultado = calcularEquacao(a, b, c);
        System.out.println(resultado);

    }
    public static double valorValido (Scanner sc, String descricao) {
        double valor;
        do {
            System.out.println(descricao);
            valor = sc.nextDouble();
            if (valor == 0) {
                System.out.println("Valor inválido!");
            }
        } while (valor == 0);
        return valor;
    }

    public static String calcularEquacao (double a, double b, double c) {
        double delta = Math.pow(b, 2) -4 * (a * c);

        if (delta < 0) {
            return "A equação não possui raízes reais (Δ < 0).";
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return String.format("A equação possui uma raiz real:%nX = %.2f", x);
        } else {
            double  x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double  x2 = (-b - Math.sqrt(delta)) / (2 * a);

            return String.format(
                    "A equação possui duas raízes reais:%nX1 = %.2f%nX2 = %.2f",
                    x1, x2 );
        }
    }
}
