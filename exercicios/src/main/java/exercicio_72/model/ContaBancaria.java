package exercicio_72.model;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(double saldo,  String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public class Extrato {
        String titular =  "Extrato";

        public void mostrarSaldoAtual(){
            System.out.println("Saldo atual: " + saldo + " - Titular: " + ContaBancaria.this.titular);
        }
    }
}
