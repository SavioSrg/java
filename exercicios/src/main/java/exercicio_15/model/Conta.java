package exercicio_15.model;

public class Conta {
    private int numero;
    protected double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public Conta (int numero, double saldo) {
        this.numero = numero;
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }
}
