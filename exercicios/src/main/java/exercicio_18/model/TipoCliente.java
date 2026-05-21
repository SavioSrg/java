package exercicio_18.model;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa física"),
    PESSOA_JURIDICA(2, "Pessoa jurídica"),;

    private final int NUMERO;
    private final String DESCRICAO;

    TipoCliente(int numero, String DESCRICAO) {
        this.NUMERO = numero;
        this.DESCRICAO = DESCRICAO;
    }

    public int getNumero() {
        return NUMERO;
    }

    public String getDescricao() {
        return DESCRICAO;
    }

    public static TipoCliente tipoClientePorNomeRelato(String descricao) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getDescricao().equals(descricao)) {
                return tipoCliente;
            }
        }
        return null;
    }
}
