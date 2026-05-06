package Exercicio_13.model;

public class Associacao {
    private String placa;
    private Carro carro;

    public Associacao(String placa,  Carro carro) {
        this.placa = placa;
        this.carro = carro;
    }

    public void imprimir() {
        System.out.println("O veiculo " + carro.getNome() +
                " possui a placa " + this.placa);
    }
}
