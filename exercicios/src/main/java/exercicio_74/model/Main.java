package exercicio_74.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public  static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 4, 7, 10, 15, 22, 33, 40);

        List <Integer> numerosNovos = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numerosNovos);
    }
}
