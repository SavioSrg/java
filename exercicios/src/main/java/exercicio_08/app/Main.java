package exercicio_08.app;

import exercicio_08.model.Account;

public class Main {
    public static void main(String[] args) {
        Account conta = new Account("470", 132);

        System.out.printf(
    """
    Número de registro: %s
    Saldo inicial: %.2f
    """, conta.id, conta.balance);
    }
}
