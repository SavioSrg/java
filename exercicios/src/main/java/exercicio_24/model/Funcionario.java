package exercicio_24.model;

public abstract class Funcionario implements Pagamento {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
