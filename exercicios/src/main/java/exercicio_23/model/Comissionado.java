package exercicio_23.model;

public class Comissionado extends Funcionario {
    private double valorVendaBruto;

    public Comissionado(String nome, String cpf, double valorVendaBruto) {
        super(nome, cpf);
        this.valorVendaBruto = valorVendaBruto;
    }

    @Override
    public double vencimentos() {
        double valorSalario = 1642.68;

        double valorComissao = valorVendaBruto * 0.3;
        if (valorComissao > valorSalario) {
            return valorComissao;
        } else {
            return valorSalario;
        }
    }
}
