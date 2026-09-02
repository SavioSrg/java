package exercicio_71.model;

public class Equipamento {
    private String item;
    private String descricao;

    public Equipamento(String item, String descricao) {
        this.item = item;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return item + " - " + descricao;
    }
}
