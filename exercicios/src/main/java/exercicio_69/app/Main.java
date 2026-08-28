package exercicio_69.app;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] numeros = {1,2,3,4,5,6,7,8,9};
        String[] letras = {"a", "e", "i", "o", "u"};

        trocarPosicoes(numeros, 0, 8);
        trocarPosicoes(letras, 1, 3);

        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();

        for (String letra : letras) {
            System.out.print(letra + " ");
        }
    }

    public static <T> void trocarPosicoes (T[] array, int indice1, int indice2){

        T temporario = array[indice1];

        array[indice1] = array[indice2];
        array[indice2] = temporario;
    }
}


