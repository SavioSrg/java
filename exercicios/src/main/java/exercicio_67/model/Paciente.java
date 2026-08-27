package exercicio_67.model;

import java.util.Objects;

public class Paciente implements Comparable<Paciente> {
    private String nome;
    private Integer grauDeUrgencia;

    public Paciente(String nome, Integer grauDeUrgencia) {
        this.nome = nome;
        this.grauDeUrgencia = grauDeUrgencia;
    }

    public String getNome() {
        return nome;
    }

    public Integer getGrauDeUrgencia() {
        return grauDeUrgencia;
    }

    @Override
    public int compareTo(Paciente o) {
        if (this.grauDeUrgencia > o.grauDeUrgencia) {
            return -1;
        } else if (this.grauDeUrgencia < o.grauDeUrgencia) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Paciente paciente)) return false;
        return Objects.equals(grauDeUrgencia, paciente.grauDeUrgencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grauDeUrgencia);
    }

    @Override
    public String toString() {
        return nome + " - " + grauDeUrgencia;
    }
}
