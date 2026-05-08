package exercicio_15.model;

public class ContaCorrente extends Conta {
    private double totalTaxa = 0;

    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 0.1;
        super.sacar(valor + taxa);
    }
}
