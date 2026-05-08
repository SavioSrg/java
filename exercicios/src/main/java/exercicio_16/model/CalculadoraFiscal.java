package exercicio_16.model;

import java.util.ArrayList;
import java.util.List;

public final class CalculadoraFiscal {
    private List<Operacao> operacoes = new ArrayList<>();

    public double calcularImpostoGeral (double valor) {
        return valor * 0.05;
    }

    public void inserir(Operacao operacao) {
        operacoes.add(operacao);
    }

    public void imprimirOperacoesCalculadas() {
        for  (Operacao op : this.operacoes) {
            System.out.println("Código: " + op.getCodigo());
            System.out.println("Descrição: " + op.getDescricao());
            System.out.println("Valor: " + op.getValor());
            System.out.println("Imposto: " + calcularImpostoGeral(op.getValor()));
            System.out.println("Valor total: " + (op.getValor() + calcularImpostoGeral(op.getValor())));
            System.out.println("___".repeat(30) + "\n");
        }
    }

}
