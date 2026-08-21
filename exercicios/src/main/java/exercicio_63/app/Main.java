package exercicio_63.app;

import exercicio_63.model.Produto;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Mouse", 50.0);
        Produto p2 = new Produto("Teclado", 100.0);
        Produto p3 = new Produto("Monitor", 80.0);
        Produto p4 = new Produto("Headset", 30.0);
        Produto p5 = new Produto("Webcam", 70.0);

        NavigableSet<Produto> listaProdutos = new TreeSet<Produto>();
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
        listaProdutos.add(p4);
        listaProdutos.add(p5);

        Produto referencia50 = new Produto("", 50.0);
        Produto referencia100 = new Produto("", 100.0);

        System.out.println(listaProdutos.ceiling(referencia50));
        System.out.println(listaProdutos.lower(referencia100));

        NavigableSet<Produto> faixa =
                listaProdutos.subSet(
                        new Produto("", 30.0),
                        true,
                        new Produto("", 80.0),
                        true
                );

        System.out.println("Entre R$ 30 e R$ 80: " + faixa);
    }
}
