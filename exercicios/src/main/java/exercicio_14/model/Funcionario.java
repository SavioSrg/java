package exercicio_14.model;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    private static int contagemFuncionario = 0;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = "Não definido";
        contagemFuncionario++;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public static int getContagemFuncionario() {
        return contagemFuncionario;
    }

    public double getBonificacao() {
        return this.salario * 0.10;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Salário: R$ " + salario + " | num. funcionário: " + contagemFuncionario + " | Cargo: " + cargo;
    }
}
