package exercicio_57.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 8, 31, 98));

        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()) {
            Integer numero = iterator.next();

            if (numero % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println(numeros);
    }
}
