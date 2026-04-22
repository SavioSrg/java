package exercicio_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double a = sc.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double b = sc.nextDouble();

        System.out.println("Valores iniciais:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Troca com variável TEMP

        double tempA = a;
        double tempB = b;

        double temp = tempA;
        tempA = tempB;
        tempB = temp;

        System.out.println("Valores modificados com variável temporária:");
        System.out.println("a = " + tempA);
        System.out.println("b = " + tempB);

        // Troca sem variável (Aritmética)

        double aritA = a;
        double aritB = b;

        aritA = aritA + aritB;
        aritB = aritA - aritB;
        aritA = aritA - aritB;

        System.out.println("Valores modificados com variável aritmética:");
        System.out.println("a = " + aritA);
        System.out.println("b = " + aritB);

        sc.close();
    }
}
