package exercicio_60.app;

import exercicio_60.model.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("1984", "George Orwell", 1949);
        Livro l2 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro l3 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937);

        Livro[] livros = {l1, l2, l3};

        List<Livro> biblioteca = new ArrayList<Livro>(List.of(livros));

        for (Livro livro : biblioteca) {
            System.out.println(livro);
        }

        System.out.println("\nOrdenação");
        Collections.sort(biblioteca);

        for (Livro livro : biblioteca) {
            System.out.println(livro);
        }





    }
}
