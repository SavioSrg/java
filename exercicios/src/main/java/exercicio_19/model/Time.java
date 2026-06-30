package exercicio_19.model;

import java.util.Arrays;

public class Time {
    private String nome;
    private static Jogador[] listaJogadores = new Jogador[2];
    private double caixa;

    public Time (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarJogador (Jogador jogador) {
        for (int i = 0; i<listaJogadores.length; i++){
            if (listaJogadores[i] == null){
                listaJogadores[i] = jogador;
                jogador.setTime(Time.this);
                break;
            } else {
                System.out.println("time cheio");
            }
        }
    }

//    public static Jogador[] getListaJogadores() {
//        for (Jogador jogador : listaJogadores) {
//            if (jogador != null) {
//                jogador.getNome();
//            }
//        }
//        return listaAtualizada;
//    }

    @Override
    public String toString() {
        return "Time" +
                "nome:" + nome +
                ", lista de jogadores:" + Arrays.toString(listaJogadores) +
                ", caixa:" + caixa;
    }
}
