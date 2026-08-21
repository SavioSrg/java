package exercicio_63.model;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto o) {
        if (this.preco < o.preco) {
            return -1;
        } else if (this.preco > o.preco) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
