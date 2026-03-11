package br.com.savio.alura.desafios.conversorDeMoedas.principal;

import br.com.savio.alura.desafios.conversorDeMoedas.consultarMoeda.ConversaoMoeda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversaoMoeda conversor = new ConversaoMoeda();

        System.out.println("Seja bem-bindo/a ao Conversor de Moedas");

        int opcao;

        do {
            System.out.println("""
                    ----------------------------\n
                    1) Dólar =>> Peso argentino
                    2) Peso argentino =>> Dólar
                    3) Dólar =>> Real brasileiro
                    4) Real brasileiro =>> Dólar
                    5) Dólar =>> Peso colombiano
                    6) Peso colombiano =>> Dólar
                    7) Sair
                    """);

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    converter(sc, conversor, "USD", "ARS");
                    break;
                case 2:
                    converter(sc, conversor, "ARS", "USD");
                    break;
                case 3:
                    converter(sc, conversor, "USD", "BRL");
                    break;
                case 4:
                    converter(sc, conversor, "BRL", "USD");
                    break;
                case 5:
                    converter(sc, conversor, "USD", "COP");
                    break;
                case 6:
                    converter(sc, conversor, "COP", "USD");
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida, selecione uma das opções acima!");
            }
        }while (opcao != 7);

        sc.close();
    }
    public static void converter(Scanner sc, ConversaoMoeda conversor,
                                 String moedaOrigem, String moedaDestino) {

        System.out.print("Digite o valor que deseja converter: ");
        double valor = sc.nextDouble();

        double resultado = conversor.converter(moedaOrigem, moedaDestino, valor);

        System.out.printf("Resultado da conversão: %.2f%n \n", resultado);
    }
}
