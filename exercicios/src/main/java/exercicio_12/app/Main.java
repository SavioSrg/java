package exercicio_12.app;

import exercicio_12.model.Jogador;
import exercicio_12.model.Time;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Neymar");
        Time time2 = new Time("Seleção Brasileira Olímpica");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time2);
        jogador2.setTime(time2);
        time2.setJogadores(jogadores);

        System.out.println("---- Jogador ----");
        jogador2.imprime();

        System.out.println("---- Time ----");
        time2.imprime();
    }
}
