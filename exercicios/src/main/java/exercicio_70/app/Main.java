package exercicio_70.app;

import exercicio_70.model.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>();

        pilha.empilhar("CG-345");
        pilha.empilhar("FR-109");
        pilha.empilhar("WT-673");

        for (String item : pilha.elementos) System.out.println(item);

        System.out.println("\n");

        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());

        System.out.println("\n");

        for (String item : pilha.elementos) System.out.println(item);

        System.out.println("\nA pilha está vazia?" + pilha.estaVazia());
    }
}
