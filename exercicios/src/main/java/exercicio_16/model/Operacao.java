package exercicio_16.model;

public class Operacao extends Seguro {
    private int codigo;
    private String descricao;

    public Operacao(int codigo, String descricao, String beneficiario, double valor) {
        super(beneficiario, valor);

        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Descrição: " + descricao;
    }
}
