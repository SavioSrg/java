package exercicio_64.app;

import exercicio_64.model.Produto;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto(1L, "Teclado");
        Produto p2 = new Produto(2L, "Mouse");
        Produto p3 = new Produto(3L, "Monitor");
        Produto p4 = new Produto(4L, "Headset");
        Produto p5 = new Produto(5L, "Mouse");


        Map<Produto, Integer> estoque = new HashMap<Produto, Integer>();

        // Adicionando
        estoque.put(p1, 10);
        estoque.put(p2, 25);
        estoque.put(p3, 3);
        estoque.put(p4, 8);
        estoque.put(p5, 25);

        // Retorna valor associado
        System.out.println("Quantidade em estoque: " + estoque.get(p1));

        // Retorna valor mapeando ou chave
        System.out.println("Quantidade em estoque de " + p1.getDescricao() + ": " + estoque.getOrDefault(p1, 0));

        // Confere se chave está mapeada
        System.out.println("O produto " + p2.getDescricao() + " está no estoque: " + estoque.containsKey(p2));

        // Confere quantidade de valores repetidos
        System.out.println("Existe item repetido com o mesmo estoque? " + estoque.containsValue(25));

        // Remover
        System.out.println("\nRemoção do item 5 (Valor estoque): " + estoque.remove(p5));

        System.out.println("número em estoque: " + estoque.size());

        System.out.println("\n--- CHAVES ---");

        for (Produto produto : estoque.keySet()) {
            System.out.println(
                    produto.getId() + " - " + produto.getDescricao()
            );
        }

        System.out.println("\n--- VALORES ---");

        for (Integer quantidade : estoque.values()) {
            System.out.println(quantidade);
        }

        System.out.println("\n--- ENTRADAS ---");

        for (Map.Entry<Produto, Integer> entry : estoque.entrySet()) {

            Produto produto = entry.getKey();
            Integer quantidade = entry.getValue();

            System.out.println(
                    produto.getId() + " - "
                            + produto.getDescricao()
                            + " | Quantidade: "
                            + quantidade
            );
        }

        estoque.clear();
        System.out.println("\nLimpeza concluída!");

        System.out.println("Não contem mapemantos? " + estoque.isEmpty());
    }
}
