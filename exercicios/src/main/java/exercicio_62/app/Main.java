package exercicio_62.app;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> a =  new TreeSet<>(Set.of(1, 2, 3, 4, 5, 6));
        Set<Integer> b =  new TreeSet<>(Set.of(4, 5, 6, 7, 8, 9));

        System.out.println(a);
        System.out.println(b);

        System.out.println("\nUnião - A e B");
        Set<Integer> uniao = new HashSet<>(a);
        uniao.addAll(b);
        System.out.println(uniao);

        System.out.println("\nInterseção - A e B");
        Set<Integer> intersecao = new HashSet<>(a);
        intersecao.retainAll(b);
        System.out.println(intersecao);

        System.out.println("\nDiferença - A e B");
        Set<Integer> diferenca = new HashSet<>(a);
       diferenca.removeAll(b);
        System.out.println(diferenca);

    }
}
