package exercicio_16.app;

import exercicio_16.model.CalculadoraFiscal;
import exercicio_16.model.Operacao;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Operacao operacao1 = new Operacao(23, "Carro de trabalho", "Carlos Miguel", 726.31);
        Operacao operacao2 = new Operacao(25, "Casa", "Roberta", 300000);

        CalculadoraFiscal calculadora  = new CalculadoraFiscal();
        calculadora.inserir(operacao1);
        calculadora.inserir(operacao2);

        calculadora.imprimirOperacoesCalculadas();
    }
}
