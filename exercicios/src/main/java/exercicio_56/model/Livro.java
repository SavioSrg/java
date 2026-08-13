package exercicio_56.model;

import java.util.Objects;

public class Livro {
    private String isbn;
    private String titulo;

    public Livro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if(!(obj instanceof Livro livro)) return false;

        return isbn == livro.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

}
