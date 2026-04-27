package exercicio_09.model;

public class Car extends Vehicle {
    private String make;
    private String model;
    private Integer year;

    public Car(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car () {
        this("Não informado", "Não Informado", null);
    }

    @Override
    public double speedUp(double incremento) {
        double novaVelocidade = getSpeed() + (incremento * 1.2);
        setSpeed(novaVelocidade);
        return getSpeed();
    }

    @Override
    public String toString() {
        return "Carro" +
                "(" +
                "Marca: " + make +
                ", Modelo: " + model +
                ", Ano: " + year +
                ")";
    }
}
