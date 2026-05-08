package exercicio_17.model;

public class Veiculo {
private boolean ligaVeiculo;

    public Veiculo () {
        this.ligaVeiculo = false;
    }

    public boolean getLiga() {
        return ligaVeiculo;
    }

    public void setLiga(boolean liga) {
        this.ligaVeiculo = liga;
    }

    public void ligar() {
        if (getLiga() == true) {
            setLiga(false);
        } else {
            setLiga(true);
        }

    String termo = getLiga() ? "ligado" : "desligado";

    System.out.println("Veiculo " + termo);
    }


}
