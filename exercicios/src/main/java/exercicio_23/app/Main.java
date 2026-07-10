package exercicio_23.app;

import exercicio_23.model.Funcionario;
import exercicio_23.model.Assalariado;
import exercicio_23.model.Comissionado;
import exercicio_23.model.Horista;

public class Main {
    public static void main(String[] args) {
        Assalariado assalariado = new Assalariado("Mário", "869.456.987-95");
        Comissionado comissionado = new Comissionado("Luciana", "123.456.987-95", 40000);
        Horista horista = new Horista("Heitor", "951.654.753-54", 47, 6.5);

        Funcionario[] funcionarios = {assalariado, comissionado, horista};

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Valor recebido: " + funcionario.vencimentos());
            System.out.println("...".repeat(20));
        }
    }
}
