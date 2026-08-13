package exercicio_56.app;

import exercicio_56.model.Livro;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("978-3-16-148410-0", "Java");
        Livro l2 = new Livro("978-3-16-148410-0", "Java Avançado");

        System.out.println(l1.equals(l2));
        System.out.println("Livro 1: " + l1.hashCode());
        System.out.println("Livro 2: " + l2.hashCode());
    }
}
