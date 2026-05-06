package exercicio_12.model;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Jogador: " + this.nome);
        if (time != null) {
            System.out.println("Atua no time: " + time.getNome());
        } else {
            System.out.println("Jogador sem time (Agente Livre).");
        }
    }
}
