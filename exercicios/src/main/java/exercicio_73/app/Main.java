package exercicio_73.app;

import exercicio_73.model.Cofre;
import exercicio_73.model.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(520.6, "Mário\n");

        ContaBancaria.Extrato extrato = new ContaBancaria.Extrato(conta);
        extrato.mostrarSaldoAtual();


        Cofre cofre = new Cofre("ABCDOMINGO");
        Cofre.Auditor auditor = cofre.new Auditor();

        Cofre.Fabricante fabricante = new Cofre.Fabricante(cofre);

        auditor.mostrarSenhaAtual();
        fabricante.mostrarSenhaAtual();
    }
}
