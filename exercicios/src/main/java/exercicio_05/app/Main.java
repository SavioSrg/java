package exercicio_05.app;

import exercicio_05.model.Book;

public class Main {
    public static void main(String[] args) {
        Book livro = new Book();

        Book livro2 = new Book("O mágico de Oz", "L. Frank Baum");

        Book livro3 = new Book("Atlas Ilustrado de Anatomia", "Adriana Rigutti", 73);

        System.out.println("Livro 1: " + livro);
        System.out.println("Livro 2: " + livro2);
        System.out.println("Livro 3: " + livro3);
    }
}
