package exercicio_14.model;

public class Diretor extends Funcionario {
    public Diretor(String nome, double salario) {
        super(nome, salario);
        setCargo("Diretor");
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.20;
    }
}
