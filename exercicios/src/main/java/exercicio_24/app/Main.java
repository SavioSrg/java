package exercicio_24.app;

import exercicio_24.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produtos[] produtos = new Produtos[3];
        produtos[0] = new Produtos("Monitor", 2000.00, 2);
        produtos[1] = new Produtos("Teclado", 350.00, 1);
        produtos[2] = new Produtos("Mouse", 280.00, 1);
        Fatura fatura  = new Fatura(produtos);

        Funcionario funcionario1 = new Assalariado("Romario", 1200.67);
        Funcionario funcionario2 = new Assalariado("Carlos", 5200.00);

        ArrayList<Pagamento> loteFinanceiro = new ArrayList<>();
        loteFinanceiro.add(fatura);
        loteFinanceiro.add(funcionario1);
        loteFinanceiro.add(funcionario2);

        // 4. Processando o lote e calculando o total
        double totalLote = 0;
        System.out.println("--- Detalhes do Lote Financeiro ---");

        for (Pagamento item : loteFinanceiro) {
            double valor = item.getPaymentAmount();
            System.out.println("Descrição: " + item.getDescricao());
            System.out.printf("Item a pagar: R$ %.2f%n", valor);
            System.out.println("----".repeat(15));
            totalLote += valor;
        }

        System.out.printf("VALOR TOTAL: R$ %.2f%n", totalLote);
    }
}
