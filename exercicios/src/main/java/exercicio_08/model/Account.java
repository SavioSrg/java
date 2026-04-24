package exercicio_08.model;

public class Account {
    public String id;
    public double balance;


    public Account(String id, double balance) {
        if(id == null || id.isEmpty()) {
            System.err.println("ERRO: Número dá conta consta como vazio");
            return;
        }

        if(balance < 0) {
            System.err.println("ERRO: Valor inválido");
            return;
        }

        this.id = id;
        this.balance = balance;
    }
}
