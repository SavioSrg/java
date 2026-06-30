package exercicio_20.model;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome) {
        this.nome = nome;
        this.salario = 0;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("Salário negativo");
        } else {
            this.salario = salario;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract void subiuDeCargo(Cargo novoCargo);
}
