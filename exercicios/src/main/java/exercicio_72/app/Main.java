package exercicio_72.app;

import exercicio_72.model.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(520.6, "Mário");

        ContaBancaria.Extrato extrato = conta.new Extrato();
        extrato.mostrarSaldoAtual();
    }
}
