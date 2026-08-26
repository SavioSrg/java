package exercicio_65.app;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        fila.offer("Ana");
        fila.offer("Roberto");
        fila.offer("Clara");
        fila.offer("Miguel");
        fila.offer("Beatriz");
        fila.offer("Italo");

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }

        System.out.println(fila.poll());
        System.out.println(fila.peek());

        try {
            fila.remove();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            fila.element();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
