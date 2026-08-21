package exercicio_61.app;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String texto = "O dia de hoje se apresenta como uma tela em branco inteiramente nova, repleta de horas silenciosas que carregam a promessa sutil de recomeços, convidando-nos a desacelerar o ritmo caótico da rotina para que possamos finalmente apreciar a beleza dos pequenos detalhes, respirar com mais calma e transformar cada instante simples em uma oportunidade preciosa de evolução, conexão e gratidão.";

        texto = texto.replaceAll("[.,!?;:]", "").toLowerCase();

        String[] palavras = texto.split("\\s+");

        TreeSet<String> palavrasUnicas = new TreeSet<>();
        for (String palavra : palavras) {
            palavrasUnicas.add(palavra);
        }

        System.out.println("Total antes: " + palavras.length);
        System.out.println("Total depois: " + palavrasUnicas.size());
    }
}
