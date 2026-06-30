package exercicio_19.model;

public class Jogador {
    private String nome;
    private double salario;
    private Posicao posicao;
    private Time time;

    public Jogador (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Jogador" + "\n" +
                "nome: " + nome +
                ", salário: " + salario +
                ", posição: " + posicao;
    }
}
