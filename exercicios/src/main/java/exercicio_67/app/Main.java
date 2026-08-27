package exercicio_67.app;

import exercicio_67.model.Paciente;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Samuel", 1);
        Paciente p2 = new Paciente("Tania", 4);
        Paciente p3 = new Paciente("Rodrigo", 3);
        Paciente p4 = new Paciente("Aline", 4);
        Paciente p5 = new Paciente("Sussana", 5);

        Queue<Paciente> pacientes = new PriorityQueue<>();
        pacientes.add(p1);
        pacientes.add(p2);
        pacientes.add(p3);
        pacientes.add(p4);
        pacientes.add(p5);

        while (!pacientes.isEmpty()) {
            System.out.println(pacientes.poll());
        }
    }
}
