package exercicio_11.model;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private static int quantidadeFuncionarios = 0;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        quantidadeFuncionarios++;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    @Override
    public String toString() {
        return "nome: " + nome +
                ", cpf: " + cpf +
                ", salário: " + salario;
    }
}
