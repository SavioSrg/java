package exercicio_71.app;

import exercicio_71.model.Equipamento;
import exercicio_71.model.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha<Equipamento> pilha = new Pilha<>();

        pilha.empilhar(new Equipamento("EQ-001", "Falha no motor"));
        pilha.empilhar(new Equipamento("EQ-002", "Problema no rádio"));
        pilha.empilhar(new Equipamento("EQ-003", "Falha no computador"));

        for (Equipamento p : pilha.getElementos()) {
            System.out.println(p);
        }

        System.out.println("\nOrdem em que foram resolvidas");
        while (!pilha.listaVazia()) {
            System.out.println(pilha.desempilhar());
        }
    }
}
