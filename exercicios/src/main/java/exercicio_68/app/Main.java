package exercicio_68.app;

import exercicio_68.model.Cliente;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juan", 15);
        Cliente c2 = new Cliente("Maria", 7);
        Cliente c3 = new Cliente("Pedro", 3);
        Cliente c4 = new Cliente("Mariana", 6);

        Queue<Cliente> clientes = new PriorityQueue<>();
        clientes.offer(c1);
        clientes.offer(c2);
        clientes.offer(c3);
        clientes.offer(c4);

        double tempoAtual = 0;
        double tempoTotalEspera = 0;

        while (!clientes.isEmpty()) {
            Cliente cliente = clientes.poll();

            double tempoEspera = Math.max( 0, tempoAtual - cliente.getInstanteChegada());

            tempoTotalEspera += tempoEspera;

            tempoAtual = Math.max(tempoAtual, cliente.getInstanteChegada());

            tempoAtual += cliente.getTempoAtendimento();

            System.out.println(cliente);
            System.out.println("Tempo de espera: " + tempoEspera);

        }
    }
}
