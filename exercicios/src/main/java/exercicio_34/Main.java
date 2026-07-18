package exercicio_34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            System.out.println("TESTE DE LEITOR DE PALAVRAS");
            System.out.println("Digite uma palavra: ");
            String palavra = teclado.nextLine();

            leitorDePalavras(palavra);

        } catch (SemVogalException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void leitorDePalavras(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            char letraMaiscula = Character.toUpperCase(letra);
            if (temVogal(letraMaiscula)) {
                System.out.println("(" + letra + ") é uma vogal.");
                return;
            }
        }
        throw new SemVogalException("A palavra fornecida não possui nenhuma vogal.");
    }

    public static boolean temVogal(char letra) {
        Character[] vogais = {'A', 'E', 'I', 'O', 'U'};

        for (Character v : vogais) {
            if (v.equals(letra)) {
                return true;
            }
        }

        return false;
    }

}
