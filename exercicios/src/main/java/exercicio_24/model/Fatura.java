package exercicio_24.model;

public class Fatura implements Pagamento {
    private Produtos[] produtos;

    public Fatura(Produtos[] produtos) {
        this.produtos = produtos;
    }

    @Override
    public String getDescricao() {
        StringBuilder resultado = new StringBuilder("\n");

        for (Produtos produto : this.produtos) {
            String nome = produto.getNome();
            String preco = Double.toString(produto.getPreco());
            String quantidade = Double.toString(produto.getQuantidade());

            resultado.append(String.join(" ", nome, preco, quantidade)).append("\n");
        }
        return resultado.toString();
    }

    @Override
    public double getPaymentAmount() {
        double valorTotal = 0;
        for (Produtos produto : this.produtos) {
            double valorProduto = produto.getQuantidade() * produto.getPreco();
            valorTotal += valorProduto;
        }
        return valorTotal;
    }
}
