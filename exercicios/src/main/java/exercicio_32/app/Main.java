package exercicio_32.app;

import exercicio_32.model.SaldoInsuficienteException;
import exercicio_32.model.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("008987-4", 40);
        try {
            conta.saca(50);
            System.out.println("Saldo atual: " + conta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
