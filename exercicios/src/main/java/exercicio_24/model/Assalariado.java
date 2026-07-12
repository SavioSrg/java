package exercicio_24.model;

public class Assalariado extends  Funcionario {
    private double salario;
    private String tipoSalario;

    public Assalariado(String nome, double salario) {
        super(nome);
        this.salario = salario;
        this.tipoSalario = "Assalariado";
    }

    public String getTipoSalario() {
        return tipoSalario;
    }

    @Override
    public String getDescricao() {
        return "Nome: " + getNome() + ", Tipo de salário: " + getTipoSalario();
    }

    @Override
    public double getPaymentAmount() {
        return this.salario;
    }


}
