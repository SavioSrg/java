package exercicio_15.app;

import exercicio_15.model.Conta;
import exercicio_15.model.ContaCorrente;
import exercicio_15.model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Conta contaSimples = new Conta(123456);
        contaSimples.setSaldo(500);
        contaSimples.sacar(100);
        System.out.println("Conta: " + contaSimples.getNumero() + " | Saldo atual: " + contaSimples.getSaldo());


        ContaCorrente contaCorrente = new ContaCorrente(234567, 0);
        contaCorrente.setSaldo(800);
        contaCorrente.sacar(180);
        System.out.println("Conta: " + contaCorrente.getNumero() + " | Saldo atual: " + contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca(345678, 0);
        contaPoupanca.setSaldo(800);
        contaPoupanca.sacar(180);
        System.out.println("Conta: " + contaPoupanca.getNumero() + " | Saldo atual: " + contaPoupanca.getSaldo());
    }
}
