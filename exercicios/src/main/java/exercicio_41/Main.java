package exercicio_41;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(25);
        numeros.add(40);
        numeros.add(null);
        numeros.add(5);
        numeros.add(80);
        numeros.add(127);

        int resultado = 0;

        for (Integer numero : numeros) {
            if (numero != null && numero % 2 == 0) {
                resultado += numero.intValue();
            }
        }

        System.out.println(resultado);

    }
}
