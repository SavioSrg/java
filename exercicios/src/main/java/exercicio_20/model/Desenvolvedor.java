package exercicio_20.model;

public class Desenvolvedor extends Funcionario{
    private Cargo cargo;

    public Desenvolvedor(String nome, Cargo cargo) {
        super(nome);
        this.cargo = cargo;
    }

    @Override
    public void subiuDeCargo (Cargo novoCargo) {
        int ordemAtual = cargo.getOrdem();
        int ordemNova = novoCargo.getOrdem();

        if (ordemAtual < ordemNova) {
            setCargo(novoCargo);
            System.out.println(getNome() + " foi promovido para " + getCargo().getDescricao());
        } else if (ordemAtual == ordemNova) {
            System.out.println("O funcionário já ocupa o cargo de " + getCargo().getDescricao() + ".");
        } else {
            System.out.println("Não é possível realizar regressão de cargo.");
        }
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "Nível de cargo:" + cargo +
                ", Salário: R$" + String.format("%.2f", getSalario());
    }
}
