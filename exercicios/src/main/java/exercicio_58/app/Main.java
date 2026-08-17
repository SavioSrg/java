package exercicio_58.app;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class Main {
    public static void main(String[] args) {
        List<String> produtos = new ArrayList<>(List.of("notebook", "mouse", "teclado"));

        System.out.println("Lista no inicio do processo: " + produtos);

        ListIterator<String> listIterator = produtos.listIterator();

        while (listIterator.hasNext()) {
            String item = listIterator.next();
            listIterator.set(item.toUpperCase());
        }

        System.out.println("Transformação em maiúsculo: " + produtos);

        while (listIterator.hasPrevious()) {
            String item = listIterator.previous();
        }
        System.out.println("Lista em ordem inversa: "  + produtos);
    }
}
