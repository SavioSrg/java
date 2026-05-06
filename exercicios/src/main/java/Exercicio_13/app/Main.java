package Exercicio_13.app;

import Exercicio_13.model.Carro;
import Exercicio_13.model.Associacao;

public class Main {
    public static void main(String[] args) {


        Carro carro = new Carro("Fusca", "VM");

        Associacao associacao = new Associacao("ABD-8465", carro);
        associacao.imprimir();
    }
}
