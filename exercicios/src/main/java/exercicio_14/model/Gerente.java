package exercicio_14.model;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
        setCargo("Gerente");
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.15;
    }
}
