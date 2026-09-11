package exercicio_73.model;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(double saldo,  String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public static class Extrato {
        ContaBancaria contaBancaria;
        String titular =  "Extrato";

        public Extrato(ContaBancaria contaBancaria) {
            this.contaBancaria = contaBancaria;
        }

        public void mostrarSaldoAtual(){
            System.out.println("Saldo atual: " + contaBancaria.saldo + " - Titular: " + contaBancaria.titular);
        }
    }
}
