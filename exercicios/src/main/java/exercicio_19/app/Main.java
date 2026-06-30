package exercicio_19.app;

import exercicio_19.model.Jogador;
import exercicio_19.model.Time;

// IMCOMPLETO
public class Main {
    public static void main(String[] args) {
        Time time = new Time("Real Madrid");
        Jogador jogador = new Jogador("Rodrigo", 4200000);

        time.adicionarJogador(jogador);
        time.adicionarJogador(jogador);
        time.adicionarJogador(jogador);

        System.out.println(jogador);
        System.out.println(time);
    }
}
