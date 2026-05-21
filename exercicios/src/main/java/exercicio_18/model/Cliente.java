package exercicio_18.model;

public class Cliente {
    private String nome;
    private TipoCliente tipoPessoa;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoPessoa, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoPessoa = tipoPessoa;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public TipoCliente getTipoPessoa() {
        return tipoPessoa;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", código=" + tipoPessoa.getNumero() +
                ", tipo=" + tipoPessoa.getDescricao() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
