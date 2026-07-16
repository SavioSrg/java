package exercicio_26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("CALCULADORA DE DIVISÃO");
            System.out.println("Digite o primeiro valor: ");
            double primeiroValor = teclado.nextDouble();
            System.out.println("Digite o segundo valor: ");
            double segundoValor = teclado.nextDouble();

            if (segundoValor == 0) {
                throw new ArithmeticException("Valor inválido");
            }

            System.out.println("Resultado: " + (primeiroValor / segundoValor));
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("ERRO: Segundo número deve ser maior que zero");
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("ERRO: Digite apenas números");
        }
    }
}
