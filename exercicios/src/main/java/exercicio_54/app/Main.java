package exercicio_54.app;

import exercicio_54.model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Notebook", 3500.0);
        Produto p2 = new Produto(1, "Notebook Gamer", 4200.0);

        System.out.println("Produto 1: " + p1);
        System.out.println("Produto 2: " + p2);

        System.out.println("\np1 == p2: " + (p1 == p2));
        System.out.println("p1.equals(p2): " + p1.equals(p2));
    }
}
