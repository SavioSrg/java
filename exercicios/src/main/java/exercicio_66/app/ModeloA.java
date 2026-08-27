package exercicio_66.app;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class ModeloA {
    public static void main(String[] args) {
        Queue<Double> filaPrioridade =  new PriorityQueue<>();
        filaPrioridade.offer(12.3);
        filaPrioridade.offer(65.7);
        filaPrioridade.offer(39.0);
        filaPrioridade.offer(4.25);
        filaPrioridade.offer(54.98);
        filaPrioridade.offer(54.9);
        filaPrioridade.offer(74.0);
        filaPrioridade.offer(1.0);
        filaPrioridade.offer(10.0);
        filaPrioridade.offer(19.9);

        Collections.reverseOrder();

        while (!filaPrioridade.isEmpty()){
            System.out.println(filaPrioridade.poll());
        }

    }
}
