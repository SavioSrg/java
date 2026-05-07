package exercicio_14.app;

import exercicio_14.model.ControleDeBonificacoes;
import exercicio_14.model.Diretor;
import exercicio_14.model.Funcionario;
import exercicio_14.model.Gerente;

public class Main {
    public static void main(String[] args) {
        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        Funcionario funcionario = new Funcionario("Otávio", 865.23);
        System.out.println(funcionario);
        System.out.printf("Bonificação: %.2f%n", funcionario.getBonificacao());
        System.out.println("-".repeat(35));
        controle.registra(funcionario);
        System.out.printf("Total de Bonificação acumulado: %.2f%n", controle.getTotalDeBonificacoes());        controle.lista();

        System.out.println("\n");

        Gerente gerente = new Gerente("Juan", 1102.36);
        System.out.println(gerente);
        System.out.printf("Bonificação: %.2f%n", gerente.getBonificacao());
        System.out.println("-".repeat(35));
        controle.registra(gerente);
        System.out.printf("Total de Bonificação acumulado: %.2f%n", controle.getTotalDeBonificacoes());
        controle.lista();

        System.out.println("\n");

        Diretor diretor = new Diretor("Marcela", 1654.12);
        System.out.println(diretor);
        System.out.printf("Bonificação: %.2f%n", diretor.getBonificacao());
        System.out.println("-".repeat(35));
        controle.registra(diretor);
        System.out.printf("Total de Bonificação acumulado: %.2f%n", controle.getTotalDeBonificacoes());
        controle.lista();

    }
}
