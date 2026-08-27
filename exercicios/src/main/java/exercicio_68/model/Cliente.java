package exercicio_68.model;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Cliente implements Comparable<Cliente>{
    private String nome;
    private double instanteChegada;
    private double tempoAtendimento;
    private int quantidadeDeItens;
    ThreadLocalRandom random = ThreadLocalRandom.current();

    public Cliente(String nome, int quantidadeDeItens) {
        this.nome = nome;
        this.quantidadeDeItens = quantidadeDeItens;
        tempoAtendimento = calcularAtendimento();
        instanteChegada = calcularTempoChegada();
    }

    public double calcularTempoChegada() {
        return random.nextInt(3, 120);
    }

    public double calcularAtendimento() {
        return random.nextInt(2, 6) * quantidadeDeItens;
    }

    public String getNome() {
        return nome;
    }

    public double getInstanteChegada() {
        return instanteChegada;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public double  getTempoAtendimento() {
        return tempoAtendimento;
    }

    @Override
    public int compareTo(Cliente o) {
        if(this.instanteChegada > o.instanteChegada){
            return 1;
        }
        else if(this.instanteChegada < o.instanteChegada){
            return -1;
        }
        return 0;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cliente cliente)) return false;
        return Double.compare(instanteChegada, cliente.instanteChegada) == 0 && Double.compare(tempoAtendimento, cliente.tempoAtendimento) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanteChegada, tempoAtendimento);
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " - Tempo na fila: " + instanteChegada +
                " - Tempo de atendimento: " + tempoAtendimento;
    }
}
