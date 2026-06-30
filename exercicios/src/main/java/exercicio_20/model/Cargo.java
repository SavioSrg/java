package exercicio_20.model;

public enum Cargo {
    ESTAGIARIO("Estagiário", 1),
    ASSISTENTE("Assistente", 2),
    ANALISTA("Analista", 3),
    SUPERVISOR("Supervisor", 4),
    GESTOR ("Gestor", 5);

    private String descricao;
    private int ordem;
        Cargo(String descricao, int ordem) {
            this.descricao = descricao;
            this.ordem = ordem;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getOrdem() {
        return ordem;
    }
}