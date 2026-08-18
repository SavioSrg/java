package exercicio_60.model;

import java.util.Objects;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Livro livro)) return false;
        return anoPublicacao == livro.anoPublicacao;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(anoPublicacao);
    }

    @Override
    public int compareTo(Livro livro) {
        return Integer.compare(anoPublicacao, livro.anoPublicacao);
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo +
                ", Autor: " + autor +
                " (" + anoPublicacao + ")";
    }
}
