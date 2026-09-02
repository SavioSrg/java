package exercicio_71.app;

import exercicio_71.model.Equipamento;
import exercicio_71.model.Pilha;

import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha<Equipamento> ordemDeServico = new Pilha<>();

        int opcao = 0;

        while (opcao != 5) {
            System.out.println();
            opcao = exibirMenu(sc);

            while (opcao == 0 || opcao > 5) {
                System.out.println("...favor digitar uma opção válida");
                opcao = exibirMenu(sc);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do equipamento:");
                    String nome = sc.nextLine();
                    System.out.println("Digite a descrição de manutenção:");
                    String descricao = sc.nextLine();

                    ordemDeServico.empilhar(new Equipamento(nome, descricao));
                    System.out.println("Cadastrado com sucesso!");
                    break;
                case 2:
                if (!ordemDeServico.ListaVazia()){
                    System.out.println("Ordem de serviço: " + ordemDeServico.desempilhar());
                    System.out.println("Executada com sucesso!");
                } else {
                    System.out.println("Nenhum equipamento encontrado!");
                }
                    break;

                case 3:
                    System.out.println("O próximo item será: " + ordemDeServico.verProximoItem());
                    break;

                case 4:
                    System.out.println("Lista vazia: " + ordemDeServico.listaVazia());
                    break;
            }
        }
    }

    private static int exibirMenu(Scanner sc) {
        System.out.println("""
                1 - Registrar equipamento
                2 - Processar equipamento
                3 - Ver próximo equipamento
                4 - Verificar se a fila está vazia
                5 - Sair
                """);

        int opcao = sc.nextInt();
        return opcao;
    }
}
