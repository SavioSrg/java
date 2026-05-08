package exercicio_17.model;

public class Carro extends Veiculo {
public String modelo;
    private boolean estadoArCondicionado;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.estadoArCondicionado = false;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean getEstadoArCondicionado() {
        return estadoArCondicionado;
    }

    public void setEstadoArCondicionado(boolean estadoArCondicionado) {
        this.estadoArCondicionado = estadoArCondicionado;
    }

    public void ativarArCondicionado() {
        if (getEstadoArCondicionado() == true) {
            setEstadoArCondicionado(false);
        } else  {
            setEstadoArCondicionado(true);
        }

        String termo = getEstadoArCondicionado() ? "ligado" : "desligado";
        System.out.println("Ar Condicionado do " + getModelo() + " está " + termo);
    }

    @Override
    public void ligar() {
        super.ligar();

        String termo = getLiga() ? "ligado" : "desligado";
        System.out.println("O carro modelo " + getModelo() + " agora está " + termo);
    }
}
