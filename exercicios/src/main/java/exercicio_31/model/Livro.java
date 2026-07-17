package exercicio_31.model;

public class Livro {
    private String titulo;
    private Autor autor;

    public Livro(String titulo, Autor autor) {
        if (autor == null) {
            throw new IllegalArgumentException("Autor não pode ser nulo.");
        }

        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor.getNome();
    }
}
