package exercicio_55.model;

import java.util.Objects;

public class Cliente {
    private int id;
    private String nome;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Cliente)) return false;

        Cliente cliente = (Cliente) o;

        return id == cliente.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
