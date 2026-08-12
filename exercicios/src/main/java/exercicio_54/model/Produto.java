package exercicio_54.model;

import java.util.Objects;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object o) {
        // Identidade de memória
        if (this == o) return true;

        // Nulidade e verificação de tipo
        if (!(o instanceof Produto)) return false;

        // Casting e comparação lógica de atributos
        Produto produto = (Produto) o;
        return Objects.equals(this.id, produto.id);
    }

    @Override
    public int hashCode() {
        // Calcula o hash combinando os atributos usados no equals()
        return Objects.hash(this.id);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
