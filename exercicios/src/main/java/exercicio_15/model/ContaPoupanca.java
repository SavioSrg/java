package exercicio_15.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, double saldo) {
        super(numero, saldo);
    }

    public void atualizar(double taxaPercentual) {
        double rendimento = this.saldo * (taxaPercentual / 100);
        this.saldo += rendimento;
    }
}
