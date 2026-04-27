package exercicio_09.model;

public class Bicycle extends Vehicle{
    private String color;
    private String model;

    public Bicycle(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public Bicycle() {
        this("Não informado", "Não informado");
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double speedUp(double incremento) {
        double novaVelocidade = getSpeed() + (incremento * 0.8);
        setSpeed(novaVelocidade);
        return getSpeed();
    }

    @Override
    public String toString() {
        return "Bicicleta" +
                "(" +
                "Cor: " + color +
                ", Modelo: " + model +
                ")";
    }
}
