package exercicio_17.app;

import exercicio_17.model.Carro;
import exercicio_17.model.Veiculo;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("fusca");
        Carro carro2 = new Carro("celta");
        Carro carro3 = new Carro("onix");
        Veiculo carro4 = new Carro("fiesta");

        Veiculo[] veiculos = {carro1, carro2, carro3, carro4};
        for (Veiculo veiculound : veiculos) {
            if (veiculound instanceof Carro) {
                Carro carro = (Carro) veiculound;
                carro.ativarArCondicionado();
            }
            System.out.println("---".repeat(20));
        }
    }
}
