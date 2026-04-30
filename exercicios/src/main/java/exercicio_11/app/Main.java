package exercicio_11.app;

import exercicio_11.model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Samuel", "896.456.987-45", 1984.26);
        System.out.println(funcionario1);
        System.out.println("Quantidade de funcionários: " + funcionario1.getQuantidadeFuncionarios());
        System.out.println("-".repeat(35));

        Funcionario funcionario2 = new Funcionario("Mariana", "123.456.789-00", 2500.00);
        System.out.println(funcionario1);
        System.out.println("Quantidade de funcionários: " + funcionario1.getQuantidadeFuncionarios());
        System.out.println("-".repeat(35));

        Funcionario funcionario3 = new Funcionario("Carlos", "987.654.321-11", 3200.75);
        System.out.println(funcionario1);
        System.out.println("Quantidade de funcionários: " + funcionario1.getQuantidadeFuncionarios());
        System.out.println("-".repeat(35));

        Funcionario funcionario4 = new Funcionario("Ana", "456.789.123-22", 1800.50);
        System.out.println(funcionario1);
        System.out.println("Quantidade de funcionários: " + funcionario1.getQuantidadeFuncionarios());
        System.out.println("-".repeat(35));

        Funcionario funcionario5 = new Funcionario("João", "741.852.963-33", 2750.90);
        System.out.println(funcionario1);
        System.out.println("Quantidade de funcionários: " + funcionario1.getQuantidadeFuncionarios());
        System.out.println("-".repeat(35));

    }
}
