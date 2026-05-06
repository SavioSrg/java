package Exercicio_13.model;

public class Carro {
    private String nome;
    private String marca;
    private Associacao placa;
    public Carro(String nome) {
        this.nome = nome;
    }

    public Carro(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }
}
