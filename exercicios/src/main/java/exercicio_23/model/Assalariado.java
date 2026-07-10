package exercicio_23.model;

public class Assalariado extends Funcionario {
    public Assalariado(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double vencimentos() {
        return 1780.94;
    }
}
