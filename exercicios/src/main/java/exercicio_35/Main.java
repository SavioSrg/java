package exercicio_35;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o máximo de números possiveis sem repetir!");

        ArrayList<Integer> lista = new ArrayList<>();

        try (Scanner teclado = new Scanner(System.in)) {

            while (true) {
                System.out.println("Digite um número: ");
                int numero = teclado.nextInt();

                if (lista.contains(numero)) {
                    throw new IllegalArgumentException(
                            "O número " + numero + " já foi informado."
                    );
                }

                lista.add(numero);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(lista);

            e.printStackTrace();
        }
    }
}
