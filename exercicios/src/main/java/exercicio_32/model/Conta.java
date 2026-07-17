package exercicio_32.model;

public class Conta {
    private String numeroDaConta;
    private double saldo;

    public Conta(String numeroDaConta, double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saca(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("ERRO: Valor não pode ser menor ou igual a zero");
        }

        if (valor > getSaldo()) {
            throw new SaldoInsuficienteException("Saldo de " + getSaldo() + " é insuficiente para realizar " +
                    "o saque de " + valor);
        }

        setSaldo(getSaldo() - valor);
    }
}
